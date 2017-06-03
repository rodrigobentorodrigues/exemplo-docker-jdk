package com.ifpb.dac.app;

import com.ifpb.dac.controle.ClienteDAO;

public class App {
    
    public static void main(String[] args) {
        ClienteDAO dao = new ClienteDAO();
        System.out.println(dao.listaTodos().toString());
    }
    
    
}
