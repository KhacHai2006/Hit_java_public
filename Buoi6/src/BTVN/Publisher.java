package BTVN;

public class Publisher {
    public String name;
    public String address;

    public Publisher(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getInfo(){
        return "Publisher Name:" + name + ", Address" + address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
