class UberX extends Car{
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    void showDetails() {
        System.out.println("Conductor:" + this.driver.name + " con curp " + this.driver.document);
        System.out.println("Marca:" + this.brand);
        System.out.println("Modelo:" + this.model);
    }
}
