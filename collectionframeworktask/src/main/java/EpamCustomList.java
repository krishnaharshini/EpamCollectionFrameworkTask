import com.epam.krishnaharshini.collectionframeworktask.*;
public class EpamCustomList {
	public static void main(String[] args) 
    {
        CustomList<Integer> list = new CustomList();
 
        //Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
        System.out.println(list.size());
    }

}
