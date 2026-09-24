import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class FortuneTellerFrame extends JFrame {

    private String[] fortunes = {
            "The end is near. Please backup your data.",
            "If you eat something and nobody sees you eat it, it has no calories.",
            "Your finances will be a key to your financial future.",
            "New romance is in the future. Ignore previous fortune.",
            "A dubious friend may be an enemy in camouflage. Or just wearing a weird hat.",
            "The fortune you seek is in another fortune.",
            "Error 404: Fortune not found. Please try again later.",
            "You will soon be hungry again.",
            "Never test the depth of the water with both feet.",
            "Confucius say: He who laughs last didn't get the joke.",
            "You will read this fortune and think, \"Wow, that is so true.\"",
            "He who cookies with one hand has dirty hand."
    };
    private int previousfortune = -1;

    public FortuneTellerFrame(){
        JPanel toppanel = new JPanel();
        ImageIcon fortuneimg = new ImageIcon("RES/FortuneTeller_img.png");
        JLabel titlelabel = new JLabel("FortuneTeller", fortuneimg, JLabel.CENTER);
        titlelabel.setFont(new Font("Serif", Font.BOLD, 48));
        titlelabel.setHorizontalTextPosition(JLabel.CENTER);
        titlelabel.setVerticalTextPosition(JLabel.BOTTOM);
        toppanel.add(titlelabel);

        JPanel middlepanel = new JPanel();
        JTextArea fortunetextarea = new JTextArea(10, 25);
        fortunetextarea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        fortunetextarea.setLineWrap(true);
        JScrollPane scrollpane = new JScrollPane(fortunetextarea);
        middlepanel.add(scrollpane,BorderLayout.CENTER);

        JPanel bottompanel = new JPanel();
        JButton fortunebutton = new JButton("Read My Fortune!");
        JButton quitbutton = new JButton("Quit");
        fortunebutton.setFont(new Font("Comic Sans", Font.ITALIC, 18));
        quitbutton.setFont(new Font("Comic Sans", Font.ITALIC, 18));
        bottompanel.add(fortunebutton);
        bottompanel.add(quitbutton);

        fortunebutton.addActionListener(
                e ->{
                    Random random = new Random();
                    int currentfortune;
                    do {
                        currentfortune = random.nextInt(fortunes.length);
                    }
                    while (currentfortune == previousfortune);
                    previousfortune = currentfortune;
                    fortunetextarea.append(fortunes[currentfortune] + "\n");
                    System.out.println(fortunes[currentfortune]);
                }
        );

        quitbutton.addActionListener(e -> {System.exit(0);});


        setLayout(new BorderLayout(10,10));
        add(toppanel, BorderLayout.NORTH);
        add(middlepanel, BorderLayout.CENTER);
        add(bottompanel, BorderLayout.SOUTH);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screensize = toolkit.getScreenSize();
        int width = (int)(screensize.width * .75);
        int height = (int)(screensize.height * .75);
        setTitle("FortuneTeller");
        setSize(width, height);

        setLocationRelativeTo(null);

    }
}
