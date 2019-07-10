package cn;

public class UpperStrategy implements StrategyInterface{

	@Override
	public void occupationWestOfSiChuan(String msg) {
		if(msg.length()<5 || msg=="" || msg==null) {
			System.out.println("使用上计失败");
			int i = 100/0;
		}
		System.out.println("此为上计");
	}

}
