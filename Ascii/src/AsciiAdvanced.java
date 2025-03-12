public class AsciiAdvanced {
    public static void main(String[] args){
        int height = 5;

        for (int i = height+1; i > 0; i--){
            for (int j = 0; j < i-1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i+1; j++){
                System.out.print(i+1);
            }
            System.out.print("\n");
        }

        for (int i = 0; i < height; i++) {
            for(int j = height - 1 - i; j > 0; j--){
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++){
                System.out.print(j+1);
            }
            System.out.print("\n");
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i+1; j++){
                System.out.print((char)(j+65));
            }
            System.out.print("\n");
        }

        for (int i = 0; i < height; i++){
            for (int j = (height - 1 - i); j > 0; j--){
                System.out.print(" ");
            }
            for (int k = 0; k < (i+1)*2-1; k++){
                System.out.print("*");
            }
            for (int j = (height - 1 - i); j > 0; j--){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
