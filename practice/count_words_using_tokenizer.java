package practice;
import java.util.*;

public class count_words_using_tokenizer {
	public static void main(String[] args) {
		Scanner input  =new Scanner(System.in);
		StringTokenizer str = new StringTokenizer(input.nextLine());
		System.out.print(str.countTokens());
	}
}
