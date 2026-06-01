package server;

public class Server {

    private static String hostUsername;


    public static synchronized void setHostUsername(String username) {
        hostUsername = username;

        System.out.println("Host username set to: " + hostUsername);
    }
}
