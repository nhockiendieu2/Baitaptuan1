/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitaptuan1;

import java.net.InetAddress;

/**
 *
 * @author dacla
 */
public class BaiTapTuan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            // lay dia chi ip cua 1 trang web
            InetAddress inet = InetAddress.getByName("www.google.com");
            // thu ket noi trong thoi gian la 5s
            boolean isKN = inet.isReachable(5000);
            
            // in ra thong bao
            if(isKN)
            {
                System.out.println("Co ket noi InTERNET");
            }
            else
            {
                System.out.println("Khong co ket noi internet");
            }    
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
