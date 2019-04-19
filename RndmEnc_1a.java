/*
 RndmEnc_1a.java
    This is a program developed to help with generating random encounters.

    Currently only supports the Lost Mines of Phandelver campaign setting, other
    Campaigns and a custom option are coming soon!
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class RndmEnc_1a extends JFrame
{
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu campSelect;
    private JMenuItem exitItem;
    private JMenuItem LostMines;
    
    
    //multiPanels
    private JPanel mainPanel;
    private JPanel playerPanel;
    private JPanel outputPanel;
    
    
    //partyGUI
    private JLabel partyCount;
    private JLabel avgLevel;
    private JTextField partyTF;
    private JTextField levelTF;

    //output GUI
    private JTextArea outputTA;
    

    Encounter e1 = new Encounter();
    
    public RndmEnc_1a()
    {
        setTitle ("Encounter Generator");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buildMenuBar();
        buildPanel();
        add(mainPanel);
        //add(outputPanel);
        //add(playerPanel);
  
        
        setVisible(true);
    }
    
    private void buildMenuBar()
    {
        menuBar = new JMenuBar();
        
        buildFileMenu();
        buildEncounterMenu();
        
        menuBar.add(fileMenu);
        menuBar.add(campSelect);
        
        setJMenuBar(menuBar);
    }
    
    private void buildFileMenu()
    {
        fileMenu = new JMenu("File");
        
        exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new ExitListener());
        
        fileMenu.add(exitItem);
    }
    
    private void buildEncounterMenu()
    {
        campSelect = new JMenu("Campaigns");
        
        LostMines = new JMenuItem("Lost Mines of Phandelver");
        LostMines.addActionListener(new GenerateEncounter());
        
       // printEmplInfoItem = new JMenuItem("Print Number of Players");
       // printEmplInfoItem.addActionListener(new PrintEmployeeListener());
        
        campSelect.add(LostMines);
       // encounterMenu.add(printEmplInfoItem);
    }
    
    private void buildPanel()
    {
        playerPanel = new JPanel();
       // playerPanel.setBackground(Color.blue);
        
        
        partyCount = new JLabel(" Number of Players in party");
        partyTF = new JTextField(4);
        
        avgLevel = new JLabel(" Average player level (rounded down)");
        levelTF = new JTextField(3);
        
        
        playerPanel.add(partyCount);
        playerPanel.add(partyTF);
        
        playerPanel.add(avgLevel);
        playerPanel.add(levelTF);
        
        
        //output panel
        outputPanel = new JPanel();
        outputTA = new JTextArea(30, 30);
        outputPanel.add(outputTA);
        
        //main Panel
        mainPanel = new JPanel();
        //mainPanel.setLayout(new BorderLayout());
        mainPanel.add(playerPanel);
        mainPanel.add(outputPanel);
        //mainPanel.add(playerPanel, BorderLayout.NORTH);
       // mainPanel.add(outputPanel, BorderLayout.SOUTH);
    }
    
    private class ExitListener implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            System.exit(0);
        }
    }
    
   

    
    private class GenerateEncounter implements ActionListener
    {
        String level, party, inputStr; 
        int party1, level1;
        
        public void actionPerformed (ActionEvent e)
        {
            level1 = 0;
            party1 = 0;
            level = levelTF.getText();
            inputStr = levelTF.getText();
            level1 = Integer.parseInt(inputStr);
            party = partyTF.getText();
            inputStr = partyTF.getText();
            party1 = Integer.parseInt(inputStr);
           
            e1.setParty(party1);
            e1.setLevel(level1);
            e1.Chance();
            if (e1.Chance())
            {
                outputTA.setText(null);
                
                e1.computePlayerCR();
                e1.encBuilder();
                outputTA.append(e1.printEnc());
            }
            else
            {
                outputTA.setText(null);
                outputTA.append("The party continues without issue");
            }
        }
    }
    
    private class PrintEmployeeListener implements ActionListener
    {       
        public void actionPerformed (ActionEvent e)
        {
            e1.computePlayerCR();
            //e1.printE();
            outputTA.append(e1.printEnc());
        }
    }
    
    public static void main(String[] args) 
    {
        new RndmEnc_1a();
    }
    
}
