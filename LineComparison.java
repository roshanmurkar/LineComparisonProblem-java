public class LineComparison{

        public static void main(String args[]) {

                System.out.println("Welcome To Line Comparision Program");
                int X1=6,Y1=2,X2=2,Y2=8;
                double distance = Math.sqrt((X2-X1)*(X2+X1) + (Y2-Y1) *(Y2+Y1)) ;
                //System.out.println(distance);
                System.out.println("Distance between "+"("+X1+","+Y1+"),"+"("+X2+","+Y2+") is "+distance);
	}
}