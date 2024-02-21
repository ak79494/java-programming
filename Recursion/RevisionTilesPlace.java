//place tiles of size 1*m to move 0,0 to nm
class RevisionTilesPlace {
	public static int placeTiles(int n, int m) {
		if(n==m) {
			return 2;
		}
		if(n<m) {
			return 1;
		}
		//vertically
		int vertPlacements = placeTiles(n-m,m);
		// hotrizontally
		int horPlacements = placeTiles(n-1,m);
		return vertPlacements + horPlacements;
	}
	public static void main(String[] args) {
		int n=4; int m=2;
		System.out.println(placeTiles(n,m));

		
	}
}