public abstract class Person {

    //3.1 Lav en klasse Person, med feltet name.
    // Lav også en konstruktør og relevant getter- og setter-metode.
    // Lav derudover metoden boolean addCourse(String course).
    //Metoden skal ikke gøre noget, så du kan lade den returnere true og ikke gøre andet (en dummy-metode).

   private String name;

    public Person(String name){

        this.name = name;


    }

    public String getName(){

        return this.name;
    }

    public String setName(String name){

        return name;


    }

    public abstract boolean addCourse(String course);
}
