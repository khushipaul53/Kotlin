abstract class Car {
    internal var id: Int = 0;          //This method used to get id of Car and return Id of current object of int type
    internal var model: String? = null;                                //This method used to get id of Car and return Model of current object of String type

    internal var price: Double = 0.toDouble();  //get car prize

    internal fun display() {
        System.out.println("Enter Car ID :-$id")   ;                      //display Car details.
        System.out.println("Enter Car Model :-" + model!!);
        System.out.println("Enter Car Price :-$price");

        // System.out.println("Enter Car Resale Value :" + Resale_Value());
    }

    abstract fun Resale_Value(): Double;   //abstract resale_value function defined in extended classses. and overrided by every car.

}
/*This is Constructor of Hyundai class
	 *  id of int type
         *  model of String Type
	    price of double type */
class Hyundai(id: Int, model: String, price: Double) : Car() {

    init {
        this.id = id   ;                                //hundai car constructor geting car id,car model, car price
        this.model = model;
        this.price = price;
    }

    override fun Resale_Value(): Double {
        return price * 0.40  ;              // definaton of abstract method resale_value.
    }

}

/* This is Constructor of Toyoto class
     *  id of int type
     *  model of String Type
     * price of double type*/
class Toyota(id: Int, model: String, price: Double) : Car() {

    init {
        this.id = id;
        this.model = model;                        //Toyoto car constructor for getting car id,car model,car price
        this.price = price;
    }

    override fun Resale_Value(): Double {
        return price * 0.80;                //defination of abstract method resale_value;
    }

}

/*This is Constructor of Hyundai class
     * id of int type
     *  model of String Type
     *  price of double type */
class Maruti(id: Int, model: String, price: Double) : Car() {

    init {
        this.id = id;
        this.model = model  ;                                       //Maruti car constructor for getting car id,car model,car price
        this.price = price;
    }

    override fun Resale_Value(): Double {
        return price * 0.60;                               //defination of abstract method resale_value;
    }

}