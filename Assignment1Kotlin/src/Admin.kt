import java.util.*

class Admin {
    var sc = Scanner(System.`in`);
    val Prizes = Prizes();

    var customer_List: ArrayList<Customer> = ArrayList();    //Array list to contain the information.
    val _id: Int get() {
        var n = 0;
        try {
            val input = sc.next();
            n = Integer.parseInt(input);
        } catch (e: Exception) {
            System.out.println("Please enter valid id.");
            n = _id;
        }

        return n;
    }

    val _name: String get() {
        var c = 1;
        var c_name = "";
        c_name = sc.next();
        for (i in 0 until c_name.length) {
            if (c_name[i] >= 'a' && c_name[i] <= 'z' || c_name[i] >= 'A' && c_name[i] <= 'Z') {
                continue;
            } else {
                c = 0;
                break;
            }
        }
        if (c == 0) {
            System.out.println("Please enter valid name.");
            c_name = _name;
        }
        return c_name;
    }

    //defination of Add_new_Costumer method.
    fun Add_New_Customer() {
        var count = 0;


        System.out.println("Enter Customer ID No.");
        val id = _id;

        for (cust in customer_List) {
            if (cust.Get_Customer_Id() === id) {   //checking entered id and customer id to proceed next to add car in
                //particular id to customer
                count++;
                break;
            }
        }
        if (count > 0) {
            System.out.println("Customer with same ID already Exists.");
        } else {
            System.out.println("Enter Customer Name");
            val name = _name;
            val customer = Customer(id, name);
            if (customer_List.add(customer)) {
                System.out.println("Customer Added");
            }
        }
    }


    //Defination of Add_car_To_customer;
    fun Add_Car_To_Customer() {


        if (customer_List.size === 0) {
            System.out.println("No Data Found");
        } else {
            System.out.println("Enter Customer ID");
            val id = _id;

            for (cust in customer_List) {
                if (id == cust.Get_Customer_Id()) {
                    cust.Add_Car();
                } else {
                    System.out.println("Id doesnt exist");
                }

            }
        }

    }

    //Defination of view_Customers in sorted order by name
    fun View_Customers() {
        if (customer_List.size=== 0) {
            System.out.println("No Customer Found");
        }

        //Compairing name of all names to sort them using collections
        val Comparator = { c1: Customer, c2: Customer -> c1.Get_Customer_Name().compareTo(c2.Get_Customer_Name()) }

        //USing collections.sort to sort the list
        Collections.sort(customer_List,Comparator)

        //printing the sortes list
        for (cust in customer_List) {
            System.out.println("Customer ID: " + cust.Get_Customer_Id() + "\n" + "Customer Name:" + cust.Get_Customer_Name());

            cust.display()  //display function of Customer class is called.

        }
    }

    //  Defination of method List by id
    fun List_By_Id() {


        if (customer_List.size === 0) {
            println("No Data found")
        } else {
            println("Enter Customer id")
            val id = _id

            for (cust in customer_List) {
                if (id == cust.Get_Customer_Id()) {
                    System.out.println("Customer id: " + cust.Get_Customer_Id() + "\n" + "Customer Name:" + cust.Get_Customer_Name())
                    cust.display() //display function of Customer class is called.
                    break
                } else {
                    println("Id Does'nt exist")
                }

            }
        }
    }

    //   Prize function to display the winner
    fun Prize() {
    Prizes.LuckyDraw(customer_List)
    }

}