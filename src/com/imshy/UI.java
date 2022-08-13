package com.imshy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class UI {
    private JFrame frame;
    public UI()
    {
        prepareGUI();
    }
    private void prepareGUI()
    {
        frame = new MainFrame();
        frame.setVisible(true);
    }

}
