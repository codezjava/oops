package collection2;
import java.util.ArrayList;
public class Collection2 {
	public static void main(String arg[])
	{
		ArrayList<Integer> mark1=new ArrayList<Integer>();
		mark1.add(11);
		mark1.add(22);
		mark1.add(33);
        mark1.add(44);
        mark1.add(55);
        System.out.println("arrayList 1:"+mark1);
        ArrayList<Integer> mark2=new ArrayList<Integer>();
        mark2.add(66);
        mark2.add(77);
        mark2.add(88);
        mark2.add(99);
        System.out.println("arrayList 2:"+mark2);
        
        //add two array list by using addAll() method
        mark1.addAll(mark2);
        System.out.println("add two arraylist by using the addall() method");
        for(Integer mark3:mark1)
        {
        	System.out.println(mark3);
        }
        ArrayList<String> name =new ArrayList<String>();
        name.add("viji");
        name.add("nandhini");
        
        // contains method is used to check the sequence of characters is part of a given array list or not 
        System.out.println("contains method");
        if(name.contains("viji"))
        {
        	System.out.println("the word viji is found in given arraylist");
        }
        else
        {
        System.out.println("the word viji is not found in given arraylist");
        }
        
        //isEmpty() method 
        System.out.println("\n"+name.isEmpty());
	}

}
