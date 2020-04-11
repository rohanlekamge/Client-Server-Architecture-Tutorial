package simpletest;
import java.time.LocalDateTime;
import java.util.Date;

public class DummyServer {
    
    public DummyServer(){}
    
    //Server Connection Part
    String testConnection(String client , String name){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(name + ": Client Found!");
        System.out.println(name + ": Client Connection Being Succesfully Established.\n");
        System.out.println("- " + name + " Running -\n");
        System.out.println(name + ": Connection from Client " + client + " has been succeeded at " + now);
        return "[" + now + "]" + name +" :" + "Connection from client ….. succeded)" ;
    }
    
}
