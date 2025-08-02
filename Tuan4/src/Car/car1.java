package Car;

public class car1 {
    String brand;
    int maxSpeed;


    public car1(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void run() {
        System.out.println("Xe" + brand + "đang chạy với tốc độ tối đa" + maxSpeed + "km/h");
    }
}
