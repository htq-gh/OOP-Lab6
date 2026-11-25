package org.example;

public class Car implements Comparable {
    private String name;
    private int price;
    private int year;
    private int horsePower;

    public Car(String name, int price, int year, int horsePower) {
        this.name = name;
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    public String  getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return getName() + ": Вартість: " + getPrice() + "; Рік виготовлення: "
                + getYear() + "; К.С.: " + getHorsePower();
    }

    @Override
    public int compareTo(Object object) {
        Car other = (Car) object;

        int priceDiff = other.price - this.price;
        int yearDiff = this.year - other.year;
        int hpDiff = this.horsePower - other.horsePower;

        int hasPriceDiff = priceDiff * priceDiff;
        int hasYearDiff = yearDiff * yearDiff;

        return priceDiff;
    }
}
