package br.com.messager.model;

import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class GroupConversation extends Conversation {

    private List<User> administrators;
    private List<User> guests;
    private String conversationName;

    public GroupConversation(User userOwner, Calendar createDate, List<User> guests, String conversatio) {
        super(userOwner, createDate);
        this.guests = guests;
        this.administrators.add(userOwner);
    }

    public List<User> add(User admin, User guest){
        if (checkAdmin(admin) && !checkGuest(guest)){
            this.guests.add(guest);
        }
        return Collections.unmodifiableList(this.guests);
    }

    public List<User> add(User admin, List<User> guests){
        if(checkAdmin(admin)){
            for(int i = 0; i <= guests.size(); i = i + 1){
                this.guests.add(guests.get(i));
            }
        }
        return Collections.unmodifiableList(this.guests);
    }

    public List<User> addAdministrator(User admin, User guest){

        return Collections.unmodifiableList(this.administrators);
    }

    private boolean checkAdmin(User admin) {
        if (this.guests.contains(admin)) {
            return true;
        }
        return false;
    }

    private boolean checkGuest(User guest) {
        if (this.guests.contains(guest)) {
            return true;
        }
        return false;
    }



}
