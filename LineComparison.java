import com.linecomparisonmethod.LineComparisonUsingMethodUC4;

import java.util.Scanner;

public class LineComparison {
    public static int x1, x2, y1, y2, x3, x4, y3, y4;
    public static Double length1,length2;
    public void setLength(){
        Scanner sc = new Scanner(System.in);
        System.out.println("First line");
        System.out.println("Enter the Co-ordinates of x1 and y1 : ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter the Co-ordinates of x2 and y2 :");
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        System.out.println("Second line");
        System.out.println("Enter the Co-ordinates of x3 and y3 :");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        System.out.println("Enter the Co-ordinates of x4 and y4 :");
        x4 = sc.nextInt();
        y4 = sc.nextInt();

    }

    public void calculateTwoLength(){
        length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        length2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("Length of the first line = " + length1);
        System.out.println("Length of the second line = " + length2);

    }

    public void compareLineUsingCompareToMethod(){
        if (length1.compareTo(length2) == 1)
            System.out.println("Line 1 is Greater than Line 2 ");
        else if (length1.compareTo(length2) == -1)
            System.out.println("Line 1 is Less than Line 2 ");
        else
            System.out.println("Both lines are Equals");
    }

    public static void main(String[] args) {

        LineComparison equalMethodUC2 = new LineComparison();
        equalMethodUC2.setLength();
        equalMethodUC2.calculateTwoLength();
        equalMethodUC2.compareLineUsingCompareToMethod();

    }
}
