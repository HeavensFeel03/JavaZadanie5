import ru.netology.javaqa.javaqamvn.services.CalculateRest;

public class Main {
    public static void main(String[] args) {
        CalculateRest service = new CalculateRest();
        System.out.println(service.CalculateRest(100_000, 60_000, 150_000));
    }

}
