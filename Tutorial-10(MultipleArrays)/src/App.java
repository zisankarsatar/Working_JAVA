
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid= {
				{3,5,3569},
				{5},
				{1235,456,7,7}
		};
		
		System.out.println(grid[1][0]);
		System.out.println(grid[0][2]);
		
		String[][] texts= new String[2][3];
		
		texts[0][2]="Heeello can��m";
		
		System.out.println(texts[0][2]);
		
		for(int row=0; row<grid.length; row++) {
			for(int col=0; col<grid[row].length; col++) {
				System.out.println(grid[row][col]+ "\t");
			}
			System.out.println();
		}
		
		String[][] words = new String[2][];
		
		System.out.println(words[0]);
		
		words[0] = new String[5];
		words[0][1]="hi mee";
		
		System.out.println(words[0][1]);
	}
	

}
