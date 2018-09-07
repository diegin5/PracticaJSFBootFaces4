package com.mycompany.controller;

import com.mycompany.controllerimpl.ClienteCtrlImpl;
import com.mycompany.modell.Cliente;
import com.mycompany.dao.ClienteDAO;
import java.util.ArrayList;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "clienteCtrl")
@SessionScoped
public class ClienteCtrl implements Serializable {

    private Cliente selected;
    private boolean est;
    ClienteDAO catdao;
    private ArrayList<Cliente> list = new ArrayList<>();

    public ClienteCtrl() {
        this.selected = new Cliente();
        this.catdao = new ClienteCtrlImpl();
    }

    public void createCliente() {
        if (catdao.createCliente(selected)) {
            System.out.println("Insertado");
        } else 
            System.out.println("Error al momento de insertar");
        }
    }
    public ArrayList<Cliente> getList() {
        list = catdao.readCliente();
        return list;
    }

    public void deleteCliente(String id){
        
        if (catdao.deleteCliente(id)) {
            System.out.println("Eliminado"+id);
        } else {
            System.out.println("Error al momento de eliminar");
        }
    }
    public Cliente getSelected() {
        return selected;
    }

    public void setSelected(Cliente selected) {
        this.selected = selected;
    }

}
