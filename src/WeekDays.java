import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner insertNumber = new Scanner(System.in);
        System.out.println("Podaj liczbę oznaczającą dzień tygodnia (od 1 do 7): ");
        int weekDayNumber = insertNumber.nextInt();
        String toShow = "Wtorek";

        switch (weekDayNumber) {
            case 1:
                toShow = "Poniedziałek";
                break;
            case 2:
                toShow = "Wtorek";
                break;
            case 3:
                toShow = "Sroda";
                break;
            case 4:
                toShow = "Czwartek";
                break;
            case 5:
                toShow = "Piątek";
                break;
            case 6:
                toShow = "Sobota";
                break;
            case 7:
                toShow = "Niedziela";
                break;
            default:
                System.out.println("Niepoprawna liczba. Wpisz liczbę w przedziale od 1 do 7.");
        }

        if (weekDayNumber == 6 || weekDayNumber == 7) {
            System.out.println("Podany numer dnia tygodnia: " + weekDayNumber + '\n' + toShow + " to: dzień wolny");
        } else {
                System.out.println("Podany numer dnia tygodnia: "+weekDayNumber+'\n'+ toShow + " to: dzień pracujący");
        }

    }

}
