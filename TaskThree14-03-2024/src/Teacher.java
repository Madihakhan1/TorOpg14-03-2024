//3.2: Lav to klasser Student og Teacher, som arver fra Person.
// Lav konstruktører til klasserne, som kalder Persons konstruktør ved at bruge keywordet super().

import java.util.ArrayList;

public class Teacher extends Person {

    //3.3 Lav to ArrayList i Teacher kaldet canTeach og currentCourses.

    ArrayList<String>canTeach = new ArrayList<>();
    ArrayList<String>currentCourses = new ArrayList<>();

    public Teacher(String name, ArrayList<String>canTeach) {

        super(name);

        this.canTeach = canTeach;
    }


    @Override
    public boolean addCourse(String course) {
        if(canTeach.contains(course)) {
            return false;
        }else
            canTeach.add(course);
        return true;
    }
}
