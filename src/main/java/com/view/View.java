package com.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class View extends JFrame{
    private JPanel start;
    private JButton productButton;
    private JButton clientButton;
    private JButton orderButton;
    private JLabel title;

    public View(){
        this.setVisible(true);
        this.setContentPane(start);
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void productMenu(ActionListener action) {
        productButton.addActionListener(action);
    }

    public void clientMenu(ActionListener action) {
        clientButton.addActionListener(action);
    }

    public void orderMenu(ActionListener action) {
        orderButton.addActionListener(action);
    }
}
