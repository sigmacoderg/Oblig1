import javax.swing.*;
import javax.swing.JOptionPane.*;

public class Oblig1 {
    public static void main (String[] args) {
String name = JOptionPane.showInputDialog("Hva er ditt fornavn?");
String lastname = JOptionPane.showInputDialog("Hva er ditt etternavn?");

System.out.println(name);
System.out.println(lastname);
String fulltnavn =(name + " " + lastname);
JOptionPane.showMessageDialog(null, "Tenk at jeg " + fulltnavn + " har gjort oblig1 allerede!" );
        System.out.println(fulltnavn);

}
}