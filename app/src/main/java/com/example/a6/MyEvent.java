package com.example.a6;

public class MyEvent {
    private int event_icon;
    private String event_name;

    public MyEvent(int event_icon, String event_name) {
        this.event_icon = event_icon;
        this.event_name = event_name;
    }

    public int getEvent_icon() {
        return event_icon;
    }

    public void setEvent_icon(int event_icon) {
        this.event_icon = event_icon;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }
}
