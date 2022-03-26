package package1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Card {

	char symbol;
	int number;
    protected ArrayList<Integer> array;
    protected Map<String,ArrayList<Integer>> card;
    
    public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

    public Card(){
        this.array = new ArrayList<Integer>();
        this.card = new HashMap<String,ArrayList<Integer>>();
    }

    public void addCard(String symbol,int number) {
        if(this.card.containsKey(symbol)) {
             this.card.get(symbol).add(number);             
        }else {
            this.array.add(number);
            this.card.put(symbol,this.array);
       }

    }
}


public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Character, ArrayList<Card>> map = new TreeMap<>();
		
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= n; i++) {
			
			char symbol = sc.nextLine().charAt(0);
			int number = sc.nextInt();
			
			Card c = new Card();
			c.setSymbol(symbol);
			c.setNumber(number);
			sc.nextLine();
			
			if (!map.containsKey(symbol)) {
				ArrayList<Card> list = new ArrayList<>();
				list.add(c);
				map.put(symbol, list);
			} else {
				ArrayList<Card> list = map.get(symbol);
				list.add(c);
			}			
		}
		System.out.println("Distinct Symbols are :");
		
		Set<Entry<Character, ArrayList<Card>>> set = map.entrySet();
		Iterator<Entry<Character, ArrayList<Card>>> it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next().getKey() + " ");
		}
		System.out.println();
		
		
		set = map.entrySet();
		it = set.iterator();
		
		while (it.hasNext()) {
			int sum = 0;
			Map.Entry<Character, ArrayList<Card>> me = it.next();
			ArrayList<Card> list = me.getValue();
			
			System.out.println("Cards in " + me.getKey() + " Symbol");
			
			for (Card card : list) {
				System.out.println(card.getSymbol() + " " + card.getNumber());
				sum += card.getNumber();
			}
			
			System.out.println("Number of cards : " + list.size());
			System.out.println("Sum of Numbers : " + sum);
		}			
		
		sc.close();
	}

}