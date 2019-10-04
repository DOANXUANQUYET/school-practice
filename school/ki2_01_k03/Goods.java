package ki2_01_k03;

public class Goods {
	
	private String goodsCode;
	private String goodsName;
	private int price;
	public Goods(String goodsCode, String goodsName, int price) {
		super();
		this.goodsCode = goodsCode;
		this.goodsName = goodsName;
		this.price = price;
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public int getPrice() {
		return price;
	}
	
}
