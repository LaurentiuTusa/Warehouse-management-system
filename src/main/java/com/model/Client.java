package com.model;

public class Client {
    private int id;
    private String client_name;
    private String email;

    public Client(int client_id, String client_name, String email) {
        this.id = client_id;
        this.client_name = client_name;
        this.email = email;
    }

    public Client () {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
