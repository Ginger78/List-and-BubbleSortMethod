import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
      // create list array of integers
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Please enter 5 integers: ");
		
      //ask the user to input five numbers and assign them to the list from element 0 to 4
		for (int i = 0; i < 5; i++) {
			list.add(in.nextInt());
		}
		
      //call sort method
		sort(list);
      
      //print out the numbers from the array list
      for (int i = 0; i < list.size(); i++) {
         System.out.println(list.get(i));
      } 
		
	}
	
   //bubble sort method from least to greatest
	public static void sort(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++)
         for (int j = 0; j < list.size() - i - 1; j++)
            //following if statement ex: if the number in element 0 is greater than the number in element 1 they swap 
            if (list.get(j) > list.get(j+1))
            {
               int t = list.get(j);
               list.set(j, list.get(j+1));
               list.set(j+1, t);
            }         
	}

}
