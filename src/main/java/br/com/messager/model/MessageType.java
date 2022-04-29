package br.com.messager.model;

public enum MessageType {
    TEXT("text"),
    AUDIO("audio"),
    IMAGE("image");

    private String type;

    MessageType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


}
