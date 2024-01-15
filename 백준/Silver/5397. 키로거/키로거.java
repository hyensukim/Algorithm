import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testCase; i++) {
			String line = br.readLine();
			Stack<Character> prevStack = new Stack<>();
			Stack<Character> nextStack = new Stack<>();
			for(int j=0; j<line.length(); j++) {
				char ch = line.charAt(j);
				if(ch == '<') {
					if(!prevStack.isEmpty()) {
						nextStack.push(prevStack.pop());
					}
				}else if(ch == '>') {
					if(!nextStack.isEmpty()) {
						prevStack.push(nextStack.pop());
					}
				}else if(ch == '-') {
					if(!prevStack.isEmpty()) {
						prevStack.pop();
					}
				}else {
					prevStack.push(line.charAt(j));
				}
			}
			
			while(!nextStack.isEmpty()) {
				prevStack.push(nextStack.pop());
			}
			
			for(int k=0; k<prevStack.size(); k++) {
				bw.write(prevStack.get(k));
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		
	}
}