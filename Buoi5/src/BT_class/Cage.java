package BT_class;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Cage {
    private String cageCode;
    private ArrayList<Pet> pets ;
    private int currentPetCount;
    static int totalCages = 0;
    final int MAX_CAPACITY = 3;


    public Cage(String cageCode){
        this.pets = new ArrayList<>();
        Cage.totalCages += 1;
        this.cageCode = cageCode;
        this.currentPetCount = pets.size();

    }

    public Cage(String cageCode, ArrayList<Pet> pets){
        this.cageCode = cageCode;
        this.pets = pets;
        this.currentPetCount = pets.size();
        Cage.totalCages += 1;
    }

    public void addPet (Pet pet){
            if (currentPetCount < MAX_CAPACITY) {
                pets.add(pet);
                currentPetCount ++;
            } else {
                System.out.println( "Lồng" + cageCode + "đã đầy, không thể thêm thú.");
            }
    }

    public void printAllPets(){
        System.out.println("Lồng: " + cageCode);

        if(pets.size() == 0){
            System.out.println(" Long nay hien khong co thu cung nao:");
        }else {
            System.out.println(" Danh sach thu cung trong long:");
            for (int i = 0; i < pets.size(); i++){
                Pet pet = pets.get(i);
                System.out.println((i + 1) + ". Ten:" + pet.getName() + ", Loai:" + pet.getSpecies() + ", Can nang: " + pet.getWeight() + "kg" );
            }
        }
    }

    public void printOverweightPets(){
        boolean found = false;
        System.out.println("Danh sach thu cung nang hon 10kg:");
        for (Pet pet : pets){
            if (pet.isOverweight()){
                System.out.println("- " + pet.getBasicInfo() + " (" + pet.getWeight() + "kg");
                found = true;
            }
        }
        if (!found){
            System.out.println(" Khong co thu nao nang hon 10kg.");
        }
    }
}
