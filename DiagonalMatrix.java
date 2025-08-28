package Matrix;

public class DiagonalMatrix {
    public static void main(String[] args) {
        int mat[][]={{10,20,30,40,50},{5,6,7,8,9},{11,22,33,44,55},{16,17,18,19,20}};
        for(int i=0;i<mat.length;i++)//mat.length=4,i=3
        {	System.out.print(mat[i][0]+" ");
            int j=i


                    -1,k=1;//j=2,
            while(j>=0)
            {	System.out.print(mat[j][k]+" ");
                j--;k++;//j=-1,k=3
            }
            if(i==mat.length-1)//3==3
            {	System.out.println();
                for( j=1;j<mat[0].length;j++)//mat[0].length=5
                {	System.out.print(mat[i][j]+" ");
                    int r=i-1,c=j+1;
                    while(c<mat[0].length)//mat[0].length=5
                    {	System.out.print(mat[r][c]+" ");
                        r--;
                        c++;
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
