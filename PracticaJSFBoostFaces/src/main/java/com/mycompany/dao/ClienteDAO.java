package com.mycompany.dao;

import com.mycompany.modell.Cliente;
import java.util.ArrayList;


public interface ClienteDAO {
    public boolean createCliente(Cliente cat);
    public ArrayList<Cliente> readCliente();
    public boolean updateCliente(Cliente cat);
    public boolean deleteCliente(String id);
    
}