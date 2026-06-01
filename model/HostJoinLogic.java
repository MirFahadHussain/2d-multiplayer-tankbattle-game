package model;

import view.MainFrame;
import java.net.InetAddress;
import server.Server;

public class HostJoinLogic {

    MainFrame mainFrame;

    String currentUsername;
    String currentIPAddress;
    boolean hosting = false;
    Object clientOut; // Placeholder for client output stream

    public HostJoinLogic(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public void startHosting() {
        currentUsername = mainFrame.getUsername();
        currentIPAddress = getLocalHostIPAddress(); 

        hosting = true;
        clientOut = null; // Placeholder for client output stream

        Server.setHostUsername(currentUsername);


        //mainFrame.setIPAddress(currentIPAddress);
    }
    
    public void startJoining() {
        //currentUsername = mainFrame.getUsername();
        //currentIPAddress = mainFrame.getIpAddress();
        System.out.println("Joining");
    }

    public String getLocalHostIPAddress() {
        try{
            InetAddress localHost = InetAddress.getLocalHost();

            String ipAddress = localHost.getHostAddress();

            return ipAddress;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    } 

}