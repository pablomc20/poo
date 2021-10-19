<?php
require_once "Account.php";

class User extends Account {
    public $age;
    public function __construct($name, $document, $age)
    {
        parent::__construct($name, $document);
        $this->age = $age;
    }

    public function greeting()
    {
        echo "Soy el pasajero {$this->name} y mi curp es {$this->document}";
    }
}