package Chapter48;

/**
 * Created by eason on 16/11/17.
 */
public class Main48 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(1.03 - .42);
        System.out.println(1.00 - 9 * .10);

        double funds = 1.00;
        int itemsBought = 0;
        for (double price = 0.10; funds >= price; price += .10) {
            funds -= price;
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Change: $" + funds);

    }

}

