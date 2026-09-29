public class merge {
    public static void main(String[] args) {
        String[] lista = {
            "Uva", "abacaxi", "Pêra", "manga", "Caju", "maçã",
            "Laranja", "banana", "Kiwi", "limão", "Abacate", "goiaba",
            "Morango", "acerola", "Pitaya", "caqui", "Jabuticaba",
            "amora", "Framboesa", "cereja"
        };

        mergeSortStr(0, lista.length, lista);

        mostrarAmostra(lista);
    }

    public static void mostrarAmostra(String[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    public static void mergeSortStr(int inicio, int tamanho, String[] v) {
        if (inicio < tamanho - 1) {
            int meio = (inicio + tamanho) / 2;
            mergeSortStr(inicio, meio, v);
            mergeSortStr(meio, tamanho, v);
            intercalarStr(inicio, meio, tamanho, v);
        }
    }

    public static void intercalarStr(int inicio, int meio, int tamanho, String[] v) {
        int i, j, k;
        String[] auxiliar = new String[tamanho - inicio];
        i = inicio;
        j = meio;
        k = 0;

        while (i < meio && j < tamanho) {
            if (v[i].compareTo(v[j]) <= 0) {
                auxiliar[k] = v[i];
                k++;
                i++;
            } else {
                auxiliar[k] = v[j];
                k++;
                j++;
            }
        }

        while (i < meio) {
            auxiliar[k] = v[i];
            k++;
            i++;
        }

        while (j < tamanho) {
            auxiliar[k] = v[j];
            k++;
            j++;
        }

        for (i = inicio; i < tamanho; i++) {
            v[i] = auxiliar[i - inicio];
        }
    }
}
