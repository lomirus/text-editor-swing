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
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import indi.lmr_zhy.text_editor.App;

public class ReplaceDialog extends AbstractAction {
    public ReplaceDialog(App app) {
        super("替换");
    }

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
}
