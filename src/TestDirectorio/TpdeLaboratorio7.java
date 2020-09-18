
package TestDirectorio;


public class TpdeLaboratorio7 {


    public static void main(String[] args) {
    Cliente c1 = new Cliente("Luis","Rosales","Mendoza","B17mza2casa4",44445);
    Cliente c2 = new Cliente("Emanuel","Salguero","Cordoba","B17mza2casa4",11111);
    Cliente c3 = new Cliente("Rebeca","Sosa","San Luis","B17mza2casa4",22222);
    Cliente c4 = new Cliente("Maria","Gomez","San Luis","B17mza2casa4",33333);
    Cliente c5 = new Cliente("Ceferino","Sosa","San Luis","B17mza2casa4",44444);
    DirectorioTelefonico telefonica= new DirectorioTelefonico();
    telefonica.agregarCliente(2664001225L , c1);
    telefonica.agregarCliente(2664001223L , c5);
    telefonica.agregarCliente(2664001254L , c2);
    telefonica.agregarCliente(2664034545L , c3);
    telefonica.agregarCliente(2664034554L , c4);
    telefonica.agregarCliente(2664034423L , c5);
        System.out.println(telefonica.buscarCliente(2664001223L));
        System.out.println(telefonica.buscarTelefono("Sosa"));
        System.out.println(telefonica.buscarClientes("San Luis"));
        
        
        
        
    }
    
}
