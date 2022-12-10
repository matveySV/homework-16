import java.util.List;
import java.util.stream.Collectors;

public class StreamUtils {
    public static List<People> getWomenFrom18To60(List<People> people) {
        return people.stream()
                .filter(pipl ->pipl.getSex()==Sex.WOMAN && pipl.getAge()>18 && pipl.getAge()<60)
                .collect(Collectors.toList());
    }


    public static double getAverageManAge(List<People> people) {
        return people.stream()
                .filter(pipl -> pipl.getSex() == Sex.MAN)
                .mapToInt(pipl -> pipl.getAge()).average()
                .orElse(0);
    }

    public static List<People> getWorkingPeople(List<People> people) {
        return people.stream()
                .filter(pipl -> pipl.getAge() >= 18)
                .filter(pipl -> pipl.getAge() < 60 && pipl.getSex() == Sex.MAN || pipl.getAge() < 55 && pipl.getSex() == Sex.WOMAN)
                .collect(Collectors.toList());

    }

}