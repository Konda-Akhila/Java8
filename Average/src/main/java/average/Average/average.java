package average.Average;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class average {
	public static double average(List l) {
		int sum=0;
		for(int i=0;i<l.size();i++) {
			sum+=(Integer)l.get(i);
		}
		double average=sum/(l.size());
		return average;

}
	public static void  main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<Integer>();
		int num=0;
		String ch=" ";
		do {
			System.out.println("Enter number");
			num=sc.nextInt();
			list.add(num);
			System.out.println("Do you want to continue? y or n");
			sc.nextLine();
			ch=sc.nextLine();
		}while(ch.equals("y"));
		
		double x=average(list);
		System.out.println(x);
		sc.close();
	}
}