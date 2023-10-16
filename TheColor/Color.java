class Color {

	private int redChannel; 
	private int greenChannel;
	private int blueChannel;
	
	public Color(int redChannel, int greenChannel, int blueChannel) {
		this.redChannel = redChannel;
		this.greenChannel = greenChannel;
		this.blueChannel = blueChannel;
	}

	public final static Color WHITE = new Color(255, 255, 255);
	public final static Color BLACK = new Color(0, 0, 0);
	public final static Color RED = new Color(255, 0, 0);
	public final static Color ORANGE = new Color(255, 165, 0);
	public final static Color YELLOW = new Color(255, 255, 0);
	public final static Color GREEN = new Color(0, 128, 0);
	public final static Color BLUE = new Color(0, 0, 255);
	public final static Color PURPLE = new Color(128, 0, 128);

	@Override
	public String toString() {
		return "redChannel: " + redChannel + "\n" +
				"greenChannel: " + greenChannel + "\n" +
				"blueChannel: " + blueChannel;
		}
}