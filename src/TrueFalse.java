public class TrueFalse extends Question {
    private String correctAnswer;

    public TrueFalse(String question, String correctAnswer) {
        super(question);
        this.correctAnswer = correctAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public String toString() {
        return getQuestion();
    }

    public static boolean validateUserInput(String aInput) {
        return aInput.matches("TRUE|FALSE");
    }

    public boolean equals(String aAnswer) {
        return aAnswer.equals(correctAnswer);
    }

    public static void addQuestion() {
        boolean exit = false;
        do{ System.out.println("Type the question or press enter to return to the menu");
            String q = Quiz.getUserInput(false);
            if(q.equals("")) {
                return;
            }
            System.out.println("Is the correct answer True or False?");
        String a = Quiz.getUserInput(true);
        exit = validateUserInput(a);
        } while(!exit);
        Quiz.addQuestion(new TrueFalse(q,a));
    }

}
