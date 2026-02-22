import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Cesar Marquez
 * @since March 1, 2026
 * @version 1.0
 * CEN4802 Software Integration, Configuration, and Testing
 */
public class programLogic {


    /**
     * This will ask the user for menu input and check if its valid
     * @return the user menu option
     */
    public int menuOption(){

        Scanner scanner = new Scanner(System.in);

        int option = 0;
        boolean valid = false;

        do {

            programUI.menu();

            try{
                option = scanner.nextInt();

                if(option < 1 || option > 4){
                    System.out.println("Your input need to be from 1 to 4");
                }
                else{
                    valid = true;
                    return option;
                }


            }catch (InputMismatchException e){
                System.out.println("Your input need to be integer");
                scanner.next();
            }

        }while(!valid);

        return option;
    }

    /**
     * this method will add to the to do list
     * @param userList array list that will store locally the user to do list
     * @return message that is either success or unsuccess
     */
    public String add(ArrayList<String> userList){

        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        String newItem = "";


        do {

            programUI.add();

            try{

                newItem = scanner.nextLine();

                if(newItem.isBlank()){
                    System.out.println("Your input was blank, please try again");
                }
                else if(newItem.matches("\\d+")){
                    System.out.println("Your input was just number, please try again");

                }
                else{
                    valid = true;
                    userList.add(newItem);
                    return  programUI.successfulMessage() + "\n" + newItem + "\nwas added to the to do list";
                }


            }catch (InputMismatchException e){
                System.out.println("Your input need to be String, please try again");
                scanner.next();
            }

        }while(!valid);

        return programUI.failMessage();
    }

    /**
     * this method will delete to the to do list
     * @param userList array list that will store locally the user to do list
     * @return message that is either success or unsuccess
     */
    public String delete(ArrayList<String> userList){

        Scanner scanner = new Scanner(System.in);

        int userDelete = 0;
        int index;
        boolean valid = false;

        do {

            programUI.delete();

            try{

                userDelete = scanner.nextInt();

                index = userDelete - 1;


                if( index <0 ){
                    System.out.println("Your input cannot be negative or zero, please try again ");
                }
                else{
                    valid = true;
                    return  programUI.successfulMessage() + "\n" +  userList.remove(index) + "\nwas deleted";
                }


            }catch (InputMismatchException e){
                System.out.println("Your input need to be integer, please try again");
                valid = false;
                scanner.next();
            }

            catch (IndexOutOfBoundsException e){
                System.out.println("index does not exits, please try again");
                valid = false;
            }


        }while(!valid);

        return programUI.failMessage();
    }

    /**
     * this method will display the to do list
     * @param userList array list that will store locally the user to do list
     */
    public void view(ArrayList<String> userList){

        int counter = 1;

        if(userList.isEmpty()){
            System.out.println("Your to do list is empty");
        }
        else{

            for(String list : userList)
            {
                System.out.println(counter +")      " + list);
                counter++;

            }

        }
    }
}
