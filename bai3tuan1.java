/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptuan1;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 *
 * @author dacla
 */
public class bai3tuan1 {
    // Lay ve tat ca dia chi IP cua may chu local
    public static void main(String[] args){
        try{
            // B1 : Lay ve tat ca cac giao dien cua may
            Enumeration<NetworkInterface> interfaces
                    = NetworkInterface.getNetworkInterfaces();
            // b2: duyet qua tung giao dien mang
            while(interfaces.hasMoreElements())
            {
                // duyet qua tung interfaces
                NetworkInterface netIn = interfaces.nextElement();
                // lay ve danh sach dia chi ip cua mang
                Enumeration<InetAddress> inets = netIn.getInetAddresses();
                //duyet qua tung dia chi ip va in ra man hinh 
                while(inets.hasMoreElements())
                {
                    InetAddress address = inets.nextElement();
                    System.out.println("Dia chi IP: "+ address.getHostAddress());
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    
    
    
    
    }
}
