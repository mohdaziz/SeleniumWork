package Common;

import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Random;

public class Utilities {

    public static void sleep(int seconds){

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static WebElement pickRandomWebElement (List<WebElement> inputList){

        int numberOfElements = inputList.size();
        if(numberOfElements == 0) {
            System.out.println("The number of elements in " + inputList.toString() + " is zero");
        }

        System.out.println("The number of available options for arrival destination are: " + numberOfElements);
        int randomSelection = new Random().nextInt(numberOfElements);

        return inputList.get(randomSelection);
    }

}
