class User extends Account {
    constructor(name, document, age) {
        super(name, document);
        this.age = age;
    }

    greeting() {
        console.log(`Soy el pasajero ${this.name} y mi curp es ${this.document}`);
    }
}