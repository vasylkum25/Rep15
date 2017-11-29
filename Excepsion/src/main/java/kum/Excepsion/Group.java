package kum.Excepsion;

import java.util.Arrays;

public class Group {

private Student[] students;

private int groupId;

    public Group(Student[] students, int groupId) {
        this.students = students;
        this.groupId = groupId;
    }

    public Group() {
    }

    public Group(int i) {
        this.groupId = i;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

	@Override
	public String toString() {
		return "Group [students=" + Arrays.toString(students) + ", groupId=" + groupId + "]";
	}
    
    

}
