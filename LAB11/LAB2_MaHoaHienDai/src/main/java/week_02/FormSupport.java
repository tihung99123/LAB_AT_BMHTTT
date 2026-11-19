package week_02;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

final class FormSupport {

    private FormSupport() {
    }

    static JTextArea area(int rows) {
        JTextArea area = new JTextArea(rows, 50);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        return area;
    }

    static void row(JPanel panel, String label, Component component) {
        panel.add(new JLabel(label));
        panel.add(component);
    }

    static JPanel grid() {
        return new JPanel(new GridLayout(0, 2, 8, 6));
    }

    static JPanel buttons(JButton... buttons) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        for (JButton button : buttons) {
            panel.add(button);
        }
        return panel;
    }

    static void show(JFrame frame, JPanel fields, JPanel controls, JLabel status) {
        JPanel content = new JPanel(new BorderLayout(8, 8));
        content.add(fields, BorderLayout.CENTER);
        JPanel south = new JPanel(new BorderLayout());
        south.add(controls, BorderLayout.NORTH);
        south.add(status, BorderLayout.SOUTH);
        content.add(south, BorderLayout.SOUTH);
        frame.setContentPane(content);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    static JScrollPane scroll(JTextArea area) {
        return new JScrollPane(area);
    }

    static JTextField field(String text, int columns) {
        return new JTextField(text, columns);
    }
}