package pl.javastart.data;

public class Car {

    public String brand;
    public String model;
    public String color;
    private int year;
    public int doors;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 0 )
            this.year = year;
        else
            System.out.println("rok niepoprawny");
    }
}

