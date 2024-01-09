/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.networkexample;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author utsuktakhatri
 */
public class NetworkExample {

    public static void main(String[] args) throws UnknownHostException {
       InetAddress ip = InetAddress.getByName("www.pkmc.tu.edu.np") ;
        System.out.println("IP:"+ip);
    }
}
