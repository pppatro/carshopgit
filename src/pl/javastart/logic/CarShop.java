package pl.javastart.logic;

import pl.javastart.data.Car;

public class CarShop {
    public static void main(String[] args) {
            Car car1 = new Car();
            Car car2 = new Car();

        car1.setBrand("BMW");
        car1.setModel("M5");
        car1.setColor("Biały");
        car1.setYear(-2020);
        car1.setDoors(4);
        String car1Info = car1.getBrand() + ", Kolor: " + car1.getColor() + ", " + car1.getModel() + ", Rok: " + car1.getYear() + ", Liczba drzwi: " + car1.getDoors();


//        car2.setBrand("Audi");
//        car2.setModel("A4");
//        car2.setColor("Czerwony");
//        car2.setYear(2010);
//        car2.setDoors(4);
//        String car2Info = car2.getBrand() + ", " + car2.getColor() + ", " + car2.getModel() + ", " + car2.getYear() + ", " + car2.getDoors();
//
//
        System.out.println(car1Info);
//        System.out.println(car2Info);


    }
}