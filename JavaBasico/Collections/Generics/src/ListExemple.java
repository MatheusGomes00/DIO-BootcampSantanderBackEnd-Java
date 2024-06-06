import java.util.ArrayList;
import java.util.List;

public class ListExemple {
    public static void main(String[] args) {
//        List listaSemGenerics = new ArrayList();
//        listaSemGenerics.add("Maverick");
//        listaSemGenerics.add(16);
//
//        for (Object elemento : listaSemGenerics) {
//            String str = (String) elemento;
//            System.out.println(str);
//        }

        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Maverick");
        listaGenerics.add(" .v8-");

        for (String elemento : listaGenerics){
            // System.out.println((String) elemento);
            String str = (String) elemento;
            System.out.println(str);
        }

    }
}
