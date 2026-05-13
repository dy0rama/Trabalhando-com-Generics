void main() {
    List<Produto> produtos = new ArrayList<>();
    produtos.add(new Produto("Processador", 2399.99));
    produtos.add(new Produto("Placa de Video", 5299.99));
    produtos.add(new Produto("Monitor", 1199.99));
    produtos.add(new Produto("Placa-Mãe", 1499.99));
    produtos.add(new Produto("Memória RAM", 899.99));

    ListaUtil.ordenarExibir(produtos);
}
