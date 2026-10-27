//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()

{
    Scanner in = new Scanner(System.in);

    double cVal = 0;
    double fVal = 0;
    boolean done = false;
    String trash = "";
    // F = C * 9/5 + 32

    do {

        IO.print("Enter the C Value: ");

        if(in.hasNextDouble())
        {
            cVal = in.nextDouble();
            fVal = cVal * 9.0/5 + 32;
            IO.println("The value " + cVal + "in Celsius is " + fVal + "in Fahrenheit!" );
            done = true;
        }
        else
        {
           trash = in.nextLine();
            IO.println("You must enter a valid Fahrenheit value not: " + trash);
            IO.println("Try Again");
        }

    }while(!done);
}
