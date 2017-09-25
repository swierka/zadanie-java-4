import sun.text.normalizer.NormalizerBase;

public class MathQuiz {

    public boolean Question1 (double answer){
        boolean question1;
            if (answer == 15){
            question1 = true;
        } else { question1 = false;}
        return question1;
    }

    public boolean Question2 (double answer){
        boolean question2;
        if (answer == 144){
            question2 = true;
        } else { question2 = false;}
        return question2;
    }

    public boolean Question3 (double answer){
        boolean question3;
        if (answer == 123){
            question3 = true;
        } else { question3 = false;}
        return question3;
    }
}