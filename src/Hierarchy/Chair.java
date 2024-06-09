package Hierarchy;

public class Chair {
    String model;
    int numnberOfLegs;
    int price;

    public Chair(String model, int numnberOfLegs, int price) {
        this.model = model;
        this.numnberOfLegs = numnberOfLegs;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumnberOfLegs() {
        return numnberOfLegs;
    }

    public void setNumnberOfLegs(int numnberOfLegs) {
        this.numnberOfLegs = numnberOfLegs;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Model: " + model);
        System.out.println("Number of legs: " + numnberOfLegs);
        System.out.println("Price: " + price);
    }

    public int calculatePrice(int charisAmount) {
        return charisAmount * price;
    }
}
