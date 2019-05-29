package mainThread;
import controller.StudentController;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        StudentController controller = new StudentController();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add new student.");
            System.out.println("2. Save ");
            System.out.println("3. Display all student.");
            System.out.println("4. Exit");
            System.out.println("Enter choice");
            System.out.println(" ---------------- ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    controller.addStudent();
                    break;
                case 2:
                    controller.saveFile();
                    break;
                case 3:
                    controller.readFile();
                    break;
                case 4:
                    System.out.println("Exit!");
                    break;
                default:

                    break;
            }
            if (choice == 4) {
                break;
            }

        }
    }
}