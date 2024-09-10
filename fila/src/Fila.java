public class Fila{

    private static Fila instancia;
    private Fila(){}
    
    public static Fila getInstance(){
        if (instancia == null){
            instancia = new Fila();
        }
        return instancia;
       
    }
    public void imprimeDocumento(){
        System.out.println("Impresso");
    }

    public void removeDocumento(){
        System.out.println("Removido");
    }

    public void removeTodosDocumento(){
        System.out.println("Tudo removido");
    }

}