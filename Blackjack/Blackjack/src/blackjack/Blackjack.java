/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.*;
/**
 *
 * @author mepig
 */
public class Blackjack { /*this game was meant to be part of a whole economy with other games so if you see certain things, it might be because of that. Use this code if you want.*/

 public static void printGameRules() { //prints the game rules
    System.out.println("""
                       ð�•Žð�•–ð�•�ð�•”ð�• ð�•žð�•– ð�•¥ð�•  ð�”¹ð�•�ð�•’ð�•”ð�•œð�•�ð�•’ð�•”ð�•œ! ð�•‹ð�•™ð�•– ð�•˜ð�• ð�•’ð�•� ð�• ð�•— ð�•¥ð�•™ð�•– ð�•˜ð�•’ð�•žð�•– ð�•šð�•¤ ð�•¥ð�•  ð�•˜ð�•–ð�•¥ ð�•¥ð�•  ð�Ÿšð�Ÿ™ ð�•¡ð�• ð�•šð�•Ÿð�•¥ð�•¤. ð�•€ð�•— ð�•ªð�• ð�•¦ ð�•˜ð�•  ð�• ð�•§ð�•–ð�•£ ð�Ÿšð�Ÿ™ ð�•¡ð�• ð�•šð�•Ÿð�•¥ð�•¤, ð�•ªð�• ð�•¦ ð�•�ð�• ð�•¤ð�•–. 
                       â„•ð�•¦ð�•žð�•“ð�•–ð�•£ ð�•”ð�•’ð�•£ð�••ð�•¤ ð�•™ð�•’ð�•§ð�•– ð�•’ ð�•¡ð�• ð�•šð�•Ÿð�•¥ ð�•§ð�•’ð�•�ð�•¦ð�•– ð�•–ð�•¢ð�•¦ð�•’ð�•� ð�•¥ð�•  ð�•¥ð�•™ð�•–ð�•šð�•£ ð�•Ÿð�•¦ð�•žð�•“ð�•–ð�•£. ð�”½ð�•’ð�•”ð�•– ð�•”ð�•’ð�•£ð�••ð�•¤(ð�•‚, ð�•�, â„š, ð�”¸) ð�•’ð�•£ð�•– ð�Ÿ™ð�Ÿ˜ ð�•¡ð�• ð�•šð�•Ÿð�•¥ð�•¤.
                       ð�•�ð�• ð�•¦ ð�•¤ð�•¥ð�•’ð�•£ð�•¥ ð�• ð�•¦ð�•¥ ð�•¨ð�•šð�•¥ð�•™ ð�Ÿ™ð�Ÿ˜ð�Ÿ˜ð�Ÿ˜ ð�•”ð�• ð�•šð�•Ÿð�•¤ ð�•’ð�•Ÿð�•• ð�•¥ð�•™ð�•– ð�•˜ð�• ð�•’ð�•� ð�•šð�•¤ ð�•¥ð�•  ð�•˜ð�•–ð�•¥ ð�•’ð�•¤ ð�•žð�•’ð�•Ÿð�•ª ð�•’ð�•¤ ð�•ªð�• ð�•¦ ð�•”ð�•’ð�•Ÿ. ð�•€ð�•— ð�•ªð�• ð�•¦ ð�•™ð�•šð�•¥ ð�Ÿ˜ ð�•”ð�• ð�•šð�•Ÿð�•¤ ð�•ªð�• ð�•¦ ð�•�ð�• ð�•¤ð�•–.
                       ð�”¸ð�•�ð�•¤ð�• , ð�•›ð�•¦ð�•¤ð�•¥ ð�•¤ð�•  ð�•ªð�• ð�•¦ ð�•œð�•Ÿð�• ð�•¨, ð�•¥ð�•™ð�•–ð�•£ð�•– ð�•šð�•¤ ð�•Ÿð�•  ð�•¨ð�•’ð�•ª ð�• ð�•— ð�•¨ð�•šð�•Ÿð�•Ÿð�•šð�•Ÿð�•˜ ð�•¥ð�•™ð�•šð�•¤. ð�”¾ð�• ð�• ð�•• ð�•�ð�•¦ð�•”ð�•œ!
                       â„™ð�•£ð�•–ð�•¤ð�•¤ ð�•– ð�•¥ð�•  ð�•–ð�•©ð�•šð�•¥ ð�•’ð�•Ÿð�•ªð�•¥ð�•šð�•žð�•–.""");
    
    
  }

  public static void printLossMessage() { //prints a randomly generated loss message
    Random rand = new Random();
    int action = rand.nextInt(4)+1;

    switch(action) {
      case 1: System.out.println("ðŸ„·ðŸ„¾ðŸ…† ðŸ„³ðŸ„¾ðŸ„´ðŸ…‚ ðŸ„¸ðŸ…ƒ ðŸ„µðŸ„´ðŸ„´ðŸ„» ðŸ…ƒðŸ„¾ ðŸ„»ðŸ„¾ðŸ…‚ðŸ„´ ðŸ…ƒðŸ„¾ ðŸ…ƒðŸ„·ðŸ„´ ðŸ„²ðŸ„¾ðŸ„¼ðŸ„¿ðŸ…„ðŸ…ƒðŸ„´ðŸ…� ðŸ…ˆðŸ„¾ðŸ…„ ðŸ„³ðŸ…„ðŸ„½ðŸ„²ðŸ„´?"); 
      break;

      case 2: System.out.println("Gáµ¢â‚œ Gáµ¤d."); 
      break;

      case 3: System.out.println("ð��»ð�‘œð�“Œ ð�’¹ð�‘œð�‘’ð�“ˆ ð�’¾ð�“‰ ð�’»ð�‘’ð�‘’ð�“� ð�“�ð�‘œð�“ˆð�’¾ð�“ƒð�‘” ð�“‰ð�‘œ ð�“‰ð�’½ð�‘’ ð�’¸ð�‘œð�“‚ð�“…ð�“Šð�“‰ð�‘’ð�“‡ ð�“‡ð�‘œð�‘œð�“€ð�’¾ð�‘’?"); 
      break;

      case 4: System.out.println("ð�™‚ð�™¤ ð�™¥ð�™¡ð�™–ð�™® ð�™¢ð�™žð�™£ð�™šð�™˜ð�™§ð�™–ð�™›ð�™© ð�™®ð�™¤ð�™ª ð�™£ð�™šð�™§ð�™™."); 
      break;

      
    }
  }

  public static void printWinMessage() { //prints a randomly generated loss message
    Random rand = new Random();
    int action = rand.nextInt(4)+1;

    switch(action) {
      case 1: System.out.println("ðŸ†ˆðŸ…¾ðŸ†„'ðŸ†�ðŸ…´ ðŸ…½ðŸ…¾ðŸ†ƒ ðŸ†‚ðŸ†„ðŸ…¿ðŸ…¿ðŸ…¾ðŸ†‚ðŸ…´ðŸ…³ ðŸ†ƒðŸ…¾ ðŸ…ºðŸ…½ðŸ…¾ðŸ†† ðŸ…·ðŸ…¾ðŸ†† ðŸ†ƒðŸ…¾ ðŸ…¿ðŸ…»ðŸ…°ðŸ†ˆ ðŸ…½ðŸ…´ðŸ††-ðŸ…¶ðŸ…´ðŸ…½."); 
      break;

      case 2: System.out.println("Nice â’½â“�â“§â“§â“§â“§â“§â“§â“§ Kid.");
      break;

      case 3: System.out.println("â’¼â“ž â“–â“�â“œâ“‘â“›â“” â“¢â“žâ“œâ“”â“¦â“—â“”â“¡â“” â“”â“›â“¢â“”â€¯Â Â â€¯,âƒ� â’¾ â“žâ“�â“›â“¨ â“�â“’â“’â“”â“Ÿâ“£ â“–â“�â“œâ“”â“¢ â“•â“¡â“žâ“œ â“›â“žâ“¢â“”â“¡â“¢");
      break;

      case 4: System.out.println("ð�”Šð�”¬ ð�”¤ð�”žð�”ªð�”Ÿð�”©ð�”¢ ð�”°ð�”¬ð�”ªð�”¢ð�”´ð�”¥ð�”¢ð�”¯ð�”¢ ð�”¢ð�”©ð�”°ð�”¢, â„‘ ð�”¬ð�”«ð�”©ð�”¶ ð�”žð�” ð�” ð�”¢ð�”­ð�”± ð�”¤ð�”žð�”ªð�”¢ð�”° ð�”£ð�”¯ð�”¬ð�”ª ð�”©ð�”¬ð�”°ð�”¢ð�”¯ð�”°.");
      break;

      
    }
  }
  
  public static void main(String[] args) {
  
    
    Scanner scan = new Scanner(System.in);
    Cards crd = new Cards();
    ComputerCards ccrd =new ComputerCards();
    Random rand = new Random();
    BettingSystem easteregg = new BettingSystem(100, 10000); //lets you start off with more coins if you can activate the easter egg
    
    printGameRules(); //prints the game rules
    
    int bet = 0;
    
    int random = 0;
    int tempcoins = 0;
    boolean bett = false;
    boolean resultsdisplayed = false; //prevents the results from displaying more than once
    boolean discover = false; //only lets you discover the easter egg once
    boolean playing = true; //boolean to determine if game is repeated or not
    BettingSystem bs = new BettingSystem(bet, 1000);
    
    while (playing == true) {
        bet = 0;
        bett = false;
        
        if (bs.getCoins() == 0) {
            System.out.println("GaMe oveR. You lOsT ahaHAHAh. yOu ENdED uP wIth 0 coiNS.");
            System.exit(1);
            
        }
        inner:
        while (!bett){ //repeats until a valid bet is entered
            
            System.out.println("ð��˜ð��¨ð��® ð��¡ð��šð��¯ð��ž: " + bs.getCoins() + " ð��œð��¨ð��¢ð��§ð��¬.");
            System.out.print("ð�—•ð�—²ð�˜� ð�—”ð�—ºð�—¼ð�˜‚ð�—»ð�˜�: ");
            bet = scan.nextInt(); //waits from input ready message from player

            
            if ((bet == 69 || bet == 420 || bet == 12345 || bet==21 || bet==19) && discover == false) { /*gives you coins if you get the easter egg and you haven't done it before. don't tell anyone this, but if you enter a meme number it activates.*/

                int coins = rand.nextInt(100000)+1;
                System.out.println("You truly are a dank memer. Take these " + coins + " coins as a reward!");
                easteregg.awardCoins(coins);
                discover = true;
                continue;
            }
    
            else if ((bet == 69 || bet == 420 || bet == 12345 || bet==21) && discover == true) {
        
                System.out.println("SToP TrYiNg tO KhEaT YoU GrEeDy aMaTeUr. ThE GeNiUsEs tHaT KrEaTeD Me wOuLdN'T LeT YoU GeT AwAy wItH ThAt.");
                continue;
            }
            
            else if (bet > bs.getCoins()) {
        
                System.out.println("You only have " + bs.getCoins() + " coins fool.");
                continue;
            }
        
            else if (bet <= 249) {
                random = rand.nextInt(4)+1;
            
                switch (random) {
                    case 1: System.out.println("You can't bet under 250 coins sorry, not really sorry.");
                    break;
                    case 2: System.out.println("Bet more coins nerd. You need at least 250 coins.");
                    break;
                    case 3: System.out.println("Stop bothering me if you can't bet 250 coins.");
                    break;
                    case 4: System.out.println("Bet.exe has stopped work. System.error.detected. Engaging self destruction. "); //stops code if you're unlucky
                    System.out.print("By the way, you had: " + bs.getCoins() + " ð��œð��¨ð��¢ð��§ð��¬.");
                    System.exit(1);
                
                }
                continue;
            }
            System.out.println("wtf");
            bett=true;
            break inner;
    } 
        System.out.println("gothere");
        bs = new BettingSystem(bet, bs.getCoins()); //syncs the amount of coins over
        String choice = "";
        int turn = 1;
        int computerturn = 1;
        boolean gameOver = false;
        boolean computerGameOver = false;
    
     
    while(gameOver == false || computerGameOver == false){ // the actual game, repeats until the results are clear
        
        if (turn >= 4) {
            gameOver = true;
            
            break;
        }
        
        if (computerturn >= 4) {
            
            computerGameOver = true;
            break;
        }
        
        if (crd.getScore() >= 21 || ccrd.getComputerScore() >= 21) {
          gameOver = true;
          computerGameOver = true;
          break;
        }
        
        if (turn == 1) {  //players turn
        
        crd.shuffle();
        crd.draw();
        crd.draw();
        turn += 1;
        
        }
        
        else if (turn >= 2 && gameOver == false) {
        turn += 1;
        crd.draw();
        
        }
        
        if (computerturn == 1) { //plays computers turn
        computerturn++;
        ccrd.shuffle();
        ccrd.drawForComputer();
        ccrd.drawForComputer();
        }
      
        else if (computerturn >= 2 && computerGameOver == false && (ccrd.getComputerScore() < 17 || crd.getScore() > ccrd.getComputerScore())) { //draws for computer is computer score is under 17
        computerturn += 1;
        ccrd.drawForComputer();
        
        }
        
        else if (computerturn >= 2 && computerGameOver == false && ccrd.getComputerScore() >= 17) {
            computerGameOver = true;
        }
       
       
        if (crd.getScore() >= 21 || ccrd.getComputerScore() >= 21) {
          gameOver = true;
          computerGameOver = true;
          break;
        }
        
      
        if (gameOver == false) {
            System.out.println("Cards: " + crd.getCards() + " || Budget Memer Cards: " + ccrd.getComputerCards()); //prints outscore
            System.out.println("Total: "+ crd.getScore() + " || Budget Memer Total: " + ccrd.getComputerScore());
            System.out.println("Type h to hit, type s to stand, or e to exit.");
            choice = scan.next();
        
        }    
      
        if (!choice.toLowerCase().equals("h")&&!choice.toLowerCase().equals("s")&&!choice.toLowerCase().equals("e") && gameOver == false){

            System.out.println("ð�”¹ð�•–ð�•”ð�•’ð�•¦ð�•¤ð�•– ð�• ð�•— ð�•ªð�• ð�•¦ð�•£ ð�•šð�•Ÿð�•’ð�•“ð�•šð�•�ð�•šð�•¥ð�•ª ð�•¥ð�•  ð�•’ð�•”ð�•¥ð�•¦ð�•’ð�•�ð�•�ð�•ª ð�•¡ð�•£ð�•–ð�•¤ð�•¤ ð�•’ ð�•“ð�•¦ð�•¥ð�•¥ð�• ð�•Ÿ, ð�•€ ð�•¨ð�•šð�•�ð�•� ð�•Ÿð�• ð�•¨ ð�•¥ð�•’ð�•œð�•– ð�•ªð�• ð�•¦ð�•£ ð�•žð�• ð�•Ÿð�•–ð�•ª (ð�•’ð�•�ð�• ð�•Ÿð�•˜ ð�•¨ð�•šð�•¥ð�•™ ð�•ªð�• ð�•¦ð�•£ ð�•¤ð�• ð�•”ð�•šð�•’ð�•� ð�•¤ð�•–ð�•”ð�•¦ð�•£ð�•šð�•¥ð�•ª, ð�•”ð�•£ð�•–ð�••ð�•šð�•¥ ð�•”ð�•’ð�•£ð�••, ð�•’ð�•Ÿð�•• ð�•šð�•¡ ð�•Ÿð�•¦ð�•žð�•“ð�•–ð�•£ð�•¤."); 
            gameOver = true;
                    
        }
                
        else if(choice.toLowerCase().equals("s")){

            gameOver = true;
            

        }
        
        else if(choice.toLowerCase().equals("e")){

            System.out.println("You ended the game with " + bs.getCoins() + " coins in your wallet. GG's");
            System.exit(1);

        }
                
        else if(choice.toLowerCase().equals("h")){
            if (turn >= 4) {
                System.out.println("ã€�Yã€‘ã€�oã€‘ã€�uã€‘ ã€�cã€‘ã€�aã€‘ã€�nã€‘ã€�'ã€‘ã€�tã€‘ ã€�hã€‘ã€�iã€‘ã€�tã€‘ ã€�aã€‘ã€�nã€‘ã€�yã€‘ã€�mã€‘ã€�oã€‘ã€�rã€‘ã€�eã€‘ã€�!ã€‘ ã€�Yã€‘ã€�oã€‘ã€�uã€‘ ã€�aã€‘ã€�lã€‘ã€�rã€‘ã€�eã€‘ã€�aã€‘ã€�dã€‘ã€�yã€‘ ã€�hã€‘ã€�iã€‘ã€�tã€‘ ã€�tã€‘ã€�wã€‘ã€�iã€‘ã€�cã€‘ã€�eã€‘ ã€�dã€‘ã€�uã€‘ã€�mã€‘ ã€�dã€‘ã€�uã€‘ã€�mã€‘ã€�!ã€‘");
            }
            
            
    }
        
                        
    }
    
    if (gameOver == true && computerGameOver == true && resultsdisplayed == false) {
    System.out.println("ð�—™ð�—¶ð�—»ð�—®ð�—¹ ð�—µð�—®ð�—»ð�—±: "); //prints out the final hand of cards
    System.out.println("Cards: " + crd.getCards() + " || Budget Memer Cards: " + ccrd.getComputerCards()); 
    System.out.println("Total: "+ crd.getScore() + " || Budget Memer Total: " + ccrd.getComputerScore());
    resultsdisplayed = true;
        

        
    //compares total values and gets result
    if(crd.getScore()>21 && ccrd.getComputerScore()>21){ //if you both bust ,you both lose
        System.out.println("You both lost lol.");
        printLossMessage();
        bs.loss();
        continue;
      }
    
    else if(crd.getScore()<=21 && ccrd.getComputerScore()>21){ //if the computer busts but you dont you win
        System.out.println("You win! Your opponent busted.");
        printWinMessage();
        bs.win();
        continue;
      }
    
    else if(crd.getScore()>21 && ccrd.getComputerScore()<=21){ //if the computer busts but you dont you win
        System.out.println("You lose! You took way to many cards.");
        printLossMessage();
        bs.loss();
        continue;
      }
    
     else if(crd.getScore()<21 && ccrd.getComputerScore()==21){ //if the computer busts but you dont you win
        System.out.println("You lose! Budget Memer has achieve blackjack.");
        printLossMessage();
        bs.loss();
        continue;
      }
     
    else if (crd.getScore() < ccrd.getComputerScore() && ccrd.getComputerScore() < 21 && crd.getScore() < 21) { //if both scores are under 21 and the computer score is greater
        System.out.println("You lost " + bs.getBet() + " coins. Noob.");
        printLossMessage();
        bs.loss();
        continue;
      }
    
    else if(crd.getScore()==21 && ccrd.getComputerScore()!=21){ //if you get blackjack but the computer doesn't
        
        System.out.println("You won! Since you got blackjack, you get 50% more profit.");
        bs.win2();
        printWinMessage();
        continue;
      }
    
    else if(crd.getScore()==21 && ccrd.getComputerScore()!=21){ //if the computer gets blackjack but you don't.
        
        System.out.println("You lose! NEEEEERDDDDDD");
        bs.loss();
        printLossMessage();
        continue;
      
    }
    
   
    else if (ccrd.getComputerScore() == 21 && crd.getScore() == 21) { //if you both get 21, you lost 25% of your bet
      
        System.out.println("It's a tie! Since you both got BlackJack you only lose 25% of your bet!");
        bs.tie2();
        continue;

      }

    else if (ccrd.getComputerScore() == crd.getScore() && ccrd.getComputerScore() < 21 && crd.getScore() < 21) {//if it's a tie player loses 50% of their bet
        
        System.out.println("It's a tie! You lose 50% of your bet!");
        bs.tie();
        continue;
    
    }

    else if (crd.getScore() > ccrd.getComputerScore() && ccrd.getComputerScore() < 21 && crd.getScore() < 21) { // if you both get under 21, but your score is higher
      
      
        System.out.println("You win! Your cards totaled more than your opponent. Your bet is now magically doubled.");
        printWinMessage();
        bs.win();
        continue;
     
    }
    
    
}
} 
    
    
}
}  

       
    
