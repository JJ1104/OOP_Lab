import java.util.Scanner;

class p2{
	
	static int findTrace(int mat[][],int row, int column){
		int sum = 0,i,j;
		for(i=0;i<row;i++){
			for(j=0;j<column;j++){
				if(i==j)
					sum += mat[i][j];
			}
		}
		return sum;
	}

	static double findNorm(int mat[][],int row,int column){
		int sum=0,i,j;
		double norm;
		for(i=0;i<row;i++){
			for(j=0;j<column;j++){
				sum+= Math.pow(mat[i][j],2);
			}
		}
		norm = Math.sqrt(sum);
		return norm;
	}

	public static void main(String args[]){
		int m,n,i,j,trace;
		double norm;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the rows and columns of the matrix:");
		m = scanner.nextInt();
		n = scanner.nextInt();
		int mat[][]= new int[m][n];
		System.out.println("Enter the elements of the matrix:");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				mat[i][j] = scanner.nextInt();
			}
		}
		trace = findTrace(mat,m,n);
		System.out.println("The trace of the matrix is "+trace);
		norm = findNorm(mat,m,n);
		System.out.println("The norm of the matrix is "+norm);
		scanner.close();

	}
}