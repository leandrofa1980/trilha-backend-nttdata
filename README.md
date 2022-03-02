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
   Desafio 3
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

---

<h2>Desafio 10</h2>

### Objetivo

Se aprofundar no universo Spring, conhecendo um pouco mais de perto seu repertório e funcionalidades, saber montar um ambiente Spring, criar uma nova aplicação, realizar as configurações necessárias, aproveitar as facilidades que a ferramenta trás, acelerando o desenvolvimento e otimizando a  performance da aplicação.

#### O que você entende por Spring Framework?

O Spring é um framework Java criado para facilitar o desenvolvimento de aplicações, explorando, para isso, os conceitos de inversão de controle e injeção de dependências, com ele temos uma tecnologia que nos fornece não apenas recursos necessários à grande parte das aplicações, como módulo para persistência de dados, integração, segurança, testes, desenvolvimento web, legibilidade de código maior, implementações com menos código, facilidade na manutenção do código e entrega mais rápida.

#### Cite 3 exemplos de ferramentas Spring e suas respectivas finalidades:

- Spring Data: Fornece um modelo de programação consistente baseado em Spring para acessar dados, facilitando o uso de bancos relacionais e não relacionais, também chamado de projeto guarda-chuva que contém subprojetos específicos para um determinado banco de dados.
- Spring Security: Se concentra em fornecer autenticação e autorização para aplicativos Java. O verdadeiro poder do Spring Security é encontrado na facilidade com que ele pode ser estendido para atender aos requisitos personalizados.
- Spring Web Services: Focado em facilitar a criação de serviços Web orientados a documentos, visa facilitar o desenvolvimento de serviços SOAP com contrato em primeiro lugar, permitindo a criação de serviços web flexíveis usando maneiras de manipular cargas XML.

#### Quais ferramentas do Spring foram utilizadas na trilha até o momento?

Utilizamos na trilha: Spring actuator, Spring Data JPA, Validation, Web, Spring Devtools, H2, Lombok.

#### Cite 5 vantagens em utilizar Spring:

- Uma das vantagens do Spring é que ele fornece a maioria dos componentes necessários em uma aplicação de maneira pré-configurada, tornando possível termos uma aplicação rodando em produção rapidamente com o minimo de esforço de configuração.
- Facilitando ainda mais, temos disponibilizado o Spring Initializr que podemos habilitar os módulos desejados em nosso projeto, gerando um projeto Maven ou Gradle com todos os componentes solicitados e podemos começar a trabalhar com o desenvolvimento do código.
- O Spring tem um servidor embarcado, então não precisamos baixar um servidor para fazer testes em desenvolvimento como em produção, por padrão o Spring tem o Tomcat configurado como servidor web.
- Fazendo o uso do Devtools conseguimos renicializar nossa aplicação a cada alteração que fazemos, tem integração com o livereload que automatiza a cada alteração na aplicação.
- Com o Spring temos o benefício de otimizar nosso tempo e aumentar a produtividade, ou seja, não temos que gastar tempo desenvolvendo uma aplicação do zero, recebemos do Spring a maioria dos recursos necessário.

#### Descreva os passos de criação de uma Web API Spring boot, com conexão com SQL Server:

- Iniciamos nossa Web API pelo site do [https://start.spring.io/](https://start.spring.io/), escolhemos o tipo do projeto que queremos criar Maven ou Gradle e qual linguagem de programação, o Spring Initializr vem com a versão estável marcada, pode escolher outra versão se prefirir, em Porject Metadata vamos configurar o projeto com o grupo, nome do projeto, nome do pacote, qual pacote (Jar ou War) e versão da linguagem. Em Dependencies vamos escolher quais dependências queremos em nosso projeto, vamos utilizar Spring Web para que nossa aplicação contenha o Tomcat, um banco de dados para salvar, alterar , remover, ou pesquisar por dados, aqui vamos utilizar o Mysql e o Spring Data Jpa para persistir e mapear nossas classes no banco de dados de maneira automática. Agora vamos gerar nosso projeto clicando em generate, um arquivo zip será baixado.
- Nosso próximo passo é configurar o projeto em uma IDE de sua escolha, primeiro vamos configurar o o drive do Mysql, em application.properties vamos passar uma URL informando qual o tipo do banco de dados, que é mysql, e a porta onde o banco vai rodar, é preciso passar um parâmetro chamado creatDatabaseIfNotExist como true, caso não exista um banco de daods esse parâmetro cria um, completando com o serverTimezone como UTC, evitando que ocorra algum erro. Agora é preciso passar o usúario e uma senha, assim teremos acesso ao banco de dados, vamos editar o application.properties e passar um usúario e senha, em alguns casos a senha pode ser vazia, para que nossas entidades sempre atualizem temos que definer a propriedade do ddl-auto e definir como update para que o banco de dados atualize junto com nossas entidades, nosso arquivo application.properties está pronto:

spring.datasource.url=jdbc:mysql://localhost:3306/produtos?createDatabaseIfNotExist=true&amp;serverTimezone=UTC
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update

#### Qual a funcionalidade do pom.xml?

Significa Project Object Model, é um arquivo XML que reside no diretório base do projeto, contém informações sobre o projeto e vários detalhes de configuração usados pelo Maven, ao executar uma tarefa ou objeto, o Maven procura o pom no diretório, obtém as informações necessárias e, em seguida, executa. É nele também que adicionamos as dependências de outras bibliotecas que utilizamos no projeto.

#### Qual a funcionalidades do applications.properties?

É um armazenamento chave-valor para propriedades de configuração, é uma ótima opção para uma determinada aplicação que necessita de configurações externas e não pode ser alterada. Um exemplo seria um programa que conecta a um banco de dados e precisa de dados para realizar a conexão, sem que o código fonte do mesmo seja alterado.

#### Qual o propósito das Annotations?

Introduzidas no Java 5 as Annotations são utilizadas para anotar métodos, campos e classes, essas marcações seram tratadas pelo compilador, ferramentas de desenvolvimento e bibliotecas, as anotações são colocadas em cima da classe, método ou atributo que desejamos referenciar.

#### Cite 10 annotations, com suas respectivas finalidades e descreva ou desenhe um cenário exemplificando a sua utilização:

- @SpringBootAplication

Usamos essa anotação para marcar a classe principal de uma aplicação Spring Boot e habilitar uma série de recursos, por exemplo, configuração Spring baseada em Java, varredura de componentes e recursos de configuração automatica do Spring Boot.
```bash
    @SpringBootApplication
    public class ControlFinancesApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(ControlFinancesApplication.class, args);
        }
    }
```
- @Controller

É uma anotação de nível de classe que informa ao Spring Framework que esta classe serve como um Spring MVC Controller.
```bash
    @Controller
    public class VehicleContorller {
    // ...
    }
```
- @Service

Usamos a esta anotação para indicar que uma classe pertence a camada de serviço que contém a lógica de negócios de uma aplicação.
```bash
    @Service
    public class VehicleService {
    // ...
    }
```
- @Repository

As classe DAO ou Repository geralmente representam a camada de acesso ao banco de dados em uma aplicação e devem ter essa anotação.
```bash
    @Repository
    public class VehicleRepository {
    // ...
    }
```
- @ExceptionHandler

Com esta anotação podemos declarar um método de tratamento de erros personalizados, o Spring chama esse método quando quando um manipulador de solicitações lança qualquer uma das exceções especificadas.

A exceção capturada pode ser passada para o método como argumento:
```bash
    @ExceptionHandler(IllegalArgumentException.class)
    void onIllegalArgumentException(IllegalArgumentException exception){
    // ...
    }
```
- @PathVariable

Esta anotação indica que um argumento de método está vinculado a uma variável de modelo URI. Podemos especificar o modelo URI com a anotação @RequestMapping e vincular um argumento de método a uma das partes do modelo com @PathVariable.
```bash
    @RequestMapping("/{id}")
    Vehicle getVehicle(@PathVariable("id") long id) {
    // ...
    }
```
- @GetMapping

Anotação para mapear solicitações HTTP em métodos específicos de manipulador GET, simplificando utiliza o verbo GET buscando informações do banco de dados.
```bash
    @GetMapping("/read")
    public ResponseEntity<List<Category>> read(){
    // ...
    }
```
- @PostMapping

Utiliza o verbo POST para inserir novos dados no banco de dados, mapear solicitações HTTP POST em métodos específicos de manipulador.
```bash
    @PostMapping("/employees")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
    return employeeRepository.save(employee);
    }
```
- @PutMapping

Utilizamos essa anotação para atualizar o recurso usando o método HTTP PUT específico de manipulador em campos do banco de dados.
```bash
    @PutMapping("/update/{id}")
    public ResponseEntity<Entry> update(@Valid @PathVariable("id") Long id, @RequestBody EntryDto entryDto){
    return ResponseEntity.ok(entryService.update(id, entryDto));
    }
```
- @DeleteMapping

Anotação para mapear solicitações HTTP DELETE que usa o verbo DELETE para excluir dados do banco de dados.
```bash
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
    entryService.delete(id);
    return ResponseEntity.noContent().build();
    }
``` 
#### O que é um advice em Spring? Quais os tipos de advice para o Spring?

É a ação executada pelo aspecto em um join point particular, esta ação pode executar antes, após ou memo envolver o join point para decidir se o mesmo deve ser executado. O principal objetivo dos aspectos é apoiar preocupações transversais, como registro, perfil, cache e gerenciamento de transações.

Tipos de advice:

- Before: Advice que executa antes do join point, mas não tem o poder de evitar que o join point execute;

- After returning: Advice que executa após o join point apenas se este terminar de forma bem sucedida;

- After throwing: Advice que executa após o join point quando ele finaliza enviando uma exceção;

- After (finally): Advice que executa após o join point independentemente de sua forma de retorno;

- Around: Advice que envolve a execução de um join point. Este é o tipo mais poderoso de advice, pois pode realizar ações antes e após a execução do join point. Também é de sua responsabilidade decidir se o join point deve ou não ser chamado.

#### Como adicionamos segurança à nossa aplicação Spring?

Utilizamos o Spring Security que é uma estrutura de autenticação e controle de acesso poderosa e altamente personalizável. É o padrão de fato para garantir aplicações baseadas no Spring, é uma estrutura que se concentra em fornecer autenticação e autorização para aplicações Java. Como todos os projetos do Spring o verdadeiro poder da segurança é encontrado na facilidade com que ele pode ser estendido para atender aos requisitos personalizados.

#### Qual é o pacote Spring responsável pelas conexões com os bancos de dados?

- Spirng Data - Tem a missão de facilitar o acesso a bancos de dados relacionais e não relacionais.

#### Explique e exemplifique como criar um agendamento de execução de métodos Spring; Cite exemplos de usabilidade:

Para criar um agendamento podemos usar a anotação @Scheduled do Spring, seguindo algumas regras para usar esse método:

- o método deve normalmente ter um tipo de retorno vazio(se não o valor devolvido será ignorado;
- o método não deve esperar quaisquer parâmetros.

Vamos ativar tarefas de agendamento por meio da anotação @EnableScheduling, vamos começar configurando uma tarefa para executar após um atraso fixo, esta opção deve ser usada quando cada execução da tarefa for independente:

    @Scheduled(fixedRate = 1000)
    public void scheduleFixedRateTask() {
    System.out.println(
    "Fixed rate task - " + System.currentTimeMillis() / 1000);
    }

Se quisermos apoiar o comportamento paralelo em tarefas programadas, precisamos adicionar a anotação @Async:
```bash
    @EnableAsync
    public class ScheduledFixedRateExample {
    @Async
    @Scheduled(fixedRate = 1000)
    public void scheduleFixedRateTaskAsync() throws InterruptedException {
        System.out.println(
        "Fixed rate task async - " + System.currentTimeMillis() / 1000);
        Thread.sleep(2000);
        }
    }
```
#### Referências:

- [tutorialspoint.com/maven](https://www.tutorialspoint.com/maven/maven_pom.htm)
- [guilherme-manzano.medium.com/guia-do-spring-framework](https://guilherme-manzano.medium.com/guia-do-spring-framework-spring-boot-spring-mvc-spring-rest-jpa-hibernate-spring-security-6476ca4dbe13https://blog.geekhunter.com.br/tudo-o-que-voce-precisa-saber-sobre-o-spring-boot/)
- [devmedia.com.br/spring-produtividade-e-qualidade-no-desenvolvimento](https://www.devmedia.com.br/spring-produtividade-e-qualidade-no-desenvolvimento/23311)
- [alura.com.br/artigos/primeiros-passos-spring](https://www.alura.com.br/artigos/primeiros-passos-spring)
- [spring.io/projects/spring-framework](https://spring.io/projects/spring-framework)
- [dzone.com/articles/the-springbootapplication-annotation](https://dzone.com/articles/the-springbootapplication-annotation-example-in-ja)
- [baeldung.com/spring-mvc-annotations](https://www.baeldung.com/spring-mvc-annotations)
- [javaguides.net/2018/11/spring-getmapping-postmapping-putmapping-deletemapping](https://www.javaguides.net/2018/11/spring-getmapping-postmapping-putmapping-deletemapping-patchmapping.html)
- [devmedia.com.br/programacao-orientada-a-aspectos-com-o-spring-framework](https://www.devmedia.com.br/programacao-orientada-a-aspectos-com-o-spring-framework-2-0/6781)
- [baeldung.com/spring-scheduled-tasks](https://www.baeldung.com/spring-scheduled-tasks)

---

<h2> Desafio 11 </h2>

### Objetivo

Entender para que servem as libs, e como funciona o gerenciamento de dependências de um projeto.

#### O que são libs quando se trata de código?

A definição de libs no wikipedia diz que é uma coleção de subprogramas utilizados no desenvolvimento de software. Tem como função facilitar o desenvolvimento garantindo mais agilidade e menos erro, geralmente essa coleção é criada por outros desenvolvedores que resolveram determinado problema e que já foram testadas.

#### Cite 2 libs populares no Java e seu objetivo

- Apach Commons:
  Estende muitas das bibliotecas Java Core, compreende 43 bibliotecas modulares que abrange domínios como Coleções, Matemática, Classes, Banco de dados entre outros;


- Jackson:
  Processa dados para Java, no desenvolvimento processamos dados formatados, uma maneira de transferir dados é por meio de Json que é um formato moderno de troca de dados. Com o Jackson podemos converter POJO em dados ou gerar POJO a partir de dados com a ajuda das anotações de Jackson.

#### Qual é o propósito do Maven, e qual é o seu relacionamento com o arquivo pom.xml?

É uma ferramenta de automação e gerenciamento de projetos Java, é responsável por gerar relatórios de produtividade, garantir execução de teste, gerenciar dependências, controlar versão de artefatos dentre outras, o Maven tem a facilidade de trabalhar com vários módulos de um mesmo sistema e extensão para novar funcionalidades por meio de plugins, além de estimular boas práticas. No arquivo pom.xml contém todas as configurações que o Maven necessita para interagir, ele pode ser simples possuindo as coordenadas do projeto, ou complexo, relacionando dependências, repositórios de plugins, plugins específicos, estrategias de construção de projetos, perfis, entre outros. 

#### Qual é a diferença do Maven para o Grandle?

São duas ferramentas para o processo de build de um projeto em qualquer linguagem JVM. O Gradle é uma ferramenta mais robusta, os scripts do Gradle são declarativos, de fácil leitura, escreve código em Groovy ao invés de XML, gestão de dependências robusta, build escaláveis, tem suporte corporativo build contínuo entre outros.

#### Com os conhecimentos adquiridos até o agora, realize uma conexão com o desafio 3 onde falamos sobre JDBC, os drivers de comunicação com os bancos de dados.

#### I. Qual a relação entre os termos lib, driver e JDBC?

O JDBC é baseado em drivers, para funcionar os drivers precisam estar carregados na memória, no lib ficam os arquivos .jar e as bibliotecas externas.

#### II. Como é adicionado uma lib no projeto?

Utilizando o Maven pelo seu gerenciador.

#### III.  Escolha  um  banco  de  dados  (menos  o  H2)  e  explique  como  utilizar  o  driver  de  comunicação.


Primeiro precisamos instalar a dependência do banco de dados no pom.xml, agora precisamos configurar o driver do banco de dados em application.properties, passando uma URL com o driver, porta onde o banco vai rodar, alguns drivers já vem com a porta default se utilizarmos outra porta devemos informar qual é essa porta, o nome do banco de dados seguido do time zone, usúario e senha, para ter uma comunicação com o banco.

#### Referências

- [wikipedia.org](https://pt.wikipedia.org/wiki/Biblioteca_(computa%C3%A7%C3%A3o))
- [ichi.pro/pt/as-10-principais-bibliotecas](https://ichi.pro/pt/as-10-principais-bibliotecas-que-todo-desenvolvedor-java-deve-conhecer-61422653275988)
- [devmedia.com.br/introducao-ao-maven](https://www.devmedia.com.br/introducao-ao-maven/25128)
- [dclick.com.br/entendendo-archetypes-do-maven](https://www.dclick.com.br/2011/03/28/entendendo-archetypes-do-maven/)
- [devmedia.com.br/jdbc-tutorial](https://www.devmedia.com.br/jdbc-tutorial/6638)
- [giuliana-bezerra.medium.com](https://giuliana-bezerra.medium.com/gerenciador-dependencias-com-o-mavem-em-projetos-java-6703fce91fb6)

---

<h2>Desafio 12</h2>

### Objetivo

Entender sobre testes unitários, stack tracer(pilha de erros) compreendendo melhor o funcionamento do código, e análise de um possível erro no sistema.

#### Explique o conceito de teste unitário?

Teste unitário compreende em verificar a menor parte de uma aplicação, em linguagens orientada a objetos, essa menor parte pode ser um método de uma classe, ou função em linguagem de paradígma funcional. 

#### Descreva como fazer um código de teste:

É preciso criar uma classe testes no pacote de testes, usamos a anotação @Test para o Junit entender que é um método testável, o nome do nosso método deve mostrar o que exatamente queremos que ele faça exemplo: 'somarDoisValores', agora vamos indicar o que queremos passando duas variáveis referente aos valores da soma, vamos cria nosso objeto e chamar o método que queremos testar, agora usamos o assert que realiza o teste comparando o resultado ou o comportamento do código sendo testado, no nosso exemplo o 'assertEquas' indica que estamos querendo afirmar algo. Pronto nosso teste comportando-se como projetado será validado.

Código exemplo:
```bash
public class AdicaoTeste {
  @Test
  public void somarDoisValores(){
    int a = 1;
    int b = 2;
    Adicao adicao = new Adicao();
    int soma = adicao.soma(a, b);

    assertEquals(3, soma);
  }
}
```

#### Qual o intuito do teste unitário?

É importante saber que testes unitários servem para garantir que uma aplicação continue funcionando após alterações em sua base de código. Teste unitário precisa funcionar isoladamente para funcionar rapidamente, é esperado no teste unitário validar que cada unidade de trabalho se comporte como projetada, esperada ou pretendida, mas o teste unitário tem o verdadeiro propósito de fornecer um feedback sobre o projeto e a implementação do código.É importante saber que testes unitários servem para garantir que uma aplicação continue funcionando após alterações em sua base de código.

#### Quais  são  as  ferramentas  que  utilizamos  para  realizar  testes  unitários cite 2:

- Junit é uma API de código aberto para criação de testes unitários em Java, fornece anotações e métodos que precisamos para nossos teste, foi a primeira criada para esse fim e que influenciou o surgimento de muitas outras.

- PyUnit é uma biblioteca para realização de testes unitários em Python baseada na arquitetura xUnit, foi criada com o intuito de trazer todos os recursos que já haviam no Junit, o PyUnit evoluiu a explorar plenamente os recursos da linguagem e se adequar ao jeito pythonico de escrever código.

#### Referências

- [digite.com/pt-br/agile/testes-unitarios/](https://www.digite.com/pt-br/agile/testes-unitarios/)
- [devmedia.com.br/e-ai-como-voce-testa-seus-codigos](https://www.devmedia.com.br/e-ai-como-voce-testa-seus-codigos/39478#:~:text=O%20que%20s%C3%A3o%20testes%20unit%C3%A1rios%3F%20Os%20testes%20unit%C3%A1rios,a%20partir%20da%20cria%C3%A7%C3%A3o%20de%20classes%20de%20testes.)
- [devmedia.com.br/test-driven-development](https://www.devmedia.com.br/test-driven-development-tdd-simples-e-pratico/18533)
- [devmedia.com.br/exemplo/documentacao-junit](https://www.devmedia.com.br/exemplo/documentacao-teste-unitario/84?parte=25)
- [devmedia.com.br/exemplo/documentacao-teste-unitario](https://www.devmedia.com.br/exemplo/documentacao-teste-unitario/84?parte=10)

---

<h2>Desafio 13</h2>

### Objetivo

Praticar o processo de integração, e entender a importancia de seguirmos à risca os contratos, entender a relevãncia de mudar uma letra ou alterar um campo.

---

<h2>Desafio 14</h2>

### Objetivo

Sintetizar os conhecimentos adquiridos ao longo desse percurso.

#### a) Desafio 1 - Git:

I. Dê 2 exemplos de situações onde é necessário utilizar o merge:

- Quando queremos fazer alterações sem afetar o código principal e testa-las para verificar se funcionam corretamente, podemos criar uma nova branch(ramo), tudo ocorrendo bem, podemos juntar tudo no código principal utilizando o merge do git para incorporar as alterações.
- Em projetos com equipes de desenvolvedores cada um pode ter de uma cópia do projeto para desenvolver, finalizando o projeto ou sua parte no desenvolvimento utilizamos o merge para unificar todo o projeto.

II. Com qual objetivo realizamos o commit?

- Para criar pontos na história do desenvolvimento, commits são peças individuais da história armazenadas pelo repositório, com o atributo -m acrescentamos uma mensagem para identificar o que foi feito no desenvolvimento, uma informação relevante é que em cada commit o git armazena quem fez o commit utilizando do e-mail e do nome do usúario.

III. Qual a diferença entre:

- git add -all: Atualiza o índice não apenas onde possui um arquivo correspondente mas também onde o índice já possui uma entrada.
- git add -u: Atualiza o índice exatamente onde já possui uma entrada correspondente, remove e modifica as entradas de índice, mas não adiciona novos arquivos.
- git add -A: Quando não passamos um caminho específico, atualiza todos os arquivos de todas as branch.
- git add .: Atualiza todos os arquivos modificados e novos.

IV. Qual é a ordem dos comandos para subir novas atualizações, verificando se existem alterações a serem recebidas?

- git status para verificar novas alterações git add para adicionar as novas atualizações no repositório local, git commit para identificar as atualizações feitas e git push para subir no repositório remoto.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 1? Se não, justifique;

- Sim.

#### b) Desafio 2 - POO e Entity:

I. Qual a finalidadde da camada Entity?

- É onde as funcionalidades são designadas aos conceitos aos quais elas pertencem, determinando os atributos das classes, getters e setters e métodos especializados para manipular atributos.

II. Para você, por que acha que seguimos a programação orientada a objetos?

- Códigos feitos no paradigma estruturados tendem a apresentar uma grande quantidade de comandos, com programação orientação a objetos organizamos dados e operações na forma de classes, temos mais legibilidade do código e facilidade de manutenção.

III. Qual é o ideal por trás de utilizar os métodos getters e setters?

- Os getters e setters nos permite manter o conceito de encapsulamento, pois com eles podemos acessar os valores de fora do deu pacote, levando em consideração a proteção de alguns atributos que podem ou não ser mutáveis.

IV. Qual o propósito de construtor em uma classe? Podemos criar uma classe sem construtor?

- É responsavel por criar o objeto em memória, ele instancia a classe utilizando a palavra reservada 'new', não podemos criar uma classe sem construtores eles são obrigatórios.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 2? Se não, justifique;

- Sim.


#### c) Desafio 3 - HTTP, REST e Controller:

I. Qual o objetivo da camada Controller?

- É na camada controller que temos a comunicação com o frontend, ela é a intermediária entre aa camadas de apresentação e a camada de regra de negócios.

II. No que os padrões REST nos auxiliam?

- Em tornar a comunicação entre sistemas de forma organizada, com a arquitetura REST os clientes enviam solicitações para recuperar ou modificar recursos e o servidor enviam respostas para essas solicitações.

III. Quais métodos HTTP utilizamos para montar um CRUD?

- POST
- GET
- PUT
- DELETE

IV. Qual a diferença entre as annotations @PathVariable, @RequestParam, @RequestBody? E com quais métodos HTTP elas podem ser utilizadas respectivamente?

- @PathVariable - é usado para obter objetos individuais ou dados extraidos do caminho da URL, em resumo quando o valor da variável é passada diretamente na URL.

- @RequestParam - Usado para fins de filtragem, passamos os parâmetros que queremos filtrar por URL, eles são parte integrante da URL por esse notivo devem ser capturados utilizando @RequestParam.

- @RequestBody - Indica que um parâmetro deve ser vinculado ao corpo da solicitação HTTP, o @RequestBody é usado para que o corpo da solicitação seja lido e desserializado em um objeto.

V. Para que serve ResponseEntity?

Retorna a resposta completa, incluindo cabeçalhos HTTP e corpo, usamos também para detalhar no corpo da resposta erros específicos.

VI. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 3? Se não, justifique;

- Sim.

#### d) Desafio 4 - JPA e Repository:

I. Qual é o propósito da camada Repository?

- Realizar o isolamento entre a camada de acesso a dados de uma aplicação, usando injeção de dependênciae proporcionando uma visão mais orientada a objetos, em outras palavras é uma interface de consulta e manipulação em coleção de dados.

II. De maneira prática como funciona a injeção do Repository? E qual a relação com Autowired?

- Instanciar um objeto repository que tem várias operações para utilizarmos na aplicação;
- Para ter uma instância de outra classe no Spring Boot é preciso usar a anotação @Autowired ele resolve a dependência, ele vai obter uma instância da classe repository no nosso caso.

III. Quais são as facilidades em utilizar JPA?

- Conversão entre o modelo orientado a objetos e o paradigma relacional do banco de dados;
- Não precisa criar códigos SQL para salvar, alterar ou remover registros do banco de dados;
- A aplicação não fica presa a um banco de dados sendo simples a troca

IV. Quais são os passos para configurar um banco de dados em um projeto Spring?

- O primeiro passo é incluir as dependencias no pom.xml do JPA e do banco de dados que vamos utilizar na aplicação;
- Configurar o arquivo application.properties com as configuraçoes do banco de dados, onde colocamos uma URL , username, password, alguns bancos precisam ter o path do navegador;
- Fazer o mapeamento nas entidades fazendo o uso de anotações que instruem o JPA de como ele vai converter os objetos para o modelo relacional do banco de dados;

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 4? Se não, justifique;

- Sim

#### e) Desafio 5 - Service:

I. Qual a finalidade da camada Service?

- É na Service que ficam as regras de negócio, operações diversas como validação, verificação, acesso ao repositório, nela recebemos as requisições do controller, quando bem implementada é de fácil manutenção e mudanças em relação a evoluçao da regra de negócio.

II. Qual o sentido de um método ter apenas um propósito?

- Ter um código mais limpo e de fácil manutenção, esse é um conceito SOLID princípio da responsabilidade única, onde uma classe deve ter um, e somente um, motivo para mudar.

III. Qual a diferença entre um método void e métodos tipados?

- Quando um método executa apenas o código que tem dentro do seu bloco, sem retornar nenhum resultado, é identificado pela palavra-chave void;
- Métodos que possuem um tipo de dados incorporado na declaração e apresentam em seu bloco a palavra reservada return está informando que terá um retorno do mesmo tipó de dados com a qual foi declarado.

IV. É normal um serviço chamar outro?

- Service interagem com outros services, sem se importar quando está sendo chamado.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 5? Se não, justifique;

- Sim

#### f) Desafio 6 - DTO:

I. Quais problemas conseguimos resolver utilizando a camada DTO?

- Transferir dados de um local para outro sem lógica de negócios, determinar o que pode ser visto na camada de apresentação evitando que dados de interesse exclusivos fiquem expostos, otimização do tráfego de dados.

II. Qual a diferença de realizarmos o "de para" utilizando constructor ou getters e setters?

- Construtores devem passar os valores mínimos que uma classe precisa e os getteres and setters são o meio para buscar as informações contidas na classe, vale ressaltar que só se deve criar getters e setters quando eles realmente são úteis. Utilizando esses métodos estamos escondendo dados para expor o comportamento.

III. No que a utilização do Mapper nos auxilia? Achou fácil a implementação?

-  Ele usa uma abordagem baseada em convenção para mapear objetos enquanto fornece uma API segura de refatoração simples para lidar com casos de uso específicos.

IV. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 6? Se não, justifique;

- Sim

#### g) Desafio 7 - Manipulação de dados:

I. Qual é a forma de validar os dados de uma requisição sem utilizar @Valid?

- Uma forma é isolar cada regra de validação em uma classe separada, com uma interface genérica que contém a assinatura de um método responsável pela validação, cada classe deverá implementar a interface passando por parâmetro o tipo do objeto que será validado, também precisamos implementar um método escrevendo dentro dele a lógica de validação, em uma classe vamos criar um método que irá receber por parâmetro um validator e o objeto a ser validado, por fim em nosso método salvar, podemos pedir para ele validar.

II. Para que serve um ENUM? Cite exemplos;

- Representam um conjunto fixo de constantes(static, final), pode ser definido usando a palavra chave 'enum', tornam o código mais explícito, mais legível, e menos vulnerével a erros de programação. Exemplo:
  ```bash
      public enum Turno {
          MANHA,
          TARDE,
          NOITE;
      }
  ```

III. Como criamos um custom validator? E qual o objetivo de criar um?

- Primeiro é necessário das dependências do Spring Boot starter e Spring Boot validation no pom.xml;
- Criar uma annotation para validação, com a mensagem que será devolvida para o usuário;
- É necessário criar uma classe que contém a regra de negócio da validação;
- No Controller que recebe nosso objeto, para que a validação tenha efeito adicionamos a anotação @Valid;
- Por fim criamos um arquivo properties para buscar as mensagens que serão exebidas.

Com a criação da validação se algum erro ou parâmetro inválido surgirem, será lançado uma mensagem padronizada e mostrada para o cliente final.

IV. Qual foi a diferença entre utilizar for e streams no desafio 6?

- Um código mais legível e conciso além de poder aumenta sua produtividade, com o for corremos mais riscos de gerar bug inesperados, a partir do Java 8 com criação de funções lambda foi possível criar uma nova forma de iterar com coleções utilizando o stream, podemos fazer muito mais do que com o for.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 7? Se não,
justifique;

- Sim

#### h) Desafio 8 - Tratamento de exceptions:

I. Qual a finalidade de trata-las?

- Tratamos as exceções para melhor entendimento do que acorreu com o código, mostrando informações do erro, seu tipo, entregando para o cliente final uma melhor explicação da causa da exceção. A casos que exceções são necessárias impedidno que o código pare de funcionar.

II. Como as descobrimos?

- Quando um programa é interrompido do seu fluxo normal é lançado uma exceção que contém informações sobre o erro por meio de mensagens.

III. Como fazemos para estourar um exception em uma determinada linha?

- Por meio da instrução throw que lança uma exceção definida.

IV. Qual é a melhor forma de implementarmos nosso controle de exceções?

- Criando uma classe expecífica para tratar exeções, podemos escrever nossas próprias classes e instanciá-las com cada exceção.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 8? Se não,
justifique:

- Sim.

#### i) Desafio 9 - Patterns, SOLID e Arquitetura:

I. O que é Singleton Pattern?

- É um padrão que permiti criar objetos únicos para os quais há apenas uma instância, este padrão oferece um ponto de acesso a ela, ou seja, gerencia a própria instância dela além de evitar que qualquer outra classe crie uma instância dela.

II. O que significa a letra D de SOLID e como se aplica na camada de Repository?

- Dependency Inversion Principle(Princípio da inversão de dependência) - Esse princípio fala que os modulos de alto nível não podem depender dos de baixo nível, ambos deve depender de abstrações e as abstrações não podem depender de detalhes. Levando em consideração  o texto o modulo de alto nível tem envolvimento com a regra de negócio, o de baixo nível são as tarefas internas que a aplicação faz, na Repository se aplica pois estamos desacoplando modulos utilizando esse princípio.

III. Qual o objetivo das camadas?

- Organizar asa responsabilidades, uma das vantagens no uso de camadas é poder isolar a complexidade e os detalhes de uma camada para as demais e dar um propósito bem definido a cada camada de forma que a mesma possa ser reutilizável por um nível mais alto ou até mesmo substituível.

IV. Qual arquitetura é melhor DDD, Hexagonal ou Clean?

- Claro que cada arquitetura tem sua particularidade e forma de representar e aplicar questões de organização, isolamento e dependência entre camadas, na minha opnião a Clean archtecture por ser uma arquitetura que proposiona maior organização das responsabilidades do código.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 9? Se não,
justifique;

- Sim.

#### j) Desafio 10 - Spring:

I. Qual a diferença entre Java e Spring?

- Java é uma linguagem de programação orientada a objetos, usada para desenvolvimento de software e aplicações web.
- Spring é uma estrutura de aplicativos de código aberto usado amplamente pela comunidade Java.

II. É possível utilizar Spring Data sozinho?

- Não segundo a documentação do Spring ele é um projeto guarda-chuva que contém muitos subprojetos específico para cada banco de dados, exemplo Spring Data MongoDB, Spring Data JPA, entre outros.

III. É possível utilizar Spring Boot, Spring Data e Spring Security em apenas um projeto?
Se sim, como é feito a integração?

- Sim, por meio das dependências implementadas no pom.xml, e utilizando de anotações referente aos modulos Spring.

IV. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 10? Se
não, justifique;

- Sim.

#### k) Desafio 11 - Libs:

I. Cite 5 libs que utilizou durante a trilha e suas respectivas funcionalidades;

- Sweggar - Utilizamos para projetar, construir, documentar e comsumir APIs REST;
- Lombok - Utilizamos para redução de código por meio de anotações, com ele automatizamos a criação de getters, setters e construtotres ;
- Junit - Utilizamos o Junit paraescrever testes em nossa aplicação, ele fornece anotações e declara classes para escrever testes;
- Jackson - É usado para transferir dados em formato Json, ele também aceita outros formatos como Avro, XML, YAML, etc;
- Mokito - Utilizada para simular o comportamento de outras classes ou serviçoes externos.

II. Qual a diferença entre uma lib e um driver?

- Lib é uma coleção de subprogramas utilizada no desenvolvimento de software.
- Driver é basicamente arquivos .jar que contém os meios para fazer a comunicação com o banco de dados.

III. Existe limite de libs por projeto?

- Não

IV. Por que utilizar um gerenciador de dependências?

- Para facilitar na realização de automação e gerenciamento das dependências de um projeto, o desenvolvedor pode focar no desenvolvimento da aplicação.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 11? Se
não, justifique;

- Sim.

#### l) Desafio 12 - Testes unitários:

I. Por que DEVOPS exige uma porcentagem de cobertura mínima nos projetos?

- Para garantir segurança, maneiras colaborativas de trabalhar, com DevOps conectamos aplicações legadas a uma infraestrutura e aplicações modernas, aceleramos osprocessos necessários e capaz de gerar valor para o usúario.

II. Qual o objetivo de utilizar Mockito? Dê um exemplo;

- Como comentado anteriormente utilizamos para simular o comportamento de classes e métodos.

 ```bash
	@ExtendWith(MockitoExtension.class)
	public class TrilhaBackTestes {

   	@Mock
    	private EntryRepository entryRepository;

	@InjectMocks
	private EntryService entryService;
 ```

III. O que é o Sonar? E qual é o seu papel?

- Sonar é um projeto open source que visa avaliar a qualidade de códigos. Para isso ele avalia a arquitetura de design, número de comentários, regras do Java, alto nível de complexidade, código duplicado, cobertura de testes no código, etc. Além de possuir um número bastente extenso de puglins.
- Tem o papel de oferecer ferramentas necessárias para escrever um código limpo e seguro.

IV. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 12? Se
não, justifique;

- Sim.

#### m) Desafio 13 - Integração:

I. Como foi o processo de integração?

- Primeiro precisei instalar o NodeJs, clonar o código do front, seguir o README do front, fazer ajustes nos endpoints do código e alterar alguns nomes no front para conseguir rodar a aplicação.

II. Quais foram as principais dificuldades?

- Por ter pouco conhecimento com aplicações frontend para entender a instalação e como essa integração funciona.

III. Obteve algum erro de CORS?

- Sim.

IV. O que é CORS?

- CORS (Cross-origin Resource Sharing) é um mecanismo utilizado pelos navegadores para compartilhar recursos entre diferentes origens. CORS é uma espicíficação do W3C e faz uso de headers do HTTP para informar aos navegadores se determinado recurso pode ser ou não acessado.

V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 13? Se
não, justifique;

- Sim.



















