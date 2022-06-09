package indi.lmr_zhy.text_editor;

import java.nio.file.Path;

import javax.swing.*;

public class App {
    public JFrame frame;
    public TextArea textArea;
    public Path filePath;

    public App() {
        initTheme();
        this.frame = new JFrame("新建文本文档 - 记事本");
        this.frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);

        this.textArea = new TextArea();
        frame.add(this.textArea);

        MenuBar menuBar = new MenuBar(this);
        frame.setJMenuBar(menuBar);
    }

    public void setTitle(String newTitle) {
        this.frame.setTitle(newTitle + '-' + "记事本");
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
