import javax.swing.*;
import java.awt.*;

public class FortuneTellerFrame extends JFrame {

    public FortuneTellerFrame(){
        JPanel toppanel = new JPanel();
        ImageIcon fortuneimg = new ImageIcon("RES/FortuneTeller_img.png");
        JLabel titlelabel = new JLabel("FortuneTeller", fortuneimg, JLabel.CENTER);
        titlelabel.setFont(new Font("Serif", Font.BOLD, 48));
        toppanel.add(titlelabel);

        JPanel middlepanel = new JPanel();
        JTextArea fortunetextarea = new JTextArea();
        fortunetextarea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        JScrollPane scrollpane = new JScrollPane(fortunetextarea);
        middlepanel.add(scrollpane);

        JPanel bottompanel = new JPanel();
        JButton fortunebutton = new JButton("Read My Fortune!");
        JButton quitbutton = new JButton("Quit");
        fortunebutton.setFont(new Font("Comic Sans", Font.ITALIC, 18));
        quitbutton.setFont(new Font("Comic Sans", Font.ITALIC, 18));
        bottompanel.add(fortunebutton);
        bottompanel.add(quitbutton);


    }
}
