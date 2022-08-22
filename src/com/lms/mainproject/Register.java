package com.lms.mainproject;

import com.lms.templates.BaseButton;
import com.lms.templates.BaseLabel;
import com.lms.templates.BasePanel;
import com.lms.templates.BaseTextField;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends BasePanel {

    BaseLabel userName, password, register, email, phone;
    BaseTextField tfUserName, tfEmail, tfPhone;
    JPasswordField tfPassword;
    BaseButton loginButton, backButton, signupButton;
    Font mediumFont = new Font(Font.MONOSPACED, Font.PLAIN, 18);
    Font mediumFont2 = new Font(Font.DIALOG_INPUT, Font.BOLD, 18);
    Font largeFont = new Font(Font.DIALOG_INPUT, Font.PLAIN, 28);

    private void init() {
        initLabel();
        initTextField();
        initButton();
    }

    private void initButton() {
        signupButton = new BaseButton(this, "Register", 350, 300, 100, 30);
        backButton = new BaseButton(this, "Back", 650, 300, 100, 30);
        loginButton = new BaseButton(this, "Already have an account? Login here", 350, 380, 400, 30);
        loginButton.setBorder( new MatteBorder(0, 0, 1, 0, Color.red));

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( e.getSource() == loginButton ) {
                    LibraryManagementSystem.setActiveScreen( new UserLogin(LibraryManagementSystem.backgroundPanel, 0, 200, 1000, 600));

                }
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( e.getSource() == backButton ) {
                    LibraryManagementSystem.setActiveScreen(new Welcome(LibraryManagementSystem.backgroundPanel, 0, 200, 1000, 600));
                }
            }
        });
        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( e.getSource() == signupButton ) {
                    tfUserName.setText("registered!");
                }
            }
        });
    }

    private void initLabel() {
        register = new BaseLabel(this, "Register", 0, 10, 1000, 50);
        register.setFont( largeFont );
        register.setHorizontalAlignment(BaseLabel.CENTER);
        register.setVerticalAlignment(BaseLabel.CENTER);

        userName = new BaseLabel(this, "Username: ", 100, 110, 200, 30);
        userName.setFont(mediumFont2);
        userName.setVerticalAlignment(BaseLabel.CENTER);
        userName.setHorizontalAlignment(BaseLabel.RIGHT);

        password = new BaseLabel(this, "Password: ", 100, 150, 200, 30);
        password.setFont(mediumFont2);
        password.setVerticalAlignment(BaseLabel.CENTER);
        password.setHorizontalAlignment(BaseLabel.RIGHT);

        email = new BaseLabel(this, "Email: ", 100, 190, 200, 30);
        email.setFont(mediumFont2);
        email.setVerticalAlignment(BaseLabel.CENTER);
        email.setHorizontalAlignment(BaseLabel.RIGHT);

        phone = new BaseLabel(this, "Phone: ", 100, 230, 200, 30);
        phone.setFont(mediumFont2);
        phone.setVerticalAlignment(BaseLabel.CENTER);
        phone.setHorizontalAlignment(BaseLabel.RIGHT);
    }

    private void initTextField() {
        tfUserName = new BaseTextField(this, 350, 110, 400, 30);
        tfUserName.setFont( mediumFont );
        tfUserName.setBorder( new MatteBorder(0, 0, 2, 0, Color.BLACK));

        tfPassword = new JPasswordField();
        tfPassword.setBounds(350, 150, 400, 30);
        tfPassword.setFont( mediumFont );
        tfPassword.setBorder( new MatteBorder(0, 0, 2, 0, Color.BLACK));
        this.add( tfPassword );

        tfEmail = new BaseTextField(this, 350, 190, 400, 30);
        tfEmail.setFont( mediumFont );
        tfEmail.setBorder( new MatteBorder(0, 0, 2, 0, Color.BLACK));

        tfPhone = new BaseTextField(this, 350, 230, 400, 30);
        tfPhone.setFont( mediumFont );
        tfPhone.setBorder( new MatteBorder(0, 0, 2, 0, Color.BLACK));
    }

    public Register(BasePanel panel, int x, int y, int width, int height) {
        super(panel, x, y, width, height);
        init();
    }
}
