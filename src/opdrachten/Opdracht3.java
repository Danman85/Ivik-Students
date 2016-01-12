package opdrachten;

public class Opdracht3 {

    public static void maand(int n) {
        String month;
        switch(n){
            case 1: month = "januari";
                break;
            case 2: month = "februari";
                break;
            case 3: month = "maart";
                break;
            case 4: month = "april";
                break;
            case 5: month = "mei";
                break;
            case 6: month = "juni";
                break;
            case 7: month = "juli";
                break;
            case 8: month = "augustus";
                break;
            case 9: month = "september";
                break;
            case 10: month = "oktober";
                break;
            case 11: month = "november";
                break;
            case 12: month = "december";
                break;
            default: month = "invalid month number";
        }

        System.out.println("Maand nummer " + n + " is: " + month);
    }

    public static void main(String[] args){
        Opdracht3 lente = new Opdracht3();

        lente.maand(5);
    }
}
