package indi.text_editor;

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

        JMenu edit = new JMenu("编辑");

        JMenuItem undo = new JMenuItem();
        AbstractAction undoAction = new AbstractAction("撤销") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("撤销");
            }
        };
        undoAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK));
        undo.setAction(undoAction);
        edit.add(undo);

        edit.addSeparator();

        JMenuItem cut = new JMenuItem();
        AbstractAction cutAction = new AbstractAction("剪切") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("剪切");
            }
        };
        cutAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));
        cut.setAction(cutAction);
        edit.add(cut);

        JMenuItem copy = new JMenuItem();
        AbstractAction copyAction = new AbstractAction("复制") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("复制");
            }
        };
        copyAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
        copy.setAction(copyAction);
        edit.add(copy);

        JMenuItem paste = new JMenuItem();
        AbstractAction pasteAction = new AbstractAction("粘贴") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("粘贴");
            }
        };
        pasteAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));
        paste.setAction(pasteAction);
        edit.add(paste);

        JMenuItem delete = new JMenuItem();
        AbstractAction deleteAction = new AbstractAction("删除") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("删除");
            }
        };
        deleteAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
        delete.setAction(deleteAction);
        edit.add(delete);

        edit.addSeparator();

        JMenuItem search = new JMenuItem();
        AbstractAction searchAction = new AbstractAction("使用 Bing 搜索") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("使用 Bing 搜索");
            }
        };
        searchAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK));
        search.setAction(searchAction);
        edit.add(search);

        JMenuItem find = new JMenuItem();
        AbstractAction findAction = new AbstractAction("查找") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("查找");
            }
        };
        findAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.CTRL_DOWN_MASK));
        find.setAction(findAction);
        edit.add(find);

        JMenuItem findNext = new JMenuItem();
        AbstractAction findNextAction = new AbstractAction("查找下一个") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("查找下一个");
            }
        };
        findNextAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
        findNext.setAction(findNextAction);
        edit.add(findNext);

        JMenuItem findPrevious = new JMenuItem();
        AbstractAction findPreviousAction = new AbstractAction("查找上一个") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("查找上一个");
            }
        };
        findPreviousAction.putValue(Action.ACCELERATOR_KEY,
                KeyStroke.getKeyStroke(KeyEvent.VK_F3, KeyEvent.SHIFT_DOWN_MASK));
        findPrevious.setAction(findPreviousAction);
        edit.add(findPrevious);

        JMenuItem replace = new JMenuItem();
        AbstractAction replaceAction = new AbstractAction("替换") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("替换");
            }
        };
        replaceAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_DOWN_MASK));
        replace.setAction(replaceAction);
        edit.add(replace);

        JMenuItem forward = new JMenuItem();
        AbstractAction forwardAction = new AbstractAction("转到") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("转到");
            }
        };
        forwardAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_G, KeyEvent.CTRL_DOWN_MASK));
        forward.setAction(forwardAction);
        edit.add(forward);

        edit.addSeparator();

        JMenuItem selectAll = new JMenuItem();
        AbstractAction selectAllAction = new AbstractAction("全选") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("全选");
            }
        };
        selectAllAction.putValue(Action.ACCELERATOR_KEY,
                KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));
        selectAll.setAction(selectAllAction);
        edit.add(selectAll);

        JMenuItem timeOrDate = new JMenuItem();
        AbstractAction timeOrDateAction = new AbstractAction("时间/日期") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("时间/日期");
            }
        };
        timeOrDateAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
        timeOrDate.setAction(timeOrDateAction);
        edit.add(timeOrDate);

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
