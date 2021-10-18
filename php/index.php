<?php
require_once "Car.php";
require_once "UberX.php";
require_once "Account.php";

$car = new Car("AMD12345", new Account("Pablo", "CUMP970324"));
$car->printDataCar();

$uberx = new UberX("YGH7890", new Account("Juan", "JUAN67544"), "VW", "Bochito");
$uberx->printDataCar();