package GuiRockPaperScissors;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.util.Random;

public class gameframeclass implements ActionListener, ComponentListener
{

    int Xlocation = 458;
    int Ylocation = 130;

    int rounds = 1;
    int userScore = 0;
    int ComScore = 0;
    int userinput;
    int Cominput;
    String winner;
    String finalwinner;
    String button5Text = "Next Round";

    JFrame frame = new JFrame("Rock paper Scissors");
    JScrollPane scrollPane;

    JPanel panel1;
    JPanel panel2;
    JPanel panel3; JPanel panel3_1; JPanel panel3_2;
    JPanel panel4;
    JPanel panel5; JPanel panel5_1; JPanel panel5_2;

    JLabel label1;
    JLabel label2; 
    JLabel label3_1; 
    JLabel label3_2; 
    JLabel label3_3; 
    JLabel label3_4; 
    JLabel label4; 
    JLabel label5_1; 


    JButton button1l2;
    JButton button2l2;
    JButton button3l2;
    JButton button1l5;
    JButton buttonPA1;
    JButton buttonPA2;

    ImageIcon userIcon;
    ImageIcon comIcon;
    ImageIcon frameIcon;


    public void gameframe()
    {
        //------------------Main Body--------------------------

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,480);
        frame.setLocation(Xlocation,Ylocation);
        frame.addComponentListener(this);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        frame.setResizable(false);
        frameIcon = new ImageIcon("images/paper.png");
        frame.setIconImage(frameIcon.getImage());
        //-----------------------------------------------------

        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(450,93));
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER,0,15));
        panel1.setBorder(BorderFactory.createEtchedBorder());
       
        label1 = new JLabel();
        label1.setText("ROUND:"+rounds);
        label1.setFont(new Font(null,Font.BOLD,38));

        panel1.add(label1);

        //-------------------------------------------------------

        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(450,60));
        panel2.setLayout(new FlowLayout(FlowLayout.LEADING,6,15));
        panel2.setBorder(BorderFactory.createEtchedBorder());

        label2 = new JLabel();
        label2.setText("Choose One:");
        label2.setFont(new Font(null,Font.BOLD,18));

        button1l2 = new JButton("ROCK");
        button2l2 = new JButton("PAPER");
        button3l2 = new JButton("SCISSORS");

        button1l2.setFont(new Font("Comic Sans", Font.BOLD, 16));
        button2l2.setFont(new Font("Comic Sans", Font.BOLD, 16));
        button3l2.setFont(new Font("Comic Sans", Font.BOLD, 16));

        button1l2.addActionListener(this);
        button2l2.addActionListener(this);
        button3l2.addActionListener(this);

        button1l2.setFocusable(false);
        button2l2.setFocusable(false);
        button3l2.setFocusable(false);

        panel2.add(label2);
        panel2.add(button1l2);
        panel2.add(button2l2);
        panel2.add(button3l2);

        //-------------------------------------------------------

        panel3 = new JPanel();
        panel3.setPreferredSize(new Dimension(450,150));
        panel3.setLayout(new FlowLayout(FlowLayout.LEADING,0,0));

        //-------------------------------------------------------

        panel3_1 = new JPanel();
        panel3_1.setBorder(BorderFactory.createEtchedBorder());
        panel3_1.setPreferredSize(new Dimension(225,150));
        panel3_1.setLayout(new FlowLayout(FlowLayout.CENTER,150,15));

        label3_1 = new JLabel();
        label3_1.setText("You Showed:");
        label3_1.setFont(new Font("Ubuntu",Font.BOLD,17));
        
        label3_2 = new JLabel();

        panel3_1.add(label3_1);
        panel3_1.add(label3_2);

        //-------------------------------------------------------

        panel3_2 = new JPanel();
        panel3_2.setBorder(BorderFactory.createEtchedBorder());
        panel3_2.setPreferredSize(new Dimension(225,150));
        panel3_2.setLayout(new FlowLayout(FlowLayout.CENTER,150,15));

        label3_3 = new JLabel();
        label3_3.setText("COM Showed:");
        label3_3.setFont(new Font("Ubuntu",Font.BOLD,17));
        
        label3_4 = new JLabel();

        panel3_2.add(label3_3);
        panel3_2.add(label3_4);

        //-------------------------------------------------------

        panel3.add(panel3_1);
        panel3.add(panel3_2);

        //-------------------------------------------------------
        
        panel4 = new JPanel();
        panel4.setBorder(BorderFactory.createEtchedBorder());
        panel4.setPreferredSize(new Dimension(450,60));
        panel4.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));

        label4 = new JLabel();
        label4.setFont(new Font("Ubuntu",Font.BOLD,30));

        panel4.add(label4);


        //-------------------------------------------------------

        panel5 = new JPanel();
        panel5.setPreferredSize(new Dimension(450,60));
        panel5.setLayout(new FlowLayout(FlowLayout.LEADING,0,0));

        //-------------------------------------------------------

        panel5_1 = new JPanel();
        panel5_1.setBorder(BorderFactory.createEtchedBorder());
        panel5_1.setPreferredSize(new Dimension(225,60));
        panel5_1.setLayout(new FlowLayout(FlowLayout.CENTER,0,15));

        label5_1 = new JLabel();
        label5_1.setFont(new Font("Ubuntu",Font.BOLD,20));

        panel5_1.add(label5_1);
        //-------------------------------------------------------

        panel5_2 = new JPanel();
        panel5_2.setBorder(BorderFactory.createEtchedBorder());
        panel5_2.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));
        panel5_2.setPreferredSize(new Dimension(225,60));
        
        button1l5 = new JButton();
        button1l5.setText(button5Text);
        button1l5.setPreferredSize(new Dimension(150,40));
        button1l5.setFont(new Font("Comic Sans", Font.BOLD, 17));
        button1l5.setEnabled(false);
        button1l5.addActionListener(this);
        button1l5.setFocusable(false);
        panel5_2.add(button1l5);
        //-------------------------------------------------------

        panel5.add(panel5_1);
        panel5.add(panel5_2);

        //-------------------------------------------------------

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);

        frame.setVisible(true);

        //----------------------------------------------------

        
    }
    //==========================================================

    public void finalframe()
    {
        //------------------Final Body--------------------------
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,480);
        frame.setLocation(Xlocation,Ylocation);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        frame.setResizable(false);
        frameIcon = new ImageIcon("images/scisors.png");
        frame.setIconImage(frameIcon.getImage());
        //------------------------------------------------------

        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(450,100));
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER,0,20));
        panel1.setBorder(BorderFactory.createEtchedBorder());
        
        label1 = new JLabel();
        label1.setText("GAME OVER");
        label1.setFont(new Font(null,Font.BOLD,48));
        frame.add(panel1);
        panel1.add(label1);
        
        //------------------------------------------------------
        
        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(450,70));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER,0,8));
        panel2.setBorder(BorderFactory.createEtchedBorder());
      
        label2 = new JLabel();
        label2.setFont(new Font("Ubuntu",Font.ITALIC,45));
        
        panel2.add(label2);
        frame.add(panel2);
        //-----------------------------------------------------

        panel3 = new JPanel();
        panel3.setPreferredSize(new Dimension(450,130));
        panel3.setBorder(BorderFactory.createEtchedBorder());
                 
        JTextArea area = new JTextArea();
        area.setText("HighScores:\n\n1.player:20\n2.player:18\n3.Computer:16\n4.player:12\n5.Computer:10\n6.player:8\n7.Computer:7\n8.Computer:5\n");
        area.setFont(new Font(null,Font.BOLD,18));
        area.setEditable(false);

        scrollPane = new JScrollPane(area);
        scrollPane.setPreferredSize(new Dimension(440,149));
        panel3.add(scrollPane,BorderLayout.CENTER);

        frame.add(panel3);
        //-------------------------------------------------------

        panel4 = new JPanel();
        panel4.setBorder(BorderFactory.createEtchedBorder());
        panel4.setPreferredSize(new Dimension(450,60));
        panel4.setLayout(new FlowLayout(FlowLayout.CENTER,0,15));

        label4= new JLabel();
        label4.setFont(new Font("Ubuntu",Font.BOLD,25));

        panel4.add(label4);
        frame.add(panel4);
        //------------------------------------------------------
        panel5 = new JPanel();
        panel5.setPreferredSize(new Dimension(450,60));
        panel5.setLayout(new FlowLayout(FlowLayout.LEADING,0,0));

        //-------------------------------------------------------

        panel5_1 = new JPanel();
        panel5_1.setBorder(BorderFactory.createEtchedBorder());
        panel5_1.setPreferredSize(new Dimension(225,60));
        panel5_1.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));


        buttonPA1 = new JButton("Play Again");
        buttonPA1.setPreferredSize(new Dimension(150,40));
        buttonPA1.setFont(new Font("Comic Sans", Font.BOLD, 17));
        buttonPA1.addActionListener(this);
        buttonPA1.setFocusable(false);
        panel5_1.add(buttonPA1);
        //-------------------------------------------------------

        panel5_2 = new JPanel();
        panel5_2.setBorder(BorderFactory.createEtchedBorder());
        panel5_2.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));
        panel5_2.setPreferredSize(new Dimension(225,60));
        
        buttonPA2 = new JButton("Exit");
        buttonPA2.setPreferredSize(new Dimension(150,40));
        buttonPA2.setFont(new Font("Comic Sans", Font.BOLD, 17));
        buttonPA2.addActionListener(this);
        buttonPA2.setFocusable(false);
        panel5_2.add(buttonPA2);

        panel5.add(panel5_1);
        panel5.add(panel5_2);
        frame.add(panel5);

        //-------------------------------------------------------
        
        frame.setVisible(true);
    }
    //==========================================================


    //-----------------Location Changer-------------------------

    @Override
    public void componentResized(ComponentEvent e) { }
    @Override
    public void componentMoved(ComponentEvent e) 
    {
            Xlocation = frame.getX();
            Ylocation = frame.getY();
            frame.setLocation(Xlocation, Ylocation);  
    }
    @Override
    public void componentShown(ComponentEvent e) { } 
    @Override
    public void componentHidden(ComponentEvent e) { }  
   

    //===================ButtonListener========================

    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if(e.getSource()==button1l2)
       {
        //rock button

        userinput = 1;
        userIcon = new ImageIcon("images/rock2.png");
        label3_2.setIcon(userIcon);
        comGen();
        checker();
        button1l5.setEnabled(true);
        button1l2.setEnabled(false);
        button2l2.setEnabled(false);
        button3l2.setEnabled(false);
        button1l5.setText(button5Text);
        

       }
       if(e.getSource()==button2l2)
       {
        //paper button

        userinput = 2;
        userIcon = new ImageIcon("images/paper2.png");
        label3_2.setIcon(userIcon);
        comGen();
        checker();
        button1l5.setEnabled(true);
        button1l2.setEnabled(false);
        button2l2.setEnabled(false);
        button3l2.setEnabled(false);

       }
       if(e.getSource()==button3l2)
       {
        //scissors button

        userinput = 3;
        userIcon = new ImageIcon("images/scisors.png");
        label3_2.setIcon(userIcon);
        comGen();
        checker();
        button1l5.setEnabled(true);
        button1l2.setEnabled(false);
        button2l2.setEnabled(false);
        button3l2.setEnabled(false);

       }

       if(e.getSource()==button1l5)
       {
           //NextRound button

           if(rounds<3)
           {
               rounds++;
               frame.remove(panel1);
               frame.remove(panel2);
               frame.remove(panel3);
               frame.remove(panel4);
               frame.remove(panel5);
               frame.repaint();
               gameframe();
           }
            else if(rounds==3)
            {
               rounds++;
               System.out.println("Value of rounds:"+rounds);
               frame.remove(panel1);
               frame.remove(panel2);
               frame.remove(panel3);
               frame.remove(panel4);
               frame.remove(panel5);
               frame.repaint();
               finalframe();
               label4.setText("Player:"+userScore+" || Com:"+ComScore);
               finalchecker();
            }
       }

       if(e.getSource()==buttonPA1)
       {
            rounds = 1;
            userScore = 0;
            ComScore = 0;
            button5Text = "Next Round";
            frame.remove(panel1);
            frame.remove(panel2);
            frame.remove(panel3);
            frame.remove(panel4);
            frame.remove(panel5);
            frame.repaint();
            gameframe();
       }
       if(e.getSource()==buttonPA2)
       {
            System.exit(0);
       }

    }

    //-----------------------------------------------------------

    public void checker()
    {
        if(userinput == 3 && Cominput == 2 ||
           userinput == 2 && Cominput == 1 ||
           userinput == 1 && Cominput == 3 )
        {
            String winner = "Player Won";
            label4.setText(winner);
            userScore++;
            
            label5_1.setText("Player:"+userScore+" || Com:"+ComScore );

            if(rounds == 3)
            {
                button5Text = "Final Score";
                button1l5.setText(button5Text);
            }    
        }
        else if(
                Cominput == 3 && userinput == 2 ||
                Cominput == 2 && userinput == 1 ||
                Cominput == 1 && userinput == 3   )
        {
            String winner = "Com Won";
            label4.setText(winner);
            ComScore++;

            label5_1.setText("Player:"+userScore+" || Com:"+ComScore );

            if(rounds == 3)
            {
                button5Text = "Final Score";
                button1l5.setText(button5Text);
            }
        }
        else if(Cominput==userinput)
        {
            String winner = "Draw ";
            label4.setText(winner);

            label5_1.setText("Player:"+userScore+" || Com:"+ComScore );

            if(rounds == 3)
            {
                button5Text = "Final Score";
                button1l5.setText(button5Text);
            }
        }
    }

    //-----------------------------------------------------------


    public void finalchecker()
    {
        if(userScore>ComScore)
        {
            finalwinner = "PLAYER WINS";
            label2.setText(finalwinner);
        }
        else if(ComScore>userScore)
        {
            finalwinner = "COM WINS";
            label2.setText(finalwinner);
        }
        else if(ComScore==userScore)
        {
            finalwinner = "DRAW GAME";
            label2.setText(finalwinner);
        }
    }


    //-----------------------------------------------------------

    public void comGen()
 {
     Random random  = new Random();
     Cominput = random.nextInt(3)+1;

     switch (Cominput) 
     {
         case 1:
            Cominput = 1;
            comIcon = new ImageIcon("images/rock2.png");
            label3_4.setIcon(comIcon);
            break;

         case 2:
            Cominput = 2;
            comIcon = new ImageIcon("images/paper2.png");
            label3_4.setIcon(comIcon);
            break;

         case 3:
            Cominput = 3;
            comIcon = new ImageIcon("images/scisors2.png");
            label3_4.setIcon(comIcon);
            break;
     
    }
     
 }


}//Yes I wrote that shit :)