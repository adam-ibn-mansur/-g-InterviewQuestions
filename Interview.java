import javax.swing.JOptionPane;
import java.lang.Math;

public class Interview {

  public void countOdds() {
    System.out.println("Find all odd numbers between 1 and 100.");
    for (int i = 1; i <= 100; i+=2) { //this gives us our odd numbers for free without an if statement with an i % 2 condition.
        System.out.print(i + " "); //Prints output.
    }
  }
//From here on in, the outputs with println will have \n\n as prefixes for formatting purposes.
  public void CountBackwardsByThirteen() {
    System.out.println("\n\nCount backwards from 700 to 200 by 13.");
    
    //We did a for-loop with countOdds() - let's go ahead and do a while loop.
    int x = 700; //Start from 700
    while (x - 13 >= 200)
    {
      x -= 13; //decrement
      System.out.print(x + " ");//spit out the answer
    }
  }

  //This one was the hardest one. 
  public void twoCardsFromShuffledDeck() {
    System.out.println("\nDraw two cards from a shuffled standard playing card deck of 52 cards.");

    String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"}; //initialising the suits of the deck in a String array named 'SUITS'
    String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"}; //Same thing here, but with the 13 different ranks of cards.

    int n = SUITS.length * RANKS.length; //deck of 52

    String[] deck = new String[n];
    for (int i = 0; i < RANKS.length; i++) {
      for (int j = 0; j < SUITS.length; j++) {
        deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j]; //All 13 RANKS of all 4 SUITS are creating the 52-card deck!
      }
    }

    for (int i = 0; i < n; i++) {
      int r = i + (int) (Math.random() * (n-i)); //using random function
      String temp = deck[r];
      deck[r] = deck[i];
      deck[i] = temp; //swapping and shuffling
    }

    for (int i = 0; i < 2; i++) {
      // pull two cards from the shuffled deck, printing one card at a time. Safe to say, 
      //we can assume we are putting the card back in the pile.
      System.out.print(deck[i] + "\t"); //displaying a random card
    }
    
    //I could have just called 
  }

  public int sumBetweenXandY() {
    System.out.println("Assuming you have two integers, x and y, with y being greater than x, sum all the numbers from x to y.");
    //for example, if x is 3, and y = 10, return the sum 3+4+5+6+7+8+9+10
     JFrame f = new JFrame();
     String inputX = JOptionPane.showInputDialog(f, "Please enter x: ");
     String inputY = JOptionPane.showInputDialog(f, "Please enter y (make sure y is greater than x: ");
    //I went with the JOptionPane method of basic I/O mainly because I find it to be more aesthetically pleasing and professional.
    //That, and I was not patient enough to figure out how to use Scanner in Atom. Maybe later.
     int x = Integer.parseInt(inputX);
     int y = Integer.parseInt(inputY);
 
     int sum = 0;
     if (x < y) {
       for (int i = x; i <= y; i++) { //start at x, end at y, iterate.
        sum+=i; //Calculates the sum of all natural numbers from x to y.
      }
    }
     return sum;
   }
//main fxn
  public static void main(String[] args) {
    //creating the object to call the public methods from this static one.
    Interview obj = new Interview();

    obj.countOdds();
    obj.CountBackwardsByThirteen();
    obj.twoCardsFromShuffledDeck();
    System.out.println(obj.sumBetweenXandY());
  }
}
