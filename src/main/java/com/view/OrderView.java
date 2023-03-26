package com.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class OrderView extends JFrame{
    private JTextField textFieldID;
    private JTextField textFieldClient_id;
    private JTextField textFieldProduct_id;
    private JButton orderButton;
    private JTextField textFieldAmount;
    private JLabel Order_failed;
    private JPanel order;
    private JLabel success;

    public OrderView(){
        this.setVisible(true);
        this.setContentPane(order);
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Order_failed.setVisible(false);
        success.setVisible(false);
    }

    public String getTextFieldID() {
        return textFieldID.getText();
    }

    public void setTextFieldID(JTextField textFieldID) {
        this.textFieldID = textFieldID;
    }

    public String getTextFieldClient_id() {
        return textFieldClient_id.getText();
    }

    public void setTextFieldClient_id(JTextField textFieldClient_id) {
        this.textFieldClient_id = textFieldClient_id;
    }

    public String getTextFieldProduct_id() {
        return textFieldProduct_id.getText();
    }

    public void setTextFieldProduct_id(JTextField textFieldProduct_id) {
        this.textFieldProduct_id = textFieldProduct_id;
    }

    public String getTextFieldAmount() {
        return textFieldAmount.getText();
    }

    public void setTextFieldAmount(JTextField textFieldAmount) {
        this.textFieldAmount = textFieldAmount;
    }

    public void setOrder_failed (){
        Order_failed.setVisible(true);
    }

    public void setSuccess () {
        success.setVisible(true);
    }

    public void orderAction(ActionListener action) {
        orderButton.addActionListener(action);
    }
}
