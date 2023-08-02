package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
       Queen queen = new Queen();
       Worker worker = new Worker();
       Drone drone = new Drone();

    //    output(queen.doYourJob());
    //    output(worker.doYourJob());
    //    output(drone.doYourJob());
       
    //    output("--------------------"); 

    //    output(queen.fly());
    //    output(worker.fly());
    //    output(drone.fly());

    //    output("--------------------"); 
 
       pollObj(queen);
       pollObj(worker);
       pollObj(drone);

       HoneyBee bee = new HoneyBee();
       pollObj(bee);
    }

    // --- 3. Iteration :: Polymorphie ---//
    private static void pollObj(HoneyBee obj) {
        output(obj.doYourJob());
        output(obj.fly());
        output("--------------------"); 

    }



    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
}

