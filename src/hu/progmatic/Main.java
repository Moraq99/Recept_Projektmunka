package hu.progmatic;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        String[] ingredients1 = {
                "\n, túró\n",
                "tojás (sárgája)\n",
                "tej\n",
                "cukor\n",
                "vaníliás pudingpor\n",
                "rúd vanília magjai\n",
                "csipet só\n"};
        String[] ingredients2 = {
                "\n, túró\n",
                "tojás (sárgája)\n",

                "cukor\n",
                "vaníliás pudingpor\n",
                "rúd vanília magjai\n",
                "csipet só\n"};

        String[] ingredients ={Arrays.toString(ingredients1),Arrays.toString(ingredients2)};

        String instruction1 =("\nA tojások sárgáját a cukorral, pudingporral és egy kevés tejjel alaposan elkeverjük\n" +
                "      (előzőleg a sárgájákat a cukorral kissé habosítjuk).\n" +
                "      A maradék tejet a vanília magjaival felforraljuk, beleöntjük a masszát, majd addig keverjük,\n" +
                "      amíg sűrű pudingot nem kapunk. Ezután hagyjuk kihűlni.\n" +
                "      A túrót áttörjük, majd hozzáöntjük a kihűlt vaníliás alapot,\n" +
                "      és botmixerrel addig keverjük, amíg krémes nem lesz.\n" +
                "      Poharakba, tálakba adagolva lehűtjük.\n" +
                "      Tálaláskor megszórhatjuk áfonyával,\n" +
                "      vagy készíthetünk hozzá karamell vagy gyümölcs öntetet.")

                ;

        Recipe recipe1 = new Recipe("almáspite", "easy", 10, true,ingredients1,instruction1);
        Recipe recipe2 = new Recipe("krémes","hard",30,false);

        /*Recipe recipe3 = new Recipe();
        Recipe recipe4 = new Recipe();
        Recipe recipe5 = new Recipe();
        Recipe recipe6 = new Recipe();
        Recipe recipe7 = new Recipe();
        Recipe recipe8 = new Recipe();
        Recipe recipe9 = new Recipe();
        Recipe recipe10 = new Recipe();
        Recipe recipe11 = new Recipe();
        Recipe recipe12 = new Recipe();
        Recipe recipe13 = new Recipe();*/


        System.out.println(recipe1);
        System.out.println(Arrays.toString(ingredients));
        /*if (recipe1...) {
            System.out.println("Eklészítési utasítás");
        }*/




    }



    /*public void findRecipe(){*/



}




