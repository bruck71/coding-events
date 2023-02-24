package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    //Need a place to put events
    private static final Map<Integer, Event> events = new HashMap<>();

    //get all events
    public static Collection<Event> getAll() {  //Collection is an interface or list
        return events.values(); //collection extends iterable and implements iterable to loop through the lists automatically
    }
    //get a single event
    public static Event getById(int id) {
        return events.get(id);
    }
    //add an event to collection
    public static void add(Event event) {
        events.put(event.getId(), event);
    }
    //remove an event from collection
    public static void remove(int id) {
        events.remove(id);
    }
}
