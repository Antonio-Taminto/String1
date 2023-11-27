// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String x = "a";
        String y = "b";

        System.out.println(uguali(x,y));
    }
    public static StringBuilder uguali(String x , String y){
        StringBuilder result;

        if(x.equals(y)){
            result= new StringBuilder("Le due stringhe sono uguali");
        }else {
            result= new StringBuilder("Le due stringhe sono differenti");
        }
        return result;
    }
}