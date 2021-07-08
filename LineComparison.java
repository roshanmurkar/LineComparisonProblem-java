public class LineComparison{

        public static void main(String args[]) {

                System.out.println("Welcome To Line Comparision Program");
                int X1=6,Y1=2,X2=2,Y2=8;
                Double distance = Math.sqrt((X2-X1)*(X2+X1) + (Y2-Y1) *(Y2+Y1)) ;
                System.out.println("Distance between "+"("+X1+","+Y1+"),"+"("+X2+","+Y2+") is "+distance);
	
                int X3=12,Y3=4,X4=4,Y4=16;
                Double distance1 = Math.sqrt((X4-X3)*(X4+X3) + (Y4-Y3) *(Y4+Y3)) ;
                System.out.println("Distance between "+"("+X3+","+Y3+"),"+"("+X4+","+Y4+") is "+distance1);
                //check whether both lines are equal or not
                System.out.println( distance == distance1);//false
                
                //Compare is greater than (1) or less than (-1)
                System.out.println(distance + " .compareTo " + distance1 + ": " + distance.compareTo(distance1));
        }
}