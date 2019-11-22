public class Main {

    public static void main(String[] args) {
        Person person = new Person("Joshua",26,"male",new String[] {"being a hardarse","agile","crazy","loving","ssd hard drives"});
        String greeting = person.hello();
        System.out.println(greeting);
    }

}
