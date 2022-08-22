package com.lms.templates;

import javax.swing.*;

public class BaseTextField extends JTextField {
    public BaseTextField(BaseFrame frame, int x, int y, int width, int height) {
        super();
        this.setBounds(x, y, width, height);
        this.setFocusable( true );
        frame.add( this );
    }

    public BaseTextField(BasePanel panel, int x, int y, int width, int height) {
        super();
        this.setBounds(x, y, width, height);
        this.setFocusable( true );
        panel.add( this );
    }
}
