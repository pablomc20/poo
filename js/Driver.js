class Driver extends Account {
    constructor(name, document, yearsWorking){
        super(name, document);
        this.yearsWorking = yearsWorking;
    }

    greeting() {
        console.log(`Soy el conductor ${this.name} y llevo ${this.yearsWorking} años trabajando`);
    }
}