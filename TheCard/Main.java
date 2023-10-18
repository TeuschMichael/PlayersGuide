public class Main {
	public static void main(String[] args) {

		//Card kaart = new Card(Color.RED, Rank.NINE);
		//System.out.println(kaart.getColor());
		//System.out.println(kaart.isSymbolCard());

		for (Color color : Color.values()) {
			for (Rank rank : Rank.values()) {
				Card kaart = new Card(color, rank);
				System.out.println(kaart.getColor() + " " + kaart.getRank());
			}
		}
	}
}