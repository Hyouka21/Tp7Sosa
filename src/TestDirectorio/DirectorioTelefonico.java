
package TestDirectorio;

import java.util.*;



public class DirectorioTelefonico {
     Map<Long,Cliente> directorio = new TreeMap<>();
         
     public void agregarCliente(Long tel,Cliente cli){
     directorio.put(tel, cli);
     }
     public Cliente buscarCliente (Long tel){
     if(directorio.containsKey(tel)){ return directorio.get(tel);}else{
     return null;  }
     }
     public Set<Long> buscarTelefono(String ape){
    /*     HashSet<Long>telefonos= new HashSet<>();
         for(Map.Entry<Long,Cliente> cli : directorio.entrySet())
         { long clave= cli.getKey();
            String apellido=cli.getValue().getApellido();
            if(apellido.equals(ape)){telefonos.add(clave);}
         }
         return telefonos;*/ 
        HashSet<Long>telefonos= new HashSet<>();
         for(Long tel : directorio.keySet())
         { 
          Cliente c=directorio.get(tel);
           if(c.getApellido().equals(ape)){ telefonos.add(tel);
           }
         }
         return telefonos;
     }
     public List<Cliente> buscarClientes(String ciu){
          List<Cliente>clientes= new ArrayList<>();
         for(Long tel : directorio.keySet()){ 
          Cliente c=directorio.get(tel);
           if(c.getCiudad().equals(ciu)){ clientes.add(c);}
         }
         return clientes;
     }
     public void borrarCliente(int dni){
         Map<Long,Cliente> borrar = new TreeMap<>();
         borrar.putAll(directorio);
         for(Long tel : borrar.keySet()){ 
          Cliente c=borrar.get(tel);
           if(c.getDni()==dni){ directorio.remove(tel);}
         }
     }
}
