package com.view;

import javax.swing.*;
import java.awt.*;

public class TableView extends JFrame{
    private JPanel tablePanel;

    public TableView(){
        this.setVisible(true);

        this.setContentPane(tablePanel);
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addTable(JTable table){
        JScrollPane sp = new JScrollPane(table);
        tablePanel.add(sp);
        tablePanel.setVisible(true);
        tablePanel.updateUI();
    }
}
