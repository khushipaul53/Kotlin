import java.util.*



    fun main(args:Array<String>) {

        var Choice:String;

        var Menu: String;
        val Admin = Admin();

        val sc = Scanner(System.`in`);
        //Enter your choices.
        try {
            do {
                System.out.println("\n");
                System.out.println("Enter your Choice\n");
                System.out.println("1.Add new Customer");
                System.out.println("2.Add Car to an existing Customer");
                System.out.println("3.List of Customers with their cars sorted by name");
                System.out.println("4.List individual Customer based on ID");
                System.out.println("5.Generate prizes for the customer");

                Choice = sc.next();

                when (Choice) {
                    "1" -> Admin.Add_New_Customer();        //Add new Customer
                    "2" -> Admin.Add_Car_To_Customer();      //Add Car to Costumer
                    "3" -> Admin.View_Customers();     //To View Customer according sorted name
                    "4" -> Admin.List_By_Id();      // To view Customer according to Ids
                    "5" -> Admin.Prize();        //To show the winner.

                    else ->   System.out.println("Admin please enter Correct choice");
                }
                System.out.println("If you want to use menu again press:- Y for Yes and N for NO");

                Menu = sc.next();

            } while (Menu == "Y" || Menu == "y")
        } catch (e: InputMismatchException) {
            System.out.println("Input incorrect.. Please enter correct input");
        }

    }


