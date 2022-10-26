import java.util.Map;

public class CoffeeMachine {
    public String drink;
    public int sugar;

    public static Map<String,Double> referentiel= Map.of("C",0.6,"T",0.4,"H",0.5);




    public String takeCommand(String drink, int sugar, double money) {
        boolean stick;
        // si sucre tata
        stick = sugar != 0;
        //sinon
        //fin de la gratuité
        if(referentiel.get(drink)<=(money)){
            if (stick) {
                return drink + ":" + sugar + ":0" ;
            } else {
                return drink + "::" ;
            }
        }
        else{
            return "M:Il manque "+(referentiel.get(drink)-money)+"euros";
        }

    }

    public static void main(String[] args){
        CoffeeMachine coffeemachine=new CoffeeMachine();
        System.out.println(coffeemachine.takeCommand("T",1,0.3));
        System.out.println(coffeemachine.takeCommand("H",0,0.7));
        System.out.println(coffeemachine.takeCommand("C",2,0.6));
    }

    //drink et price comme objet


}
