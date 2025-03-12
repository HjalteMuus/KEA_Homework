import java.util.ArrayList;
import java.util.Scanner;

public class IKEA {
    static String furniture;
    static String target;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Catalog c = new Catalog();
        showMenu();

        String choice = s.nextLine();

        while(!choice.equalsIgnoreCase("stop")){
            handleChoice(c, choice, s);
            choice = s.nextLine();
        }

    }

    public static void showMenu(){
        System.out.println("""
                Here are the things you can do in this catalog program.
                add: Prompts you to add some new furniture to your catalog.
                show: Shows your current catalog of furniture.
                remove: Removes furniture from the catalog.
                sort: Sorts the list alphabetically.
                stop: stops the program.
                any other input: shows this menu again.""");
    }

    public static void handleChoice(Catalog c, String choice, Scanner s){
        if(choice.equalsIgnoreCase("add")){
            System.out.println("Please write what furniture you would like to add");
            furniture = s.nextLine();
            c.addFurniture(furniture);

        }else if(choice.equalsIgnoreCase("show")){
            System.out.println("Showing current catalog");
            c.showCatalog();

        }else if(choice.equalsIgnoreCase("search")){
            System.out.println("What would you like to search?");
            target = s.nextLine();
            c.search(target);

        }else if(choice.equalsIgnoreCase("remove")){
            System.out.println("Please write what furniture to remove");
            target = s.nextLine();
            c.removeFurniture(target);

        }else if(choice.equalsIgnoreCase("sort")){
            c.sortCatalog();

        }else if(!choice.equalsIgnoreCase("stop")){
            showMenu();
        }
    }
}

class Catalog {
    ArrayList<String> catalog = new ArrayList<>();

    public ArrayList<String> addFurniture(String furniture){
        furniture = furniture.toLowerCase();
        catalog.add(furniture);
        System.out.println("You've added " + furniture + " to the catalog");
        return catalog;
    }

    public void showCatalog(){
        System.out.println(catalog);
    }

    public void search(String target){
        if(catalog.contains(target)){
            System.out.println(target + " is in the catalog");
        }else{
            System.out.println(target + " is not in the catalog");
        }
    }

    public void removeFurniture(String target){
        target = target.toLowerCase();
        if(catalog.contains(target)){
            catalog.remove(target);
            System.out.println(target + " has been removed from the catalog");
        }else{
            System.out.println(target + " is not in the catalog");
        }
    }

    public void sortCatalog(){
        catalog.sort(null);
        System.out.println("Catalog sorted alphabetically");
        showCatalog();
    }
}