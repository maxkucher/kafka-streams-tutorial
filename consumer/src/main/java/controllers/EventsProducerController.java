package controllers;

import dto.EventDTO;
import services.EventsProducer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("/api/v1/events/producer")
@Produces(MediaType.APPLICATION_JSON)
public class EventsProducerController {
    private final EventsProducer eventsProducer;

    public EventsProducerController(EventsProducer eventsProducer) {
        this.eventsProducer = eventsProducer;
    }

    @POST
    @Path("/{deviceId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response sendEvent(@PathParam("deviceId") String deviceId, EventDTO eventDTO) throws IOException {
        eventsProducer.sendEvent(eventDTO);
        return Response.noContent().build();
    }
}
