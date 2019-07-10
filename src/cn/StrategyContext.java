package cn;

public class StrategyContext {
	private StrategyInterface sif;
	public void occupation(String msg) {
		sif = new UpperStrategy();
		try {
			sif.occupationWestOfSiChuan(msg);
		}catch(Exception e){
			sif = new MiddleStrategy();
			sif.occupationWestOfSiChuan(msg);
		}
	}
}
