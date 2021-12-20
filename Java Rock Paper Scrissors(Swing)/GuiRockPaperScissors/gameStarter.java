package GuiRockPaperScissors;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class gameStarter implements ActionListener,KeyListener
{
    JFrame mainFrame;

    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel3_1; JPanel panel3_2;

    JButton button1;
    JButton button2;
    JButton button3;

    JLabel label1;
    JLabel label1_1;
    JLabel label2; 
    JLabel label3_1; 
    JLabel label3_2; 

    ImageIcon mainFrameIcon;

    gameframeclass mainob = new gameframeclass();
    help mainob2 = new help();

    public void GameRunner()
    {
        //----------------------------------------------------------

        mainFrame = new JFrame("Java based RPS");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(450,480);
        mainFrame.setFocusable(true);
        mainFrame.requestFocus();
        mainFrame.setLocation(458,130);
        mainFrame.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        mainFrame.setResizable(false);
        mainFrame.addKeyListener(this);
        mainFrameIcon = new ImageIcon("images/rock.png");
        mainFrame.setIconImage(mainFrameIcon.getImage());
        
        //-----------------------------------------------------------

        panel1 = new JPanel();
        label1_1 = new JLabel();
        panel1.setPreferredSize(new Dimension(450,170));
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER,0,20));
        panel1.setBorder(BorderFactory.createEtchedBorder());
        
        label1 = new JLabel();
        label1_1.setText("Java Based");
        label1.setText("Rock Paper Scissors");
        label1_1.setFont(new Font(null,Font.BOLD,40));
        label1.setFont(new Font(null,Font.BOLD,38));
        panel1.add(label1_1);
        panel1.add(label1);
        mainFrame.add(panel1);
        
        //------------------------------------------------------
        
        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(450,190));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER,200,15));
        panel2.setBorder(BorderFactory.createEtchedBorder());
      
        button1 = new JButton("Start");
        button1.setPreferredSize(new Dimension(120,40));
        button1.setFont(new Font(null,Font.BOLD,20));
        button1.setFocusable(false);
        button1.addActionListener(this);

        button2 = new JButton("Help");
        button2.setPreferredSize(new Dimension(120,40));
        button2.setFont(new Font(null,Font.BOLD,20));
        button2.setFocusable(false);
        button2.addActionListener(this);

        button3 = new JButton("Exit");
        button3.setPreferredSize(new Dimension(120,40));
        button3.setFont(new Font(null,Font.BOLD,20));
        button3.setFocusable(false);
        button3.addActionListener(this);

        
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        mainFrame.add(panel2);
        //-----------------------------------------------------

        panel3 = new JPanel();
        panel3.setPreferredSize(new Dimension(450,60));
        panel3.setLayout(new FlowLayout(FlowLayout.LEADING,0,0));

        panel3_1 = new JPanel();
        panel3_1.setBorder(BorderFactory.createEtchedBorder());
        panel3_1.setPreferredSize(new Dimension(225,60));
        panel3_1.setLayout(new FlowLayout(FlowLayout.CENTER,0,15));

        label3_1 = new JLabel();
        label3_1.setFont(new Font("Ubuntu",Font.BOLD,20));
        label3_1.setText(" ");
        panel3_1.add(label3_1);
        //-------------------------------------------------------

        panel3_2 = new JPanel();
        panel3_2.setBorder(BorderFactory.createEtchedBorder());
        panel3_2.setLayout(new FlowLayout(FlowLayout.CENTER,0,12));
        panel3_2.setPreferredSize(new Dimension(225,60));
    
        label3_2 = new JLabel();
        label3_2.setFont(new Font("Ubuntu",Font.BOLD,25));
        label3_2.setText("V:1.0");
        panel3_2.add(label3_2);
        
        panel3.add(panel3_1);
        panel3.add(panel3_2);
        
        mainFrame.add(panel3);
        //-------------------------------------------------------

        mainFrame.setVisible(true);
        //-------------------------------------------------------
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()==button1)
       {
            mainFrame.remove(panel1);
            mainFrame.remove(panel2);
            mainFrame.remove(panel3);
            mainFrame.repaint();
            mainob.gameframe();
            mainFrame.dispose();
       }
       if(e.getSource()==button2)
       {
           mainob2.helpFrame();
       }
       if(e.getSource()==button3)
       {
           System.exit(0);
       }
    }

    //------------------------------------------------------------

    @Override
    public void keyTyped(KeyEvent e) 
    {
        switch(e.getKeyChar())
        {
            case 's' :   mainFrame.remove(panel1);
                         mainFrame.remove(panel2);
                         mainFrame.remove(panel3);
                         mainFrame.repaint();
                         mainob.gameframe();
                         mainFrame.dispose();
                         break;

            case 'h' :   mainob2.helpFrame();
                         break;

            case 'e' :   System.exit(0);
                         break;

        }
    }
    @Override
    public void keyPressed(KeyEvent e)  {  }
    @Override
    public void keyReleased(KeyEvent e) {  }
}
