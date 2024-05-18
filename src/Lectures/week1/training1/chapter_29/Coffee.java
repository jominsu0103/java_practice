package Lectures.week1.training1.chapter_29;

public class Coffee {
    private String coffeeName;
    private long waterQuantity; //ml
    private long coffeeBeanQuantityl; //g

    private boolean isWrappedUp; //포장

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public long getWaterQuantity() {
        return waterQuantity;
    }

    public void setWaterQuantity(long waterQuantity) {
        this.waterQuantity = waterQuantity;
    }

    public long getCoffeeBeanQuantityl() {
        return coffeeBeanQuantityl;
    }

    public void setCoffeeBeanQuantityl(long coffeeBeanQuantityl) {
        this.coffeeBeanQuantityl = coffeeBeanQuantityl;
    }

    public boolean isWrappedUp() {
        return isWrappedUp;
    }

    public void setWrappedUp(boolean wrappedUp) {
        isWrappedUp = wrappedUp;
    }

    void beWrappedUp() {
        this.isWrappedUp = true;
    }

    public Coffee(String coffeeName, long waterQuantity, long coffeeBeanQuantityl) {
        this.coffeeName = coffeeName;
        this.waterQuantity = waterQuantity;
        this.coffeeBeanQuantityl = coffeeBeanQuantityl;
        isWrappedUp = false;
    }
}
