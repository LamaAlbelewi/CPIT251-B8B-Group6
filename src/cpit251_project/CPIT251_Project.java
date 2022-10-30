/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251_project;

import java.util.*;

/**
 *
 * @author LamaA
 */
public class CPIT251_Project {

    /**
     * @param args the command line arguments
     */
    Scanner input = new Scanner(System.in);
    // for lines
    Scanner input2 = new Scanner(System.in);
    Customer c = new Customer();

    public static void main(String[] args) {
        CPIT251_Project Lama = new CPIT251_Project();
        System.out.println("choose service: \n1: maintenance\n2: Accessories\n");
        Lama.chooseService(2,100.0);
        
    }

    public void chooseService(int service, double price) {
        EnterDevice(input2.nextLine());
        // if maintainance  show pictures of maintenance services
        if (service == 1) {
            System.out.println("Accessories menu");
        }// if accories show pictures of accessories
        else {
            System.out.println("maintenance menu");
        }
        fillInformation();
        String time = "time";
        placeOrder(time,price);
        showformation();

    }

    public String EnterDevice(String DeviceType) {
        System.out.println("Enter device information");
        String DeviceInfo = input2.nextLine();
        c.setDeviceInfo(DeviceType + ": " + DeviceInfo);
        return DeviceType + ": " + DeviceInfo;
    }

    public void fillInformation() {
        System.out.println("fill your information");
        // random id 
        String uniqueID = UUID.randomUUID().toString();
        c.setId(uniqueID);
        System.out.print("Enter your name: ");
        String name = input2.nextLine();
        System.out.println("");
        c.setName(name);
     //   char gender; // return the clicked button char
        
        System.out.print("Enter your number: ");
        int phone = input.nextInt();
        c.setPhone(phone);
        System.out.println(""); // test if it start with ....

    }

    public void showformation() {
        System.out.println("YOUR INFOOOOO");
        System.out.println(c.toString());
        // test if it prints right

    }

    public void placeOrder(String time, double price) {
        System.out.print("Enter location\n");
        String location = input.next();
        System.out.print("Enter Time\n");
        String Duration = time; // test time ( Date within Range )
        payment(price);
    }

    public void payment(double price) {
        /* 
        # of orders array size of 4
        Total Price ( accssorie + maintainance )
        Discout ? // FCIT Discount 15%
        check box to pay in cash or credit card
        when done show information and recipt
         */
        System.out.println("Total price is "+ price);
        System.out.print("Enter discount:");
        System.out.println("");
        String discount = input.next(); 
        // test the calculations of the discount
        if(discount.equals("FCIT")){
            price = price - (price * (15/100.0));
            System.out.println("The price after discount is "+price);
        }else{
            System.out.println("Invalid coupon");
        }
    }
}
