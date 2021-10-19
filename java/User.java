import java.text.MessageFormat;

public class User extends Account{
    public int age;
    public User(String name, String document, int age) {
        super(name, document);
        this.age = age;
    }

    public void greeting() {
        System.out.println(MessageFormat.format("Soy el pasajero {0} y mi curp es {1}", this.name, this.document));
    }
}
