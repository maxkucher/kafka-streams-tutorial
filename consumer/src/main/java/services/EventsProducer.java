package services;

import dto.EventDTO;

import java.io.IOException;

public interface EventsProducer {

    void sendEvent(EventDTO eventDTO) throws IOException;
}
