# Projeto que consome APIs do Sistema de Estoque de Cervejas (VERSÃO PESSOAL) 

repositório com a VERSÃO PESSOAL do projeto prático "Controle de Estoque de Cervejas" do Bootcamp GFT START #2 Java da [DIO](https://digitalinnovation.one/).

--------------------

Neste projeto foi desenvolvido um sistema que consome, usando Feign, APIs de controle de estoque de cervejas.

--------------------

### Desenvolvimento

Foram desenvolvidas as seguintes tarefas:

* Configurações iniciais de um projeto com o Spring Boot Initialzr para a criação do sistema

* Incluída a dependência do Feign no pom.xml
  ````xml
  <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-openfeign</artifactId>
    <version>3.1.4</version>
  </dependency>
  ````
* Definir a porta do servidor no application.properties
 ````server.port=9090````
* Incluir a anotação ````@EnableFeignClients```` na classe main do projeto
* Criação da interface ICervejaConsumidorFeign com os métodos usados pela CervejaController

### Tecnologias e Dependências utilizadas

- **Java 11**
- **Maven** p/ gerenciamento de dependências
  - **Lombok**
- **Spring Boot (2.7.4)**
  - **Spring Web**
  - **Spring Cloud OpenFeign**
- **Git/GitHub** para versionamento do código

### Instalação e Execução

Baixar e importar todos os módulos em sua IDE preferida

Após executar todos os módulos, basta apenas abrir os endpoints abaixo:

#### APIs Cervejas

| VERBO  | URL                                              | CORPO                                                        |
| ------ |--------------------------------------------------| ------------------------------------------------------------ |
| GET    | http://localhost:9090/consumidor/api/v1/cervejas | NÃO É NECESSÁRIO                                             |
| GET    | http://localhost:9090/consumidor/api/v1/cervejas/{nome}     | NÃO É NECESSÁRIO                                             |
