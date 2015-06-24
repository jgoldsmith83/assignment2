/**
 * @author Justin
 */
public class formatPrinter {
    public static void main(String[] args){
        String[][] name = {{"John", "Jane", "Louis"},
                            {"Smith", "Doe", "CK"}
        };
        
        double[] grade = {88.8, 92.4, 98.9};
        double gradeSum = 0;
        double gradeAvg = gradeSum/grade.length;
        
        for (double i : grade){
            gradeSum += i;
        }
        
        
        
        System.out.printf("%-12s %-12s %8s\n", "First", "Last", "Grade");
        
         //This is printing each line with a loop
        final int COLS = 3;
        
        
          // Counter variables for rows and columns
        int col=0, row=0;
        
        for (col= 0; col <= COLS - 1; col++)
          {
             System.out.printf("%-12s %-12s %8s\n", name[row][col], name[row+1][col], grade[col]);
             
          }
        
        System.out.println();
        System.out.printf("%-12s %19.2s\n", "Average", gradeAvg);
        
        
    }
    
}
