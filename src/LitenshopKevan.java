public class LitenshopKevan {
    public static void main(String[] args) {
        Dator dator1 = new Dator("HP", 13999, 10);
        Dator dator2 = new Dator("Dell", 15999, 5);

        Varukorg varukorg = new Varukorg();
        varukorg.läggTillVara(dator1);
        varukorg.läggTillVara(dator2);

        dator1.setBrand("Lenovo");
        dator1.setValue(17999);

        varukorg.skrivUtVarukorg();

    }

}


            /*
    Dice myDice = newDice();
    Dice myDice2 = newDice();
    Dice myD20 = newDice();

    System.out.println("visible side is "+myDice.visibleNo);
 myDice.rollDice();
     System.out.println("visible side is "+myDice.visibleNo);

    System.out.println("visible side is "+myDice2.visibleNo);
 myDice2.rollDice();
     System.out.println("visible side is "+myDice2.visibleNo);

    System.out.println("visible side is "+myD20.visibleNo);
            myD20.rollDice();
            System.out.println("visible side is "+myD20.visibleNo);

             */


