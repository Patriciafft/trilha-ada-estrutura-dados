
// foi criado um pacote para a classe Stack, pois não estava dando certo os dois métodos main
import stack.Stack;

public class Invert {

    public static void main(String[] args) {
        int[] numbers = { 5, 4, 3, 2, 1 };

        inverter(numbers);
    }

    private static void inverter(final int[] numbers) {

        Stack stack = new Stack(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }

        var node = stack.pop();
        while (node != null) {
            System.out.println(node.getValue());
            node = stack.pop();

        }

    }

}
