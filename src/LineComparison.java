//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LineComparison {
    public void isEqual(double x1,double x2,double y1,double y2){


        double length_line = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("Length of line is :"+length_line);
    }

    public static void main(String[] args) {

        LineComparison uc1 = new LineComparison();
        uc1.isEqual(1, 5, 4, 9);


    }
}