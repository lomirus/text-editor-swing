package indi.text_editor;

import javax.swing.*;

public class App {
    JFrame frame;
    private TextArea textArea;

    public App() {
        initTheme();
        this.frame = new JFrame("Text Editor");
        frame.setSize(640, 480);

        this.textArea = new TextArea();
        textArea.setLineWrap(true);
        frame.add(textArea);

        MenuBar menuBar = new MenuBar(this);
        frame.setJMenuBar(menuBar);
    }

    public String getContent() {
        return this.textArea.getText();
    }

    public void setContent(String newContent) {
        this.textArea.setText(newContent);
    }

    public void run() {
        this.frame.setVisible(true);
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

