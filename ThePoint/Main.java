public class Main {
	public static void main(String[] args) {
	
	ThePoint puntEen = new ThePoint(2, 3);
	ThePoint puntTwee = new ThePoint(-4, 0);
	
	System.out.println(puntEen.xCoord + " " + puntEen.yCoord);
	System.out.println(puntTwee.xCoord + " " + puntTwee.yCoord);
	System.out.println(puntEen.toString());
	System.out.println(puntTwee.toString());
	}
}