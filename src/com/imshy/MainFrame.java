package com.imshy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends JFrame {
    private JPanel panel;
    public MainFrame()
    {
        setupMainFrame();
    }
    private void setupMainFrame()
    {
        panel = new JPanel();
        setTitle("Wage Information");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUpCombos();

    }
    private void setUpCombos()
    {
        add(createTextInputContainer("Wage $/hr: "));
        add(createTextInputContainer("Hours worked weekly"));
    }
    private Container createTextInputContainer(String inputMessage)
    {
        JLabel inputLabel = new JLabel(inputMessage);
        JTextField inputArea = new JTextField(20);
        Container container = new Container();
        container.add(inputLabel);
        container.add(inputArea);
        container.setLayout(new FlowLayout());

        return container;
    }

    private record TextInputCombo(JLabel inputMessage, JTextField inputArea){}

    private class ClickListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(!e.equals("Submit"))
                return;


        }
    }
}
