A aplicação foi desenvolvida utilizando uma classe chamada Produto, que representa um produto contendo dois atributos principais: o nome e o preço. A classe implementa a interface Comparable<Produto>, permitindo definir uma regra natural de ordenação entre objetos do tipo Produto.
A ordenação foi feita com base no preço dos produtos, do menor para o maior. Para isso, o método compareTo() foi sobrescrito utilizando o método Double.compare(), que realiza a comparação correta entre valores do tipo double.
Além disso, foi criada uma classe utilitária chamada ListaUtil, responsável por conter um método genérico chamado ordenarExibir. Esse método recebe uma lista de qualquer tipo de objeto e utiliza o método Collections.sort() para realizar a ordenação automática da lista. Após ordenar os elementos, o método imprime os itens no console.
O uso de generics torna o método reutilizável para diferentes tipos de listas, desde que os objetos implementem a interface Comparable.
Também foi sobrescrito o método toString() na classe Produto, permitindo exibir as informações formatadas de maneira mais legível durante a impressão dos objetos.
Por fim, no programa principal, foi criada uma lista contendo diferentes produtos com nomes e preços variados. Essa lista foi enviada ao método ListaUtil.ordenarExibir(), que realizou a ordenação e exibiu os produtos organizados pelo preço em ordem crescente.
Com esse exercício, foram praticados os seguintes conceitos:

Criação de classes e objetos;
Encapsulamento;
Interface Comparable;
Sobrescrita de métodos (compareTo e toString);
Uso de Collections.sort();
Generics;
Manipulação de listas com List;
Ordenação de objetos personalizados.
