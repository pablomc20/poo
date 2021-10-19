<?php
require_once "Car.php";
require_once "UberX.php";
require_once "Account.php";
require_once "User.php";
require_once "Driver.php";

$driver = new Driver("Pablo", "CUMP970324", 2);
$car = new Car("AMD12345", $driver);
$car->printDataCar();
$driver->greeting();
echo "<br>";

$uberx = new UberX("YGH7890", new Account("Juan", "JUAN67544"), "VW", "Bochito");
$uberx->printDataCar();
echo "<br>";

$user = new User("David", "DAV6427", "342d");
$user->greeting();