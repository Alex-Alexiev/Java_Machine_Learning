
public class DataPoint {
	
	private int x, y, biasInput;
	private int label;
	private static final double SLOPE = 0.4;
	private static final int Y_INT = 200;
	
	public DataPoint(int x, int y, int maxInput) {
		this.biasInput = maxInput;
		this.x = x;
		this.y = y;
		if (y > SLOPE*x+Y_INT) {
			this.label = 1;
		} else {
			this.label = 0;
		}
	}
		
	public static DataPoint[] generateRandomData(int numDatas, int rangeSize) {
		DataPoint[] ret = new DataPoint[numDatas];
		for (int i = 0; i < ret.length; i++) {
			int x = (int)(Math.random()*rangeSize)-(rangeSize/2);
			int y = (int)(Math.random()*rangeSize)-(rangeSize/2);
			ret[i] = new DataPoint(x, y, rangeSize/2);
		}
		return ret;
	}
		
	public Vector getVector() {
		return new Vector(new double[] {x,y, biasInput});
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getLabel() {
		return label;
	}

	public void setLabel(int label) {
		this.label = label;
	}
	
}
