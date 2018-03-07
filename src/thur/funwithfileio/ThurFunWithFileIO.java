package thur.funwithfileio;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author john
 */
public class ThurFunWithFileIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        File file = new File("crap.txt");
        Scanner fileContents = new Scanner(file);
        int gradeAggregate = 0;
        int numberOfStudents = 0;

        while (fileContents.hasNext()) {
            String studentName = fileContents.next();
            int studentGrade = fileContents.nextInt();
            fileContents.nextLine();

            gradeAggregate += studentGrade;
            numberOfStudents++;

            System.out.println(
                    "Student Name: "
                    + studentName
                    + " received a grade of: "
                    + studentGrade
            );
        }

        System.out.println(
                "The average is: " + (float) gradeAggregate / numberOfStudents
        );
    }

}
