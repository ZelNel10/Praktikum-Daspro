import java.util.Scanner;
public class PemilihanHariDenganIf23 {
    public static void main(String[] args) {
        //Input angka
        Scanner input = new Scanner(System.in);
        System.out.print("Input day number: ");
        int dayName = input.nextInt();

        //Output hasil
        if (dayName >= 1 && dayName <= 5) {
            System.out.println("Weekday");
        } 
        else if (dayName == 6 || dayName == 7) {
            System.out.println("Weekend");
        }
        else {
           System.out.println("Invalid number"); 
        }
    }
}
