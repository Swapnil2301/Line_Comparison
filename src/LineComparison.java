//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LineComparison {
    public Double isEqual(double x1,double x2,double y1,double y2){


        double length_line = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        return length_line;
    }

    public static void main(String[] args) {

        LineComparison uc1 = new LineComparison();
        double length_line1 = uc1.isEqual(1, 5, 4, 9);
        double length_line2 = uc1.isEqual(2,6,4,8);
        if(length_line1 == length_line2){
            System.out.println("Lines are Equal");
        }
        else{
            System.out.println("Lines are Not Equal");
        }
    }
}