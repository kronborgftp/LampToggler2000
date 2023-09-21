import java.util.Locale;
import java.util.Scanner;

public class LampToggler {
    static Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        {

            Lamp lamp1 = new Lamp("Kitchen Lamp");
            Lamp lamp2 = new Lamp("Living room lamp");
            Lamp lamp3 = new Lamp("Oven lamp");
            Lamp lamp4 = new Lamp("Outdoor lamp");
            Lamp lamp5 = new Lamp("Ceiling lamp");

            Lamp selectedLamp = null;

            while (true) {

                System.out.println("Here are your lamps: \n" +
                        "1. " + lamp1 + "\n " +
                        "2. " + lamp2 + "\n " +
                        "3. " + lamp3 + "\n " +
                        "4. " + lamp4 + "\n " +
                        "5. " + lamp5 + "\n ");

                System.out.println("Choose a lamp: ");
                int userChoice = keyboard.nextInt();

                //switch case to select the lamp
                switch (userChoice) {
                    case 1 -> {selectedLamp = lamp1; }
                    case 2 -> {selectedLamp = lamp2; }
                    case 3 -> {selectedLamp = lamp3; }
                    case 4 -> {selectedLamp = lamp4; }
                    case 5 -> {selectedLamp = lamp5; }
                    default -> System.out.println("Please choose a lamp.");

                }

                //toggle lamp on/off
                selectedLamp.toggle();
            }

        }
    }
}