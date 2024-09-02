import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Car{
    private String carId;
    private String brand;
    private String model;
    private double basePricePerDay;
    private boolean isAvailable;

    //Constructor
    public Car(String carId, String brand, String model, double basePricePerDay, String isAvailable){
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.basePricePerDay = basePricePerDay;
        this.isAvailable = true;
    }

    public String getCarId(){
        return carId;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public double CalculatePrice(int rentalDays){
        return basePricePerDay * rentalDays;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void rent(){
        isAvailable = false;
    }

    public void returnCar(){
        isAvailable = true;
    }
}

class Customer{
    private String customerId;
    private String name;

    //Constructor
    public Customer(String customerId, String name){
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerId(){
        return customerId;
    }

    public String getName(){
        return name;
    }
}

class Rental{
    private Car car;  //car name variable
    private Customer customer;
    private int days;

    public Rental(Car car, Customer customer, int days){
        this.car = car;
        this.customer = customer;
        this.days = days;
    }

    public Car getCar(){
        return car;
    }

    public Customer getCustomer(){
        return customer;
    }
    public int getDays() {
        return days;
    }
}

class CarRentalSystem{

}


public class Main {
    public static void main(String args[]){

    }
}
