package day13;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;

    private List<String> subscriptions;

    public User(String username){
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<String> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user){
        subscriptions.add(user.getUsername());
    }

    public boolean isSubscribed(User user){
        System.out.println(subscriptions);
        if (subscriptions.contains(user.getUsername())) return true;
        else return false;
    }

    public boolean isFriend(User user){
        if(subscriptions.contains(user.getUsername())
                && user.getSubscriptions().contains(username)){
            return true;
        }else {
            return false;
        }
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(User.this,user,text);
    }

    public String toString(){
        return username;
    }

}
