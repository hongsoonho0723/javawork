package ex0129.array;

public class MultiArrayExam {
	
	//int [] [] arr;
	
	int[][] arr = new int [3][]; //3행 열 미완성
	/*
	 * int [][] arr = new int [][] { {1,3,5,7}, {2,4,8}, {10,20,30,40,50,60,70},
	 * {1,5} };
	 */
	public void test() {
		
		arr[0] = new int [4];
		arr[1] = new int [] {1,3,5,7,8,0};
		arr[2] = new int [] {2,4};
		
		
		
		
		
		
		System.out.println("arr = "+arr);
		System.out.println("arr[0] = "+arr[0]);
		System.out.println("arr[0][0] = "+arr[0][0]);
				
		int rowLen= arr.length;
		for(int row = 0; row<rowLen; row++) {
			int colLen = arr[row].length;
			for(int col =0; col<colLen; col++) {
				
				System.out.print(arr[row][col]+"\t");
				
			}
			System.out.println();
		}
		
		System.out.println("***개선된 for문으로 *****");
		
		for(int row []: arr) {
			for(int col : row) {
				System.out.print(col+"\t");
				
			}System.out.println();
		}
		
	}
	
	
	public static void main (String[] args) {
	
	MultiArrayExam me = new MultiArrayExam();
	me.test();
	
	//new MultiArrayExam().test();
		 
	}
	
	
}
