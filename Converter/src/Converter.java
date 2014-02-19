import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		Converter Converter = new Converter();
		Converter.readline();
	}

	boolean issuit = true;
	String cardsString = "";
	String pokerHandString = "";
	PrintWriter writerCards, writerHand;
	Scanner line;
	public void readline() {
		
		try {
			writerCards = new PrintWriter("Cards.txt", "UTF-8");
			writerHand = new PrintWriter("hands.txt", "UTF-8");
			 line = new Scanner(new BufferedReader(new FileReader(
					"pokertest.data.txt")));
			while (line.hasNext()) {
cardsString = "";
pokerHandString="";
issuit = true;
				String[] split = line.next().split(",");

				for (int i = 0; i < split.length - 1; i++) {

					if (issuit) {

						// String value = split[i];
						// System.out.print("dette er suit  ");
						switch (split[i]) {
						case "1":
							cardsString += "1,0,0,0,";
							break;
						case "2":
							cardsString += "0,1,0,0,";
							break;
						case "3":
							cardsString += "0,0,1,0,";
							break;
						case "4":
							cardsString += "0,0,0,1,";
							break;

						}
						issuit = false;
					} else if (!issuit) {
						// System.out.print("dette er number  ");
						switch (split[i]) {
						case "1":
							cardsString += "1,0,0,0,0,0,0,0,0,0,0,0,0,";
							break;
						case "2":
							cardsString += "0,1,0,0,0,0,0,0,0,0,0,0,0,";
							break;
						case "3":
							cardsString += "0,0,1,0,0,0,0,0,0,0,0,0,0,";
							break;
						case "4":
							cardsString += "0,0,0,1,0,0,0,0,0,0,0,0,0,";
							break;
						case "5":
							cardsString += "0,0,0,0,1,0,0,0,0,0,0,0,0,";
							break;
						case "6":
							cardsString += "0,0,0,0,0,1,0,0,0,0,0,0,0,";
							break;
						case "7":
							cardsString += "0,0,0,0,0,0,1,0,0,0,0,0,0,";
							break;
						case "8":
							cardsString += "0,0,0,0,0,0,0,1,0,0,0,0,0,";
							break;
						case "9":
							cardsString += "0,0,0,0,0,0,0,0,1,0,0,0,0,";
							break;
						case "10":
							cardsString += "0,0,0,0,0,0,0,0,0,1,0,0,0,";
							break;
						case "11":
							cardsString += "0,0,0,0,0,0,0,0,0,0,1,0,0,";
							break;
						case "12":
							cardsString += "0,0,0,0,0,0,0,0,0,0,0,1,0,";
							break;
						case "13":
							cardsString += "0,0,0,0,0,0,0,0,0,0,0,0,1,";
							break;

						}

						issuit = true;
					}
				}
				
				
				cardsString = cardsString.substring(0, cardsString.length()-1);
				switch (split[10]) {
				case "0":
					pokerHandString += "1,0,0,0,0,0,0,0,0,0";
					break;

				case "1":
					pokerHandString += "0,1,0,0,0,0,0,0,0,0";
					break;
				case "2":
					pokerHandString += "0,0,1,0,0,0,0,0,0,0";
					break;
				case "3":
					pokerHandString += "0,0,0,1,0,0,0,0,0,0";
					break;

				case "4":
					pokerHandString += "0,0,0,0,1,0,0,0,0,0";
					break;
				case "5":
					pokerHandString += "0,0,0,0,0,1,0,0,0,0";
					break;
				case "6":
					pokerHandString += "0,0,0,0,0,0,1,0,0,0";
					break;
				case "7":
					pokerHandString += "0,0,0,0,0,0,0,1,0,0";
					break;
				case "8":
					pokerHandString += "0,0,0,0,0,0,0,0,1,0";
					break;
				case "9":
					pokerHandString += "0,0,0,0,0,0,0,0,0,1";
					break;

				}

				//System.out.println(finished);

				 
				writerCards.println(cardsString);
				writerHand.println(pokerHandString);
				
			}
		} catch (Exception e) {
			System.out.print(e);
			// TODO: handle exception
		}
		
		writerCards.close();
		writerHand.close();
		 line.close();
	}
}
