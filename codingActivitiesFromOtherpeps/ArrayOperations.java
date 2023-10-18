package codingActivitiesFromOtherpeps;
import java.util.Scanner;

public class ArrayOperations {
    int size;
    private int[] array; // created an instance of the array here
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	ArrayOperations object = new ArrayOperations(); // I created an object called "object" so i could call the variables in the class
    	do {
    		try {
    		 System.out.print("Specific Array Size: ");
    		 object.size = object.scanner.nextInt();
    		 object.array = new int[object.size]; // Initialized the array here
    		 object.menu();
    		}catch(Exception e) {
    			System.out.println("Invalid input! Please enter an integer.");
    			object.scanner.nextLine();
    		}
    	}while(!Character.isDigit(object.size));
    }

    private void menu() {
        int choice = 0;
        do {
        	try { // This try catch is the overseer, the Emperor, the strongest one, this traps everything within the menu selection
            System.out.println("Menu:\n1.] Insert\n2.] View\n3.] Delete\n4.] Update\n5.] Search\n6.] Sort (1. Ascending 2. Descending)\n7.] EXIT\n\nEnter your choice: ");
            choice = scanner.nextInt(); 
            switch (choice) {			// Choosing tasks are much easier when it's broken down into methods, it is much easier to debug incase some nasty bugs annoys your program;
                case 1:
                    insert(); // Calls insert method
                    break;

                case 2:
                    view(); // Calls view method
                    break;

                case 3:
                    delete(); // Calls delete method
                    break;

                case 4:
                    update(); // Calls update method
                    break;

                case 5:
                    search(); // Calls search method
                    break;

                case 6:
                    sort(); // Calls sort method
                    break;

                case 7:
                	System.out.println("Exiting Program..."); // Kills the program
                	System.exit(0);;
                    break;

                default:
                    System.out.println("Invalid choice."); // Traps choices not included in the cases 1-7
                    break;
            }
            }catch(Exception e) {
            	System.out.println("Invalid input!");
            	scanner.nextLine();
            }
        } while (choice != 7);

        scanner.close();
    }

    // Method used to insert a value in a specific index of an array prompted by the user
    private void insert() {
        System.out.print("Enter the index to insert: ");
        int insertIndex = scanner.nextInt();

        System.out.print("Enter the value to insert: ");
        int insertValue = scanner.nextInt();

        if (insertIndex >= 0 && insertIndex < size) {
            array[insertIndex] = insertValue;
            System.out.println("Value inserted successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }
    // Method used to view all values of the array.
    private void view() {
        System.out.println("Array Elements:");

        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + array[i]);
        }
    }
    // Method used to delete a value in a specific index of an array prompted by the user
    private void delete() {
        System.out.print("Enter the index to delete: ");
        int deleteIndex = scanner.nextInt();

        if (deleteIndex >= 0 && deleteIndex < size) {
            array[deleteIndex] = 0;
            System.out.println("Value deleted successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }
    // Method used to update a value in a specific index of an array prompted by the user
    private void update() {
        System.out.print("Enter the index to update: ");
        int updateIndex = scanner.nextInt();

        System.out.print("Enter the new value: ");
        int updateValue = scanner.nextInt();

        if (updateIndex >= 0 && updateIndex < size) {
            array[updateIndex] = updateValue;
            System.out.println("Value updated successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }
    // Method used to search a value in an array prompted by the user
    private void search() {
        System.out.print("Enter the value to search: ");
        int searchValue = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (array[i] == searchValue) {
                System.out.println("Value found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Value not found.");
        }
    }
    // Method used to sort the array's value either it's ascending or descending order prompted by the user
    private void sort() {
        System.out.print("Enter the sort order (1. Ascending 2. Descending): ");
        int sortOrder = scanner.nextInt();

        if (sortOrder == 1) {
            // Sort in ascending order
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

            System.out.println("Array sorted in ascending order.");
        } else if (sortOrder == 2) {
            // Sort in descending order
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (array[i] < array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            System.out.println("Array sorted in descending order.");
        } else {
            System.out.println("Invalid sort order.");
        }
    }
}
