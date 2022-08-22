package com.lms.mainproject;

import com.lms.templates.BaseButton;
import com.lms.templates.BaseLabel;
import com.lms.templates.BasePanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Welcome extends BasePanel {

    BaseButton adminBtn, userBtn;
    BaseLabel welcomeLabel;
    Font largeFont = new Font(Font.DIALOG_INPUT, Font.PLAIN, 28);

    public Welcome(BasePanel panel, int x, int y, int width, int height) {
        super(panel, x, y, width, height);
        init();
    }

    private void init() {
        welcomeLabel = new BaseLabel(this, "Welcome to Library Management System!", 0, 110, 1000, 50);
        welcomeLabel.setFont( largeFont );
        welcomeLabel.setHorizontalAlignment(BaseLabel.CENTER);
        welcomeLabel.setVerticalAlignment(BaseLabel.CENTER);

        adminBtn = new BaseButton(this, null, 340, 200, 150, 150 );
        adminBtn.setBackground(Color.WHITE);
        try {
            adminBtn.addImage("/assets/adminLogo.png");
        } catch (IOException e) {
            System.out.println(e);
        }
        userBtn = new BaseButton(this, null, 510, 200, 150, 150 );
        try {
            userBtn.addImage("/assets/userLogo.jpg");
        } catch (IOException e) {
            System.out.println(e);
        }

        adminBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( e.getSource() == adminBtn ) {
                    LibraryManagementSystem.setActiveScreen( new AdminLogin(LibraryManagementSystem.backgroundPanel, 0, 200, 1000, 600));
                }
            }
        });

        userBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( e.getSource() == userBtn ) {
                    LibraryManagementSystem.setActiveScreen( new UserLogin(LibraryManagementSystem.backgroundPanel, 0, 200, 1000, 600));
                }
            }
        });
    }
}
