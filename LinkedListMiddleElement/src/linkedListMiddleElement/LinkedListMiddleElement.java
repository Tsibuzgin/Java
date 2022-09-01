package linkedListMiddleElement;

import java.util.LinkedList;
import java.util.*;

public class LinkedListMiddleElement {
	public static void main(String[] args)
	{
		//declaring LikedList
		var staff = new LinkedList<String>();
		//asking for length of LinkedList
		System.out.println("How many elements in the LinkedList?");
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		//asking to fill LinkedList
		System.out.println("Type them");
		//reading elements of LinkedList
		for (int i = 0; i < length; i++) {
			String item = in.next();
			staff.add(item);
		};
		//searching and showing the middle element
		if (length % 2 == 1) {
			int index = length / 2;
			String middle_item = staff.get(index);
			System.out.println(middle_item);
		} else {
			int index = length / 2 - 1;
			String middle_item_1 = staff.get(index);
			String middle_item_2 = staff.get(index + 1);
			System.out.println(middle_item_1);
			System.out.println(middle_item_2);
		};
	}
}
