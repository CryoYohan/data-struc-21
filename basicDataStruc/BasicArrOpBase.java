package basicDataStruc;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class BasicArrOpBase {

	// Initialize data structure, array, for storing the integers;
	int[] arrNum = new int[5];
	// Initialize Scanner
	Scanner sc = new Scanner(System.in);
	
	BasicArrOpBase(){
		System.out.println("DATA STRUCTURE ACTIVITY: BASIC ARRAY OPERATIONS\n\n");
		menu();
	}
	
	public void menu() {
		int input =0;
		for(int i = 0; i < arrNum.length; i++) {
			try {
			System.out.println("Enter number " + (i+1) + ": ");
			arrNum[i] = sc.nextInt();
			}catch(Exception e) {
				System.out.println("Invalid input, please enter a valid integer");
				i--;
				sc.nextLine();
			}
		}
		do {
			try {
				System.out.println("-----PLEASE CHOOSE A TASK-----\n1.] INSERT || 2.] DELETE || 3.] SEARCH || 4.] UPDATE || 5.] DISPLAY VALUES || 6.] EXIT");
				input = sc.nextInt();
				switch(input) {
				case 1:
					insert();
					break;
				case 2:
					delete();
					break;
					
				case 3:
					search();
					break;
				
				case 4:
					update();
					break;
					
				case 5:
					displayArray();
					break;
				
				case 6:
					sort();
					break;
					
				case 7:
					System.out.println("Program Closed...");
					System.exit(0);
					break;
					
				default:
					System.out.println("Invalid input");
					break;
				}
			}catch(Exception e) {
				System.out.println("Invalid input!");
				sc.nextLine();
			}
		}while(input!=7);
		
	}
	
	public void displayArray() {
		System.out.println("Here are the values stored:\n");
		int numbering = 0;
		for(int n: arrNum) {
			System.out.println("Index " + numbering + ".] "+ n);		
			numbering++;
		}
		System.out.println();
	}
	public void insert() {
		int newValue, index;
		System.out.println("Which index do you want to insert?\n1.] Beginning 2.] End 3.] Specific Index: ");
		int choice = sc.nextInt();
		for(int i = 0; i < arrNum.length; i++) {			
			if(arrNum[i] == 0) 
				System.out.println("Index " + (i) + ": " + arrNum[i] );
			else
				System.out.println("Index " + (i) + ": " + arrNum[i]);		
		}
		switch(choice) {
		case 1:
			System.out.println("Enter new value: ");
			arrNum = Arrays.copyOf(arrNum, arrNum.length + 1);
			for(int i = arrNum.length - 1; i > 0; i--) {
				arrNum[i] = arrNum[i-1];
			}
			arrNum[0] = newValue = sc.nextInt();;
			break;
		case 2:
			System.out.println("Enter new value: ");
			arrNum = Arrays.copyOf(arrNum, arrNum.length + 1);
			arrNum[arrNum.length-1] = newValue = sc.nextInt();
			break;
			
		case 3:
			System.out.println("Enter specific index: ");
			index = sc.nextInt();
			System.out.println("Enter new value: ");
			arrNum = Arrays.copyOf(arrNum, arrNum.length + 1);
			for(int i = arrNum.length - 1; i > index; i--) {
				arrNum[i] = arrNum[i-1];
			}
			arrNum[index] = newValue = sc.nextInt();
		}
	}
	public void delete() {
		System.out.println("Enter index to delete: \n");
		for(int i = 0; i < arrNum.length; i++) {		
			System.out.println("Index " + (i) + ": " + arrNum[i]);
		}
		int arrNumCopy[] = Arrays.copyOf(arrNum, arrNum.length - 1);
		int deleteChoice = sc.nextInt();
		for(int i = 0, j = 0; i < arrNum.length; i++) {
			if(arrNum[i]!=arrNum[deleteChoice]) {
				arrNumCopy[j] = arrNum[i];
				j++;
			}
		}
		arrNum = arrNumCopy;
	}	
	public void search() {
		int found = 0, x =0, indexNumber = 0;
		ArrayList<String> arrIndex = new ArrayList<String>();
		System.out.println("Enter value to search: \n");
		int search = sc.nextInt();
		for(int i = 0; i < arrNum.length; i++) {
			if(search==arrNum[i]) {
				found++;
				arrIndex.add(i + "");
				x++;
			}
		}
		if(found==0)
			System.out.println("Value does not exist!");
		if(found==1){
			System.out.println("There is " + found + " value found at index " + arrIndex);
		}
		else if(found>1) {
			System.out.print("There are " + found + " values found at index [");
			int c = 1;
			for(String n : arrIndex) {
				if(c==arrIndex.size())
					System.out.print("" + n + "]");
				else
					System.out.print(n + ", ");
				c++;
					
			}
			System.out.println();
		}
		
	}	
	public void update() {
		displayArray();
		System.out.println("Pick a number to update: ");
		int input = sc.nextInt();
		System.out.println("Enter new value: ");
		int newValue = sc.nextInt();
		arrNum[input] = newValue;
		System.out.println("Updated successfully!");
	}		
	public void sort() {
		System.out.println("Pick sorting order\n1.] Ascending 2.] Descending");
		int input = sc.nextInt();
		switch(input) {
		case 1:
			for (int i = 0; i < arrNum.length - 1; i++) {
                for (int j = i + 1; j < arrNum.length; j++) {
                    if (arrNum[i] > arrNum[j]) {
                        int temp = arrNum[i];
                        arrNum[i] = arrNum[j];
                        arrNum[j] = temp;
                    }
                }
            }
			System.out.println("Sorted to ascending order.\n");
			break;
		case 2:
			for (int i = 0; i < arrNum.length - 1; i++) {
                for (int j = i + 1; j < arrNum.length; j++) {
                    if (arrNum[i] < arrNum[j]) {
                        int temp = arrNum[i];
                        arrNum[i] = arrNum[j];
                        arrNum[j] = temp;
                    }
                }
            }
			System.out.println("Sorted to descending order.\n");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
	}
}
