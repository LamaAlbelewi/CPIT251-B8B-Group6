/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpit251project;

public class Customer {
    
    private String id;
    private String name;
    private char gender;
    private int phone;
    private String DeviceInfo;
    

    public Customer(String id, String name, char gender, int phone) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }

    Customer() {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getDeviceInfo() {
        return DeviceInfo;
    }

    public void setDeviceInfo(String DeviceInfo) {
        this.DeviceInfo = DeviceInfo;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", phone=" + phone + ", DeviceInfo=" + DeviceInfo + '}';
    }
    
    
}
