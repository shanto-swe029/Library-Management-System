package com.lms.mainproject;

import com.lms.templates.BasePanel;

public class LibraryManagementSystem extends BaseScreen{

    static BasePanel activePanel;

    public LibraryManagementSystem(String title, int width, int height) {
        super(title, width, height);
    }

    @Override
    void initComponents() {
        setActiveScreen( activePanel = new Welcome(backgroundPanel, 0, 200, 1000, 600) );
    }

    static void setActiveScreen( BasePanel panel ) {
        backgroundPanel.remove(activePanel);
        backgroundPanel.add( activePanel = panel );
        activePanel.updateUI();
    }

    public static void main(String[] args) {
        LibraryManagementSystem libraryManagementSystem = new LibraryManagementSystem("Library Management Software", 1000, 800);
        libraryManagementSystem.setVisible(true);
    }
}
