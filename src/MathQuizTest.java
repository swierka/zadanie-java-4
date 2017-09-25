import java.util.Scanner;

//Nie wiem dlaczego, sprawdzanie 2 i 3 pytania dziala niepoprawnie - zawsze pokazuje, ze odp jest zla

public class MathQuizTest {

    public static void main(String[] args) {
        Scanner answerQuizQuestions = new Scanner(System.in);
        System.out.println("Jaki jest wynik mnożenia 3*5?");
        double answerQ1 = answerQuizQuestions.nextDouble();
        answerQuizQuestions.nextLine();
        System.out.println("Jakie jest pole kwadratu o boku 12?");
        double answerQ2 = answerQuizQuestions.nextDouble();
        answerQuizQuestions.nextLine();
        System.out.println("Jaki jest pierwiastek kwadratowy z liczby 15129?");
        double answerQ3 = answerQuizQuestions.nextDouble();
        answerQuizQuestions.nextLine();
        answerQuizQuestions.close();
        MathQuiz checkAnswers = new MathQuiz();
        boolean checkedAnswer1 = checkAnswers.Question1(answerQ1);
        boolean checkedAnswer2 = checkAnswers.Question1(answerQ2);
        boolean checkedAnswer3 = checkAnswers.Question1(answerQ3);

        if (checkedAnswer1 == true) {
            System.out.println("Pytanie 1: Poprawna odpowiedź");
        } else {
            System.out.println("Pytanie 1: Błędna odpowiedź. Poprawna odpowiedź to 15.");
        }

        if (checkedAnswer2 == true) {
            System.out.println("Pytanie 2: Poprawna odpowiedź");
        } else {
            System.out.println("Pytanie 2: Błędna odpowiedź. Poprawna odpowiedź to 144.");
        }

        if (checkedAnswer3 == true) {
            System.out.println("Pytanie 3: Poprawna odpowiedź");
        } else {
            System.out.println("Pytanie 3: Błędna odpowiedź. Poprawna odpowiedź to 123.");
        }

        //       int getResult(boolean  vars) {
        //           int count = 0;
        //           for (boolean var : vars) {
        //               count += (var ? 1 : 0);
        //           }
        //           return count;


        //wiem, ze to nie jest optymalne rozwiazanie, ale na razie zadne lepsze mi nie wyszlo (np to wyzej)
        if (checkedAnswer1 == true && checkedAnswer2 == true && checkedAnswer3 == true) {
            System.out.println("Twój wynik to: 3/3");
        } else if (checkedAnswer1 == false && checkedAnswer2 == false && checkedAnswer3 == false) {
            System.out.println("Twój wynik to 0/3");
        } else if (checkedAnswer1 == true && checkedAnswer2 == true && checkedAnswer3 == false) {
            System.out.println("Twój wynik to 2/3");
        } else if (checkedAnswer1 == true && checkedAnswer2 == false && checkedAnswer3 == true) {
            System.out.println("Twój wynik to 2/3");
        } else if (checkedAnswer1 == false && checkedAnswer2 == true && checkedAnswer3 == true) {
            System.out.println("Twój wynik to 2/3");
        } else if (checkedAnswer1 == false && checkedAnswer2 == false && checkedAnswer3 == true) {
            System.out.println("Twój wynik to 1/3");
        } else if (checkedAnswer1 == false && checkedAnswer2 == true && checkedAnswer3 == false) {
            System.out.println("Twój wynik to 1/3");
        } else if (checkedAnswer1 == true && checkedAnswer2 == false && checkedAnswer3 == false) {
            System.out.println("Twój wynik to 1/3");
        }
    }
}