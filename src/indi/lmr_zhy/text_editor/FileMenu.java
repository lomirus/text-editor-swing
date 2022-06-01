package indi.lmr_zhy.text_editor;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class FileMenu extends JMenu {
    public FileMenu(App app) {
        this.setText("文件");
        JMenuItem newFile = new JMenuItem();
        AbstractAction newFileAction = new AbstractAction("新建") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                app.setTitle("无标题");
            }
        };
        newFileAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
        newFile.setAction(newFileAction);
        this.add(newFile);

        JMenuItem newWindow = new JMenuItem();
        AbstractAction newWindowAction = new AbstractAction("新窗口") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("新窗口");
            }
        };
        newWindowAction.putValue(Action.ACCELERATOR_KEY,
                KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK | KeyEvent.SHIFT_DOWN_MASK));
        newWindow.setAction(newWindowAction);
        this.add(newWindow);

        JMenuItem open = new JMenuItem();
        AbstractAction openAction = new AbstractAction("打开") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                final String cwd = System.getProperty("user.dir");
                final JFileChooser fileChooser = new JFileChooser(cwd);
                final int res = fileChooser.showOpenDialog(app.frame);
                if (res == JFileChooser.CANCEL_OPTION) {
                    return;
                }
                final File file = fileChooser.getSelectedFile();
                try {
                    Path filePath = file.toPath();
                    app.filePath = filePath;
                    app.setTitle(file.getName());
                    String content = new String(Files.readAllBytes(filePath));
                    app.setContent(content);
                } catch (IOException e) {
                    System.out.print(e.getMessage());
                }
            }
        };
        openAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
        open.setAction(openAction);
        this.add(open);

        JMenuItem save = new JMenuItem();
        AbstractAction saveAction = new AbstractAction("保存") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (app.filePath == null) {
                    final String cwd = System.getProperty("user.dir");
                    final JFileChooser fileChooser = new JFileChooser(cwd);
                    final int res = fileChooser.showOpenDialog(app.frame);
                    if (res == JFileChooser.CANCEL_OPTION) {
                        return;
                    }
                    final File file = fileChooser.getSelectedFile();
                    try {
                        Path filePath = file.toPath();
                        app.filePath = filePath;
                        Files.writeString(filePath, app.getContent());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        Files.write(app.filePath, app.getContent().getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        saveAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
        save.setAction(saveAction);
        this.add(save);

        JMenuItem saveAs = new JMenuItem();
        AbstractAction saveAsAction = new AbstractAction("另存为") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                final String cwd = System.getProperty("user.dir");
                final JFileChooser fileChooser = new JFileChooser(cwd);
                final int res = fileChooser.showOpenDialog(app.frame);
                if (res == JFileChooser.CANCEL_OPTION) {
                    return;
                }
                final File file = fileChooser.getSelectedFile();
                try {
                    Path filePath = file.toPath();
                    Files.writeString(filePath, app.getContent());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        saveAsAction.putValue(Action.ACCELERATOR_KEY,
                KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK | KeyEvent.SHIFT_DOWN_MASK));
        saveAs.setAction(saveAsAction);
        this.add(saveAs);

        this.addSeparator();

        JMenuItem pageConfig = new JMenuItem();
        AbstractAction pageConfigAction = new AbstractAction("页面设置") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("页面设置");
            }
        };
        pageConfig.setAction(pageConfigAction);
        this.add(pageConfig);

        JMenuItem print = new JMenuItem();
        AbstractAction printAction = new AbstractAction("打印") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("打印");
            }
        };
        printAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_DOWN_MASK));
        print.setAction(printAction);
        this.add(print);

        this.addSeparator();

        JMenuItem exit = new JMenuItem();
        AbstractAction exitAction = new AbstractAction("退出") {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("退出");
            }
        };
        exit.setAction(exitAction);
        this.add(exit);
    }
}
