package text_editor;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        initTheme();
        JFrame frame = new JFrame("Text Editor");
        frame.setSize(640, 480);
        frame.setVisible(true);

        TextArea textArea = new TextArea();
        frame.add(textArea);

        MenuBar menuBar = new MenuBar();
        frame.setJMenuBar(menuBar);
    }

    private static void initTheme() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
}

