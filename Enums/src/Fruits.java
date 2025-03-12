enum Fruits {
    APPLE,
    BANANA,
    GRAPES
}

class BestFruit{
    public static void main(String[] args){
        for (Fruits type : Fruits.values()){
            System.out.println(type);
        }
    }
}