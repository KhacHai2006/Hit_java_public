package BT_class;

public class Main {

    public static void main(String[] args) {


    Cage cage1 = new Cage("A1");
    Cage cage2 = new Cage("B1");

    Pet pet1 = new Pet("Mimi", 4.5, "Cat");
    Pet pet2 = new Pet("Lulu", 12.5, "Dog");
    Pet pet3 = new Pet("Bobo", 11.0, "Dog");
    Pet pet4 = new Pet("Meomeo", 3.5, "Cat");
    Pet pet5 = new Pet("Chocon", 9.5, "Dog");

    cage1.addPet(pet1);
    cage1.addPet(pet2);
    cage1.addPet(pet3);
    cage2.addPet(pet4);
    cage2.addPet(pet5);

    System.out.println("Tong so long da tao:" + Cage.totalCages);

    cage1.printAllPets();
    cage2.printAllPets();

    cage1.printOverweightPets();
    cage2.printOverweightPets();
    }
}
