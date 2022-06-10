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

    public void setHightLight(int start, int end) {
        this.highlighter.removeAllHighlights();
        try {
            this.highlighter.addHighlight(start, end, DefaultHighlighter.DefaultPainter);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }

    public Highlight[] getHightLights() {
        return this.highlighter.getHighlights();
    }

    public void findNext(String text) {
        int caret_pos = this.textArea.getCaretPosition();
        int start = this.textArea.getText().indexOf(text, caret_pos);
        if (start != -1) {
            this.setHightLight(start, text.length() + start);
            this.textArea.setCaretPosition(text.length() + start);
        } else if (caret_pos != 0) {
            this.textArea.setCaretPosition(0);
            this.findNext(text);
        }
    }

    public void findPrevious(String text) {
        int caret_pos = this.textArea.getCaretPosition();
        int start = this.textArea.getText().lastIndexOf(text, caret_pos);
        if (start != -1) {
            this.setHightLight(start, text.length() + start);
            if (start == 0) {
                this.textArea.setCaretPosition(this.textArea.getText().length());
            } else {
                this.textArea.setCaretPosition(start - 1);
            }
        } else if (caret_pos != this.textArea.getText().length()) {
            this.textArea.setCaretPosition(this.textArea.getText().length());
            this.findPrevious(text);
        }
    }

    public void replaceNext(String from, String to) {
        int caret_pos = this.textArea.getCaretPosition();
        int start = this.textArea.getText().indexOf(from, caret_pos);
        if (start != -1) {
            this.setHightLight(start, from.length() + start);
            this.textArea.setCaretPosition(from.length() + start);
            this.textArea.replaceRange(to, start, from.length() + start);
        } else if (caret_pos != 0) {
            this.textArea.setCaretPosition(0);
            this.replaceNext(from, to);
        }
    }

    public void replacePrevious(String from, String to) {
        int caret_pos = this.textArea.getCaretPosition();
        int start = this.textArea.getText().lastIndexOf(from, caret_pos);
        if (start != -1) {
            this.setHightLight(start, from.length() + start);
            this.textArea.replaceRange(to, start, from.length() + start);
            if (start == 0) {
                this.textArea.setCaretPosition(this.textArea.getText().length());
            } else {
                this.textArea.setCaretPosition(start - 1);
            }
        } else if (caret_pos != this.textArea.getText().length()) {
            this.textArea.setCaretPosition(this.textArea.getText().length());
            this.replacePrevious(from, to);
        }
    }
}