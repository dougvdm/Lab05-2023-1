import ordenadores.OrdenarPorInsercao;
import ordenadores.OrdenarPorSelecao;

public class Main {
    public static void main(String[] args) {
        int[] array = {  7, 9, 15, 17, 20};
        int[] array2 = { 0, 1,  2, 22, 30};
        Order o = new OrdenarPorInsercao();
        int[] array2 = o.ordene(array);
        for (int i : array2){
            System.out.println(i);
        }

    
    }
}
