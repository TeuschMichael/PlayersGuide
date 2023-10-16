class ThePoint {
	
	public int xCoord;
	public int yCoord;
	
	public int getxCoord() {
		return xCoord;
	}
	
	public int getyCoord() {
		return yCoord;
	}
	
	public ThePoint(int xCoord, int yCoord) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	public ThePoint() {
		xCoord = 0;
		yCoord = 0;
		
	}
	
	@Override
	public String toString(){
		return "xCoord:" +  xCoord + " yCoord: " + yCoord;
	}
}