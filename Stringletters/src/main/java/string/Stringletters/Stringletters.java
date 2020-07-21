package string.Stringletters;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Stringletters {
	public static Collection<Object> stringPatternList(List<String> list){
		List<Object> count = list.stream().filter(x -> x.startsWith("a")).filter(x -> x.length()<=3).collect(Collectors.toList());
		return count;

}
	public static void main(String args[]) {
		List<String> strList = Arrays.asList("ahh", "akh", "aof","bad", "bcde", "dfg", "jkq"); 
		Collection<Object> str=stringPatternList(strList);
		System.out.println(str);

	}
}