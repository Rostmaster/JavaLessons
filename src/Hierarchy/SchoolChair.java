package Hierarchy;

public class SchoolChair extends Chair {

    Boolean isAllowAdjustments = true;
    Boolean isSpinning = false;
    Boolean hasDiscount;
    int discountAmount;

    public SchoolChair(String model, int numnberOfLegs, int price) {
        super(model, numnberOfLegs, price);
    }

    public Boolean getHasDiscount() {
        return hasDiscount;
    }

    public void setHasDiscount(Boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public Boolean getAllowAdjustments() {
        return isAllowAdjustments;
    }

    public void setAllowAdjustments(Boolean allowAdjustments) {
        isAllowAdjustments = allowAdjustments;
    }

    public Boolean getSpinning() {
        return isSpinning;
    }

    public void setSpinning(Boolean spinning) {
        isSpinning = spinning;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public int calculatePrice(int charisAmount) {
        if (hasDiscount) {
            return (price - discountAmount) * charisAmount;
        } else {
            return price * charisAmount;
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Model: " + model);
        System.out.println("Number of legs: " + numnberOfLegs);
        System.out.println("Price: " + price);
        System.out.println("Allow adjustments: " + isAllowAdjustments);
        System.out.println("Spinning: " + isSpinning);
        System.out.println("Has discount: " + hasDiscount);
        System.out.println("Discount amount: " + discountAmount);
        System.out.println();
    }
}
