<?php
require_once "Account.php";

class Driver extends Account {
    public $yearsWorking;

    public function __construct($name, $document, $yearsWorking)
    {
        parent::__constructor($name, $document);
        $this->yearsWorking = $yearsWorking;
    }

    public function greeting()
    {
        echo "Soy el conductor {$this->name} y llevo {$this->yearsWorking} años trabajando";
    }
}