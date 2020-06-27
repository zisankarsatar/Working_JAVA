
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class App {


    public static void main(String[] args) {
        /*
         * ArrayLists, dizileri dahili olarak yönetir.
         * [0][1][2][3][4][5] ....
         */
        List<Integer> arrayList = new ArrayList<Integer>();
        
        /*
         * LinkedLists her öðenin bulunduðu öðelerden oluþur
         * önceki ve sonraki öðeye baþvuruda bulunuyor
         * [0]->[1]->[2] ....
         *    <-   <-
         */
        List<Integer> linkedList = new LinkedList<Integer>();
        
        doTimings("ArrayList", arrayList);
        doTimings("LinkedList" , linkedList);
    }
    
    private static void doTimings(String type, List<Integer> list) {
        
        for(int i=0; i<1E5; i++) {
            list.add(i);
        }
        
        long start = System.currentTimeMillis();
        
        /*
        // Listenin sonuna öðe ekle
        for(int i=0; i<1E5; i++) {
            list.add(i);
        }
        */
        
        // Listenin baþka yerlerine öðe ekleme
        for(int i=0; i<1E5; i++) {
            list.add(0, i);
        }
        
        long end = System.currentTimeMillis();
        
        System.out.println("Time taken: " + (end - start) + " ms for " + type);
    }
    


}

