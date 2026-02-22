/**
 * @author Cesar Marquez
 * @since March 1, 2026
 * @version 1.0
 * CEN4802 Software Integration, Configuration, and Testing
 * This will have the To-Do-List command line UI
 */
public class programUI {

    /**
     * this will display a title for this program
     */
    static void title(){

        System.out.println();
        System.out.println("=============================");
        System.out.println("    To-Do-List Assignment    ");
        System.out.println("=============================");
        System.out.println();
    }

    /**
     * this will display a menu for this program
     */
    static void menu(){

        System.out.println();
        System.out.println("============================");
        System.out.println("            Menu            ");
        System.out.println("============================");
        System.out.println("1) Add to-do item           ");
        System.out.println("2) Delete to-do item        ");
        System.out.println("3) View to-do item          ");
        System.out.println("4) Exit program             ");
        System.out.println("============================");
        System.out.print("Enter: ");
    }

    /**
     * this will display an add to do item message
     */
    static void add(){


        System.out.println();
        System.out.println("============================");
        System.out.println("        Add to-do item      ");
        System.out.println("============================");
        System.out.print("Please add item to the list: ");

    }

    /**
     * this will display delete do item message
     */
    static void delete(){

        System.out.println();
        System.out.println("====================================================");
        System.out.println("                  Delete to-do item                 ");
        System.out.println("====================================================");
        System.out.print("Please select which one item do you want to delete: ");

    }

    /**
     * this will display an add to do item message
     */
    static void view(){

        System.out.println();
        System.out.println("============================");
        System.out.println("        View to-do item     ");
        System.out.println("============================");
        System.out.println("Here is you current list: ");

    }


    /**
     * this will display a success message
     * @return success message
     */
    static String successfulMessage(){

        return      "\n"+
                "============================\n" +
                "  Action was successfully   \n" +
                "============================\n";
    }

    /**
     * this will display a fail message
     * @return fail message
     */
    static String failMessage(){

        return      "\n"+
                "==============================\n" +
                "  Action was unsuccessfully   \n" +
                "==============================\n" +
                "\n";


    }

    /**
     * this will display an exit message
     */
    static void exitMessage(){

        System.out.println();
        System.out.println("============================");
        System.out.println("  thank you and goodbye  ");
        System.out.println("============================");
        System.out.println();


    }


}
