package com.lms.mainproject;

import com.lms.templates.BaseButton;
import com.lms.templates.BaseFrame;
import com.lms.templates.BasePanel;
import java.awt.Color;

public class AppTest extends BaseFrame {

    private BaseButton ok, proceed, apply;
    private BasePanel panel4;

    private void initButtons() {
        ok = new BaseButton(panel4, "OK", panel4.getWidth() / 2 - 100 / 2, 20, 100, 30);
        proceed = new BaseButton(panel4, "Proceed", panel4.getWidth() / 2 - 100 / 2, 70, 100, 30);
        apply = new BaseButton(panel4, "Apply", panel4.getWidth() / 2 - 100 / 2, 120, 100, 30);
    }

    private void initPanels() {
        panel4 = new BasePanel(this, 250, 250, 250, 250);
        panel4.setBackground(Color.red);
    }

    public static void main(String[] args) {
        AppTest frame = new AppTest("My APP", 500, 500);
        frame.setVisible(true);
    }

    public AppTest(String title, int width, int height) {
        super(title, width, height);
        initComponents();
    }

    private void initComponents() {
        initPanels();
        initButtons();
    }
}
