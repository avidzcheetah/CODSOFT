import java.util.Scanner;
public class StuGradeCalc {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubs = scanner.nextInt();
        int[] marks = new int[numSubs];
        int total = 0;

        for (int i = 0; i < numSubs; i++) {
            System.out.print("Enter marks for subject " + (i+1) + ": ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }
        double avgPct = (double) total / numSubs;
        String grade;
        if (avgPct >= 75){
            grade = "A";
        } else if (avgPct >= 65){
            grade = "B"; 
        } else if (avgPct >= 55){
            grade = "C";
        } else if (avgPct >= 35){
            grade = "S";
        } else {
            grade = "W";
        }

        System.out.println("Total Marks = " + total);
        System.out.println("Average Percentage = " + avgPct + "%");
        System.out.println("Grade = " + grade);

        scanner.close();
    }

}


