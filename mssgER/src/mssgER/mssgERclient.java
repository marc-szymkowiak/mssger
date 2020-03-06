package mssgER;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class mssgERclient extends JFrame {
	

	JFrame mainFrame;
	JButton sendButton;
	JTabbedPane tabbedPane;
	JMenuBar topMenuBar;
	JMenu userMenu, helpMenu, settingsMenu;
	JMenuItem userChangeUser, userChangeKeys, userLogOut, userClearMssg; 
	JMenuItem helpShowVersion, helpShowHelp; 
	JMenuItem settingsShowStats, settingsChangeSettings;
	JRadioButtonMenuItem menuItem;
	JPanel mainPanel, friendsPanel, groupsPanel;
	JLabel title;
	JScrollPane scrollPane;
	JSplitPane friendsPane;
	JTextArea messageArea;
	Box box;
	
	mssgERclient() {
		super("mssgER Client");
		
		mainFrame = new JFrame();
		
		topMenuBar = new JMenuBar();
		sendButton = new JButton("Send");
		userMenu = new JMenu("User");
		helpMenu = new JMenu("Help");
		
		settingsMenu = new JMenu("Settings");
		userChangeUser = new JMenuItem("Change User");
		userChangeKeys = new JMenuItem("Change Keyset");
		userLogOut = new JMenuItem("Log out current User");
		userClearMssg = new JMenuItem("Clear Messages");
		helpShowVersion = new JMenuItem("About");
		helpShowHelp = new JMenuItem("Show Help");
		settingsShowStats = new JMenuItem("Show Statistics");
		settingsChangeSettings = new JMenuItem("Change Settings");
		
		messageArea = new JTextArea();
		
		tabbedPane = new JTabbedPane();
		
		mainPanel = new JPanel();
		friendsPanel = new JPanel();
		groupsPanel = new JPanel();
		title = new JLabel("mssgER Client");
		title.setFont(new Font("Impact", Font.PLAIN, 32));
		
		mainPanel.setLayout(null);
		mainPanel.add(title);
		
		userMenu.add(userChangeUser);
		userMenu.add(userChangeKeys);
		userMenu.add(userClearMssg);
		settingsMenu.add(settingsShowStats);
		settingsMenu.add(settingsChangeSettings);
		helpMenu.add(helpShowVersion);
		helpMenu.add(helpShowHelp);
		
		topMenuBar.add(userMenu);
		topMenuBar.add(settingsMenu);
		topMenuBar.add(helpMenu);
		
		mainFrame.add(sendButton);
		
		mainFrame.add(messageArea);
		
		mainFrame.add(mainPanel);
		mainFrame.add(friendsPanel);
		mainFrame.add(groupsPanel);
		mainFrame.add(tabbedPane);
		mainFrame.add(topMenuBar);
		
		topMenuBar.setBounds(0, 0, 800, 20);
		userMenu.setBounds(0, 0, 20, 100);
		settingsMenu.setBounds(0, 20, 20, 100);
		helpMenu.setBounds(0, 40, 20, 100);
		
		friendsPanel.setBounds(0, 20, 200, 200);
		groupsPanel.setBounds(0, 220, 200,200);
		
		messageArea.setBounds(150, 400, 600, 150);
		
		sendButton.setBounds(680,550,70,30);
		
		mainFrame.setSize(800, 700);
		
		mainFrame.setLayout(null);
		mainFrame.setVisible(true);
		
	}
	
	public static void main(String arggs[]) {
		passwordEntry();
		mssgERclient mainGUI = new mssgERclient();
		
	}
	
	public static boolean passwordEntry() { // Generates the Password Entry Dialog
		boolean finished = false;
		
		JFrame passwordFrame = new JFrame("Enter Password");
		JTextField passField = new JTextField("Enter your Password");
		JButton okButton = new JButton("OK");
		JButton cancButton = new JButton("Cancel");
		
		passwordFrame.setSize(230, 150);
		
	
		passField.setBounds(20,20,150,20);
		okButton.setBounds(20,60,75,20);
		cancButton.setBounds(120,60,75,20);
		
		passwordFrame.add(passField);
		passwordFrame.add(okButton);
		passwordFrame.add(okButton);
		passwordFrame.add(cancButton);
		
		passwordFrame.setLayout(null);
		passwordFrame.setVisible(true);
		
		
		return finished;
	}
	
	public static boolean loginScreen() { // Generates the Login Screen
		boolean finished = false;
		
		
		JFrame loginFrame = new JFrame("LogIn");
		JTextField privateKey = new JTextField("Enter private Key");
		JTextField publicKey = new JTextField("Enter public Key");
		JTextField versionInfo = new JTextField("Version 0.01 - Status: connection avaiable");
		JButton okButton = new JButton("OK");
		JButton cancButton = new JButton("Cancel");
		
		loginFrame.setSize(400, 250);
		
		privateKey.setBounds(20,20,300,20);
		publicKey.setBounds(20,60,300,20);
		versionInfo.setBounds(0,190,400,20);
		okButton.setBounds(20,100,80,30);
		cancButton.setBounds(150,100,80,30);
		
		loginFrame.add(privateKey);
		loginFrame.add(publicKey);
		loginFrame.add(versionInfo);
		loginFrame.add(okButton);
		loginFrame.add(okButton);
		loginFrame.add(cancButton);
		
		loginFrame.setLayout(null);
		loginFrame.setVisible(true);
		
		return finished;
	}

	
}
