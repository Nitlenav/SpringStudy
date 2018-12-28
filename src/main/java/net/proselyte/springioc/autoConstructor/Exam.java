package net.proselyte.springioc.autoConstructor;

public class Exam {
    private AnswerChecker answerChecker;
    private String subject;

    public Exam(AnswerChecker answerChecker, String s) {
        this.answerChecker = answerChecker;
        this.subject = s;
    }

    public AnswerChecker getAnswerChecker() {
        return answerChecker;
    }

    public void setAnswerChecker(AnswerChecker answerChecker) {
        System.out.println("We just set Answer Checker using setter.");
        this.answerChecker = answerChecker;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void examCheck() {
        answerChecker.checkAnwer();
    }

}
