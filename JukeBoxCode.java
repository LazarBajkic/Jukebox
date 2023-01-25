import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JukeBoxCode extends JFrame implements ActionListener{
    
    JButton btn1=new JButton("Deo Volente-Boom Kitty");
    JButton btn2=new JButton("Holy War-Boom Kitty");
    JButton btn3=new JButton("Badland-Boom Kitty");
    JButton btn4=new JButton("Firewall-Boom Kitty");
    JButton btn5=new JButton("Law of the jungle-Boom Kitty");
    JPanel background=new JPanel();
    JLabel nowPlaying=new JLabel();


    JukeBoxCode(){
        this.setSize(600,600);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBackground(Color.BLACK);

        btn1.setSize(200,30);
        btn1.setLocation(200,100);
        btn1.addActionListener(this);
        btn1.setFocusable(false);
        btn1.setBackground(Color.gray);
        btn1.setForeground(Color.white);
        
        btn2.setSize(200,30);
        btn2.setLocation(200,150);
        btn2.addActionListener(this);
        btn2.setFocusable(false);
        btn2.setBackground(Color.gray);
        btn2.setForeground(Color.yellow);

        btn3.setSize(200,30);
        btn3.setLocation(200,200);
        btn3.addActionListener(this);
        btn3.setFocusable(false);
        btn3.setBackground(Color.gray);
        btn3.setForeground(Color.red);

        btn4.setSize(200,30);
        btn4.setLocation(200,250);
        btn4.addActionListener(this);
        btn4.setFocusable(false);
        btn4.setBackground(Color.gray);
        btn4.setForeground(Color.orange);

        btn5.setSize(200,30);
        btn5.setLocation(200,300);
        btn5.addActionListener(this);
        btn5.setFocusable(false);
        btn5.setBackground(Color.gray);
        btn5.setForeground(Color.green);

        nowPlaying.setSize(250,30);
        nowPlaying.setLocation(200,400);

        background.setSize(600,600);
        background.setLocation(0, 0);
        background.setBackground(Color.black);

        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
        this.add(btn5);
        this.add(nowPlaying);
        this.add(background);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
    
    if(e.getSource()==btn1){
        song1();
        nowPlaying.setText("Now playing: Deo Volente");
        nowPlaying.setForeground(Color.white);
    }
    
    else if(e.getSource()==btn2){
        song2();
        nowPlaying.setText("Now playing: Holy war");
        nowPlaying.setForeground(Color.yellow);
    }
    
    else if(e.getSource()==btn3){
        song3();
        nowPlaying.setText("Now playing: Badland");
        nowPlaying.setForeground(Color.red);
    }
    
    else if(e.getSource()==btn4){
        song4();
        nowPlaying.setText("Now playing: Firewall");
        nowPlaying.setForeground(Color.orange);
    }
    
    else if(e.getSource()==btn5){
        song5();
        nowPlaying.setText("Now playing: Law of the Jungle");
        nowPlaying.setForeground(Color.green);
    }

    }
    public static void song1(){
        try{
        File file1=new File("Deo-Volente.wav");
        AudioInputStream audiostream1=AudioSystem.getAudioInputStream(file1);
        Clip clip1=AudioSystem.getClip();
        clip1.open(audiostream1);
        clip1.start();
        }catch(LineUnavailableException e1){
            e1.printStackTrace();
        }catch(IOException e1){
            e1.printStackTrace();
        }catch(UnsupportedAudioFileException e1){
            e1.printStackTrace();
        }
    }

    public static void song2(){
        try{
            File file2=new File("Holy-War.wav");
        AudioInputStream audiostream2=AudioSystem.getAudioInputStream(file2);
        Clip clip2=AudioSystem.getClip();
        clip2.open(audiostream2);
        clip2.start();
        }catch(LineUnavailableException e1){
            e1.printStackTrace();
        }catch(IOException e1){
            e1.printStackTrace();
        }catch(UnsupportedAudioFileException e1){
            e1.printStackTrace();
        }
    }

    public static void song3(){
        try{
        File file3=new File("Badland.wav");
        AudioInputStream audiostream3=AudioSystem.getAudioInputStream(file3);
        Clip clip3=AudioSystem.getClip();
        clip3.open(audiostream3);
        clip3.start();
        }catch(LineUnavailableException e1){
            e1.printStackTrace();
        }catch(IOException e1){
            e1.printStackTrace();
        }catch(UnsupportedAudioFileException e1){
            e1.printStackTrace();
        }
    }

    public static void song4(){
        try{
        File file4=new File("Firewall.wav");
        AudioInputStream audiostream4=AudioSystem.getAudioInputStream(file4);
        Clip clip4=AudioSystem.getClip();
        clip4.open(audiostream4);
        clip4.start();
        }catch(LineUnavailableException e1){
            e1.printStackTrace();
        }catch(IOException e1){
            e1.printStackTrace();
        }catch(UnsupportedAudioFileException e1){
            e1.printStackTrace();
        }
    }

    public static void song5(){
        try{
        File file5=new File("Law-of-the-Jungle.wav");
        AudioInputStream audiostream5=AudioSystem.getAudioInputStream(file5);
        Clip clip5=AudioSystem.getClip();
        clip5.open(audiostream5);
        clip5.start();
        }catch(LineUnavailableException e1){
            e1.printStackTrace();
        }catch(IOException e1){
            e1.printStackTrace();
        }catch(UnsupportedAudioFileException e1){
            e1.printStackTrace();
        }
    }
}

