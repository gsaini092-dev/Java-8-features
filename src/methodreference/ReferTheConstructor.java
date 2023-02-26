package methodreference;

interface Messagable{
    Message getMessage(String value);

 }


class Message{
    Message(String msg){
        System.out.println("This my my class constructor."+ msg);
    }
}

public class ReferTheConstructor {
    public static void main(String[] args) {
        Messagable messagable = Message::new;
        messagable.getMessage("GThis is my message");
    }
}
