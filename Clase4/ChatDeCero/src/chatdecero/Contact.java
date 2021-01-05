/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatdecero;

import java.net.InetAddress;

/**
 *
 * @author rafaeli
 */
public class Contact {
    private InetAddress inetAddress;
    private int port;

    public InetAddress getInetAddress() {
        return inetAddress;
    }

    public void setInetAddress(InetAddress inetAddress) {
        this.inetAddress = inetAddress;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return inetAddress.toString() + ": " + port;
    }
    
    
}
