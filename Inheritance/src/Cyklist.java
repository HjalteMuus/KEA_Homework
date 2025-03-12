public class Cyklist {
    protected String name;

    public Cyklist(String name){
        this.name = name;
    }

    public String toString(){
        return (this.name == null)? "There ain't noone riding in that seat" : this.name + " is riding the bike";
    }

    public String getName(){
        return name;
    }
}
