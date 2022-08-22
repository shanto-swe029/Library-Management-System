package com.lms.mainproject;

import com.lms.templates.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class UserLogin extends BasePanel {

    BaseLabel userName, password, login;
    BaseTextField tfUserName;
    JPasswordField tfPassword;
    BaseButton loginButton, backButton, signupButton;
    Font mediumFont = new Font(Font.MONOSPACED, Font.PLAIN, 18);
    Font mediumFont2 = new Font(Font.DIALOG_INPUT, Font.BOLD, 18);
    Font largeFont = new Font(Font.DIALOG_INPUT, Font.PLAIN, 28);

    public UserLogin(BasePanel panel, int x, int y, int width, int height) {
        super(panel, x, y, width, height);
        init();
    }

    private void init() {
        initLabel();
        initTextField();
        initButton();
    }

    private void verifyLogin() throws IOException {
        String usernameInput = tfUserName.getText();
        String passwordInput = tfPassword.getText();

        URL loc = getClass().getResource("/assets/user.txt");
        System.out.println("Location: " + loc);
        BufferedReader br = null;
        try {
            assert loc != null;
            br = new BufferedReader(
                    new InputStreamReader(
                            loc.openStream()
                    )
            );
            String temp = null;
            boolean matched = false;
            while( (temp = br.readLine()) != null ) {
                Scanner sc = new Scanner(temp);
                String currentuserName = sc.next();
                String currentUserPassword = sc.next();
                if( (currentuserName.equals(usernameInput)) && (currentUserPassword.equals(passwordInput)) ) {
                    matched = true;
                    break;
                }
            }
            if( matched ) {
                System.out.println("Logged in");
            } else {
                JOptionPane.showMessageDialog(this, "Wrong information", "Login Failed", JOptionPane.WARNING_MESSAGE);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            br.close();
        }

    }

    private void initButton() {
        loginButton = new BaseButton(this, "Login", 300, 300, 100, 30);
        backButton = new BaseButton(this, "Back", 600, 300, 100, 30);
        signupButton = new BaseButton(this, "Don\'t have an account? Register here", 300, 380, 400, 30);
        signupButton.setBorder( new MatteBorder(0, 0, 1, 0, Color.red));

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( e.getSource() == loginButton ) {
                    try {
                        verifyLogin();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
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
                    LibraryManagementSystem.setActiveScreen( new Register(LibraryManagementSystem.backgroundPanel, 0, 200, 1000, 600));

                }
            }
        });
    }

    private void initLabel() {
        login = new BaseLabel(this, "Login as User", 0, 10, 1000, 50);
        login.setFont( largeFont );
        login.setHorizontalAlignment(BaseLabel.CENTER);
        login.setVerticalAlignment(BaseLabel.CENTER);

        userName = new BaseLabel(this, "Username", 300, 110, 400, 30);
        userName.setFont(mediumFont2);
        userName.setVerticalAlignment(BaseLabel.CENTER);

        password = new BaseLabel(this, "Password", 300, 190, 400, 30);
        password.setFont(mediumFont2);
        password.setVerticalAlignment(BaseLabel.CENTER);
    }

    private void initTextField() {
        tfUserName = new BaseTextField(this, 300, 150, 400, 30);
        tfUserName.setFont( mediumFont );
        tfUserName.setBorder( new MatteBorder(0, 0, 2, 0, Color.BLACK));

        tfPassword = new JPasswordField();
        tfPassword.setBounds(300, 230, 400, 30);
        tfPassword.setFont( mediumFont );
        tfPassword.setBorder( new MatteBorder(0, 0, 2, 0, Color.BLACK));
        this.add( tfPassword );
    }
}
