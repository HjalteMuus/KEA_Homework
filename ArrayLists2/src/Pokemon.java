import java.util.ArrayList;
import java.util.Scanner;

class Pokemon {
    private String name;
    private String type1;
    private String type2;
    private int level;

    public Pokemon(String name, String type1, String type2, int level){
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.level = level;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getType1(){
        return type1;
    }

    public void setType1(String newType1){
        type1 = newType1;
    }

    public String getType2(){
        return type2;
    }

    public void setType2(String newType2){
        type2 = newType2;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int newLevel){
        if(level > newLevel){
            System.out.println("Can't level down, only up");
        }else{
            level = newLevel;
        }
    }
}

class Pokedex{
    ArrayList<Pokemon> pokedex = new ArrayList<>();

    public void addPokemon(Pokemon p){
        pokedex.add(p);
    }

    public void removePokemon(Pokemon p){
        pokedex.remove(p);
    }

    public void showAllPokemon(){
        if(pokedex.isEmpty()){
            System.out.println("The pokedex is empty!");
            return;
        }
        for (Pokemon p : pokedex) {
            if(!p.getType2().isEmpty()){
                System.out.println(p.getName() + " is a: " + p.getType1() + " and " + p.getType2() +
                                   " type pokemon and is level " + p.getLevel());
            }else{
                System.out.println(p.getName() + " is a: " + p.getType1() + " type pokemon" +
                        " and is level " + p.getLevel());
            }
        }
    }

}

class Pokemain{
    static String pokemonName;
    static String type1;
    static String type2;
    static int level;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pokedex pd = new Pokedex();
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Grass", "Poison", 5);
        Pokemon charmander = new Pokemon("Charmander", "Fire", "", 5);
        Pokemon squirtle = new Pokemon("Squirtle", "Water", "", 5);
        Pokemon weedle = new Pokemon("Weedle", "Bug", "Poison", 3);

        //Quickly adds the pokémon to the list
        System.out.println("Adding pokemon to the pokedex");
        pd.addPokemon(bulbasaur);
        pd.addPokemon(charmander);
        pd.addPokemon(squirtle);
        pd.addPokemon(weedle);
        pd.showAllPokemon();

        //removes weedle from the list
        System.out.println("Oops added weedle to the pokedex, that's not right. Removing weedle");
        pd.removePokemon(weedle);
        pd.showAllPokemon();

        String moreMons;
        String buffer;

        while(true){
            Pokemon p = createPokemon(s);
            pd.addPokemon(p);
            System.out.println("Do you want to add more pokemon? yes/no");
            buffer = s.nextLine(); //Is here to make sure the program doesn't just stop after 1 go,
                                   //you can remove it to see what happens :)
            moreMons = s.nextLine();
            if (!moreMons.equalsIgnoreCase("yes")){
                break;
            }
        }


        pd.showAllPokemon();

    }

    public static Pokemon createPokemon(Scanner s){
        System.out.println("What is the name of you pokemon?");
        pokemonName = s.nextLine();
        System.out.println("What is it's primary type?");
        type1 = s.nextLine();
        System.out.println("Does it have a secondary type? y/n");
        String yesOrNo = s.nextLine();
        if(yesOrNo.equalsIgnoreCase("y")){
            type2 = s.nextLine();
        }else{
            type2 = "";
        }
        System.out.println("What is the level of " + pokemonName + "?");
        level = s.nextInt();

        return new Pokemon(pokemonName, type1, type2, level);
    }
}