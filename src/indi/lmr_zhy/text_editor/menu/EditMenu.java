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
import indi.lmr_zhy.text_editor.menu.edit.FindDialog;
import indi.lmr_zhy.text_editor.menu.edit.ReplaceDialog;

public class EditMenu extends JMenu {
    public EditMenu(App app) {
        this.setText("编辑");
        JMenuItem undo = new JMenuItem();
        AbstractAction undoAction = new AbstractAction("撤销") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "撤销");
            }
        };
        undoAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK));
        undo.setAction(undoAction);
        this.add(undo);

        this.addSeparator();

        JMenuItem cut = new JMenuItem();
        AbstractAction cutAction = new AbstractAction("剪切") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "剪切");
            }
        };
        cutAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));
        cut.setAction(cutAction);
        this.add(cut);

        JMenuItem copy = new JMenuItem();
        AbstractAction copyAction = new AbstractAction("复制") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "复制");
            }
        };
        copyAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
        copy.setAction(copyAction);
        this.add(copy);

        JMenuItem paste = new JMenuItem();
        AbstractAction pasteAction = new AbstractAction("粘贴") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "粘贴");
            }
        };
        pasteAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));
        paste.setAction(pasteAction);
        this.add(paste);

        JMenuItem delete = new JMenuItem();
        AbstractAction deleteAction = new AbstractAction("删除") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "删除");
            }
        };
        deleteAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
        delete.setAction(deleteAction);
        this.add(delete);

        this.addSeparator();

        JMenuItem search = new JMenuItem();
        AbstractAction searchAction = new AbstractAction("使用 Bing 搜索") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "使用 Bing 搜索");
            }
        };
        searchAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK));
        search.setAction(searchAction);
        this.add(search);

        JMenuItem find = new JMenuItem();
        AbstractAction findAction = new FindDialog(app);
        findAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.CTRL_DOWN_MASK));
        find.setAction(findAction);
        this.add(find);

        JMenuItem findNext = new JMenuItem();
        AbstractAction findNextAction = new AbstractAction("查找下一个") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "查找下一个");
            }
        };
        findNextAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
        findNext.setAction(findNextAction);
        this.add(findNext);

        JMenuItem findPrevious = new JMenuItem();
        AbstractAction findPreviousAction = new AbstractAction("查找上一个") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "查找上一个");
            }
        };
        findPreviousAction.putValue(Action.ACCELERATOR_KEY,
                KeyStroke.getKeyStroke(KeyEvent.VK_F3, KeyEvent.SHIFT_DOWN_MASK));
        findPrevious.setAction(findPreviousAction);
        this.add(findPrevious);

        JMenuItem replace = new JMenuItem();
        AbstractAction replaceAction = new ReplaceDialog(app);
        replaceAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_DOWN_MASK));
        replace.setAction(replaceAction);
        this.add(replace);

        JMenuItem forward = new JMenuItem();
        AbstractAction forwardAction = new AbstractAction("转到") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "转到");
            }
        };
        forwardAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_G, KeyEvent.CTRL_DOWN_MASK));
        forward.setAction(forwardAction);
        this.add(forward);

        this.addSeparator();

        JMenuItem selectAll = new JMenuItem();
        AbstractAction selectAllAction = new AbstractAction("全选") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                int length = app.textArea.getText().length();
                app.textArea.setHightLight(0, length);
            }
        };
        selectAllAction.putValue(Action.ACCELERATOR_KEY,
                KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));
        selectAll.setAction(selectAllAction);
        this.add(selectAll);

        JMenuItem timeOrDate = new JMenuItem();
        AbstractAction timeOrDateAction = new AbstractAction("时间/日期") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "时间/日期");
            }
        };
        timeOrDateAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
        timeOrDate.setAction(timeOrDateAction);
        this.add(timeOrDate);
    }
}
