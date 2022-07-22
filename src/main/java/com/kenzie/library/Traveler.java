package com.kenzie.library;

public class Traveler {
//define properties
protected String name;
protected int food;
protected boolean isHealthy;

//define constructors
 public Traveler(){
     this.name = "";
     this.food = 1;
     this.isHealthy = true;
 }

 public Traveler(String name){
     this();
     this.name = name;
 }

//define methods
    public void hunt() {
        //increase traveler food by 2
        this.food +=2;
    }

    public void eat(){
     //consume 1 unit of food

        //if traveler has no food, then traveler is no longer healthy
        if(this.food == 0){
            this.isHealthy = false;
        }
        else{
            this.food -=1;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public boolean getIsHealthy() {
        return isHealthy;
    }

    public void setIsHealthy(boolean healthy) {
        this.isHealthy = healthy;
    }
}

class Doctor extends Traveler {
//define constructors
public Doctor(){
    super();
}

public Doctor(String name){
    super(name);
}

//define methods
  public void heal(Traveler traveler){
    traveler.setIsHealthy(true);
  }
}

class Hunter extends Traveler {
//define constructors
    public Hunter(){
        //hunter starts with 2 food
        super();
        this.food = 2;
    }
    public Hunter(String name){
        super(name);
        this.food = 2;
    }

//define methods
public void hunt() {
    //increase hunter food by 5
    this.food +=5;
}
    @Override
    public void eat() {
        if(this.food >=2) {
            this.food -=2;
        }
        else if(this.food < 2){
            this.food =0;
            this.isHealthy = false;
        }
        else{
            this.isHealthy = false;
        }
    }
    public void giveFood(Traveler traveler, int numOfFoodUnits){
    //hunter loose food -numOfFoodUnits
        if(this.food >= numOfFoodUnits){
             this.food -= numOfFoodUnits;
            //Traveler gains food +numOfFoodUnits
            traveler.food += numOfFoodUnits;
        }
    }
}

