import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame{
    final int FRAME_WIDTH = getMaximumSize().width;
    final int FRAME_HEIGHT = getMaximumSize().height;

    public GUI(){
        setLayout(new FlowLayout());
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        //creates gui
        GUI example = new GUI();
        example.setVisible(true);
    }
}