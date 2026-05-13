import java.util.Collections;
import java.util.List;

public class ListaUtil {
    public static <T> void ordenarExibir(List<T> lista){
        lista.sort(Collections.reverseOrder());

        for(T item : lista){
            System.out.println(item);
        }
    }
}
