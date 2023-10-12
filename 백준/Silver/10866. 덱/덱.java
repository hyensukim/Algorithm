import java.io.*;
import java.util.*;

public class Main{
    private static LinkedList<Integer> deque = new LinkedList<>();
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        while(N-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            
            switch(st.nextToken()){
                case "push_back" :
                    pushBack(Integer.parseInt(st.nextToken())); break;
                case "push_front" :
                    pushFront(Integer.parseInt(st.nextToken())); break;
                case "front" :
                    sb.append(front()).append("\n"); break;
                case "back" :
                    sb.append(back()).append("\n"); break;
                case "size" :
                    sb.append(size()).append("\n"); break;
                case "empty" :
                    sb.append(empty()).append("\n"); break;
                case "pop_front" :
                    sb.append(popFront()).append("\n"); break;                   
                case "pop_back" :
                    sb.append(popBack()).append("\n"); break;
            }
        }
        br.close();
        System.out.println(sb);
    }
    
    private static void pushFront(Integer num){
        deque.offerFirst(num);
    }
    
    private static void pushBack(Integer num){
        deque.offerLast(num);
    }
    
    private static Integer popFront(){
        if(size() == 0) return -1;
        return deque.removeFirst();
    }
    
    private static Integer popBack(){
        if(size() == 0) return -1;
        return deque.removeLast();
    }
    
    private static int size(){
        return deque.size();
    }
    
    private static int empty(){
        int i = size() == 0 ? 1 : 0;
        return i;
    }
    
    private static Integer front(){
        if(size() == 0) return -1;
        return deque.peekFirst();
    }
    
    private static Integer back(){
        if(size() == 0) return -1;
        return deque.peekLast();
    }
}