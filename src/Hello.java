public class Hello {
    public static void main(String [] args){
        boolean isMorning = true;

        if(isMorning == false){
            System.out.println("Eat Breakfast");

        }
        System.out.println("Brekfast is Over");

//        17th Jan
        double f = 20.00;
        double s  = 80.00;
        double t = (f+s)*100.00;
        double rem = 40.00 % t;
        boolean output = rem == 0.00? true: false;
        System.out.println(output);
        if (output)
        {
            System.out.print("got some remainder");
        }
    }
}
