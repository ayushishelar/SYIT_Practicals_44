
package practical2;

public class Borrow extends Practical2 {

int fiction;

int nonfiction;

int magazines;

public Borrow(int fiction, int nonfiction, int magazines, String name, int memberId) {

super(name, memberId);

this.fiction = fiction;

this.nonfiction = nonfiction;

this.magazines = magazines;

}

int calculateTotalBorrow()

{

return fiction+nonfiction+magazines;

}

void displayBorrow()

{

System.out.println("Fiction Books Borrowed:"+fiction);

System.out.println("NonFiction Books Borrowed:"+nonfiction);

System.out.println("Magazines:"+magazines); System.out.println("Total Books borrowed:"+calculateTotalBorrow()); } public static void main(String[] args) { Borrow b1= new Borrow(3,10,4,"Ayushi",44); b1.displayBorrow(); } }
