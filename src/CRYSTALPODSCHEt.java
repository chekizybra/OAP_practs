import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
public class CRYSTALPODSCHEt {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Мое первое окно");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JButton button = new JButton("Нажми меня!");
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Кнопка нажата!"));
        frame.add(button, BorderLayout.SOUTH);

        frame.setVisible(true);


    }
}
