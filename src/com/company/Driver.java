package com.company;

public abstract class Driver  {
    private String driverName;  //name of the driver
    private int driverAge;     //age of the driver
    private int driverLocation;

    abstract void setName(String driverName);  // set name of driver
    abstract String getName();        // get name of the driver
    abstract void setAge(int driverAge);   // set age of the driver
    abstract int getAge();  // get age of the driver

}
