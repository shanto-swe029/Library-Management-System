package com.lms.templates;

import javax.swing.JLabel;

public class BaseLabel extends JLabel {
    public BaseLabel(BaseFrame frame, String text, int x, int y, int width, int height) {
        super(text);
        this.setBounds(x, y, width, height);
        this.setFocusable( true );
        frame.add( this );
    }

    public BaseLabel(BasePanel panel, String text, int x, int y, int width, int height) {
        super(text);
        this.setBounds(x, y, width, height);
        this.setFocusable( true );
        panel.add( this );
    }
}
