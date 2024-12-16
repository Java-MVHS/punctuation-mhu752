import java.util.Scanner;
public class Punctuation //header
{
    //no field variables
    public static void main(String[] args) //main
    {
        String text = "Blood, Sweat, and Tears by Winston Churchill " + "May 13, 1940" + //initialize/declare text
                "Mr. Speaker:" + "On Friday evening last I received His Majesty’s commission to form a new" + "Administration. It was the evident wish and will of Parliament and the nation that this should be conceived on the broadest possible basis and that it should include all parties, both those who supported the late Government and also the parties of the Opposition." + "I have completed the most important part of this task. A War Cabinet has been formed of five Members, representing, with the Liberal Opposition, the unity of the nation. The three party Leaders have agreed to serve, either in the War Cabinet or in high executive office. The three Fighting Services have been filled. It was necessary that this should be done in one single day, on account of the extreme urgency and rigour of events. A number of other key positions were filled yesterday, and I am submitting a further list to His Majesty tonight. I hope to complete the appointment of the principal Ministers during tomorrow. The appointment of the other Ministers usually takes a little longer, but I trust that, when Parliament meets again, this part of my task will be completed, and that the Administration will be complete in all respects." + "Sir, I considered it in the public interest to suggest that the House should"
                + " be summoned to meet today. Mr. Speaker agreed and took the necessary steps, in "
                + "accordance with the powers conferred upon him by the Resolution of the House. At the "
                + "end of the proceedings today, the Adjournment of the House will be proposed until "
                + "Tuesday, the 21st May, with, of course, provision for earlier meeting, if need be. The "
                + "business to be considered during that week will be notified to Members at the earliest "
                + "opportunity. I now invite the House, by the Resolution which stands in my name, to "
                + "record its approval of the steps taken and to declare its confidence in the new "
                + "Government.";

        Punctuation pn = new Punctuation(); //instantiate
        pn.searchIt(text); //call searchIt()
    }
    public void searchIt(String text) //call getPunctuationWords, printWords
    {
        String s = getPunctuationWords(text); //value of ss in the getPunctuationWords becomes 's'
        printWords(s); //print 's' in the method printWords
    }
    public String getPunctuationWords(String text) {
        String ss = ""; //nothing inside 'ss'
        int startIndex = 0; //startIndex is originally 0
        for(int i=0; i<text.length(); i++) { //loops until it reaches the end
            if (checkForPunctuation(text.charAt(i))) { //if it returns true, then the following will run
                String word = text.substring(startIndex, i+1); //print the word from startIndex, to the i, including the punctuation
                ss = ss.concat(word); //add on word to ss
            } else if (text.charAt(i) == ' ') { //if the next char is a space, then it skips over, by adding 1 to i, and that would be startIndex,
                startIndex = i+1;              // and i would keep increasing, to check for any punctuation, till it reaches the end
            }
        }
        return ss; //goes back to searchIt()
    }
    public boolean checkForPunctuation(char c) { //text.charAt(i)=char c
        String puct = "[]\";:!?'.,()-";
        for(int i=0; i<puct.length(); i++) { //checks to see if c = any of puct using charAt and loop
            if (c == puct.charAt(i))
                return true; //the if statement in getPunctuationWords() will run
        }
        return false; //the if statement doesnt run
    }
    public void printWords(String text) //print s,now called text
    {
        System.out.println("\n\n\n");
        System.out.print(text+ " ");
        System.out.println("\n\n\n");
    }
}


