package indi.lmr_zhy.text_editor.menu;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import indi.lmr_zhy.text_editor.App;

public class HelpMenu extends JMenu {
    public HelpMenu(App app) {
        this.setText("帮助");
        JMenuItem getHelp = new JMenuItem();
        AbstractAction getHelpAction = new AbstractAction("查看帮助") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "查看帮助");
            }
        };
        getHelp.setAction(getHelpAction);
        this.add(getHelp);

        JMenuItem feedback = new JMenuItem();
        AbstractAction feedbackAction = new AbstractAction("发送反馈") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "发送反馈");
            }
        };
        feedback.setAction(feedbackAction);
        this.add(feedback);

        JMenuItem about = new JMenuItem();
        AbstractAction aboutAction = new AbstractAction("关于记事本") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "关于记事本");
            }
        };
        about.setAction(aboutAction);
        this.add(about);
    }
}
