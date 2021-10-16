package laboratorium1.com;

public class Main {

    public static void main(String[] args) {

        for( int i=1; i<11; i++)
        {
            for(int j=1; j<11;j++)
            {
                String sum=String.format("%4d",i*j);
                System.out.print(sum);

            }
            System.out.println();
        }
      /*  String lancuch,imie;

        lancuch="Witaj";
        imie="Mateusz";
        System.out.println(String.format("%s posiadaczu imienia: %s",lancuch, imie));

        System.exit(0);*/


    }
}
