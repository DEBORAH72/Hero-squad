package models;

import java.util.ArrayList;

public class Hero {

    private final String name;
    private final int age;
    private final String power;
    private final String weakness;
    private final int id;
    private static final ArrayList<Hero> instances = new ArrayList<>();

    public Hero(String name, Integer age, String power, String weakness) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        instances.add(this);
        this.id = instances.size();
    }

    public String getName() {return this.name;}
        public void getCv() {
            String cv = this.name + " " + this.power;
        }
    public int getAge() {return this.age;}
    public String getPower() {return this.power;}
    public String getWeakness() {return this.weakness;}
    public static ArrayList<Hero> getAllInstances() {return instances;}
    public static void clearAllHeroes(){instances.clear();}
    public int getId(){return id;}
    public static Hero findById(int id) {return instances.get(id-1);}

    public static Hero setUpNewHero(){
        return new Hero("Arnold",23,"flying","fire");
    }
    public static Hero setUpNewHero1(){
        return new Hero("Janet",30,"Night Vision","Light");
    }
    public static Hero setUpNewHero2(){
        return new Hero("Jay",30,"Night Vision","Light");
    }

}