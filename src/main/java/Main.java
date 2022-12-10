import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<People> people = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMAN),
                new People("Иван Иванович", 69, Sex.MAN));

        StreamUtils streamUt = new StreamUtils();
        System.out.println(streamUt.getWomenFrom18To60(people));
        System.out.println("-----------------------------------------------");
        System.out.println(streamUt.getAverageManAge(people));
        System.out.println("-----------------------------------------------");
        System.out.println(streamUt.getWorkingPeople(people));
    }
}