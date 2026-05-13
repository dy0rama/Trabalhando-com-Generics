import java.text.NumberFormat;
import java.util.Locale;

public class Produto implements Comparable<Produto>{
    private final String nome;
    private final double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    private String formatarPreco(double preco) {
        NumberFormat formatador = NumberFormat.getCurrencyInstance(Locale.of("pt","BR"));
        formatador.format(preco);
        return formatador.format(preco);
    }


    @Override
    public int compareTo(Produto o) {
        return Double.compare(o.preco, this.preco);
    }

    @Override
    public String toString() {
        return getNome() + " - " + formatarPreco(getPreco());
    }
}
