package Bai3trenlop;

public class car {
        String brand;
        int maxSpeed;


        public car(String brand, int maxSpeed) {
            this.brand = brand;
            this.maxSpeed = maxSpeed;
        }

        public void run() {
            System.out.println("Xe" + brand + "đang chạy với tốc độ tối đa" + maxSpeed + "km/h");
        }
}
