import java.util.ArrayList;
import java.util.Scanner;

public class Depend {
    public static void wrapper() {
        System.out.println("this will show how wrapper works");
    }
    public static void foreachloop() {
        ArrayList<String> animals = new ArrayList<>();
        System.out.println("how many animals do you want to enter?");
        Scanner scanner = new Scanner(System.in);
        int numberOfAnimals = scanner.nextInt();
        for(int i=0; i<numberOfAnimals; i++) {
            animals.add(scanner.next());

        }
        for ( String i: animals) {
           System.out.println(i);
        }
    }

    public static void overloaded() {
       System.out.println("overloaded methods = methods that share the same name \n but have different parameters. \n method name +parameters = method signature. ");


        }
       // static int addolo(int a,int b) { return a+b;}
       // static int addolo(int a,int b,int c) { return a+b+c;}
   // public class Cups()

    }


 /*    System.out.println("Hello");

        boolean a = true;
        System.out.println(a);
        Boolean b = true;
        System.out.println(b.toString());

        int i = 2147483647;
        System.out.println(i+1);
        Integer j = 2147483647;
        System.out.println(j);
        */
//////////////////////////////////////////////////////////////////////////
// ARRAYLIST
        /*


        ArrayList< String> food = new ArrayList<String> ();

        food.add("ass");
        food.add("booty");
        // set, remove,clear methods

        for(int i=0; i<food.size(); i++) {
            System.out.print(food.get(i));
        }

        */
///////////////////////////////////////////////////////////////////////////

/* 2d arraylist */
/*
         ArrayList<ArrayList<String>> groceryList =new ArrayList();
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("assta");
        bakeryList.add("poosta");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomato");
        produceList.add("potato");
        produceList.add("banana");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("water");
        drinksList.add("alcohol");
        groceryList.add(bakeryList);
        groceryList.add(drinksList);

        groceryList.add(produceList);

        System.out.println(groceryList.get(0).get(0));

*/