import java.util.Scanner;
/** this program will tell the user how much they saved on their order based off how much they spent.
 *
 * @author Isaac
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.println ("Please enter how much you spent");
    int money_spent = input.nextInt();
    if (money_spent <= 40) {
      System.out.println ("You get 10% off your order!");
      double money_saved = money_spent * 0.10;
      System.out.println ("You saved " + money_saved + "$!");
      double total = money_spent - money_saved;
      System.out.println ("Your new total is " + total + "$!");
    }
    else if (money_spent <= 80) {
      System.out.println ("You get 20% off your order!");
      double money_saved = money_spent * 0.2;
      System.out.println ("You saved " + money_saved + "$!");
      double total = money_spent - money_saved;
      System.out.println ("Your new total is " + total + "$!");
    }
    else if (money_spent <= 120) {
      System.out.println ("You get 30% off your order!");
      double money_saved = money_spent * 0.3;
      System.out.println ("You saved " + money_saved + "$!");
      double total = money_spent - money_saved;
      System.out.println ("Your new total is " + total + "$!");
    }
    else if (money_spent >= 121) {
      System.out.println ("You get 40% off your order!");
      double money_saved = money_spent * 0.4;
      System.out.println ("You saved " + money_saved + "$!");
      double total = money_spent - money_saved;
      System.out.println ("Your new total is " + total + "$!");
    }

  }
}
