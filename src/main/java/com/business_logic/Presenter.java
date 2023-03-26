package com.business_logic;

import com.data_access.ClientDao;
import com.data_access.OrderDao;
import com.data_access.ProductDao;
import com.model.Client;
import com.model.Order;
import com.model.Product;
import com.view.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.util.List;

/**Presenter class is the logic class. Every type of table has its instructions' logic described here
 * The methods implemented allow the user to insert, delete, update or view all entries of a table in a JTable
 *
 */
public class Presenter {
    private final View view;
    private final ClientView clientView;
    private final ProductView productView;
    private final OrderView orderView;

    public Presenter(View view, ClientView clientView, ProductView productView, OrderView orderView) {
        this.view = view;
        this.clientView = clientView;
        clientView.setVisible(false);
        this.productView = productView;
        productView.setVisible(false);
        this.orderView = orderView;
        orderView.setVisible(false);

        view.clientMenu(new clientMenu());
        view.orderMenu(new orderMenu());
        view.productMenu(new productMenu());

        clientView.addClient(new addClient());
        clientView.editClient(new editClient());
        clientView.viewAllClient(new viewClients());
        clientView.deleteClient(new deleteClient());

        productView.addProduct(new addProduct());
        productView.editProduct(new editProduct());
        productView.viewAllProduct(new viewProducts());
        productView.deleteProduct(new deleteProduct());

        orderView.orderAction(new order());
    }

    private class clientMenu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            clientView.setVisible(true);
            view.dispose();
        }
    }

    private class addClient implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ClientDao a = new ClientDao();
            try {
                int id = Integer.parseInt(clientView.getTextFieldID());
                try {
                    Client x = new Client(id, clientView.getTextFieldName(), clientView.getTextFieldEmail());//will fail here if the input is wrong
                    a.insert(x);
                    clientView.setSuccess();
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Wrong input!");
                    throw e;
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong input!");
                throw e;
            }
        }
    }

    private class editClient implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ClientDao a = new ClientDao();
            try {
                int id = Integer.parseInt(clientView.getTextFieldID());
                try {
                    Client x = new Client(id, clientView.getTextFieldName(), clientView.getTextFieldEmail());//will fail here if the input is wrong
                    a.update(x);
                    clientView.setSuccess();
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Wrong input!");
                    throw e;
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong input!");
                throw e;
            }
        }
    }

    private class viewClients implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ClientDao a = new ClientDao();
            Field[] field = a.findType().getDeclaredFields();
            String[] columnNames = new String[field.length];
            for(int i = 0; i<field.length; i++){
                columnNames[i] = field[i].getName();
            }
            List<Client> clientList = a.findAll();
            Object data[][] = new Object[clientList.size()][];
            int row = 0;
            for (Client c:clientList) {
                data[row] = new Object[]{c.getId(), c.getClient_name(), c.getEmail()};
                row++;
            }
            JTable table = new JTable(data, columnNames);
            table.setPreferredScrollableViewportSize(new Dimension(400, 300));
            table.setFillsViewportHeight(true);
            TableView tableView = new TableView();
            tableView.addTable(table);
        }
    }

    private class deleteClient implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ClientDao a = new ClientDao();
            try {
                int id = Integer.parseInt(clientView.getTextFieldID());
                try {
                    a.findById(id);//will fail here if the input is wrong
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Wrong input!");
                    throw e;
                }
                a.delete(id);
                clientView.setSuccess();
            } catch (NumberFormatException e) {
                System.out.println("Wrong input!");
                throw e;
            }
        }
    }

    private class productMenu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            productView.setVisible(true);
            view.dispose();
        }
    }

    private class addProduct implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ProductDao a = new ProductDao();
            try {
                int id = Integer.parseInt(productView.getTextFieldID());
                try {
                    Product x = new Product(id, productView.getTextFieldName(), Integer.parseInt(productView.getTextFieldPrice()), Integer.parseInt(productView.getTextFieldQuantity()));//will fail here if the input is wrong
                    a.insert(x);
                    productView.setSuccess();
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Wrong input!");
                    throw e;
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong input!");
                throw e;
            }
        }
    }

    private class editProduct implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ProductDao a = new ProductDao();
            try {
                int id = Integer.parseInt(productView.getTextFieldID());
                try {
                    Product x = new Product(id, productView.getTextFieldName(), Integer.parseInt(productView.getTextFieldPrice()), Integer.parseInt(productView.getTextFieldQuantity()));//will fail here if the input is wrong
                    a.update(x);
                    productView.setSuccess();
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Wrong input!");
                    throw e;
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong input!");
                throw e;
            }
        }
    }

    private class viewProducts implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ProductDao a = new ProductDao();
            Field[] field = a.findType().getDeclaredFields();
            String[] columnNames = new String[field.length];
            for(int i = 0; i<field.length; i++){
                columnNames[i] = field[i].getName();
            }
            List<Product> productList = a.findAll();
            Object data[][] = new Object[productList.size()][];
            int row = 0;
            for (Product c:productList) {
                data[row] = new Object[]{c.getId(), c.getProduct_name(), c.getPrice(), c.getQuantity()};
                row++;
            }
            JTable table = new JTable(data, columnNames);
            table.setPreferredScrollableViewportSize(new Dimension(400, 300));
            table.setFillsViewportHeight(true);
            TableView tableView = new TableView();
            tableView.addTable(table);
        }
    }

    private class deleteProduct implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ProductDao a = new ProductDao();
            try {
                int id = Integer.parseInt(productView.getTextFieldID());
                try {
                    a.findById(id);//will fail here if the input is wrong
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Wrong input!");
                    throw e;
                }
                a.delete(id);
                productView.setSuccess();
            } catch (NumberFormatException e) {
                System.out.println("Wrong input!");
                throw e;
            }
        }
    }

    private class orderMenu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            orderView.setVisible(true);
            view.dispose();
        }
    }

    private class order implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            OrderDao a = new OrderDao();
            ProductDao c = new ProductDao();
            try {
                int id = Integer.parseInt(orderView.getTextFieldID());
                try {
                    Order x = new Order(id, Integer.parseInt(orderView.getTextFieldClient_id()), Integer.parseInt(orderView.getTextFieldProduct_id()), Integer.parseInt(orderView.getTextFieldAmount()));//will fail here if the input is wrong
                    if(Integer.parseInt(orderView.getTextFieldAmount()) > c.findById(Integer.parseInt(orderView.getTextFieldProduct_id())).getQuantity()){//amount > available quantity
                        orderView.setOrder_failed();
                    }
                    else{
                        a.insert(x);
                        Product d = c.findById(Integer.parseInt(orderView.getTextFieldProduct_id()));
                        d.setQuantity(d.getQuantity() - Integer.parseInt(orderView.getTextFieldAmount()));
                        c.update(d);
                        orderView.setSuccess();
                    }
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Wrong input!");
                    throw e;
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong input!");
                throw e;
            }
        }
    }
}

