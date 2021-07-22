import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {

    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(1,2,3,4);
        List<Double> doubles = Arrays.asList(3.14, 6.28);
        List<Object> Objs = new ArrayList<Object>();//essa lista aceita qualquer variavel
        //copiar itens de uma lista para outra e adicionar os que sobrarem(funções)

        copy(ints, Objs); // copiar de ints para Objs
        printList(Objs); // printar a lista Objs
        copy(doubles, Objs); // copiar de doubles para Objs
        printList(Objs); // printar a lista Objs
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny){ // Função que recebe: (lista que extend Number e é o "canal" ou "origem", Lista que é super de Number (Object) e é o "destino"
        for(Number number : source){
            destiny.add(number); //pseudocódigo: para cada item NUMBER na minha lista SOURCE, adicionar a lista DESTINO(NUMBER)
        }
    }

    public static void printList(List<?> list){
        for(Object obj : list){ //pseudocódigo: para cada item OBJ na minha lista LIST, imprimir OBJ
            System.out.print(obj + " ");
        }
        System.out.println();
    }

}
