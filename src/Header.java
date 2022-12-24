import javax.swing.*;
import java.awt.*;

public class Header extends JPanel{

    private JTextField textBar;
    private JButton enter;
    private JLabel titleText;

    Header(){


        this.setPreferredSize(new Dimension(400,130));
        this.setLayout(new BorderLayout());

        //Title
        titleText = new JLabel("To Do List");
        titleText.setPreferredSize(new Dimension(200,50));
        titleText.setFont(new Font("Sans-serif",Font.BOLD,20));
        titleText.setHorizontalAlignment(JLabel.CENTER);

        this.add(titleText, BorderLayout.NORTH);

        //Field for user input
        textBar = new JTextField("Enter task...");
        textBar.setPreferredSize(new Dimension(100,80));
        textBar.setBorder(BorderFactory.createEmptyBorder());

        this.add(textBar,BorderLayout.CENTER);

        //Enter button
        enter = new JButton("Enter");
        enter.setPreferredSize(new Dimension(100,20));
        enter.setBorder(BorderFactory.createEmptyBorder());

        this.add(enter,BorderLayout.EAST);

    }

    //Getters and Setters
    public JButton getEnter() {
        return enter;
    }

    public void setEnter(JButton enter) {
        this.enter = enter;
    }

    public String getTextBar() {
        return textBar.getText();
    }

    public void setTextBar(JTextField textBar) {
        this.textBar = textBar;
    }
}
