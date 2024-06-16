package implementation;

//sendo uma classe concreta e não abstrata, é obrigatório implementar todos os métodos da interface
public class SupermarketArray implements Supermarket {

    // como essa propriedade está como final, é obrigatório inicializar o vetor no
    // construtor
    private final String[] items;
    private int lastIndex;

    // construtor
    public SupermarketArray(final int size) {
        items = new String[size];
        lastIndex = -1;
    }

    @Override // adicionar elementos
    public void add(final String item) {
        if (lastIndex == items.length - 1) {
            System.err.println("Lista de supermercado cheia!");
        } else {
            lastIndex++;
            items[lastIndex] = item;
        }
    }

    @Override // printar a lista
    public void print() {
        System.err.println("##################################################################");
        if (lastIndex < 0) {
            System.out.println("Lista de supermercado vazia!");
        }
        for (int i = 0; i <= lastIndex; i++) {
            System.out.println(i + " - " + items[i]);
        }
        System.err.println("##################################################################");
    }

    @Override // deletar item da lista
    public void delete(final int index) {
        if (index >= 0 && index <= lastIndex) {
            shift(index);
            lastIndex--;
        } else {
            System.err.println("Índice inválido: " + index);
        }
    }

    private void shift(final int index) {
        for (int i = index; i < lastIndex; i++) {
            items[i] = items[1 + 1];

        }
    }
}
