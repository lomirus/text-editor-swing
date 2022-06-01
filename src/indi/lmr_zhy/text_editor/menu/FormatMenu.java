package indi.lmr_zhy.text_editor.menu;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import indi.lmr_zhy.text_editor.App;

public class FormatMenu extends JMenu {
    public FormatMenu(App app) {
        this.setText("格式");
        JMenuItem wrap = new JMenuItem();
        AbstractAction wrapAction = new AbstractAction("自动换行") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("自动换行");
            }
        };
        wrap.setAction(wrapAction);
        this.add(wrap);

        JMenuItem font = new JMenuItem();
        AbstractAction fontAction = new AbstractAction("字体") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("字体");
            }
        };
        font.setAction(fontAction);
        this.add(font);
    }
}
