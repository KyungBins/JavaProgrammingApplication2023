import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class FunctionallnterfaceTest {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = n -> n * n;
        System.out.println(square.apply(7));

        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(7, -11));

        Consumer<String> pokemon = (name) -> { // Consumer 는 return 안됨
            System.out.println(name + "!");
        };

        pokemon.accept("피카츄");
    }
}
