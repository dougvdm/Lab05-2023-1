package ordenadores;
public class OrdenarPorInsercao implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        int valor_guardado;
        int j;
        for(int i = 1; i < array.length; i++){
            valor_guardado = array[i];
            j = i -1;
            while (j >=0 && array[j] > valor_guardado){
                array[j+1] = array[j];
                j = j-1;

            }
            array[j+1] = valor_guardado;
        }

        return array;
    }
    
}
