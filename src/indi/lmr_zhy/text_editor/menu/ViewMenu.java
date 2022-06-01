package indi.lmr_zhy.text_editor.menu;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import indi.lmr_zhy.text_editor.App;

public class ViewMenu extends JMenu {
    public ViewMenu(App app) {
        this.setText("查看");
        JMenu scale = new JMenu("缩放");
        this.add(scale);

        JMenuItem scaleUp = new JMenuItem();
        AbstractAction scaleUpAction = new AbstractAction("放大") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "放大");
            }
        };
        scaleUpAction.putValue(Action.ACCELERATOR_KEY,
                KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, KeyEvent.CTRL_DOWN_MASK));
        scaleUp.setAction(scaleUpAction);
        scale.add(scaleUp);

        JMenuItem scaleDown = new JMenuItem();
        AbstractAction scaleDownAction = new AbstractAction("缩小") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "缩小");
            }
        };
        scaleDownAction.putValue(Action.ACCELERATOR_KEY,
                KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, KeyEvent.CTRL_DOWN_MASK));
        scaleDown.setAction(scaleDownAction);
        scale.add(scaleDown);

        JMenuItem resetDefaultScale = new JMenuItem();
        AbstractAction resetDefaultScaleAction = new AbstractAction("恢复默认缩放") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "恢复默认缩放");
            }
        };
        resetDefaultScaleAction.putValue(Action.ACCELERATOR_KEY,
                KeyStroke.getKeyStroke(KeyEvent.VK_0, KeyEvent.CTRL_DOWN_MASK));
        resetDefaultScale.setAction(resetDefaultScaleAction);
        scale.add(resetDefaultScale);

        JMenuItem statusBar = new JMenuItem();
        AbstractAction statusBarAction = new AbstractAction("状态栏") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "状态栏");
            }
        };
        statusBar.setAction(statusBarAction);
        this.add(statusBar);
    }
}
