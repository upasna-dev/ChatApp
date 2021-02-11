package com.example.chatapp.Model;

public class Chat {
    private String sender;
    private String Receiver;
    private String message;
    private boolean isseen;

    public Chat(){}

    public Chat(String sender, String receiver, String message, boolean isseen) {
        this.sender = sender;
        Receiver = receiver;
        this.message = message;
        this.isseen = isseen;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return Receiver;
    }

    public void setReceiver(String receiver) {
        Receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getIsseen() {
        return isseen;
    }

    public void setIsseen(boolean isseen) {
        this.isseen = isseen;
    }
}
