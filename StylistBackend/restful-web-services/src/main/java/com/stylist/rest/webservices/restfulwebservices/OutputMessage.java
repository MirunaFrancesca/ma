package com.stylist.rest.webservices.restfulwebservices;

public class OutputMessage extends Message{
    String timestamp;

    @Override
    public String toString() {
        return "OutputMessage{" +
                "timestamp='" + timestamp + super.toString() + '\'' +
                '}';
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public OutputMessage(String from, String text, String time) {
        super(from,text);
        this.timestamp = time;
    }
}
