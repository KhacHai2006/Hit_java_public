package BT_class;

public class Pet {
    private String name;
    private double weight;
    private String species;

    public Pet(){

    }

    public Pet(String name, double weight, String species){
        this.name = name;
        this.weight = weight;
        this.species = species;
    }

    public void printInfo(String name, double weight, String species){
        System.out.println(" Ten: " + this.name );
        System.out.println(" Loai: " + this.species);
        System.out.println(" Can nang: " + this.weight);
    }

    public boolean isOverweight(){
        return  this.weight > 10;
    }

    public String getBasicInfo(){
        return this.name +" - " + this.species;
    }

    public String getName() {
        return this.name;
    }

    public String getSpecies() {
        return this.species;
    }

    public double getWeight() {
        return this.weight;
    }
}
