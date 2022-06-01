package indi.lmr_zhy.text_editor;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MenuBar extends JMenuBar {
    public MenuBar(App app) {
        JMenu file = new FileMenu(app);        
        JMenu edit = new EditMenu(app);
        JMenu format = new FormatMenu(app);
        JMenu view = new ViewMenu(app);
        JMenu help = new HelpMenu(app);

        this.add(file);
        this.add(edit);
        this.add(format);
        this.add(view);
        this.add(help);
    }
}
