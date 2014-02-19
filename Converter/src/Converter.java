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
	String finished = "";
	PrintWriter writer;
	Scanner line;
	public void readline() {
		
		try {
			writer = new PrintWriter("test_converted.txt", "UTF-8");
			 line = new Scanner(new BufferedReader(new FileReader(
					"pokertest.data.txt")));
			while (line.hasNext()) {
finished = "";
issuit = true;
				String[] split = line.next().split(",");

				for (int i = 0; i < split.length - 2; i++) {

					if (issuit) {

						// String value = split[i];
						// System.out.print("dette er suit  ");
						switch (split[i]) {
						case "1":
							finished += "1,0,0,0,";
							break;
						case "2":
							finished += "0,1,0,0,";
							break;
						case "3":
							finished += "0,0,1,0,";
							break;
						case "4":
							finished += "0,0,0,1,";
							break;

						}
						issuit = false;
					} else if (!issuit) {
						// System.out.print("dette er number  ");
						switch (split[i]) {
						case "1":
							finished += "1,0,0,0,0,0,0,0,0,0,0,0,0,";
							break;
						case "2":
							finished += "0,1,0,0,0,0,0,0,0,0,0,0,0,";
							break;
						case "3":
							finished += "0,0,1,0,0,0,0,0,0,0,0,0,0,";
							break;
						case "4":
							finished += "0,0,0,1,0,0,0,0,0,0,0,0,0,";
							break;
						case "5":
							finished += "0,0,0,0,1,0,0,0,0,0,0,0,0,";
							break;
						case "6":
							finished += "0,0,0,0,0,1,0,0,0,0,0,0,0,";
							break;
						case "7":
							finished += "0,0,0,0,0,0,1,0,0,0,0,0,0,";
							break;
						case "8":
							finished += "0,0,0,0,0,0,0,1,0,0,0,0,0,";
							break;
						case "9":
							finished += "0,0,0,0,0,0,0,0,1,0,0,0,0,";
							break;
						case "10":
							finished += "0,0,0,0,0,0,0,0,0,1,0,0,0,";
							break;
						case "11":
							finished += "0,0,0,0,0,0,0,0,0,0,1,0,0,";
							break;
						case "12":
							finished += "0,0,0,0,0,0,0,0,0,0,0,1,0,";
							break;
						case "13":
							finished += "0,0,0,0,0,0,0,0,0,0,0,0,1,";
							break;

						}

						issuit = true;
					}
				}
				switch (split[10]) {
				case "0":
					finished += "1,0,0,0,0,0,0,0,0,0";
					break;

				case "1":
					finished += "0,1,0,0,0,0,0,0,0,0";
					break;
				case "2":
					finished += "0,0,1,0,0,0,0,0,0,0";
					break;
				case "3":
					finished += "0,0,0,1,0,0,0,0,0,0";
					break;

				case "4":
					finished += "0,0,0,0,1,0,0,0,0,0";
					break;
				case "5":
					finished += "0,0,0,0,0,1,0,0,0,0";
					break;
				case "6":
					finished += "0,0,0,0,0,0,1,0,0,0";
					break;
				case "7":
					finished += "0,0,0,0,0,0,0,1,0,0";
					break;
				case "8":
					finished += "0,0,0,0,0,0,0,0,1,0";
					break;
				case "9":
					finished += "0,0,0,0,0,0,0,0,0,1";
					break;

				}

				//System.out.println(finished);

				 
				writer.println(finished);
				
			}
		} catch (Exception e) {
			System.out.print(e);
			// TODO: handle exception
		}
		
		writer.close();
		 line.close();
	}
}
