import java.util.Date;
public class AlfredoQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        
        // return "voce e bonita  " + " "   +name ;
        return String.format(" voce e bonita %s ", name );
    }//calling the guest greeding and puttng whatever return but name variable already defined 
    
    public String dateAnnouncement() {
        return String.format("It is currently %s", new Date());
    }







    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if (conversation.indexOf ("Alexis") >= 0 ){
            return " nope";
        }
        if (conversation.indexOf ("Alfred") >= 0) {
            return "sure";
        }
        return "nothing esle bye bye. ";
    }
    public String somethingElse(){
        return "haha";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

