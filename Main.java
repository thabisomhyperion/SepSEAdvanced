import java.util.*;
class Main {

	//recusion
	static String facb(int head, int trailer, int n){
		if(head > n){
			return "";
		}
		else{
			int temp = trailer + head;
			trailer = head;
			head = temp;
			return ", "+Integer.toString(head) + facb(head, trailer, n);
		}
	}
	//revesing a word in a string
	public static String revesWord(String word, int leng){
		if(leng == -1){//base case
			return "";
		}
		else{//working towards the base case.
			return word.charAt(leng) + revesWord(word, leng - 1);
		}
	}

	public static int factorial(int n){
		if(n == 1)//base case
		{
			return 1;
		}
		else{ //we are working towards the base case
			return n + factorial(n - 1);
		}
	}
  public static void main(String[] args) {
	  System.out.println(factorial(100));

	  String w = "MILK";
	  int stringLength = w.length() - 1;
	  System.out.println(revesWord("MILK", stringLength));

	  System.out.println("0, 1"+facb(1, 0, 20));
    
  }
}