package com.stylist.rest.webservices.restfulwebservices;

import javax.persistence.Entity;

@Entity
public class Message {

    private String from;
    private String text;

    @Override
    public String toString() {
        return "Message{" +
                "from='" + from + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    protected Message(){
    }

    public Message(String from, String text) {
        this.from = from;
        this.text = text;
    }

    // getters and setters
    public String getText() {
        return this.text;
    }

    public String getFrom() {
        return this.from;
    }
}
