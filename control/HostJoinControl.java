package control;

import view.MainFrame;
import model.HostJoinLogic;
import view.WaitingPanel;

public class HostJoinControl { 
    MainFrame mainFrame;
    HostJoinLogic hostJoinLogic;
    WaitingPanel waitingPanel;


    public HostJoinControl(MainFrame mainFrame) {   
        this.mainFrame = mainFrame;
        this.hostJoinLogic = new HostJoinLogic(mainFrame);
    }

    public void initialize() {
        mainFrame.getHostButton().addActionListener(e -> {
            hostJoinLogic.startHosting();
            
            waitingPanel = new WaitingPanel();
            mainFrame.getCards().add(waitingPanel, "waiting");
            mainFrame.getCardLayout().show(mainFrame.getCards(), "waiting");
        });
        mainFrame.getJoinButton().addActionListener(e -> {
            hostJoinLogic.startJoining();
            mainFrame.getCardLayout().show(mainFrame.getCards(), "waiting");
        });
    }
}