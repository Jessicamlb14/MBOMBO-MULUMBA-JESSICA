package poo1;

import java.util.ArrayList;

public class TestArticle1 {

	public static void main(String[] args) {
		ArrayList<Article> stock = new ArrayList<Article>();
	    stock.add(new Article("A001","CANON","IMPRIMANTE",800));
		stock.add(new Article("A002","HP PROBOOK","ORDINATEUR",1200));
		stock.add(new Article("A003","Z FLOD","TELEPHONE",1000));
		stock.add(new Article("A004","HP LASER","IMPRIMANTE",250));
		stock.add(new Article("A005","TECHNO CAMON 19 PRO","TELEPHONE",350));
		stock.add(new Article("A006","LENOVO","ORDINATEUR",750));
		stock.add(new Article("A007","IPHONE 13 PRO MAX","TELEPHONE",1500));
		for(Article a :stock) {
			if(a.getClass().equals("TELEPHONE")& a.getprix() <= 500)
		    System.out.println(a);

	}

}
}
