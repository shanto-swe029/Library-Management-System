package com.lms.mainproject;

import com.lms.templates.BaseFrame;
import com.lms.templates.BaseLabel;
import com.lms.templates.BasePanel;
import com.lms.templates.BaseTextField;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class Template extends BaseFrame {

    BasePanel backgroundPanel;
    BaseLabel userNameLabel, passwordLabel;
    BaseTextField userNameTextField;
    JPasswordField passwordTextField;


    Font mediumFont, mediumFont2;

    private void initComponents() {
        mediumFont = new Font(Font.MONOSPACED, Font.BOLD, 18);
        mediumFont2 = new Font(Font.DIALOG_INPUT, Font.PLAIN, 18);
        initPanels();
        initLabels();
        initTextFields();
    }

    private void initTextFields() {
        userNameTextField = new BaseTextField(this.backgroundPanel, this.getWidth()/2 + 5, this.getHeight()/2, 200, 50);
        userNameTextField.setFont(mediumFont2);
        userNameTextField.setBackground( Color.BLACK);
        userNameTextField.setForeground(Color.WHITE);
        userNameTextField.setBorder( new MatteBorder(0, 0, 2, 0, Color.red));

        passwordTextField = new JPasswordField();
        passwordTextField.setBounds(this.getWidth()/2 + 5, this.getHeight()/2 + 50, 200, 50);
        passwordTextField.setFont(mediumFont2);
        passwordTextField.setBackground( Color.BLACK);
        passwordTextField.setForeground(Color.WHITE);
        passwordTextField.setBorder( new MatteBorder(0, 0, 2, 0, Color.red));
        backgroundPanel.add(passwordTextField);


    }

    private void initLabels() {
        userNameLabel = new BaseLabel(this.backgroundPanel, "Username: ", this.getWidth()/2 - 200, this.getHeight()/2, 200, 50);
        userNameLabel.setFont(mediumFont);
        userNameLabel.setHorizontalAlignment(BaseLabel.RIGHT);
        userNameLabel.setForeground(Color.WHITE);

        passwordLabel = new BaseLabel(this.backgroundPanel, "Password: ", this.getWidth()/2 - 200, this.getHeight()/2 + 50, 200, 50);
        passwordLabel.setFont(mediumFont);
        passwordLabel.setHorizontalAlignment(BaseLabel.RIGHT);
        passwordLabel.setForeground(Color.WHITE);
    }

    private void initPanels() {
        backgroundPanel = new BasePanel(this, 0, 0, this.getWidth(), this.getHeight());
        backgroundPanel.setBackground(Color.black);

    }

    public Template(String title, int width, int height) {
        super(title, width, height);
        initComponents();
    }

    public static void main(String[] args) {
        Template frame = new Template("Library Management System", 1000, 800);
        frame.setVisible(true);
    }
}
