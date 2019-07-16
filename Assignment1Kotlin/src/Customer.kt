import java.util.*

class Customer
    (private val Customer_Id: Int,private val Customer_Name: String
) {

    var sc = Scanner(System.`in`)
    var Car: ArrayList<Car> = ArrayList()      //adding customer car to arraylist car

    val _id: Int
        get() {
            var n = 0
            try {
                val input = sc.next()
                n = Integer.parseInt(input)
            } catch (e: Exception) {
                System.out.println("Please enter valid id.")
                n = _id
            }

            return n;
        }

    val _price: Int
        get() {
            var n = 0
            try {
                val input = sc.next()
                n = Integer.parseInt(input)
            } catch (e: Exception) {
                System.out.println("Please enter valid id.")
                n = _price
            }

            return n
        }

    fun Get_Customer_Id(): Int {
        return Customer_Id       //get customer id

    }

    fun Get_Customer_Name(): String {
        return Customer_Name                  //get customer name
    }

    fun Add_Car() //Add car to customer
    {

        System.out.println("Types of cars:-\n")
        System.out.println("1.Hyundai(Enter 1)")
        System.out.println("2.Toyota(Enter 2)")
        System.out.println("3.Maruti(Enter 3)")               //Details of car
        val choice = _id

        if (choice == 1 || choice == 2 || choice == 3) {
            System.out.println("Enter Car Id:-")
            val CarId = _id
            System.out.println("Enter Car Model:-")
            val Model = sc.next()
            System.out.println("Enter Car Price:-")
            val Price = _price.toDouble()
            when (choice) {
                1 -> Car.add(Hyundai(CarId, Model, Price))       //Adding Car Details to the individual car(Hundai)
                2 -> Car.add(Toyota(CarId, Model, Price))        //Adding Car to the individual car(Toyoto)
                3 -> Car.add(Maruti(CarId, Model, Price))      //Adding Car to the individual car(Maruti)
            }

            System.out.println("Car Added.")    //car Added Successfully to Customer car Arraylist
        } else {
            System.out.println("Enter correct option")
        }
    }

    fun display() {

        for (carList in Car) {
            carList.display()
        }
    }
}