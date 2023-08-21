import java.util.concurrent.Flow;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
Gyl[] gylsAray = new Gyl[3];
gylsAray[0] = new Gyl("rozza",654);
gylsAray[1] = new Gyl("ramashka",543);
gylsAray[2] = new Gyl("kyzgaldak",7653);
metod(gylsAray);

    }
  public static   void metod (Gyl[]gyls){
        if(gyls.length == 0){
            System.out.println("byfvhnj");
            return;
        }
Gyl nur = gyls[0];
      for (int i = 1; i < gyls.length; i++) {
          if(gyls[i].getPrice()> nur.getPrice()){
              nur = gyls[i];

          }
      }
      System.out.println("кымбыт"+nur.getFloverName());
        }
}