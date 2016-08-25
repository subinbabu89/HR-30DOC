import java.util.HashMap;
import java.util.Scanner;

public class Day8 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String, String> phoneNumbers = new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            String phone = in.next();
            phoneNumbers.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            String currentPhoneNumber = phoneNumbers.get(s);
            if(currentPhoneNumber!=null){
            	System.out.println(s+"="+currentPhoneNumber);
            }else{
            	System.out.println("Not found");
            }
        }
        in.close();
	}

}
