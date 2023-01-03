import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class AppFrame extends JFrame{

    private List list;
    private Header header;
    private ArrayList<Task> taskList;

    AppFrame(){

        this.setSize(400,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        list = new List();
        header = new Header();

        //Adding frames into layout
        this.add(list, BorderLayout.CENTER);
        this.add(header,BorderLayout.NORTH);

        this.setVisible(true);

        addListeners();

    }

    public void addListeners(){

        taskList = new ArrayList<>(); // Stores tasks
        //Add task
        header.getEnter().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Task task = new Task(header.getTextBar());
                list.add(task);
                taskList.add(task);

                //Delete task
                task.getDeleteBtn().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        JButton delete = task.getDeleteBtn();
                        //Search for task that is mousePressed
                        for(int i=0; i< taskList.size();i++){
                            if(taskList.get(i).getDeleteBtn()==delete){
                                list.remove(taskList.get(i));
                            }
                        }
                        revalidate();
                        repaint();
                    }
                });
                revalidate();
            }
        });



    }
}
