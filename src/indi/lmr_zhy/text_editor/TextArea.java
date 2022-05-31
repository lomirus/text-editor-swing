package indi.lmr_zhy.text_editor;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class TextArea extends JScrollPane {
    private JTextArea textArea;
    public TextArea() {
        this.textArea = new JTextArea();
        textArea.setEditable(true);
        textArea.setLineWrap(true);

        this.setViewportView(textArea);
        this.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }

    public String getText() {
        return this.textArea.getText();
    }

    public void setText(String newText) {
        this.textArea.setText(newText);
    }
}