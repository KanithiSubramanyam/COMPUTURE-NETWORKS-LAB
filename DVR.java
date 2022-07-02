import java.util.*;

class Routing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: of edges:");
        int m = sc.nextInt();
        System.out.println("Enter the no: of vertices");
        int n = sc.nextInt();
        int[][] matrix = new int[m][3];

        for (int i = 0; i < m; i++) {
            System.out.println("Enter the edge : "+(i+1));
            System.out.print("Enter the source: ");
            int u = sc.nextInt();
            System.out.print("Enter the destination: ");
            int v = sc.nextInt();
            System.out.print("Enter the weight : ");
            int w = sc.nextInt();
            matrix[i][0] = u - 1;
            matrix[i][1] = v - 1;
            matrix[i][2] = w;
        }
        
        int[] path = new int[n];
        Arrays.fill(path, Integer.MAX_VALUE);
        path[0] = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m; j++) {
                int u = matrix[j][0];
                int v = matrix[j][1];
                int w = matrix[j][2];
                if (path[u] == Integer.MAX_VALUE) {
                    continue;
                }
                if (path[u] + w < path[v]) {
                    path[v] = path[u] + w;

                }
            }
        }
        System.out.println("the Path is ");

        for (int i = 0; i < path.length; i++) {
            if (path[i] ==Integer.MAX_VALUE) {
                System.out.println("1000000000" + " ");
            } else {
                System.out.print(path[i] + "   ");
            }
        }
        sc.close();
    }
   
}