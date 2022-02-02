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

---

<h2>
    Desafio 5
</h2>

### Objetivo

Conhecer uma nova camada de uma aplicação, entender a responsabilidade de cada camada e replicar seus conceitos para cada tipo de projeto.

#### Defina a responsabilidade das camadas 'entity', 'controller', 'repository' e 'service'.

Como dito antes o JPA é quem dita como devemos implementar para prover a comunicação com o banco de dados, junto com ela podemos usar camadas lógicas que fazem parte do sistema e rodam no lado do servidor conversando com o lado do cliente, a camada 'controller' faz esse papel é a ligação da aplicação com o backend ela recebe requisições e responde de acordo com o comportamento do sistema, temos outras camadas e suas responsabilidades, na camada 'service' ficam as regras de negócio da aplicação, 'repository' faz a ponte com o banco de dados, com ela temos acesso aos métodos da JPA referentes as operações de CRUD, todas essas camadas conversam com a 'entity' que contém classes com atributos básicos para persistência e as anotações JPA que utilizamos para mapear nossa aplicação no banco de dados, uma entidade representa, na Orientação a Objetos, uma tabela do banco de dados, e cada atributo dessa entidade representa uma linha dessa tabela.

---

<h2>Desafio 6</h2>

### Objetivo
É conhecer o funcionamento das classes de DTO e a importância dessa prática que tem como viés trazer maior segurança para nossa aplicação.

#### O que significa DTO, e qual sua importância?

DTO - (Data Transfer Object): é um padrão de projeto usado em Java para transporte de dados, tem o papel de carregar dados das entidades de forma simples, podendo inclusive "projetar" apenas alguns dados da entidade original, de forma simples provê exatamente aquilo que é necessário para um determinado processo.
Vantagens:
- Otimizar o tráfego (trafegando menos dados);
- Evitar que dados de interesse exclusivos do sistema fiquem sendo expostos, exemplo: senha, data de atualização, dados de auditória etc.
- Customizar os objetos trafegados conforme a necessiadade de cada requisição, por exemplo: para alterar um produto, você precisa dos dados A, B, C; já para listar os produtos apenas dos dados A, B e a categoria de cada produto.

---

<h2>Desafio 7</h2>

### Objetivo
É aprender os conceitos de validação, tratamento e manipulação de dados de forma otimizada.

---

<h2> Deasfio 8 </h2>

### Objetivo

Entender como funcionam as exceptions, e ser capaz de trata-las com o intuito de manter um bom funcionamento da API.

#### O que são exceptions?

De acordo com a documentação da Oracle "exceptions" é um evento que ocorre durante a execução de um programa, que interrompe o fluxo normal das instruções do programa. Quando um erro ocorre é criado um objeto chamado de exception object(objeto de exceção), que contém informações sobre o erro, tipo de erro e o estado do programa quando o erro ocorreu, esse processo é conhecido como lançar uma exceção, com a exceção lançada o sistema tenta encontrar algo para lidar com erro, pesquisando um método que contém um bloco de código que pode manipular a exceção, quando encontrado o bloco responsável por tratar a exceção faz todo o tratamento. Quando o método que faz o tratamento não é encontrado o o programa é encerrado.

#### Qual é o funcionamento do try, catch e finally?

O conjunto de blocos Try-Catch-Finally é o recurso, à nivel de linguagem de programação, criado para tratar exceções, no bloco try podemos tratar possíveis erros de forma mais robusta, há mais de uma maneira de se utilizar o try podemos colocar cada linha de código que possa lançar uma exceção dentro do seu próprio try e fornecer manipuladores de exceção separados para cada um, ou podemos colocar todo código em um único try e associar vários manipuladores a ele. Com o catch colocamos o tratamento para a exceção que eventualmente ocorra no bloco try, vem logo depois do try e cada bloco do catch é um manipulador de exceção que trata o tipo da exceção indicada por seu argumento, evitando que o programa seja finalizado ao encontrar uma exceção. O finally representa o trecho de código que será executado independente do fato deter ocorrido a exceção ou não, ele é util para mais do que apenas tratamento de exceção, por exemplo, evita que o programador permita que o código de limpeza seja ignorado acidentalmente por um return, continue, ou break, seguindo a documentação da Oracle é importante informar que o finally é uma ferramenta fundamental para evitar vazamentos de recursos.

#### Qual a relação entre “try, catch e finally” e “throws”?

Throws é uma palavra-chave usada em uma assinatura de método e declara quais exceções podem ser lançadas, pode ser útil para propagar exceções na pilha de chamada e permite que não sejam tratadas dentro do método. Quando um método declara que lança uma exceção, não é necessário trata-las, o chamador do método que lança a exceção deve manipula-las para que o fluxo do programa possa ser mantido.

#### Para que serve a annotation @ExceptionHandler?

É usada para tratar exceções de classes de manipulador expecíficas e/ou métodos de manipulador, esses métodos com essa anotação podem ter assinatura muito flexível, podendo aceitar argumentos de diferentes tipos.

#### Para que serve o comando throw?

É usada em um corpo de método ou qualquer bloco de código e é usada para lançar explicitamente uma única exceção, pode ser útil para lançar exceções com base em certas condições dentro de um bloco de código e para exceções personalizadas. As exceções marcadas e não verificadas podem ser marcadas pela palavra-chave throw, quando lançamos uma exceção com throw o fluxo  de execução do programa é interrompido e o controle é transferido para o bloco try-catch mais próximo que corresponde ao tipo de exceção lançada , se nenhuma correspondência for encontrada, o manipulador de exceção padrão encerra o programa.

#### Para que serve a annotation @ControllerAdvice?

É uma especialização da @Component para que seja detectada automaticamente por meio da varredura de caminho de classe, um Controller Advice é um tipo de interceptor que envolve a lógica em nossos Controllers e nos permite aplicar alguma lógica comum a eles, seus métodos são compartihados globalmente em vários componentes para capturar exceções e traduzi-las em respostas HTTP.

##### Referências:

- [https://rollbar.com/blog/how-to-use-the-throws-keyword-in-java-and-when-to-use-throw](https://rollbar.com/blog/how-to-use-the-throws-keyword-in-java-and-when-to-use-throw/#:~:text=The%20table%20below%20lists%20the%20difference%20between%20the,exception%20class%20name%20%201%20more%20rows%20)
- [https://docs.oracle.com/javase/tutorial](https://docs.oracle.com/javase/tutorial/essential/exceptions/definition.html)

---

<h2> Desafio 9</h2>

### Objetivo

Conhecer os principais modelos de design patterns, arquitetura de software e alguns princípios de qualidade de software,
com o intuito de conhecer fórmulas já validadas de construção de projetos que visam solucionar vários tipos de problemas de
gestão/organização do código/arquivos, reaproveitamento de código, limitações no desenvolvimento futuro, difícil manutenção, entre outros problemas já identificados pela comunidade e pelos criadores desses padrões e arquiteturas.

#### O que é um padrão de projeto e por que nós os utilizamos?

Descreve um conjunto composto por um contexto, um problema e uma solução. Em outras palavras pode-se descrever um padrão como uma solução para um determinado problema em um projeto de software, o padrão não é um código específico que colocamos dentro do que estamos desenvolvendo e sim um conceito geral, utilizamos o padrão de projeto para encontrar soluções que já tenham sido utilizadas com sucesso em mais de um contexto ou podemos adequa-las para solucionar um problema do projeto, além de melhorar a comunicação entre a equipe.

#### Cite e explique com suas palavras:

- Um dos padrões de criação: O Factory Method é um padrão que fornece uma interface para criar objetos e delegamos a instancia desses objetos para subclasses e por ser dirigido a interfaces se for preciso aumentar os recursos para o factory temos essa possibilidade sem ter que alterar o código.

- Um dos padrões estruturais: Adapter é um padrão de projeto estrutural que permite objetos com interfaces incompatíveis colaborarem entre si, um exemplo é quando temos um sistema que gera tudo em XML e queremos compartilhar o mesmo sistema em Json, com o adapter podemos utilizar o padrão para converter a interface de um objeto demaneira que outro objeto possa compreender as informações.

- Um dos padrões comportamentais: Chain of Responsability é um padrão de projeto comportamental que permite que você passe pedidos por uma corrente de handlers. Ao receber um pedido, cada handler decide se processa o pedido ou o passa adiante para o próximo handler na corrente.

#### Conceito de arquitetura de software e seu proposito:

Podemos dizer que arquitetura envolve as partes que são mais difíceis de mudar, está relacionada com decisões que devemos tormar no projeto que servem de base para o nosso software, é responsável pelo esqueleto e pela infraestrutura de alto nível de um software, é importante para automatizar novos processos ou melhorar os que já existem. Tem como proposito software com flexibilidade, escalabilidade, viabilidade, reutilização e segurança em soluções estruturadas que atenda às expectativas técnicas e de negócios.

#### Qual arquitetura estamos seguindo até o momento? Justifique sua resposta.

Estamos seguindo a arquitetura de camadas, onde destacamos a organização das responsabilidades de cada camada, deixando ela reutilizavél, hoje soluções rodando em browsers, celulares e outros dispositivos mostra que o uso de camadas tem grande valor, o uso de camadas é algo importante na organização e estruturação e quando bem utilizada contribui para que partes do software sejam reutilizáveis e substituíveis, o que indiretamente reflete em menos refatoração e maior qualidade.

#### O que significa a sigla SOLID?

SOLID é um conjunto de princípios e boas práticas para melhorar o design de software e arquitetura, tornando-os mais fáceis de manter, escalar e testar. O nome SOLID é um acrônimo mnemônico dos princípios introduzidos por Robert “Uncle Bob” Martin:
- Single Responsibility (Responsabilidade Única): Ter somente um princípio, uma responsabilidade, não ter uma classe com muitos métodos que não tem função específica, criar uma classe com um só objetivo;
- Open Closed (Aberto Fechado): Esse princípio diz que deve ser aberto para extensões e fechado para modificações;
- Liskov Substitution (Substituição de Liskov): Uma classe derivada pode e deve ser substituível por sua classe base, trabalhar com estruturas semelhantes, se caso precise trocar ou extender métodos o código não ficara engessado;
- Interface Segregation (Segregação de Interfaces): O princípio fala em quebrar interfaces maiores em menores, os clientes não devem ser forçados a depender de métodos que eles não utilizam, podemos envolver nesse contexto classes abstratas também;
- Dependence Inversion (Inversão de Dependências): Com esse princípio vamos desacoplar modulos por meio da inversão de dependência, todo sistema é dividido em dois modulos os de alto nível e os de baixo nível, nesse princípio os de alto nível não podem depender dos de baixo nível e ambos devem depender de abstrações e as abstrações não devem depender de detalhes.

####  Quais princípios foram utilizados no projeto até o momento? Explique.

Utilizamos em nosso projeto os princípios de Single Responsability pois nossas classes tem sua única responsabilidade, temos controller que faz a integração com o frontend utilizando de endpoints, service com toda a lógica de negócios, repository integrando com o banco de dados e as excepitions responsáveis por informar ao usúario de forma mais elegante erros na aplicação, o princípio de Open Closed quando estendemos da JpaRepository para usar o métodos no CRUD, quando utilizamos as classes DTO estamos usando o princípio de Liskov Substitution pois temos estruturas semelhantes e substituimos nossa classe base para maior segurança de informações.



#### Referências:

- [medium.com/@jeziellago/arquitetura-de-software](https://medium.com/@jeziellago/padr%C3%B5es-de-arquitetura-de-software-parte-i-a1d23c323a40)
- [www.igti.com.br/blog/arquitetura-de-software](https://www.igti.com.br/blog/arquitetura-de-software-definicao-negocios)
- [dev.to/oieduardorabelo](https://dev.to/oieduardorabelo/arquitetura-de-software-a-diferenca-entre-arquitetura-e-design-1j9e)
- [guia.dev/pt/pillars/software-architecture](https://guia.dev/pt/pillars/software-architecture/layers.html)
- [guia.dev/pt/pillars/software-architecture/layers-and-architecture-patterns](https://guia.dev/pt/pillars/software-architecture/layers-and-architecture-patterns.html)
- [www.venturus.org.br/o-que-e-solid/](https://www.venturus.org.br/o-que-e-solid/#:~:text=O%20nome%20SOLID%20%C3%A9%20um%20acr%C3%B4nimo%20mnem%C3%B4nico%20dos,de%20Interfaces%29%3B%20e%20Dependence%20Inversion%20%28Invers%C3%A3o%20de%20Depend%C3%AAncias%29.)





















