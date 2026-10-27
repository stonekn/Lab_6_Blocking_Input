import java.util.Scanner;

public class GasMileage
{
        static void main() {
            Scanner in = new Scanner(System.in)
            double tankCapacity = 0;
            double mpg = 0;
            double pricePerGallon = 0;
            double cost100 = 0;
            double totalMiles = 0;
            boolean done = false;
            String trash = "";
            do
            {
                IO.print("Enter the tank capacity in gallons");

                if(in.hasNextDouble())
                {
                    tankCapacity = in.nextDouble();
                    in.nextLine(); // clears the newline from the buffer
                }
                else
                {
                    trash = in.nextLine();
                    IO.println("You must enter a valid capacity not " + trash);
                }
            }while(!done);
            IO.println("the capacity is " + tankCapacity);
            done = false;

            do
            {
                IO.print("Enter the tank capacity in gallons");

                if(in.hasNextDouble())
                {
                    tankCapacity = in.nextDouble();
                    in.nextLine(); // clears the newline from the buffer
                }
                else
                {
                    trash = in.nextLine();
                    IO.println("You must enter a valid capacity not " + trash);
                }
            }while(!done);
            IO.println("the capacity is " + tankCapacity);
            done = false;

            do
            {
                IO.print("Enter the Price per gallon");

                if(in.hasNextDouble())
                {
                    pricePerGallon = in.nextDouble();
                    in.nextLine(); // clears the newline from the buffer
                }
                else
                {
                    trash = in.nextLine();
                    IO.println("Price per gallon not " + trash);
                }
            }while(!done);
            IO.println("the price per gallon is " + pricePerGallon);

            // Given size of tank, cost per gallon, and miles per gallon
            //cost to go 100 miles
            // 100/mpg * cost per gallon
            cost100 = 100 / mpg * pricePerGallon;



        }
}
