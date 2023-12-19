import javax.swing.*;

public class MainFrame{
    public static void main(String[] args) {
        Double[] a = {29.0 , 0., -5.};

        HornersScheme frame = new HornersScheme(a);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


}