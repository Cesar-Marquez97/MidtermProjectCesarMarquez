import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Cesar Marquez
 * @since March 1, 2026
 * @version 1.0
 * CEN4802 Software Integration, Configuration, and Testing
 */
public class Main {

    public static void main(String[] args) {

        //scanner for the program
        Scanner scanner = new Scanner(System.in);

        //calling my program logic to main
        programLogic programLogic = new programLogic();

        //arrayList for the user to do list
        ArrayList<String>userList = new ArrayList<>();

        //variables needed for this program
        int userMenuChoice;
        String userAdd;
        String userDelete;

        //display UI title
        programUI.title();

        do{

            userMenuChoice = programLogic.menuOption();

            //add to the to do list
            if(userMenuChoice == 1){

                userAdd = programLogic.add(userList);
                System.out.println(userAdd);

            }

            //delete an item
            else if(userMenuChoice == 2){

                System.out.println();
                programLogic.view(userList);
                userDelete = programLogic.delete(userList);
                System.out.println(userDelete);
            }

            //view the to do list
            else if(userMenuChoice == 3){

                programUI.view();
                programLogic.view(userList);

            }

            //exit the program
            else if(userMenuChoice == 4){

                programUI.exitMessage();
            }

        }while(userMenuChoice != 4);



        //closing scanner
        scanner.close();

    }
}