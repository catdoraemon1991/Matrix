package com.laioffer.matrix;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    public static List<Event> getEventData() {
        List<Event> eventData = new ArrayList<Event>();
        for (int i = 0; i < 12; ++i) {
            eventData.add(
                    new Event("Event " + (i + 1),  1184 + i + "W valley Blvd, CA 90101",
                            "This is a huge event"));
        }
        return eventData;
    }

}
