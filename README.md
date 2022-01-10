<h1>
  🖥 Trilha BackEnd
</h1>

---

## Objetivo

Esse é o início da minha jornada junto com a NTT DATA por meio de desafios que tem a missão de capacitar nos pontos de vista técnico e profissional para se tornar um desenvolvedor.

No primeiro desafio o objetivo é realizar o entendimento do que é um sistema de controle de versão, quais suas vantagens e exemplos de controle de versão.

### O que é um Sistema de Controle de Versão (VCS)?

São ferramentas utilizadas para gerenciar e rastrear toda evolução ao longo do tempo do projeto, em um artigo que li no site da Devmedia "o controle de versão é visto como uma extensão natural do processo de desenvolvimento", pelos problemas que todo projeto está sujeito, é possível utilizando o controle de versão ver quem modificou pela última vez o arquivo, reverter uma modificação, trabalhar de forma paralela no mesmo arquivo e tem o objetivo de facilitar toda e qualquer movimentação. É no repositório que fica toda a história ao longo do tempo do desenvolvimento, ele é parte principal do sistema de controle de versão, sem o uso do sistema de controle de versão(VCS) podem ocorrer vários problemas e dificuldades ao projeto.

### Vantagens

- Uma das vantagens de utilizar o VCS é que equipes de outros lugares do país ou planeta podem trabalhar em um mesmo projeto;
- É importante citar o uso de ramificações ou branching, de forma simples podemos criar a partir de um ponto do projeto principal caminhos alternativos (ramos iguais uma árvore) onde é possível mudar partes do código ou testar uma nova implementação, mantendo um registro das alterações separadamente;
- Assim como criar caminho alternativos podemos juntar os caminhos em um só, mesclando suas alterações ao código principal;
- O VCS tem um histórico das alterações dos arquivos ao longo do projeto, facilitando a recuperação de versões do código, o que foi alterado, por quem foi alterado, entre outros;
- Não deixando de citar a autonomia, o desenvolvimento é feito localmente o uso da rede é pouco necessário.

### Exemplos de VCS:

- CVS - é uma das ferramentas de controle de versão mais antigas, a primeira versão foi desenvolvida em 1968, foi inicialmente baseado em um sistema de controle de versão bastante simples o RCS (_Revision Control System_).

- Sudversion - é uma ferramenta bastante utilizada no meio corporativo, é bastante rápida na execução das funcionalidades do sistema e ainda se mostra como uma das mais simples de ser empregada.

- Git - é a ferramenta mais popular atualmente, um dos motivos é por ser open source e o uso da plataforma de hospedagem de códigos GitHub.

Pesquisa dos exemplos feita em - [gaea.com.br](https://gaea.com.br/conheca-5-ferramentas-de-controle-de-versao-de-software/)

<h2>
  Desafio 02
</h2>


### Objetivo

Nessse segundo desafio o objetivo é entender o conceito de POO, entender cada um dos seus pilares e as possibilidades que eles nos proporcionam.

#### O que é programação orientada a objetos(POO), cite seus pilares?

Qualquer coisa que pertence ao mundo físico pode ter um representante na esfera digital, orientação a objetos se baseia na representação dos elementos do mundo real, suas características e seus comportamentos, é um paradigma de programação que define um sistema através da interação e composição de diversas unidades chamadas objetos, na programação um objeto é uma unidade de ‘software’ utilizada para representar algo existente no mundo real exemplo um carro, um animal, entre outros. Uma linguagem para ser considerada no paradigma orientado a objetos precisa atender quatro pilares muito importantes: Abstração - Encapsulamento - Herança - Polimorfismo.

#### Abstração

Um dos pilares mais importantes, é onde devemos destacar as principais características do objeto e o que esse objeto irá realizar no nosso sistema, três pontos devemos considerar - uma identidade única ao objeto, as características do objeto e por fim as ações que o objeto irá executar. Um exemplo de abstração é quando utilizamos um carro sabemos ligar o carro, dirigir até nosso destino, não sabemos como é o funcionamento interno, o que acontece no motor por exemplo.

#### Encapsulamento

É um princípio que consiste em esconder detalhes de implementação de uma classe, deixando apenas exposto operações seguras e mantenham os objetos em um estado consistente, em algumas linguagens o encapsulamento é feito em propriedades privadas que só podem ser acessadas ou alterada por meio dos métodos 'getters' e ‘setters’. Exemplo de encapsulamento: no cadastro de uma pessoa vamos precisar do nome e do CPF que um registro único de cada pessoa aqui no Brasil e não pode ser alterado então precisamos limitar o acesso para não acontecer uma alteração, caso aconteça dessa pessoa casar seu nome pode ter uma alteração.

#### Herança

É a capacidade de um componente do sistema chamada 'classe' herdar características de outro componente/classe, com a herança fazemos o reuso do código que é uma vantagem e otimiza a produção da aplicação. Exemplo vamos imaginar uma família uma criança herda características dos pais que por sua vez herdam características dos avós e assim sucessivamente.

#### Polimorfismo

É a capacidade dos objetos de uma classe responderem a um mesmo método de formas diferentes dependendo do contexto. 'É definido como um princípio a partir do qual as classes derivadas de uma única classe base conseguem invocar os métodos que, embora apresentem a mesma assinatura, comportam-se de maneira diferente para cada umas das classes derivadas'. Como exemplo temos em casa dois objetos: televisão e geladeira que possuem um método ou ação de ligar e esses objetos não são ligados da mesma forma.

#### Vantagens

Primeira – Todo software orientado a objeto é confiável (ao alterar uma parte nenhuma outra é afetada)

Segunda – O software orientado a objeto é oportuno (ao dividir tudo em partes, várias delas podem ser desenvolvidas em paralelo)

Terceira – O software orientado a objeto é manutenível (atualizar um software é mais fácil, uma pequena modificação beneficia todas as partes que usarem o objeto)

Quarta – Ele também é extensível (o software não é estático, deve crescer para permanecer útil)

Quinta – O software orientado a objeto é reutilizável (podemos usar o objeto de um sistema que criamos em outro sistema que viermos a criar)

Pesquisa das vantagens feita em: [apexensino.com.br](https://apexensino.com.br/o-que-e-programacao-orientada-objetos/)

