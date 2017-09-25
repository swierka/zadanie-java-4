public class DayInfo {

    String dayConverter(int dayNumber) {
        String toShow = null; //w metodzie zmienne lokalne musza miec przypisane jakas wartosc, najlepiej dafault, w klasie wartosc default jak przypisana automatycznie

        switch (dayNumber) {
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
        return toShow;

    }

    void workingVsFreeDay(int dayNumber) {
        String toShowWhichDay = null;

        if (dayNumber == 6 || dayNumber == 7) {
            System.out.println("Podany numer dnia tygodnia: " + dayNumber + '\n' + dayConverter(dayNumber) + " to: dzień wolny");
        } else {
            System.out.println("Podany numer dnia tygodnia: " + dayNumber + '\n' + dayConverter(dayNumber) + " to: dzień pracujący");
        }
    }
}
