package ru.shemyakin.java.basic.homeworks.homework6;

public class Plate {
    private int maxFoodQuantity;
    private int foodQuantity;

    public Plate(int maxFoodQuantity) {
        this.maxFoodQuantity = maxFoodQuantity;
        this.foodQuantity = maxFoodQuantity;
    }

    public void addFood(int quantity) {
        if (this.foodQuantity < this.maxFoodQuantity) {
            this.foodQuantity += quantity;
            if (this.foodQuantity > this.maxFoodQuantity) this.foodQuantity = this.maxFoodQuantity;
        }
    }

    public boolean decreaseFood(int quantity) {
        if (this.foodQuantity >= quantity) {
            this.foodQuantity -= quantity;
            return true;
        }
        return false;
    }
}
