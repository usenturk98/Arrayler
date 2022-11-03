package Arrayler;

import java.util.ArrayList;

public class Alist {

	public static void main(String[] args) {
		ArrayList<String> dizi=new ArrayList<String>();
		dizi.add("red");
		dizi.add("yellow");
		dizi.add("green");
		dizi.add(1,"orange");
		for(int i=0;i<dizi.size();i++) {
			System.out.println(dizi.get(i));
		}
		if(dizi.contains("red")) {
			System.out.println("Dizi içinde red var");
		}else
			System.out.println("Dizi içinde red yok");
		System.out.println("Green değerinin indeksi : "+dizi.indexOf("green"));
		dizi.clear();
		for(int i=0;i<dizi.size();i++) {
			System.out.println(dizi.get(i));
		}
		
	}

}
