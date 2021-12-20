package GuiRockPaperScissors;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class help implements ActionListener, KeyListener
{
    JFrame frame;
    JPanel panel1;
    JPanel panel2;

    JScrollPane scrollPane;
    ImageIcon frameIcon;

    JButton button;

    public void helpFrame()
    {
         //------------------Final Body--------------------------
         frame = new JFrame();
         frame.setSize(450,300);
         frame.setLocation(5,130);
         frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
         frame.setResizable(false);
         frameIcon = new ImageIcon("images/rock.png");
         frame.setIconImage(frameIcon.getImage());
         frame.setFocusable(true);
         frame.requestFocus();
         frame.addKeyListener(this);
         
         //-------------------------------------------------------
         
         panel1 = new JPanel();
         JTextArea area = new JTextArea();
         String texts = "Help\n Click start on a new game\n then click on the button\n saying rock paper and scissors\n and enjoy the game";
         
         area.setText(texts);
         area.setFont(new Font(null,Font.BOLD,23));
         area.setEditable(false);
         
         scrollPane = new JScrollPane(area);
         scrollPane.setPreferredSize(new Dimension(430,220));
         panel1.add(scrollPane,BorderLayout.CENTER);
         
         frame.add(panel1);

        //------------------------------------------------------

        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(450,30));
        panel2.setLayout(new FlowLayout(FlowLayout.TRAILING,10,0));
        button = new JButton("Back to Game");
        button.setFont(new Font(null,Font.BOLD,16));
        button.addActionListener(this);

        panel2.add(button);
        frame.add(panel2);
        //-------------------------------------------------------
        frame.setVisible(true);
    }

    //---------------button Listener---------------------------

    @Override
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()==button)
       {
           frame.dispose();
       }
    }

     //---------------key Listener---------------------------

     @Override
     public void keyTyped(KeyEvent e) 
     {
         switch(e.getKeyChar())
         {
             case 'g' :   frame.dispose();
                          break;
 
             case 'b' :   frame.dispose();
                          break;
 
             case 'e' :   frame.dispose();
                          break;
 
         }
     }
     @Override
     public void keyPressed(KeyEvent e)  {  }
     @Override
     public void keyReleased(KeyEvent e) {  }
}
