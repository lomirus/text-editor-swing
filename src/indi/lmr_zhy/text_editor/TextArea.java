package indi.lmr_zhy.text_editor;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.Highlight;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TextArea extends JScrollPane {
    private JTextArea textArea;
    private Highlighter highlighter;

    public TextArea() {
        this.textArea = new JTextArea();
        textArea.setEditable(true);
        textArea.setLineWrap(true);
        textArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textArea.getHighlighter().removeAllHighlights();
            }
        });

        this.highlighter = textArea.getHighlighter();
        this.setViewportView(textArea);
        this.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }

    public String getText() {
        return this.textArea.getText();
    }

    public void setText(String newText) {
        this.textArea.setText(newText);
    }

    public void setHightLight(int start, int end) throws BadLocationException {
        this.highlighter.removeAllHighlights();
        this.highlighter.addHighlight(start, end, DefaultHighlighter.DefaultPainter);
    }

    public Highlight[] getHightLights() {
        return this.highlighter.getHighlights();
    }
}