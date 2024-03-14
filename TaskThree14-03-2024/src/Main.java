import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        //3.6 Lav en klasse Main med en main-metode, hvor du tester Student og Teacher. Du skal oprette et antal studerende og et antal undervisere og give dem ArrayLists af Strings (beståede kurser til de studerende og canTeach-kurser til underviserne). Gem alle dine objekter i en ArrayList persons.

        ArrayList<String>passedCourses = new ArrayList<>();
        passedCourses.add("C++");
        passedCourses.add("Java");

        ArrayList<String>canTeach = new ArrayList<>();
        canTeach.add("Matematik");
        canTeach.add("Engelsk");


        ArrayList<Person>personList = new ArrayList<>();
        personList.add(new Student("Madiha", passedCourses));
        personList.add(new Teacher ("Lis", canTeach));

        ArrayList<Person>person2 = new ArrayList<>();
        person2.add(new Student("Sania", passedCourses));
        person2.add(new Teacher("Mads", canTeach));

        canTeach.add("Java 1,0");

        for(Person currentPerson : personList){
            boolean succes = currentPerson.addCourse("java 1,0");
            if(succes == false){
                System.out.println(currentPerson.getName());
                if(currentPerson instanceof Student) {
                    System.out.println("Jeg har allerede bestået dette kursus");
                }else{
                    System.out.println("Kan ikke undervise i dette fag");
                }
            }
        }

    }
}