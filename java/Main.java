class Main {
    public static void main(String[] args) {
        // System.out.println("Hola");   
        Account account = new Account("Pablo", "CUMP970324");
        Car car = new Car("AMQ123", account);
        car.passenger = 2;
        // car.printDataCar();
        
        Driver driver = new Driver("Joaquín", "JOA3256", 3);
        
        UberX uberx = new UberX("AMD567", driver, "VW", "Bochito");
        uberx.showDetails();
        // uberx.printDataCar();

        User user = new User("David", "DAV9867429", 30);
        user.greeting();
    }
}