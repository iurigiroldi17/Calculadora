import javax.swing.*;

public class Calculadora {
    private JPanel Calculadora;
    private JTextField txtDisplay;
    private JButton Button;
    private JButton a9Button;
    private JButton a00Button;
    private JButton button4;
    private JButton a3Button;
    private JButton button6;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a6Button;
    private JButton button11;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Calculadora().Calculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
