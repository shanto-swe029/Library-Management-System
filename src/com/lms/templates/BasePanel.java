package com.lms.templates;

import javax.swing.JPanel;

public class BasePanel extends JPanel{

    public BasePanel(BaseFrame frame, int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        this.setLayout(null);
        frame.add(this);
    }
    public BasePanel(BasePanel panel, int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        this.setLayout(null);
        panel.add(this);
    }
}
