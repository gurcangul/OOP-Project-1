package mainpackage;
import java.util.Scanner;
import tradepackage.Trade;
import artworkpackage.Architecture;
import artworkpackage.Painting;
import artworkpackage.Sculpture;
import filepackage.ArrayListSorter;
import package2.Architect;
import package2.Artist;
public class ArtVaultAppManager {
	public void startProgram(){
		Vault theVault=new Vault();
        theVault.dataTranfer();             
	    Scanner scanner = new Scanner(System.in);
	    Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the number of the operation you want to perform: ");
 	    System.out.println("1)  Print the lists ");
 	    System.out.println("2)  Search the vault");
 	    System.out.println("3)  Trade");
 	    System.out.println("0)  Exit");
 	   ArrayListSorter<Architecture> architectureSort = new ArrayListSorter<Architecture>();
	    ArrayListSorter<Painting> paintingSort = new ArrayListSorter<Painting>();
	    ArrayListSorter<Sculpture> sculptureSort = new ArrayListSorter<Sculpture>();
	    ArrayListSorter<Architect> architectSort = new ArrayListSorter<Architect>();
	    ArrayListSorter<Artist> artistSort = new ArrayListSorter<Artist>();
 	    String keyword;
 		int choice;
 	    boolean exit = true;
 	    while(exit) {
 	    	choice=scanner.nextInt();
	    	switch (choice) {
	    	case 1:
  		 	  System.out.println("Please choose the list");
  		 	    System.out.println("");
  		 	    System.out.println("1)  Print the list of artists");
  		 	    System.out.println("2)  Print the list of architects");
  		 	    System.out.println("3)  Print the list of paintings");
  		 	    System.out.println("4)  Print the list of sculptures");
  		 	    System.out.println("5)  Print the list of architectures");
  		 	    System.out.println("0) Exit");
  		 	    System.out.println("");
  				int key=scanner.nextInt();
	    				if(key==1) {
		    		 	
		    		 	    System.out.println("Please choose the sorting method:");
		    		 	    System.out.println("");
		    		 	    System.out.println("1)  Sort by name");
		    		 	    System.out.println("2)  Sort by birthday");
		    		 	    System.out.println("3)  Sort by nationality");
		    		 	    System.out.println("0) Exit");
		    		 	    System.out.println("");
		    				key=scanner.nextInt();

		    		 	   if(key==1) {
			    		 		  artistSort.selectionSort(theVault.artistList, 1);
			    		 		  artistSort.printList(theVault.artistList);
			    		 		  break;

		    		 	    }
		    		 	   else if (key==2) {
		    		 		  artistSort.selectionSort(theVault.artistList, 2);
		    		 		  artistSort.printList(theVault.artistList);
		    		 		  break;
		    		 	    }
		    		 	   else if(key==3) {
		    		 		  artistSort.selectionSort(theVault.artistList, 3);
		    		 		  artistSort.printList(theVault.artistList);
		    		 		  break;
		    		 	    	
		    		 	    }
		    		 	   else {
		    		 		  System.out.println("Enter a valid number");
		    		 	    }
	    				}   		 	
	    				else if(key==2){
		    		 		 System.out.println("Please choose the sorting method:");
			    		 	    System.out.println("");
			    		 	    System.out.println("1)  Sort by name");
			    		 	    System.out.println("2)  Sort by birthday");
			    		 	    System.out.println("3)  Sort by nationality");
			    		 	    System.out.println("0) Exit");
			    		 	    System.out.println("");
			    				key=scanner.nextInt();

			    		 	   if(key==1) {		    		 	    	
				    		 		  architectSort.selectionSort(theVault.architectList, 1);
				    		 		  architectSort.printList(theVault.architectList);
				    		 		  break;
			    		 	    }
			    		 	   else if (key==2) {
			    		 		  architectSort.selectionSort(theVault.architectList, 2);
			    		 		  architectSort.printList(theVault.architectList);
			    		 		  break;
			    		 	    }
			    		 	   else if(key==3) {
			    		 		  architectSort.selectionSort(theVault.architectList, 3);
			    		 		  architectSort.printList(theVault.architectList);
			    		 		  break;
			    		 	    }
			    		 	   else {
			    		 		  System.out.println("Enter a valid number");
			    		 	    }
	    				}   		 		    		 		
	    				else if(key==3){
		    		 		 System.out.println("Please choose the sorting method:");
			    		 	    System.out.println("");
			    		 	    System.out.println("1)  Sort by name");
			    		 	    System.out.println("2)  Sort by artist");
			    		 	    System.out.println("3)  Sort by style");
			    		 	    System.out.println("0) Exit");
			    		 	    System.out.println("");
			    				key=scanner.nextInt();

			    		 	   if(key==1) {		    		 	    	
			    		 		  paintingSort.selectionSort(theVault.paintingList, 1);
			    		 		  paintingSort.printList(theVault.paintingList);
			    		 		  break;
			    		 	    }
			    		 	   else if (key==2) {
				    		 		  paintingSort.selectionSort(theVault.paintingList, 4);
				    		 		  paintingSort.printList(theVault.paintingList);
				    		 		 break;
			    		 	    }
			    		 	   else if(key==3) {
				    		 		  paintingSort.selectionSort(theVault.paintingList, 2);
				    		 		  paintingSort.printList(theVault.paintingList);
				    		 		 break;
			    		 	    }
			    		 	   else {
			    		 	    	System.out.println("Enter a valid number");
			    		 	    }
	    				}
	    				else if(key==4){
		    		 		 System.out.println("Please choose the sorting method:");
			    		 	    System.out.println("");
			    		 	    System.out.println("1)  Sort by name");
			    		 	    System.out.println("2)  Sort by artist");
			    		 	    System.out.println("3)  Sort by style");
			    		 	    System.out.println("4)  Sort by material");
			    		 	    System.out.println("0) Exit");
			    		 	    System.out.println("");
			    				key=scanner.nextInt();

			    		 	   if(key==1) {		    		 	    	
			    		 		  sculptureSort.selectionSort(theVault.sculptureList, 1);
			    		 		  sculptureSort.printList(theVault.sculptureList);
			    		 		  break;
			    		 	    }
			    		 	   else if (key==2) {
			    		 		  sculptureSort.selectionSort(theVault.sculptureList, 4);
			    		 		  sculptureSort.printList(theVault.sculptureList);
			    		 		  break;
			    		 	    }
			    		 	   else if(key==3) {
			    		 		  sculptureSort.selectionSort(theVault.sculptureList, 2);
			    		 		  sculptureSort.printList(theVault.sculptureList);
			    		 		  break;
			    		 	    	
			    		 	    }
			    		 	  else if(key==4) {
			    		 		 sculptureSort.selectionSort(theVault.sculptureList, 3);
			    		 		  sculptureSort.printList(theVault.sculptureList);
			    		 		  break;
			    		 	    	
			    		 	    }
			    		 	   else {
			    		 		  System.out.println("Enter a valid number");
			    		 	    }
	    				}
	    				else if(key==5){
		    		 		 System.out.println("Please choose the sorting method:");
			    		 	    System.out.println("");
			    		 	    System.out.println("1)  Sort by name");
			    		 	    System.out.println("2)  Sort by style");
			    		 	    System.out.println("0) Exit");
			    		 	    System.out.println("");
			    				key=scanner.nextInt();

			    		 	   if(key==1) {		    		 	    	
			    		 		  architectureSort.selectionSort(theVault.architectureList, 1);
			    		 		  architectureSort.printList(theVault.architectureList);
			    		 		  break;
			    		 	    }
			    		 	   else if (key==2) {
			    		 		  architectureSort.selectionSort(theVault.architectureList, 2);
			    		 		  architectureSort.printList(theVault.architectureList);
			    		 		  break;
			    		 	    	
			    		 	    }
			    		 	
			    		 	   else {
				    		 		  System.out.println("Enter a valid number");

			    		 	    }
	    				}
	    				else if(key==0){
		    		 		break;
	    				}
		    		 	break; 	
		    		 	
			    		 	
	    		 	case 2:
	    		 	    System.out.println("Enter the keyword");
	    		 		 keyword=scan.nextLine();

	    		 		 theVault.searchInArchitect(keyword);
	    		 		 theVault.searchInArtist(keyword);
	    		 		 
	    		 		 theVault.searchInArchitecture(keyword);
	    		 		 theVault.searchInSculpture(keyword);
	    		 		 theVault.searchInPaintingt(keyword);
	    		 		
	    		 		break;
	    		 	case 3:
	    		 	    System.out.println("TRADE");
	    		        Trade trade=new Trade();
	    		        trade.Trading(theVault);

	    		 		break;
	    		 	case 0:
	    		 		 exit = false;
	    		 			break;
	    		 	
	    		 }		
	    			System.out.println("Please enter the number of the operation you want to perform: ");
	    	 	    System.out.println("1)  Print the lists ");
	    	 	    System.out.println("2)  Search the vault");
	    	 	    System.out.println("3)  Trade");
	    	 	    System.out.println("0)  Exit");
	    		 
 			
 		}/**/
	}
}
