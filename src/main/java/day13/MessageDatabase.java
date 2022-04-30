package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {

    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text){
        messages.add(new Message(u1,u2,text));
    }

    public static List<Message> getMessages(){
        return messages;
    }

    public static void showDialog(User u1, User u2){

        for (Message msg:messages){

            if((u1.getUsername().equals(msg.getSender().getUsername())
                    && u2.getUsername().equals(msg.getReceiver().getUsername()) )
                    || (u2.getUsername().equals(msg.getSender().getUsername())
                    && u1.getUsername().equals(msg.getReceiver().getUsername()))){

                System.out.println(msg.getSender() + ": " + msg.getText());

            }
        }

    }


}
