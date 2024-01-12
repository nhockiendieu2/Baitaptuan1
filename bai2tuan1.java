/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptuan1;

import java.net.InetAddress;

/**
 *
 * @author dacla
 */
public class bai2tuan1 {
    public static void main(String[] args)
    {
        try{
            // Lay thong tin ket noi voi Google
            InetAddress inet = InetAddress.getByName("www.google.com");
            // Lay dia chi Ip vaf in ra manf hinh 
            System.out.println("Dia chi Ip cua google la : " + inet.getHostAddress());
        }catch(Exception e){
            e.printStackTrace();
        
        }
    
    
    
    
    }
    
    
    
    
    
    
}
