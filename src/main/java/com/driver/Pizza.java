package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private boolean isCheeseAdded = false;
    private boolean isTakeAway = false;
    private boolean isToppingAdded = false;
    private boolean isBillGenerated = false;
    private String bill;
    private int extraCheese;
    private int takeAway;
    private int topping;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        extraCheese = 80;
        takeAway = 20;
        if(isVeg){
            price = 300;
            topping = 70;
        }else{
            price = 400;
            topping = 120;
        }
        this.bill = "Base Price Of The Pizza: "+price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
    if(!isCheeseAdded){
        isCheeseAdded = true;
        price+=extraCheese;
    }
    }

    public void addExtraToppings(){
        if(!isToppingAdded){
            isToppingAdded= true;
            price+=topping;
        }
    }

    public void addTakeaway(){
    if(!isTakeAway){
        isTakeAway = true;
        price+= takeAway;
    }
    }

    public String getBill(){
        if(!isBillGenerated) {
            isBillGenerated = true;
            if (isCheeseAdded) {
                this.bill += "Extra Cheese Added: " + extraCheese + "\n";
            }
            if (isToppingAdded) {
                this.bill += "Extra Toppings Added: " + topping + "\n";
            }
            if (isTakeAway) {
                this.bill += "Paperbag Added: " + takeAway + "\n";
            }
        }
        this.bill+="Total Price: "+ price +"\n";
        return this.bill;
    }
}
