public class V2 {
    public static void main(String[] args) {
        V2 programa = new V2();
        programa.start();
    }

    void start(){

    }

    public static String cocinar(int n){
        if ((n%3==0)&&(n%5==0)) // 1A / 1B
            return "Gachamiga"; // 2
        else if (n%5==0) { // 3
            return "Miga"; // 4
        }else if (n%3==0) { // 5
            return "Gacha"; // 6
        }else
            return Integer.toString(n); // 8
    }
}