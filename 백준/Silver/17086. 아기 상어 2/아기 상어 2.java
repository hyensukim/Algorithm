import java.io.*;
import java.util.*;
public class Main {
    static int arr[][];
    static boolean check[][];
    static int n,m;
    static int dx[]= {0,0,1,-1,1,1,-1,-1};
	static int dy[]= {1,-1,0,0,1,-1,-1,1};
    
    static int bfs(int a,int b){
        check=new boolean[n+1][m+1];
        Queue<int[]> q=new LinkedList();
        q.add(new int[]{a,b,0});
        check[a][b]=true;
        
        while(!q.isEmpty()){
            int v[]=q.poll();
            
            for(int i=0;i<8;i++){
                int x=v[0]+dx[i];
                int y=v[1]+dy[i];
                int z=v[2]+1;
                
                if(x<0 || x>=n || y<0 || y>=m || check[x][y]==true) continue;
                if(arr[x][y]==1) return z;
                q.add(new int[]{x,y,z});
                check[x][y]=true;
            }
        }
        return 0;
    }
    
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=s.nextInt();
        arr=new int[n+1][m+1];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int count=0;
        int num=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]!=1){
                    num=bfs(i,j);
                    count=num>count ? num : count;
                } 
            }
        }
        System.out.print(count);
    }
}