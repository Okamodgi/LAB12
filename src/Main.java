import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите IP-адрес: ");
        String ipAddress = scanner.nextLine();

        String regex = "^((\\d|\\d\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(25[0-5]|2[0-4]\\d|1\\d\\d|\\d\\d|\\d)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ipAddress);
        if (matcher.find()) {                //Поиск в строке str соответствий с помощью метода find() объекта matcher.
            System.out.println(matcher.group() + " соответствует шаблону IP-адреса");
        } else {
            System.out.println(ipAddress + " не соответствует шаблону IP-адреса");
        }
    }
}
