import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class App {

    static Scanner read = new Scanner(System.in);

    static void showMenu() {
        System.out.println("!--- Choose an option ---!\n" + "1 - Sum;\n" + "2 - Average\n" + "0 - Exit.");
    }

    public static void main(String[] args) throws Exception {

        int option = 0;

        do {
            showMenu();
            System.out.print("Option: ");
            option = read.nextInt();

            switch (option) {
                case 1:
                    System.out.println(requestSum("1,2,3,4,5"));
                    break;
                case 2:
                    System.out.println(requestAverage("1,2,3,4,5"));
                    break;
            }

        } while (option != 0);
    }

    public static int requestSum(String numbers) {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().GET()
                .uri(URI.create("http://localhost:8080/math/sum?values=" + numbers)).build();
        HttpResponse<String> response = null;

        try {
            response = client.send(request, BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return (int) Double.parseDouble(response.body());
    }

    public static int requestAverage(String numbers) {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().GET()
                .uri(URI.create("http://localhost:8080/statistics/avg?values=" + numbers)).build();
        HttpResponse<String> response = null;

        try {
            response = client.send(request, BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return (int) Double.parseDouble(response.body());
    }
}
