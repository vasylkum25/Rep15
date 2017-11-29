package kum.Excepsion;

public class Auditory {

    private int auditoryNumber;

    private Mentor mentor;

    private Group group;

    public Auditory(Mentor mentor, Group group, int auditoryNumber) {
        this.mentor = mentor;
        this.group = group;
        this.auditoryNumber = auditoryNumber;
    }

    public String getMentorNme() {
        return mentor.getFirstName();
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public Student[] getGroupList() {
        return group.getStudents();
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public int getAuditoryNumber() {
        return auditoryNumber;
    }

    public void setAuditoryNumber(int auditoryNumber) {
        this.auditoryNumber = auditoryNumber;
    }
}
