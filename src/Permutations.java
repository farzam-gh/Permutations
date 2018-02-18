import java.util.HashSet;
import java.util.Scanner;

public class Permutations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.next();
		HashSet<String> result=new HashSet<>();
		getPerms("",str,result);
		System.out.println("\nAll permutations of "+str+" are: ");
		for(String s:result)
			System.out.print(s+" ");
	}

static void  getPerms(String prefix,String remainder,HashSet<String> result){
    if(remainder.length()==0) {
        result.add(prefix);
        return ;
        }
    int len=remainder.length();
    for(int i=0;i<len;i++){
        String before=remainder.substring(0,i);
        String after=remainder.substring(i+1,len);
        getPerms(prefix+remainder.charAt(i),before+after,result);
    }
}

}
