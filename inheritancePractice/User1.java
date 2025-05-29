public class User1 {

    public static void main(String[] args) {
        
    Dog dog1=new Dog();

    dog1.run();

    dog1.walk();

    System.out.println();

    //NewSpecialDog dog2=new NewSpecialDog();

    //We can put parent class refence in child class also

    dog1= new NewSpecialDog();

    ((NewSpecialDog) dog1).bark();// Downcasting

    dog1.run();

    dog1.walk();
 
    }

}
