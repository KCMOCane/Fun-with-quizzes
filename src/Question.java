public abstract class Question {
    private String question;

    public Question(String question) {
        this.question = question;
    }

    @Override
    public abstract String toString();

    public String getQuestion () {
        return question;
    }
}
