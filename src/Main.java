import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    JButton jButton;
    JList<Integer>displayList;

    public static void main(String[] args) {
        new Main().go();
    }

    private void go() {
        JFrame jFrameHome = new JFrame();
        jButton = new JButton("Add Random Number!");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int randomNumber = random.nextInt(101);
                Model.model.addElement(randomNumber);
                System.out.println("here");
            }
        });

        jFrameHome.getContentPane().add(BorderLayout.SOUTH, jButton);
        jFrameHome.setSize(700,700);

        displayList = new JList<>(Model.model);
        JScrollPane scrollPane = new JScrollPane(displayList);
        jFrameHome.getContentPane().add(BorderLayout.CENTER, scrollPane);

        jFrameHome.setVisible(true);
    }
}
