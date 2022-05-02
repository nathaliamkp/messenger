package br.com.messager.model;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;

public abstract class Conversation {
        private Integer id;
        private User userOwner;
        private Calendar createDate;

        public Conversation(User userOwner, Calendar createDate) {
            this.userOwner = userOwner;
            this.createDate = createDate;
        }

        protected Message createMessage(User sender, String messagePart, MessageType messageType){
            Message message = new Message(this, LocalDateTime.now(), sender, messageType, messagePart);
            return message;
        }

    public User getUserOwner() {
        return userOwner;
    }

    public Calendar getCreateDate() {
        return createDate;
    }

    protected List<Message> getMessages(Conversation conversation){

            return null;
        }

}
