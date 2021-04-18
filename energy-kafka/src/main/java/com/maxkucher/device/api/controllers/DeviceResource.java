package com.maxkucher.device.api.controllers;

import com.maxkucher.device.api.dto.DeviceState;
import com.maxkucher.device.api.dto.EventDTO;
import com.maxkucher.device.api.services.EventsProducer;
import com.maxkucher.device.common.dao.DeviceDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.UUID;

@Path("/api/v1/device")
@Produces(MediaType.APPLICATION_JSON)
public class DeviceResource {
    private final EventsProducer eventsProducer;
    private final DeviceDAO deviceDAO;

    public DeviceResource(EventsProducer eventsProducer, DeviceDAO deviceDAO) {
        this.eventsProducer = eventsProducer;
        this.deviceDAO = deviceDAO;
    }

    @POST
    @Path("/event/{deviceId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response sendEvent(@PathParam("deviceId") UUID deviceId, EventDTO eventDTO) throws IOException {
        eventsProducer.sendEvent(eventDTO);
        return Response.noContent().build();
    }

    @GET
    @Path("/{deviceId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDeviceState(@PathParam("deviceId") UUID deviceId) {
        Integer deviceCharging = deviceDAO.getDeviceState(deviceId);
        DeviceState deviceState = new DeviceState(deviceId, deviceCharging);
        return Response.ok(deviceState).build();
    }
}
