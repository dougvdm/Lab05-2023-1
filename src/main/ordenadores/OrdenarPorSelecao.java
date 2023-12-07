package ordenadores;

public class OrdenarPorSelecao implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        int posicao_menor;
        int valor_guardado;
        for(int i = 0; i < array.length; i++){
            posicao_menor = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[posicao_menor]){
                    posicao_menor = j;
                }
            }
            valor_guardado = array[posicao_menor];
            array[posicao_menor] = array[i];
            array[i] = valor_guardado;

        }

        return array;
    }
    
}
