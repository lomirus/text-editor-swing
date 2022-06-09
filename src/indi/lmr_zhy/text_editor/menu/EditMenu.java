package indi.lmr_zhy.text_editor.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.Dimension;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.Border;

import indi.lmr_zhy.text_editor.App;

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
        AbstractAction findAction = new AbstractAction("查找") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JDialog searchDialog = new JDialog();
                searchDialog.setLocationRelativeTo(null);
                searchDialog.setResizable(false);
                searchDialog.setTitle("查找");
                searchDialog.setPreferredSize(new Dimension(551, 224));
                searchDialog.setVisible(true);
                searchDialog.setLayout(null);

                JLabel searchLabel = new JLabel("查找内容：");
                searchLabel.setBounds(9, 25, 289, 27);
                searchDialog.add(searchLabel);

                JTextArea searchInput = new JTextArea();
                searchInput.setBounds(107, 18, 289, 30);
                searchInput.setAlignmentY(0.5f);
                searchDialog.add(searchInput);

                Border directionBorder = BorderFactory.createTitledBorder("方向");

                JPanel direction = new JPanel();
                direction.setBounds(239, 75, 182, 59);
                direction.setLayout(null);
                direction.setBorder(directionBorder);
                searchDialog.add(direction);
                ButtonGroup directionGroup = new ButtonGroup();

                JRadioButton up = new JRadioButton("向上");
                up.setBounds(5, 13, 100, 50);
                up.setSelected(true);
                direction.add(up);
                directionGroup.add(up);

                JRadioButton down = new JRadioButton("向下");
                down.setBounds(95, 13, 100, 50);
                direction.add(down);
                directionGroup.add(down);

                JCheckBox matchCase = new JCheckBox("区分大小写");
                matchCase.setBounds(9, 110, 110, 27);
                searchDialog.add(matchCase);

                JCheckBox loop = new JCheckBox("循环");
                loop.setBounds(9, 150, 110, 27);
                searchDialog.add(loop);

                JButton findNext = new JButton("查找下一个");
                findNext.setBounds(429, 14, 110, 27);
                searchDialog.add(findNext);

                JButton cancel = new JButton("取消");
                cancel.setBounds(429, 59, 110, 27);
                searchDialog.add(cancel);
                cancel.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        searchDialog.dispose();
                    }
                });

                searchDialog.pack();
            }
        };
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
        AbstractAction replaceAction = new AbstractAction("替换") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JDialog replaceDialog = new JDialog();
                replaceDialog.setLocationRelativeTo(null);
                replaceDialog.setResizable(false);
                replaceDialog.setTitle("替换");
                replaceDialog.setPreferredSize(new Dimension(551, 314));
                replaceDialog.setVisible(true);
                replaceDialog.setLayout(null);

                JLabel label = new JLabel("查找内容：");
                label.setBounds(9, 25, 289, 27);
                replaceDialog.add(label);

                JTextArea input = new JTextArea();
                input.setBounds(107, 18, 289, 30);
                input.setAlignmentY(0.5f);
                replaceDialog.add(input);

                JLabel repalceLabel = new JLabel("替换为：");
                repalceLabel.setBounds(9, 65, 289, 27);
                replaceDialog.add(repalceLabel);

                JTextArea replaceInput = new JTextArea();
                replaceInput.setBounds(107, 58, 289, 30);
                replaceInput.setAlignmentY(0.5f);
                replaceDialog.add(replaceInput);

                Border directionBorder = BorderFactory.createTitledBorder("方向");

                JPanel direction = new JPanel();
                direction.setBounds(239, 165, 182, 59);
                direction.setLayout(null);
                direction.setBorder(directionBorder);
                replaceDialog.add(direction);
                ButtonGroup directionGroup = new ButtonGroup();

                JRadioButton up = new JRadioButton("向上");
                up.setBounds(5, 13, 100, 50);
                up.setSelected(true);
                direction.add(up);
                directionGroup.add(up);

                JRadioButton down = new JRadioButton("向下");
                down.setBounds(95, 13, 100, 50);
                direction.add(down);
                directionGroup.add(down);

                JCheckBox matchCase = new JCheckBox("区分大小写");
                matchCase.setBounds(9, 200, 110, 27);
                replaceDialog.add(matchCase);

                JCheckBox loop = new JCheckBox("循环");
                loop.setBounds(9, 240, 110, 27);
                replaceDialog.add(loop);

                JButton findNext = new JButton("查找下一个");
                findNext.setBounds(429, 14, 110, 27);
                replaceDialog.add(findNext);

                JButton replace = new JButton("替换");
                replace.setBounds(429, 59, 110, 27);
                replaceDialog.add(replace);

                JButton repalceAll = new JButton("全部替换");
                repalceAll.setBounds(429, 104, 110, 27);
                replaceDialog.add(repalceAll);

                JButton cancel = new JButton("取消");
                cancel.setBounds(429, 149, 110, 27);
                replaceDialog.add(cancel);
                cancel.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        replaceDialog.dispose();
                    }
                });

                replaceDialog.pack();
            }
        };
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
                int length = app.getContent().length();
                app.setHightLight(0, length);
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
