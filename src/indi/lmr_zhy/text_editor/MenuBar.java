package indi.lmr_zhy.text_editor;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuBar extends JMenuBar {
    public MenuBar(App app) {
        JMenu file = new FileMenu(app);        

        JMenu edit = new EditMenu(app);

        JMenu format = new JMenu("格式");

        JMenuItem wrap = new JMenuItem();
        AbstractAction wrapAction = new AbstractAction("自动换行") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("自动换行");
            }
        };
        wrap.setAction(wrapAction);
        format.add(wrap);

        JMenuItem font = new JMenuItem();
        AbstractAction fontAction = new AbstractAction("字体") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("字体");
            }
        };
        font.setAction(fontAction);
        format.add(font);

        JMenu view = new JMenu("查看");

        JMenu scale = new JMenu("缩放");
        view.add(scale);

        JMenuItem scaleUp = new JMenuItem();
        AbstractAction scaleUpAction = new AbstractAction("放大") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("放大");
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
                System.out.println("缩小");
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
                System.out.println("恢复默认缩放");
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
                System.out.println("状态栏");
            }
        };
        statusBar.setAction(statusBarAction);
        view.add(statusBar);

        JMenu help = new JMenu("帮助");

        JMenuItem getHelp = new JMenuItem();
        AbstractAction getHelpAction = new AbstractAction("查看帮助") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("查看帮助");
            }
        };
        getHelp.setAction(getHelpAction);
        help.add(getHelp);

        JMenuItem feedback = new JMenuItem();
        AbstractAction feedbackAction = new AbstractAction("发送反馈") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("发送反馈");
            }
        };
        feedback.setAction(feedbackAction);
        help.add(feedback);

        JMenuItem about = new JMenuItem();
        AbstractAction aboutAction = new AbstractAction("关于记事本") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("关于记事本");
            }
        };
        about.setAction(aboutAction);
        help.add(about);

        this.add(file);
        this.add(edit);
        this.add(format);
        this.add(view);
        this.add(help);
    }
}
