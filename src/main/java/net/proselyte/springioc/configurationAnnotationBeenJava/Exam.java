package net.proselyte.springioc.configurationAnnotationBeenJava;

public class Exam {
    private AnswerChecker answerChecker;

    public Exam(AnswerChecker answerChecker) {
        System.out.println("Exam constructor inint.");
        this.answerChecker = answerChecker;
    }

    public AnswerChecker getAnswerChecker() {
        return answerChecker;
    }

    public void setAnswerChecker(AnswerChecker answerChecker) {
        this.answerChecker = answerChecker;
    }

    public void examCheck() {
        answerChecker.checkAnwer();
    }

}
