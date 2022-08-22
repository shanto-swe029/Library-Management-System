package com.lms.templates;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class BaseButton extends JButton{

    public BaseButton(BaseFrame frame, String text, int x, int y, int width, int height) {
        super(text);
        this.setBounds(x, y, width, height);
        this.setFocusable( false );
        frame.add( this );
    }

    public BaseButton(BasePanel panel, String text, int x, int y, int width, int height) {
        super(text);
        this.setBounds(x, y, width, height);
        this.setFocusable( false );
        panel.add( this );
    }

    public void addImage( String location ) throws IOException {
        Image img = ImageIO.read(getClass().getResource(location));
        ImageIcon icon = new ImageIcon(img);
        this.setIcon(icon);
    }
}
