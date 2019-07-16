import java.util.*

class Prizes {

    fun LuckyDraw(customerList: ArrayList<Customer>) {
        val admin = ArrayList<Int>();  //arraylist for admin to enter 3 id's
        val Random = ArrayList<Int>();  //arraylist for ramdom 6 values(id's) to choosen by system itself.
        var a: Int;
        val sc = Scanner(System.`in`);
        if (customerList.size === 0) {
            System.out.println("No costumer in list\n");
        } else if (customerList.size > 6) {
            for (i in 0..5) {
                a = (Math.random() * 10 + 1).toInt();       //Random values
                Random.add(a);
            }
            System.out.println("Enter 3 Costumer id's of your choice\n");

            for (i in 0..2) {
                val s = sc.nextInt();
                if (Random.contains(s)) admin.add(s)
            }
            System.out.println(admin);
        } else {
            System.out.println("Add more Costumer(Atleast 6)");
        }

    }

}