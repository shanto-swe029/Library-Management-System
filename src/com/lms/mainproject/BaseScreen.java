package com.lms.mainproject;

import com.lms.templates.BaseFrame;
import com.lms.templates.BaseLabel;
import com.lms.templates.BasePanel;
import java.awt.*;

public abstract class BaseScreen extends BaseFrame {

    BasePanel menuPanel, componentPanel;
    static BasePanel backgroundPanel;
    BaseLabel labelLMS;

    Font mediumFont, mediumFont2;

    abstract void initComponents();

    public BaseScreen(String title, int width, int height) {
        super(title, width, height);
        mediumFont = new Font(Font.MONOSPACED, Font.BOLD, 18);
        mediumFont2 = new Font(Font.DIALOG_INPUT, Font.PLAIN, 18);

        backgroundPanel = new BasePanel(this, 0, 0, this.getWidth(), this.getHeight());
        backgroundPanel.setBackground(Color.black);

        labelLMS = new BaseLabel(backgroundPanel, "Library Management System", 0, 0, 1000, 100);
        labelLMS.setForeground(Color.WHITE);
        labelLMS.setHorizontalAlignment(BaseLabel.CENTER);
        labelLMS.setVerticalAlignment(BaseLabel.CENTER);
        labelLMS.setFont( new Font(Font.SANS_SERIF, Font.PLAIN, 36) );



        initComponents();
    }

}
