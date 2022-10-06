package com.kenzie.library;

import java.util.Random;

public enum WildlifeType {
    ELK("ELK", 3),
    BISON("BISON", 5),
    DEER("DEER", 3),
    BEAR("BEAR", 4),
    PRONGHORN_ANTELOPE("PRONGHORN_ANTELOPE", 3),
    BIGHORN_SHEEP("BIGHORN_SHEEP", 3),
    SQUIRREL("SQUIRREL", 1),
    RUFFED_GROUSE("RUFFED_GROUSE", 1),
    PHAESANT("PHAESANT", 2),
    BOBWHITE_QUAIL("BOBWHITE_QUAIL", 1),
    HARE("HARE", 2),
    GROUNDHOG("GROUNDHOG", 1);

    //private String animal;
    private int animalValue;
    private String animalName;

    WildlifeType(final String animalName, final int animalValue) {
        this.animalName = animalName;
        this.animalValue = animalValue;
    }

    public int getAnimalValue() {
        return animalValue;
    }

    public void setAnimalValue(final int animalValue) {
        this.animalValue = animalValue;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(final String animalName) {
        this.animalName = animalName;
    }


    private static final WildlifeType[] animals = values();
    private static final int size = animals.length;
    private static final Random random = new Random();
    //private WildlifeType tempAnimal = WildlifeType.getRandomAnimal();

    public static WildlifeType getRandomAnimal() {

        return animals[random.nextInt(size)];
    }
}
//    public static void huntAnimals(WildlifeType[] animalsCaught, int animalPoints){
//        WildlifeType[] animalsCaught = new WildlifeType[size];
//        WildlifeType animal1 = WildlifeType.getRandomAnimal();
//       WildlifeType animal2 = WildlifeType.getRandomAnimal();
//        WildlifeType animal3 = WildlifeType.getRandomAnimal();
//        if(animal1.getAnimalValue() < 5){
//            animalsCaught = animal1.getAnimalValue();
//        }
//       return
//    }
//    for (int j = 0; j < animalsCaught.length; j++) {
//        if (animalsCaught[j].getAnimalValue() >= 5) {
//            WildlifeType animal = animalsCaught[j];
//        } else if (animalsCaught[j].getAnimalValue() < 5) {
//
//        }
//
//


//    public static void main(String[] args) {
//
//        WildlifeType tempAnimal = WildlifeType.getRandomAnimal();
//        System.out.println(tempAnimal.getAnimalName());
//        System.out.println(tempAnimal.getAnimalValue());
//    }
//}



