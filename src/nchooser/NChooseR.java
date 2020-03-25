/**
 * Karl Butler
 * 3/25/2020
 * NchooseR
 * This is a program that calculates the number of ways r objects can be chosen from a set of n objects
 */
package nchooser;
import javax.swing.JOptionPane;
/**
 *
 * @author Karl Butler
 */
public class NChooseR {


    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
//declaring variabless to 
        String getNum,getNum2;
        int num,num2,num3, n,r,z,x;
//getting the numbers to do calculations on
        getNum = JOptionPane.showInputDialog("This program calculates the number "
                + "\nof ways r different objects can be chosen from a set of n objects"
                + "\nEnter the number of objects to choose:");
        num=Integer.parseInt(getNum);
        
        getNum2 = JOptionPane.showInputDialog("Enter the number of objects there are to choose from:");
        num2=Integer.parseInt(getNum2);
//getting the (n-r) for calculations      
        num3=Math.abs(num2-num);
        
//getting the factorials
     
     n = fact(num);
     r = fact(num2);
     z = fact(num3);
        
//doing the actual equation  
        x= r/(n*z);
//outPut       
        System.out.println("There aer " +  x + " diferent ways" );
       
    }
//factorials
   public static int fact (int n) {
        if (n == 0 || n ==1) {
            return 1;
        } else {
            return (n * fact(n-1));
        }
    }
}
