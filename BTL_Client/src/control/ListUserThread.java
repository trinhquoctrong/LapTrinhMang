/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author trinh
 */

import java.util.logging.Level;
import java.util.logging.Logger;
import model.ListUser;

public class ListUserThread extends Thread {
    private Connect connect;
    private ListUser list;
    private boolean stop;
    public ListUserThread(Connect connect){
        this.connect = connect;
    }
    @Override
    public void run(){
        synchronized(connect){
        while(true){
                if(stop == true) {
                }else{
                    list = (ListUser) connect.rcvListUser();
                    if(list.getList().size() > 0 && list.getList().get(list.getList().size()-1) == null){
                        stop = true;
                    }
                }
            }
        }
    } 

    public Connect getConnect() {
        return connect;
    }

    public void setConnect(Connect connect) {
        this.connect = connect;
    }

    public ListUser getList() {
        return list;
    }

    public void setList(ListUser list) {
        this.list = list;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
    
}

