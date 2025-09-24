
import java.util.ArrayList;

public class  jordan{
  public static void main(String[] args) {
   /*  int[] array = {1, 2, 3, 4, 5};
    for(int i = 0; i < array.length; i++){
    array[0] = 99;
    System.out.println(array[i]);
    }*/
    ArrayList<Integer> jord = new ArrayList<>(); 
    jord.add(3);
    jord.add(4);
    jord.add(6);
    //jord.remove(Integer.valueOf(6));
    jord.add(1,90);
    System.out.println(jord.get(1));
    jord.set(2,20);
    for(int i = 0; i < jord.size(); i++){
      System.out.print(jord.get(i) + "");
 }
    //System.out.println("numbers after adding " + jord);
   }
}
//this is a new file