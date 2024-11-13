public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Vehicle {
    Vehicle() {
        System.out.println("Vehicle 생성자 호출");
    }
}

class Car extends Vehicle {
    Car() {
        super();  // 부모 클래스 생성자 호출
        System.out.println("Car 생성자 호출");
    }
}


