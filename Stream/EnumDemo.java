package Stream;

interface Mobile1{
    String APPLE= "Apple";
}

enum Mobile{
    //get converted into class --> class Mobile { static final Mobile APPLE = new Mobile();}
    APPLE(100),SAMSUNG,HTC(90);
    //APPLE,SAMSUNG,HTC;
    int price;

    Mobile(){
        price = 80;
        System.out.println("Constructor :");
    }
    Mobile(int p){
        price = p;
    }
    public int getprice(){
        return price;
    }
}
public class EnumDemo {
   // Enum
    public static void main(String[] args){
       /* if(Mobile1.APPLE == "Apple"){
        }
        System.out.println(Mobile1.APPLE);*/

        Mobile m = Mobile.APPLE;
        switch (m){
            case APPLE :
                System.out.println("Apple is Best");
                break;
            case SAMSUNG :
                System.out.println("Copy of Apple");
                break;
            /*case ANU:
                System.out.println();*/
        }
        System.out.println(Mobile.HTC.getprice());
       // System.out.println(Mobile.APPLE.ordinal());
        //System.out.println(Mobile.SAMSUNG.ordinal());

        Mobile m1[]  = Mobile.values();  //Dont know how many CONSTANTS are in enum, to fetch
        for (Mobile mobile : m1) {
            System.out.println(mobile);
        }
    }
}
