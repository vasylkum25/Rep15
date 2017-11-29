package kum.Excepsion;

public class Mentor extends Person  {

    private String subject;

    public Mentor(String firstName, String secondName, int age, String subject) {
        super(firstName, secondName, age);
        this.subject = subject;

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Mentor:" + super.toString() + "  -" +
                "subject: " + subject;
    }
}
