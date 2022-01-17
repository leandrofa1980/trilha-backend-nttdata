<h1>
  🖥 Trilha BackEnd
</h1>


### Objetivo

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

---

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

---

<h2>
   Desafio 03
</h2>

### Objetivo

Entender o básico a respeito do protocolo HTTP, REST e Web API.

#### O que é o protocolo de comunicação HTTP e como ele funciona;

HTTP: HyperText Transfer Protocol(Protocolo de Transferência de HyperTexto) Protocolo é um conjunto de regras ele serve para transferência de HyperTextos que são textos com audios, videos, imagens, links para outros textos, etc, usamos frequentemente quando acessamos uma página web, o que acontece são trocas de mensagens modelo cliente-servidor, o cliente/browser faz um pedido/request informando uma ação por exemplo 'https://www.google.com' estamos usando uma URL para o servidor que devolve uma resposta/response do pedido que no nosso caso é a página do google.

#### O que é REST, e qual é a sua relação com o protocolo HTTP;

REST: Representation State Transfer(Transferência Representacional de Estado) trata-se de um conjunto de princípios e definições necessários para a criação de um projeto com interfaces bem definidas, usa XML ou JSON para se comunicar, faz suas chamadas via URL, REST utiliza o HTTP como protocolo de comunicação oficial, o HTTP permite criar, atualizar, pesquisar, executar e remover operações.

#### O que é Web API, e qual é a sua relação com REST;

APIs: Application Programming Interface(Interfaces de Programação de Aplicativos) são construções disponibilizadas em liguagens de programação para permitir que os desenvolvedores criem funcionalidades complexas com mais facilidade. Abstraindo códigos mais complexos, fornecendo uma sintaxe mais fácil de usar em seu lugar[developer.mozilla.org](https://developer.mozilla.org/en-US/docs/Learn/JavaScript/Client-side_web_APIs/Introduction). A arquitetura REST por ser mais leve significa que pode ser desenvolvida com menor esforço, tornando-os mais fáceis de serem adotados como parte de implementação de APIs.

#### Métodos HTTP:

GET: Solicita a representação de um recurso específico, retornam apenas dados.

POST: É utilizado para submeter uma entidade a um recurso específico, frequentemente causando uma mudança no estado do recurso.

PUT: Substitui todas as atuais representações do recurso de destino pela da requisição enviada.

DELETE: Deleta um recurso específico.

PATCH: É utilizado para aplicar modificações parciais em um recurso.

#### O que é Swagger?

Um ponto essencial em qualquer projeto é a documentação, algumas vezes negligenciado, uma aplicação que não tenha uma documentação pode dificultar o trabalho dos desenvolvedores e o entendimento por parte dos usuários de como a aplicação funciona. Para criar boas documentações a equipe pode fazer uso de ferrementas, uma delas é o Swagger uma aplicação opensource compsoto por diversas ferramentas que auxilia os desenvolvedores a criar, definir, documentar e consumir uma API, ele conta com ferramentas para definir uma estrutura, criar o esqueleto da API e testa sem que aconteça qualquer tipo de perda na aplicação.

---

<h2>
  Desafio 4
</h2>

### Objetivo

Entender o papel da camada de persistência, a abstração da linguagem dos bancos de dados criada pelas ferramentas de ORM
e a partir desse entendimento ser capaz de se comunicar com qualquer tipo de banco de dados independendo da sua
linguagem nativa.

#### O que é JDBC?

É uma API construida na linguagem Java que possibilita acessar um banco de dados através de drivers, composta por dois
componentes centrais, o primeiro formado pelos pacotes **java.sql** e **javax.sql** incluidos no JavaSE, que fornecem
classes e interfaces para o desenvolvimento de software que acessem qualquer fonte de dados, o segundo componente são os
drivers, responsáveis pela conexão e interação com um banco de dados específico, podemos considerar os drivers como um
tradutor das mensagens binárias trocadas com um protocolo de um SGBD.


#### O que é ORM, cite 3 exemplos?

ORM (Object Relational Mapper) ferramenta utilizada com o propósito de unir o mundo orientado a objetos e o mundo
relacional, quando trabalhamos com aplicações orientadas a objetos, para armazenar as informações nos banco de dados
relacionais encontramos um problema chamado impedância objeto-relacional devido a diferença entre os dois mundos, no
mundo relacional utilizamos de tabelas que representam o modelo da vida real, no mundo orientado a objetos fazemos o uso
de diversos elementos como classes e interfaces por exemplo. ORM define como os dados serão mapeados, acessados e
gravados.

###### Exemplos de ORMs:

- Hibernate
- EclipseLink
- TopLink

#### O que é JPA e qual a sua relação com os ORM's?

É uma API padrão do Java que dita como frameworks ORM devem ser implementados para prover a persistência de dados em
bancos relacionais, tem como base a JDBC abstraindo detalhes dessa API para simplificar o dia a dia do programador. Para
facilitar o uso de outras bibliotecas nos projetos foi criada a JPA padronizando o modelo de persistência, os ORMs são a
ponte entre o mundo da 'orientação a Objetos' com o 'relacional' do banco de dados e a JPA padroniza esse mapeamento
entre os mundos, facilitando o uso de outras bibliotecas por meio da troca dos JARs.

#### O que é Spring Data?

É um projeto da SpringSource com proposta de unificar e facilitar o acesso a diferentes tecnologias de armazenamento de
dados, é um projeto que contém subprojetos que são específicos para um determinado banco de dados, possue entre seus
recursos, repositório poderoso e abstração de mapeamento de objetos personalizados, derivação de consulta dinâmica a
partir de nomes de métodos de repositórios entre outros. O spring Data JPA é um módulo do Spring Data que torna mais
fácil implementar repositórios baseados em JPA, reduzindo o esforço para o que é realmente necessário, o Spring fornece
a implementação automaticamente.

#### O que caracteriza um projeto "CRUD básico"?

CRUD é o acrônimo da expressão em inglês Create(Criar), Read(Ler/Consultar), Update(Atualizar) e Delete(Deletar/Excluir)
, quatro operações básicas usadas em banco de dados relacionais que caracterizam um projeto CRUD, o paradigma CRUD é
comum na construção de aplicativos web, porque fornece uma estrutura memorável para lembrar os desenvolvedores de como
contruir modelos completos e utilizáveis.

- Create - É uma função que adiciona um nova entrada de dados no recurso correspondente.
- Read - É uma função chamada que simplesmente recupera o recurso e exibe o resultado.
- Update - Função que é usada quando precisamos alterar os valores das informações.
- Delete - Chamamos essa função quando precisamos remover valores do recurso.

Em um ambiente REST geralmente corresponde aos métodos HTTP - POST, GET, PUT, DELETE, respectivamente.

🖥 Referências:
- [www.alura.com.br/artigos/conhecendo-o-jdbc](https://www.alura.com.br/artigos/conhecendo-o-jdbc?gclid=Cj0KCQiAt8WOBhDbARIsANQLp97hNsa6bYXTH3Jcf9nfiLKZeNt_HX_pd5gKiDZ5YVzoOAMiRZG42MQaAtuqEALw_wcB)
- [www.devmedia.com.br/aprendendo-java-com-jdbc](https://www.devmedia.com.br/aprendendo-java-com-jdbc/29116)
- [www.devmedia.com.br/orm-object-relational-mapper](https://www.devmedia.com.br/orm-object-relational-mapper/19056)
- [www.treinaweb.com.br/blog/o-que-e-orm](https://www.treinaweb.com.br/blog/o-que-e-orm)
- [www.devmedia.com.br/introducao-a-jpa-java-persistence-api](https://www.devmedia.com.br/introducao-a-jpa-java-persistence-api/28173)
- [www.alura.com.br/conteudo/persistencia-jpa-introducao-hibernate](https://www.alura.com.br/conteudo/persistencia-jpa-introducao-hibernate)
- [www.spring.io/projects/spring-data](https://spring.io/projects/spring-data)
- [www.spring.io/projects/spring-data-jpa](https://spring.io/projects/spring-data-jpa)
- [www.codecademy.com/article/what-is-crud](https://www.codecademy.com/article/what-is-crud)
- [www.stackoverflow.com](https://pt.stackoverflow.com/questions/359961/o-que-caracteriza-um-projeto-crud-b%C3%A1sico)

<h2>
    Desafio 5
</h2>

### Objetivo

Conhecer uma nova camada de uma aplicação, entender a responsabilidade de cada camada e replicar seus conceitos para cada tipo de projeto.

#### Defina a responsabilidade das camadas 'entity', 'controller', 'repository' e 'service'.

Como dito antes o JPA é quem dita como devemos implementar para prover a comunicação com o banco de dados, junto com ela podemos usar camadas lógicas que fazem parte do sistema e rodam no lado do servidor conversando com o lado do cliente, a camada 'controller' faz esse papel é a ligação da aplicação com o backend ela recebe requisições e responde de acordo com o comportamento do sistema, temos outras camadas e suas responsabilidades, na camada 'service' ficam as regras de negócio da aplicação, 'repository' faz a ponte com o banco de dados, com ela temos acesso aos métodos da JPA referentes as operações de CRUD, todas essas camadas conversam com a 'entity' que contém classes com atributos básicos para persistência e as anotações JPA que utilizamos para mapear nossa aplicação no banco de dados, uma entidade representa, na Orientação a Objetos, uma tabela do banco de dados, e cada atributo dessa entidade representa uma linha dessa tabela.