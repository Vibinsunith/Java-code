//Collection interface
import java.util.*;  
class HelloWorld {
    public static void main(String[] args) {
        Collection values=new ArrayList();
        values.add(4);
        values.add(6);
        values.add(9);
        Iterator it= values.iterator();
        while(it.hasNext()){
            
          System.out.println(it.next());
        }
    }
}
//List interface
import java.util.*;  
class HelloWorld {
    public static void main(String[] args) {
        List values=new ArrayList();
        values.add(4);
        values.add(6);
        values.add(9);
        values.add(2,2);
        Iterator it= values.iterator();
        while(it.hasNext()){
            
          System.out.println(it.next());
        }
    }
}
//ArrayList Sorting
import java.util.*;  
class HelloWorld {
    public static void main(String[] args) {
        List<Integer> values=new ArrayList<Integer>();
        values.add(4);
        values.add(6);
        values.add(9);
        values.add(2);
        Collections.sort(values);
        for (Integer o: values){
            
          System.out.println(o);
        }
    }
}
