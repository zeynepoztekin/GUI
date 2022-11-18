import javax.swing.*;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab8 {
    public static void main(String[] args) {
        new SikayetFormu();
    }

}
class SikayetFormu extends JFrame {
    JTextArea input;
    public SikayetFormu(){

        setSize(500,500);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("Sikayet Formu");

        JMenu menu = new JMenu("File");
        JMenuItem exit = new JMenuItem("Exit");

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu.add(exit);
        JMenuBar bar = new JMenuBar();
        bar.add(menu);
        setJMenuBar(bar);


        //Center Begin##
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9,1));
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel2.add(new Label("SIKAYET FORMU"));

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel1.add(new Label("Isim - Soyisim : "));
        panel1.add(new TextField(20));

        JPanel panel4 = new JPanel();
        panel4.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel4.add(new Label("E-mail :             "));
        panel4.add(new TextField(20));

        JPanel panel5 = new JPanel();
        panel5.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel5.add(new Label("Firma : \t\t\t\t\t\t\t"));
        JComboBox<String> combo = new JComboBox<String>();
        combo.addItem("X");
        combo.addItem("Y");
        combo.addItem("Z");
        panel5.add(combo);

        JPanel panel7 = new JPanel();
        panel7.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel7.add(new Label("Konu :\t\t\t\t\t\t\t\t\t\t  "));
        panel7.add(new JCheckBox("Kurye"));
        panel7.add(new JCheckBox("Restoran"));

        JPanel panel8 = new JPanel();
        panel8.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel8.add(new Label("Sikayet Formu"),BorderLayout.CENTER);
        JPanel panelDown = new JPanel();
        panelDown.setLayout(new BorderLayout());
        TextArea textArea = new TextArea(10,15);
        panelDown.add(textArea,BorderLayout.CENTER);

        add(panel);
        panel.add(panel2);
        panel.add(panel1);
        panel.add(panel4);
        panel.add(panel5);
        panel.add(panel7);
        panel.add(panel8);
        panel.add(panelDown);

        //Center end##


        JPanel button_panel = new JPanel();
        button_panel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        JButton enter = new JButton("Kaydet");
        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ConfirmWindow();
            }
        });
        button_panel.add(enter);
        add(button_panel,BorderLayout.SOUTH);

        setVisible(true);
    }
}
class ConfirmWindow extends JFrame
{
    public ConfirmWindow()
    {
        setSize(300,100);
        setLayout(new GridLayout(2, 1));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        JLabel label = new JLabel("Sikayetiniz basari ile kaydedildi");
        add(label);
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton exit = new JButton("Kapat");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        panel.add(exit);
        add(panel);
        setVisible(true);
    }
}