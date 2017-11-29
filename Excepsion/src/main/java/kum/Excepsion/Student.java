package kum.Excepsion;

public class Student extends Person  {

    private int groupId;

    public Student(String firstName, String secondName, int age, int groupId) {
        super(firstName, secondName, age);
        this.groupId = groupId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString()+
                " Group № " + groupId;
    }
}
