import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   Scanner o = new Scanner(System.in);
    System.out.println("Wybierz rozmiar choinki:");

    int a = o.nextInt();

    for (int i = 1; i<=a; i++){
      for (int j = 0; j<a-1; j++);
      System.out.println(" ");
      for (int j = 0; j<(i); j++)
      System.out.print("*");
      System.out.println(" ");
      
    }
    
  }
}