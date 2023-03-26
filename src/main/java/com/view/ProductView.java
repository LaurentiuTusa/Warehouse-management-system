package com.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ProductView extends JFrame {
    private JPanel product;
    private JTextField textFieldID;
    private JTextField textFieldPrice;
    private JTextField textFieldName;
    private JTextField textFieldQuantity;
    private JButton addButton;
    private JButton deleteButton;
    private JButton editButton;
    private JButton viewAllButton;
    private JLabel success;

    public ProductView(){
        this.setVisible(true);
        this.setContentPane(product);
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

    public String getTextFieldPrice() {
        return textFieldPrice.getText();
    }

    public void setTextFieldPrice(JTextField textFieldPrice) {
        this.textFieldPrice = textFieldPrice;
    }

    public String getTextFieldName() {
        return textFieldName.getText();
    }

    public void setTextFieldName(JTextField textFieldName) {
        this.textFieldName = textFieldName;
    }

    public String getTextFieldQuantity() {
        return textFieldQuantity.getText();
    }

    public void setTextFieldQuantity(JTextField textFieldQuantity) {
        this.textFieldQuantity = textFieldQuantity;
    }

    public void addProduct(ActionListener action) {
        addButton.addActionListener(action);
    }

    public void editProduct(ActionListener action) {
        editButton.addActionListener(action);
    }

    public void deleteProduct(ActionListener action) {
        deleteButton.addActionListener(action);
    }

    public void viewAllProduct(ActionListener action) {
        viewAllButton.addActionListener(action);
    }

}
