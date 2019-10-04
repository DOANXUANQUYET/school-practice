package ki2_01_k03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ki2_01_k02.User;
import ki2_01_kakunin.Person;

public class GoodsList {
	
	private List<Goods> list = new ArrayList<Goods>();

	public GoodsList() {
		try (BufferedReader br = new BufferedReader(new FileReader("goods.txt"))) {
			String record;

			while ((record = br.readLine()) != null) {
				String[] items = record.split(",");
				Goods goods = new Goods(items[0],items[1],Integer.valueOf(items[2]));
				list.add(goods);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	Goods get(String goodsCode) {
		Iterator<Goods> iterator = list.iterator();
		while(iterator.hasNext()) {
			Goods goods = iterator.next();
			if(goods.getGoodsCode().equals(goodsCode)) {
				return goods;
			}
		}
		return null;
	}
	
	

}
