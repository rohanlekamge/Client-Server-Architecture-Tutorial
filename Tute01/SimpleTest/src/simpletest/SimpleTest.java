package simpletest;

public class SimpleTest {

    public static void main(String[] args) {
        execute("IIT", "Dialog Server");
    }
    
    private static void execute(String client , String name){
        System.out.println(client + ": Connection is Starting... ");
        DummyServer dummyServer = new DummyServer() ;
        dummyServer.testConnection(client , name ) ;
        System.out.println(client + ": Hi ");
        System.out.println(dummyServer.testConnection(client , name ));
    }
    
}
