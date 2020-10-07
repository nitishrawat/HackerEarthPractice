

/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
import java.util.*;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class CostOfBalloons {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
 
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 
        */
 
        // Write your code here
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String s[] = br.readLine().trim().split(" ");
            int costOfGreenColoredBalloon = Integer.parseInt(s[0]);
            int costOfPurpleColoredBalloon = Integer.parseInt(s[1]);
            int n = Integer.parseInt(br.readLine());
            int numberOfParticipantsWhoSolvedProblem1 = 0;
            int numberOfParticipantsWhoSolvedProblem2 = 0;
            for(int j = 0; j < n ; j++){
                s = br.readLine().trim().split(" ");
                if ( Integer.parseInt(s[0]) == 1 ) {
                    numberOfParticipantsWhoSolvedProblem1++;
                }
                if ( Integer.parseInt(s[1]) == 1 ) {
                    numberOfParticipantsWhoSolvedProblem2++;
                }
            }
            int minimumCost = Math.min(costOfGreenColoredBalloon*numberOfParticipantsWhoSolvedProblem1+costOfPurpleColoredBalloon*numberOfParticipantsWhoSolvedProblem2,costOfPurpleColoredBalloon*numberOfParticipantsWhoSolvedProblem1+costOfGreenColoredBalloon*numberOfParticipantsWhoSolvedProblem2);
            System.out.println(minimumCost);
        
            
        }
 
    }
}
