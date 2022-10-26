import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.addAll(generateClients());
        while (!queue.isEmpty()) {
            Person person = queue.poll();
            if (person.amountTickets > 0) {
                System.out.println((person.name + " " + person.surName + " " + "прокатилась(ся) на аттракционе"));
                person.amountTickets--;
                if (person.amountTickets == 0) {
                    continue;
                } else {
                    queue.offer(person);
                }
            }
        }

    }

    public static List<Person> generateClients() {
        LinkedList<Person> listOfVacationers = new LinkedList<>();
        listOfVacationers.add(new Person("Василий", "Пупкин", 5));
        listOfVacationers.add(new Person("Инокентий", "Смоктуновский", 4));
        listOfVacationers.add(new Person("Анна", "Цой", 6));
        listOfVacationers.add(new Person("Таня", "Гореева", 10));
        listOfVacationers.add(new Person("Артур", "Джанибекян", 8));
        return listOfVacationers;

    }
}