import javax.swing.*;
import java.awt.*;

public class Task extends JPanel{

    private JLabel itemContentText;
    private JButton deleteBtn;

    Task(String itemContent){


        this.setPreferredSize(new Dimension(400,100));

        this.setLayout(new BorderLayout());

        //Task text
        itemContentText = new JLabel(itemContent);
        itemContentText.setPreferredSize(new Dimension(200,80));
        itemContentText.setFont(new Font("Sans-serif",Font.ROMAN_BASELINE,20));

        this.add(itemContentText,BorderLayout.CENTER);

        //Delete task button
        deleteBtn = new JButton("Delete");
        deleteBtn.setPreferredSize(new Dimension(100,20));
        deleteBtn.setBorder(BorderFactory.createEmptyBorder());

        this.add(deleteBtn,BorderLayout.EAST);

    }

    //Getters and Setters
    public JButton getDeleteBtn() {
        return deleteBtn;
    }

    public void setDeleteBtn(JButton deleteBtn) {
        this.deleteBtn = deleteBtn;
    }
}
