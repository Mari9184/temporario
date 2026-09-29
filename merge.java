public class merge{
    public class void main (String[]args){

        String[] lista = {"Uva", "abacaxi", "Pêra", "manga", "Caju", "maçã",
        "Laranja", "banana", "Kiwi", "limão", "Abacate", "goiaba",
      	"Morango", "acerola", "Pitaya", "caqui", "Jabuticaba",
        "amora", "Framboesa", "cereja"};

        public static void mostrarAmostra(int[]b){
            for (int i=0; i <b.length; i++){
                Sysstem.out.println(b[i]);
            }
        }

    }

    public static void mergeSortInt(int inicio, int tamanha, int[] v ){
        if(inicio < tamanha -1){
            int meio = (inicio+tamanha) /2;
            mergeSortInt(inicio, meio, v);
            mergeSortInt(inicio, meio, tamanha v);
            intercalarInt(inicio, meio, tamanha, v);
        }
    }

    public static void intercalarInt(int inicio, int meio, int tamanho, long[] v) {
        int i, j, k;
        long[] auxilair = new long[tamanho - inicio];
        i = inicio;
        j = meio;
        k = 0;

        while(i < meio && j < tamanho) {
            if (v[i] <=[j]) {
                auxiliar [k] = v[i];
                k++;
                i++;
            } else {
                auxiliar[k] = v[j];
                k++;
                j++;
            }
        }

        while(i < meio){
            auxiliar[k] = v[i];
            k++;
            i++;
        }

        while(j < tamanho){
            auxiliar[k] = v[j];
            k++;
            j++;
        }

        for (i = inicio; i < tamanho; i++){
            v[i] = auxiliar[i - inicio]
        }
    }

     public static void mergeSortStr(int inicio, int tamanha, int[] v ){
        if(inicio < tamanha -1){
            int meio = (inicio+tamanha) /2;
            mergeSortStr(inicio, meio, v);
            mergeSortStr(inicio, meio, tamanha v);
            intercalarStr(inicio, meio, tamanha, v);
        }
    }

    public static void intercalarStr(int inicio, int meio, int tamanho, long[] v) {
        int i, j, k;
        long[] auxilair = new long[tamanho - inicio];
        i = inicio;
        j = meio;
        k = 0;

        while(i < meio && j < tamanho) {
            if (v[i].compareTo([j])) {
                auxiliar [k] = v[i];
                k++;
                i++;
            } else {
                auxiliar[k] = v[j];
                k++;
                j++;
            }
        }

        while(i < meio){
            auxiliar[k] = v[i];
            k++;
            i++;
        }

        while(j < tamanho){
            auxiliar[k] = v[j];
            k++;
            j++;
        }

        for (i = inicio; i < tamanho; i++){
            v[i] = auxiliar[i - inicio]
        }
    }
}
