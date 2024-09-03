package com.example.rest_api;

public class Profile{
    private String name;
    private String address;
    public Profile() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "Profile{"+ "name="+name + '\'' + ", address='" + address + '\'' + '}';
    }
}
