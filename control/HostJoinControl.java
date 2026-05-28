package control;

import view.MainFrame;
import model.HostJoinLogic;

public class HostJoinControl { 
    MainFrame mainFrame;
    HostJoinLogic hostJoinLogic;

    public HostJoinControl(MainFrame mainFrame) {   
        this.mainFrame = mainFrame;
        this.hostJoinLogic = new HostJoinLogic();
    }

    public void initialize() {
        mainFrame.getHostButton().addActionListener(e -> {
            hostJoinLogic.startHosting();
        });
    }
}