package application;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		String path = "c:/ws-roberto/inCSVinternacional.txt";
		List<Product> list = new ArrayList<Product>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
					
			String line = br.readLine();
			line = br.readLine(); // arquivo tem pelo a linha de cabecalho
			while (line != null) {
				
				String [] vect = line.split(",");
				String name = vect[0];
				Double price = Double.parseDouble(vect[1]);
				Integer quantity = Integer.parseUnsignedInt(vect[2]);
				
				Product prod = new Product(name, price, quantity);
				list.add(prod);
					
				line = br.readLine();
			}	
		
		
		System.out.println("PRODUCTS|: ");
		for (Product p:list) {
			System.out.println(p);
		}
		
	} catch (Exception e) {
		System.out.println("Error: " + e.getMessage()); 
					
	}
	}			
}	


