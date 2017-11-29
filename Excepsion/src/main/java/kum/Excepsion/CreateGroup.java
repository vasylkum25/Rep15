package kum.Excepsion;

import java.util.Arrays;

public class CreateGroup {


   private Student[] students;

   private Group[] groups;


    public CreateGroup(Student[] students) {
        this.students = students;
    }

    public Group[] create(){
       groups = new Group[6];
       for (int i =0; i<=5; i++) {
           Group group = new Group(i);
           Student[] studentsG = new Student[5];
           int j = 0;
                for (int k = 0; k<students.length; k++) {
                    if(students[k].getGroupId()==group.getGroupId()){
                        studentsG[j]=students[k];
                        j++;
                    }
                }
           group.setStudents(studentsG);
           groups[i]=group;
       }

        return groups;
       }



    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }
    
    
}

