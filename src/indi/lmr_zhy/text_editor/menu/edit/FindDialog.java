package indi.lmr_zhy.text_editor.menu.edit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import indi.lmr_zhy.text_editor.App;

public class FindDialog extends AbstractAction {
    public FindDialog(App app) {
        super("查找");
    }

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
        findNext.setAction(new AbstractAction("查找下一个") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "查找下一个");
            }
        });
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
}
