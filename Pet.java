 class Pet {

    public Pet(int age){
        System.out.println("Pet");
    }
}
 public class Cat extends Pet {
    public Cat (int age){
        super(age);
        System.out.println("Cat");
    }
    public static void main(String []args){
        new Pet(5);
    }
}