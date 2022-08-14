package com.imshy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class MainFrame extends JFrame {
    private JPanel panel;
    private HashMap<String, JTextField> data;

    public MainFrame()
    {
        data = new HashMap<>();
        setupMainFrame();
    }
    private void setupMainFrame()
    {
        setTitle("Wage Information");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setUpCombos();

    }
    private void setUpCombos()
    {
        Container wage = createTextInputContainer("Wage $/hr: ", "wage");
        add(wage);
        Container weeklyHours = createTextInputContainer("Hours worked weekly", "weekly_hours");
        add(weeklyHours);
        JButton button = new JButton("Submit");
        button.addActionListener(new ClickListener());
        add(button);
    }
    private Container createTextInputContainer(String inputMessage, String data)
    {
        JLabel inputLabel = new JLabel(inputMessage);
        JTextField inputArea = new JTextField(20);
        Container container = new Container();
        container.add(inputLabel);
        this.data.put(data,inputArea);
        container.add(inputArea);
        container.setLayout(new FlowLayout());

        return container;
    }
    public HashMap<String,String> getData()
    {
        HashMap map = new HashMap();
        for(String key : data.keySet())
        {
            map.put(key, data.get(key).getText());
        }
        return map;
    }

    private record TextInputCombo(JLabel inputMessage, JTextField inputArea){}

    private class ClickListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(!command.equals("Submit"))
                return;




        }

    }
}
