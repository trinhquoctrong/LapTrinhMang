/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author trinh
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListUser implements Serializable {
    private List<Client> list;
    
    public ListUser(){
        list = new ArrayList<>();
    }
    
    public void addUser(Client client){
        list.add(client);
    }
    
    public List<Client> getList() {
        return list;
    }

    public void setList(List<Client> list) {
        this.list = list;
    }
    
    public void setStatus(boolean stt, int idx){
        list.get(idx).setStatus(stt);
    }
}

