package net.proselyte.springioc.dependencies;

public class Exam {
    private AnswerChecker answerChecker;

    public AnswerChecker getAnswerChecker() {
        return answerChecker;
    }

    public void setAnswerChecker(AnswerChecker answerChecker) {
        System.out.println("We just set Answer Checker using setter.");
        this.answerChecker = answerChecker;
    }

    public void examCheck() {
        answerChecker.checkAnwer();
    }

}
