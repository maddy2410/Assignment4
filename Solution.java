import java.util.Scanner;
import java.util.HashSet;
/*

4 4
a c a a
d d d d
b b b b
c c c e


2 2
a c
d d

*/
public class Solution{

    public static void replant(char[][] v, boolean[][] changed , int n, int m,int i, int j ,HashSet<String> visited )
    {
        if( i==n || j==m)
        return;
        
        String s = Integer.toString(i) + "----" + Integer.toString(j);
        
        // System.out.println(s);
        
        // System.out.println(visited);

        boolean found = visited.contains(s);
        if(found)
        {
            // System.out.println(s+ " is already present in Hashmap");
            return;
        }
        else
        {
            visited.add(s);
        }
        

        
        if(i==0)
        {
            if(j==0)
            {
                if(!(changed[i][j] || changed[i+1][j]) && v[i][j]==v[i+1][j])
                {
                    changed[i+1][j]=true;
                }
                if(!(changed[i][j] || changed[i][j+1]) && v[i][j]==v[i][j+1])
                {
                    changed[i][j+1]=true;
                }
                            
                replant(v,changed,n,m,i+1,j,visited);
                replant(v,changed,n,m,i,j+1,visited);
                return;
            }
            else if(j==m-1)
            {
                if(!(changed[i][j] || changed[i+1][j]) && v[i][j]==v[i+1][j])
                {
                    changed[i+1][j]=true;
                }
                if(!(changed[i][j] || changed[i][j-1]) && v[i][j]==v[i][j-1])
                {
                    changed[i][j-1]=true;
                }
                            
                replant(v,changed,n,m,i+1,j,visited);
                replant(v,changed,n,m,i,j+1,visited);
                return;
            }
            else
            {
                if(!(changed[i][j] || changed[i+1][j]) && v[i][j]==v[i+1][j])
                {
                    changed[i+1][j]=true;
                }
                if(!(changed[i][j] || changed[i][j-1]) && v[i][j]==v[i][j-1])
                {
                    changed[i][j-1]=true;
                }
                
                if(!(changed[i][j] || changed[i][j+1]) && v[i][j]==v[i][j+1])
                {
                    changed[i][j+1]=true;
                }
                        
                replant(v,changed,n,m,i+1,j,visited);
                replant(v,changed,n,m,i,j+1,visited);
                return;
            }
        }
        else if(i==n-1)
        {
            if(j==0)
            {
                if(!(changed[i][j] || changed[i-1][j]) && v[i][j]==v[i-1][j])
                {
                    changed[i-1][j]=true;
                }
                if(!(changed[i][j] || changed[i][j+1]) && v[i][j]==v[i][j+1])
                {
                    changed[i][j+1]=true;
                }
                            
                replant(v,changed,n,m,i+1,j,visited);
                replant(v,changed,n,m,i,j+1, visited);
                return;
            }
            else if(j==m-1)
            {
                if(!(changed[i][j] || changed[i-1][j]) && v[i][j]==v[i-1][j])
                {
                    changed[i-1][j]=true;
                }
                if(!(changed[i][j] || changed[i][j-1]) && v[i][j]==v[i][j-1])
                {
                    changed[i][j-1]=true;
                }
                            
                replant(v,changed,n,m,i+1,j,visited);
                replant(v,changed,n,m,i,j+1,visited);
                return;
            }
            else
            {
                if(!(changed[i][j] || changed[i-1][j]) && v[i][j]==v[i-1][j])
                {
                    changed[i-1][j]=true;
                }
                if(!(changed[i][j] || changed[i][j-1]) && v[i][j]==v[i][j-1])
                {
                    changed[i][j-1]=true;
                }
                
                if(!(changed[i][j] || changed[i][j+1]) && v[i][j]==v[i][j+1])
                {
                    changed[i][j+1]=true;
                }
                        
                replant(v,changed,n,m,i+1,j,visited);
                replant(v,changed,n,m,i,j+1,visited);
                return;	
            }
        }


        if(j==0)
        {
            if(i==0)
            {
                if(!(changed[i][j] || changed[i+1][j]) && v[i][j]==v[i+1][j])
                {
                    changed[i+1][j]=true;
                }
                if(!(changed[i][j] || changed[i][j+1]) && v[i][j]==v[i][j+1])
                {
                    changed[i][j+1]=true;
                }
                            
                replant(v,changed,n,m,i+1,j,visited);
                replant(v,changed,n,m,i,j+1,visited);
                return;
            }
            else if(i==n-1)
            {
                if(!(changed[i][j] || changed[i-1][j]) && v[i][j]==v[i-1][j])
                {
                    changed[i-1][j]=true;
                }
                if(!(changed[i][j] || changed[i][j+1]) && v[i][j]==v[i][j+1])
                {
                    changed[i][j+1]=true;
                }
                            
                replant(v,changed,n,m,i+1,j,visited);
                replant(v,changed,n,m,i,j+1,visited);
                return;
            }
            else
            {
                if(!(changed[i][j] || changed[i+1][j]) && v[i][j]==v[i+1][j])
                {
                    changed[i+1][j]=true;
                }
                if(!(changed[i][j] || changed[i][j+1]) && v[i][j]==v[i][j+1])
                {
                    changed[i][j+1]=true;
                }
                
                if(!(changed[i][j] || changed[i][j+1]) && v[i][j]==v[i][j+1])
                {
                    changed[i][j+1]=true;
                }
                        
                replant(v,changed,n,m,i+1,j,visited);
                replant(v,changed,n,m,i,j+1,visited);
                return;
            }
        }
        else if(j==m-1)
        {
            if(i==0)
            {
                if(!(changed[i][j] || changed[i+11][j]) && v[i][j]==v[i+1][j])
                {
                    changed[i+1][j]=true;
                }
                if(!(changed[i][j] || changed[i][j-1]) && v[i][j]==v[i][j-1])
                {
                    changed[i][j-1]=true;
                }
                            
                replant(v,changed,n,m,i+1,j,visited);
                replant(v,changed,n,m,i,j+1, visited);
                return;
            }
            else if(i==n-1)
            {
                if(!(changed[i][j] || changed[i-1][j]) && v[i][j]==v[i-1][j])
                {
                    changed[i-1][j]=true;
                }
                if(!(changed[i][j] || changed[i][j-1]) && v[i][j]==v[i][j-1])
                {
                    changed[i][j-1]=true;
                }
                            
                replant(v,changed,n,m,i+1,j,visited);
                replant(v,changed,n,m,i,j+1,visited);
                return;
            }
            else
            {
                if(!(changed[i][j] || changed[i-1][j]) && v[i][j]==v[i-1][j])
                {
                    changed[i-1][j]=true;
                }
                if(!(changed[i][j] || changed[i][j-1]) && v[i][j]==v[i][j-1])
                {
                    changed[i][j-1]=true;
                }
                
                if(!(changed[i][j] || changed[i+1][j]) && v[i][j]==v[i+1][j])
                {
                    changed[i+1][j]=true;
                }
                        
                replant(v,changed,n,m,i+1,j,visited);
                replant(v,changed,n,m,i,j+1,visited);
                return;	
            }
        }

        
        if(!(changed[i][j] || changed[i-1][j]) && v[i][j]==v[i-1][j])
        {
            changed[i-1][j]=true;
        }
        
        if(!(changed[i][j] || changed[i][j-1]) && v[i][j]==v[i][j-1])
        {
            changed[i][j-1]=true;
        }
        
        if(!(changed[i][j] || changed[i][j+1]) && v[i][j]==v[i][j+1])
        {
            changed[i][j+1]=true;
        }
        
        if(!(changed[i][j] || changed[i+1][j]) && v[i][j]==v[i+1][j])
        {
            changed[i+1][j]=true;
        }
        
        
        replant(v,changed,n,m,i+1,j,visited);
        replant(v,changed,n,m,i,j+1,visited);
        return;
        
    }

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the matrix:\n");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter all the characters of the matrix");
        char[][] v = new char[n][m];
        char c;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c = sc.next().charAt(0);
                v[i][j] = c;
            }
        }
        sc.close();
        boolean[][] changed = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                changed[i][j] = false;
            }
        }

        HashSet<String> visited = new HashSet<String>();
        replant(v, changed, n, m, 0, 0, visited);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(changed[i][j])
                {
                    ans++;
                }
            }
        }

        System.out.println(ans);


    }
}