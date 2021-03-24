package filepackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import artworkpackage.Architecture;
import artworkpackage.Artwork;
import artworkpackage.Painting;
import artworkpackage.Sculpture;
import mainpackage.Vault;
import package2.Architect;
import package2.Artist;

public class CSVReader{
	public static ArrayList<String> readFromCSVFile( ) {

        ArrayList<String> allValues = new ArrayList<String>();
       
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("CENG211_HW2_ArtVaultData.csv")))) {  
			 while (scanner.hasNextLine()) {    
				 
				 String data = scanner.nextLine();
				 allValues.add(data);
	             
	         }
	         
	     } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        
        return allValues;
    }
	
} 