package com.maxkucher.device.api.services;

import com.maxkucher.device.api.dto.EventDTO;

import java.io.IOException;

public interface EventsProducer {

    void sendEvent(EventDTO eventDTO) throws IOException;
}
