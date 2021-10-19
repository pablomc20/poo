import java.text.MessageFormat;

public class Driver extends Account {
    public int yearsWorking;

    public Driver (String name, String document, int yearsWorking) {
        super(name, document);
        this.yearsWorking = yearsWorking;
    }

    public void greeting() {
        System.out.println(MessageFormat.format("Soy el conductor {0} y llevo {1} años trabajando", this.name, this.yearsWorking));
    }
}
