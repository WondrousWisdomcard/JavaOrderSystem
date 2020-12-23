package maintest;

import ServerGUI.*;
import Database.*;
import ClientGUI.*;

public class OrderSystemTest {

    public static void main(String[] args) {

		PurchaseCuisines plist = new PurchaseCuisines();

    OperatorInterface t2 = new OperatorInterface();

    ServerOperatorInterface t = new ServerOperatorInterface();

    plist = t2.getMessage();
    
    t.newTask(plist);

	}// end main
}
