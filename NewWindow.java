import java.awt.*;
import javax.swing.*;
public class NewWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Your Order is Placed!!--Thank you");

    NewWindow() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        label.setBounds(0, 0, 50, 30);
        label.setFont(new Font(null, Font.ITALIC+Font.BOLD, 14));

        frame.add(label);


    }
}