package ivan.samoylov;

public class Main {

    public static void main(String[] args) {
        for(int i =0; i < 100; i++){
            if(!isSimple(i)){
                System.out.print("for " + i + " deviders: ");
                for(int j=i; j>0;j--){
                    int b=i%j;
                    if(b==0)
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }

    public static boolean isSimple(int testNum) {
        if (testNum < 2){
            return false;
        }
        double s = Math.sqrt(testNum);
        for (int i = 2; i <= s; i++) {
            if (testNum % i == 0){
                return false;
            }
        }
        return true;
    }

}
