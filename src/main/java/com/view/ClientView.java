package com.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ClientView extends JFrame{
    private JPanel client;
    private JTextField textFieldID;
    private JTextField textFieldName;
    private JTextField textFieldEmail;
    private JButton editButton;
    private JButton deleteButton;
    private JButton viewAllButton;
    private JButton addButton;
    private JLabel success;

    public ClientView(){
        this.setVisible(true);
        this.setContentPane(client);
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        success.setVisible(false);
    }

    public void setSuccess() {
        success.setVisible(true);
    }

    public String getTextFieldID() {
        return textFieldID.getText();
    }

    public void setTextFieldID(JTextField textFieldID) {
        this.textFieldID = textFieldID;
    }

    public String getTextFieldName() {
        return textFieldName.getText();
    }

    public void setTextFieldName(JTextField textFieldName) {
        this.textFieldName = textFieldName;
    }

    public String getTextFieldEmail() {
        return textFieldEmail.getText();
    }

    public void setTextFieldEmail(JTextField textFieldEmail) {
        this.textFieldEmail = textFieldEmail;
    }

    public void addClient(ActionListener action) {
        addButton.addActionListener(action);
    }

    public void editClient(ActionListener action) {
        editButton.addActionListener(action);
    }

    public void deleteClient(ActionListener action) {
        deleteButton.addActionListener(action);
    }

    public void viewAllClient(ActionListener action) {
        viewAllButton.addActionListener(action);
    }

}
