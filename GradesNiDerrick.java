import java.util.Scanner;

public class GradesNiDerrick {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Quiz: ");
    double quiz = scan.nextDouble() * 0.20;
    System.out.print("Activity: ");
    double act = scan.nextDouble() * 0.15;
    System.out.print("Project: ");
    double proj = scan.nextDouble() * 0.25;
    System.out.print("Exam: ");
    double exam = scan.nextDouble() * 0.30;
    System.out.print("Class Standing: ");
    double clsStand = scan.nextDouble() * 0.10;

    double fnlGrade = (quiz + act + proj + exam + clsStand);
}
}
