package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.HostJoinControl;

import java.awt.*; 

public class MainFrame extends JFrame{

    private CardLayout cardLayout = new CardLayout();
    private JPanel cards = new JPanel(cardLayout);

    private JLabel usernameLabel = new JLabel("User Name ");
    private JTextField usernameField = new JTextField(18);
    private JLabel ipAdress = new JLabel("IP Address ");
    private JTextField ipField = new JTextField(18);
    private JButton hostButton = new JButton("Host");
    private JButton joinButton = new JButton("Join");

    
    private HostJoinControl hostJoinControl;
    WaitingPanel waitingPanel;
    

    public MainFrame(){

        setTitle("2d Multipayer TankBattle Game");
        setSize(1024, 512);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel MainPanel = createMainPanel(); // func outside of constructor
        cards.add(MainPanel, "main");

        cardLayout.show(cards, "main");

        add(cards);
        setVisible(true);

    }
    
    private JPanel createMainPanel(){
        
        JPanel MainPanel = new JPanel();
        MainPanel.setBackground(Color.DARK_GRAY);
        MainPanel.setLayout(null);

        usernameLabel.setBounds(370, 100, 80, 20);
        usernameLabel.setBackground(Color.LIGHT_GRAY);
        usernameLabel.setOpaque(true);
        MainPanel.add(usernameLabel);

        usernameField.setBounds(460, 100, 150, 20);
        MainPanel.add(usernameField);

        ipAdress.setBounds(370, 130, 80, 20);
        ipAdress.setBackground(Color.LIGHT_GRAY);
        ipAdress.setOpaque(true);
        MainPanel.add(ipAdress);

        ipField.setBounds(460, 130, 150, 20);
        MainPanel.add(ipField);

        hostButton.setBounds(430, 180, 150, 25);
        MainPanel.add(hostButton);

        joinButton.setBounds(430, 210, 150, 25);
        MainPanel.add(joinButton);

        hostJoinControl = new HostJoinControl(this);
        hostJoinControl.initialize();

        return MainPanel;
    }

    public String getUsername() {
        return usernameField.getText();
    }

    public String getIpAddress() {
        return ipField.getText();
    }

    public void setIpAddress(String ipAdress) {
        ipField.setText(ipAdress);
    }

    public void setIPAddress(String ipAddress) {
        ipField.setText(ipAddress);
    }

    public JButton getHostButton() {
        return hostButton;
    }

    public JButton getJoinButton() {
        return joinButton;
    }

    public JPanel getCards() {
        return cards;
    }

    public CardLayout getCardLayout() {
        return cardLayout;
    }
}
