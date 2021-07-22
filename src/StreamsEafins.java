import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsEafins {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,10);

        Stream<Integer> st1 = list.stream().map(x -> x * 10); // copia e converte os valores da lista LIST para stream e os guarda num novo array
                                                              //o map DEVE estar na mesma linha de código da Stream.
//                                                            st1.map(x -> x * 10); -------  função map faz com que a expressão lambda seja aplicada para cada item da stream
        System.out.println(Arrays.toString(st1.toArray()));   //impressão deve ser feita dessa forma

//    ____________________________________________________________________________________________________________________________________________________________________________________________


        Stream<String> st2 = Stream.of("João, Lucas, Matheus");// Adiciona itens de acordo com o que foi declarado no começo da Stream, nesse caso = STRING

        System.out.println(Arrays.toString(st2.toArray())); // Impressão feita da mesma forma

//    ____________________________________________________________________________________________________________________________________________________________________________________________


        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); //o primeiro valor onde está digitado "0" é onde começa o loop, depois da "," é o statement, ordem que deve seguir
        System.out.println(Arrays.toString(st3.limit(10).toArray())); // Impressão feita de forma diferente por ser um looping potencialmente infinito, e para dar um "break" usamos o .limit(x) ((x == número de elementos a serem gerados)).

//    _________________________________________________________________________________________________________________________________________________________________________________________________________________________________________


    }

}
