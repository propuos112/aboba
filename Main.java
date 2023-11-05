import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Username for Kali Linux user: ");
        String user = scanner.nextLine();
        System.out.print("Password for user: ");
        String pass = scanner.nextLine();

        int down = 100;

        while (down > 1) {
            System.out.println("Downloading system to the terminal");
            down--;
        }

        while (true) {
            System.out.print(user + "@DESKTOP-78K3PM9:~$ ");
            String command = scanner.nextLine();

            if (command.equals("help")) {
                System.out.println("Available commands:\nbash\nroot(not avaible)"); // Здесь вы можете перечислить доступные команды
            }
            if (command.equals("bash")) {
                System.out.println("?");
            }
            else {
                System.out.println("not command");
            }
        }


    }
}
