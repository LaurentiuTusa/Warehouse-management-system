package com;

import com.business_logic.Presenter;
import com.view.ClientView;
import com.view.OrderView;
import com.view.ProductView;
import com.view.View;

public class Main{

    public static void main(String[] args) {
        Presenter presenter = new Presenter(new View(), new ClientView(), new ProductView(), new OrderView());
    }
}
