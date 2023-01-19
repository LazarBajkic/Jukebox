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

public class JukeBoxCode extends JFrame implements ActionListener{
    
    JButton btn1=new JButton("Deo Volente-Boom Kitty");

    JukeBoxCode(){
        this.setSize(600,600);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        btn1.setSize(200,30);
        btn1.setLocation(100,100);
        btn1.addActionListener(this);

        this.add(btn1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    if(e.getSource()==btn1){
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

    }
}
