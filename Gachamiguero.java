public class Gachamiguero {
    public static void main(String[] args) {
        Gachamiguero programa = new Gachamiguero();
        programa.start();
    }

    void start(){

    }

    public static String catar(int n){
        if ((n%3==0)&&(n%5==0))
            return "Gachamiga";
        else if (n%5==0) {
            return "Miga";
        }else if (n%3==0) {
            return "Gacha";
        }else
            return n+"";
    }
}
