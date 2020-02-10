public class Main{
    public static void main(String[] args) {
        

        //creating an instance of the Handbag object
        Handbag handbagObject1 = new Handbag();
        Handbag handbagObject2 = new Handbag();

        handbagObject1.colour = "Black";
        handbagObject1.brand = "Dior";
        handbagObject1.cost = 5000.99f;
        handbagObject1.longStrap = true;

        handbagObject2.colour = "Blue";
        handbagObject2.brand = "Versace";
        handbagObject2.cost = 6000.99f;
        handbagObject2.longStrap = false;

        System.out.println(handbagObject1.colour);
        System.out.println(handbagObject1.brand);

        System.out.println(handbagObject2.colour);
        System.out.println(handbagObject2.brand);

        handbagObject1.printCost();
        handbagObject2.printCost();

        handbagObject1.cost = 7000.99f;
        handbagObject1.printCost();
        handbagObject1.reduceCost();
        System.out.println(handbagObject1.cost);
    }
}