
var driver = new Driver("Pablo", "CUMP970324", 2)
var car = new Car("AMD123", driver);
car.passenger = 4;
car.printDataCar();
driver.greeting();

var uberx = new UberX("YYHT87", new Account("David", "DAVT849"), "VW", "Bochito");
uberx.passenger = 5;
uberx.printDataCar();

var user = new User("David", "DAV9438756", 29);
user.greeting();