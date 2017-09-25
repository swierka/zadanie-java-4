import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner insertNumber = new Scanner(System.in);
        System.out.println("Podaj liczbę oznaczającą dzień tygodnia (od 1 do 7): ");
        int weekDayNumber = insertNumber.nextInt();
        DayInfo dayInfo = new DayInfo();
        System.out.println(dayInfo.dayConverter(weekDayNumber));
        dayInfo.workingVsFreeDay(weekDayNumber);
    }

}
