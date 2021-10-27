package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList06 {
	
	//Create a method to delete odd elements and increase the even elements by multiplying 5

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(21);
		list1.add(21);
		list1.add(21);
		list1.add(32);
		list1.add(32);
		list1.add(21);
		list1.add(32);
		
		System.out.println(deleteOddsIncreaseEvens(list1));

	}
	//If you are sure, you will use a method in main method, make it static. Otherwise you will get CompileTime Error
	public static List<Integer> deleteOddsIncreaseEvens(List<Integer> list){

		for(int i=0; i<list.size(); i++) {
			
			if(list.get(i)%2!=0) {
				
				list.remove(i);
				i--;
				
			}else if(list.get(i)%2==0){
				
				list.set(i, list.get(i)*5);
				
			}
			
		}
				
		return list;
	}

}
