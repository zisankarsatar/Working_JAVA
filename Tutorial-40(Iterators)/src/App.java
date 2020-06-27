import java.util.Iterator;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<String>();

        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");
        
        // Listeler aras�nda yineleme y�ntemi "eski" (bu jenerikler hari�)
        // Java 5 �ncesi mevcut de�ildi). Bu yol hala ayr�lmaz bir par�ad�r
        // Java; ��eleri listeden kald�rman�za olanak tan�r
        // ve ayr�ca perde arkas�ndaki "her biri i�in" s�zdizimini destekler.
        Iterator<String> it = animals.iterator();

        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
            
            if(value.equals("cat")) {
                it.remove();
            }
        }

        System.out.println();
        
        /*
         * Yineleme s�ras�nda bir listeye ��e eklemek istiyorsan�z
         * .listIterator () y�ntemini kullanarak bir ListIterator al�n.
         * ListIterator ayr�ca �nceki () y�ntemine sahiptir.
         * daha �nce ��e ekleyebilmeniz i�in yineleyiciyi "geri sar"
         * ge�erli ��e.
         */

        // / Modern yineleme, Java 5 ve �st�; "her biri i�in" d�ng�s�

        for (String animal : animals) {
            System.out.println(animal);
            
            // A�a��dakiler i�e yaramaz; bir yineleyiciye ihtiyac�n�z var.
            // Throws ConcurrentModificationException
            // animals.remove(2);
        }
    }

}