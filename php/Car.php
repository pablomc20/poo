<?php	
    class Car
    {
        private $id;
        private $license;
        private $driver;
        private $passenger;

        public function __construct($license, $driver)
        {
            $this->license = $license;
            $this->driver = $driver;
        }

        public function printDataCar()
        {
            echo "Mi nombre es: {$this->driver->name} y mi licencia es: {$this->license}";
        }
    }
    
?>