class Main {
    public static void main(String[] args) {
        // System.out.println("Hola");   
        Account account = new Account("Pablo", "CUMP970324");
        Car car = new Car("AMQ123", account);
        car.passenger = 2;
        car.printDataCar();
        // System.out.println(car.driver);
        UberX uberx = new UberX("AMD567", new Account("Pablo", "CUMP67542637"), "nise ", "YAMAHA");
        uberx.showDetails();
        uberx.printDataCar();
    }
}