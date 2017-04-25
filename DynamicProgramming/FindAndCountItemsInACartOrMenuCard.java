public class MenuCard {
  public static void main(String[] args) {
    String[] menu = {"apples","apples", "bananas", "pears", "milk", "cookies", "bread", "lemons"};    
    int count=0;
    Scanner user_input = new Scanner(System.in);
    System.out.println(" type any item to check in menu");
    String item;
    item = user_input.next();
    for(String s:menu) {
      if(s.equalsIgnoreCase(item)) {
        count++;             
      }    
    }
    System.out.println("no. of item is "+count);
  }
}



// output :

// type any item to check in menu
// apples
// no. of item is 2
