import java.util.Iterator;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<String>();

        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");
        
        // Listeler arasýnda yineleme yöntemi "eski" (bu jenerikler hariç)
        // Java 5 öncesi mevcut deðildi). Bu yol hala ayrýlmaz bir parçadýr
        // Java; öðeleri listeden kaldýrmanýza olanak tanýr
        // ve ayrýca perde arkasýndaki "her biri için" sözdizimini destekler.
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
         * Yineleme sýrasýnda bir listeye öðe eklemek istiyorsanýz
         * .listIterator () yöntemini kullanarak bir ListIterator alýn.
         * ListIterator ayrýca önceki () yöntemine sahiptir.
         * daha önce öðe ekleyebilmeniz için yineleyiciyi "geri sar"
         * geçerli öðe.
         */

        // / Modern yineleme, Java 5 ve üstü; "her biri için" döngüsü

        for (String animal : animals) {
            System.out.println(animal);
            
            // Aþaðýdakiler iþe yaramaz; bir yineleyiciye ihtiyacýnýz var.
            // Throws ConcurrentModificationException
            // animals.remove(2);
        }
    }

}