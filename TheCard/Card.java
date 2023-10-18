enum Color {
	RED,
	GREEN,
	BLUE,
	YELLOW
	}
	
enum Rank {		
	ONE('1'),
	TWO('2'),
	THREE('3'),
	FOUR('4'),
	FIVE('5'),
	SIX('6'),
	SEVEN('7'),
	EIGHT('8'),
	NINE('9'),
	TEN('0'),
	DOLLAR('$'),
	PERCENT('%'),
	UP('^'),
	AMPERSAND('&');
	
	
	char rank;

	public boolean isSymbol() {
		if (rank <= 053 || rank >= 0) {
			return false;
		} return true;
	}
	
	
		Rank (char cardRank) {
		this.rank = cardRank;
	}
}

public class Card {
	
	final private Color color;
	final private Rank rank;
	
	
	public Card(Color color, Rank rank) {
		this.color = color;
		this.rank = rank;
	}
	
	public boolean isSymbolCard() {
		return rank.isSymbol();
	}
	
	public Color getColor() {
		return color;
	}
	
	public Rank getRank() {
		return rank;
	}
}
	



// https://howtodoinjava.com/java/enum/enum-tutorial/