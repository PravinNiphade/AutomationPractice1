package dec22;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class lambdaexpression {

	public static void main(String[] args) {
	
		List<Integer> a=List.of(2,7,8,34,3);
		System.out.println(a);
		
		//print Even Number
		a.stream().filter(e->e%2==0).forEach(e->System.out.println(e));
		a.stream().distinct().filter(e->e%2==0).forEach(e->System.out.println(e));
		
		//Addition of number
//	System.out.println(a.stream().reduce(0,(c,b)->(c+b)));
	int sum=	a.stream().distinct().reduce(0,(c,b)->(c+b));
	System.out.println("sum= "+ sum);
	int mul=a.stream().reduce(1,(e1,e2)->(e1*e2));
	System.out.println("mul= "+ mul);
	
	// square of each element in list
	a.stream().map(e->e*e).forEach(e->System.out.println(e));
	
	//to find max number in given list
	Optional<Integer> ad=a.stream().max((x,y)->Integer.compare(x, y));
	System.out.println("max no= " +ad);
	//OR
	System.out.println(a.stream().max((x,y)->Integer.compare(x, y)));
	
	//Find the Square of first 10 number
	IntStream.range(1, 11).map(e->(e*e)).forEach(e->System.out.println(e));
	
	// find length of each string in given list
	List<String> str=List.of("pravin","virat ","Dhoni","Dravid","sanju");
	str.stream().map(e->e.length()).forEach(e->System.out.println(e));
	str.stream().filter(e->e.endsWith("i")).forEach(e->System.out.println(e));
	
	}

}
