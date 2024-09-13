import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //arraylist för att samla alla personer (person)
        ArrayList<Person> allPersons = new ArrayList<>();

        //generera ett visst antal personer och spara i personlistan
        allPersons.add(new Person("David"));

        //skriva ut alla personer
        for(Person p: allPersons){
            System.out.println(p);
        }
    }
}
