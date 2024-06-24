## Spring Boot Unit Testing Practice
Este é um projeto Spring Boot criado para praticar a implementação de testes unitários.

## Descrição do Projeto
O objetivo deste projeto é fornecer um ambiente de desenvolvimento para a prática e aprendizado de testes unitários em aplicações Spring Boot. Aqui, você encontrará uma estrutura básica de uma aplicação Spring Boot com classes e métodos que podem ser utilizados para a criação de testes unitários.

O projeto inclui:

1. **Estrutura básica de um projeto Spring Boot:** com as principais dependências configuradas e uma classe Application para inicializar a aplicação.
2. **Exemplos de classes e métodos:** algumas classes de exemplo com métodos que podem ser testados de forma unitária.
3. **Testes unitários de exemplo:** testes unitários de exemplo implementados usando frameworks como JUnit e Mockito.
4. **Guia de configuração e execução:** instruções detalhadas para configurar o ambiente de desenvolvimento e executar os testes unitários.

## Tecnologias Utilizadas
- Java 17
- Spring Boot 2.7.x
- JUnit 5
- Mockito

## Pré-requisitos
- Java Development Kit (JDK) 17 instalado
- Maven instalado
- IDE de sua preferência (por exemplo, IntelliJ IDEA, Eclipse, Visual Studio Code)

## Como Executar o Projeto
1. Clone o repositório do projeto:

`git clone https://github.com/seu-usuario/spring-boot-unit-testing-practice.git`
2. Navegue até o diretório do projeto:

`cd spring-boot-unit-testing-practice`
3. Compile e execute os testes unitários usando o Maven:

`mvn clean test`

Esse comando irá:

- Limpar o diretório target
- Compilar o código-fonte
- Executar os testes unitários

4. Para executar a aplicação Spring Boot:

`mvn spring-boot:run`

5. Para executar o projeto sem executar os testes:

`mvn clean package '-Dmaven.test.skip=true'`

Isso irá iniciar a aplicação Spring Boot na porta padrão 8080.

## Contribuição
Sinta-se à vontade para contribuir com o projeto. Você pode:

- Reportar problemas ou sugerir melhorias abrindo uma nova Issue
- Enviar pull requests com correções, novos recursos ou melhorias no código

Certifique-se de seguir as diretrizes de contribuição do projeto.

## Licença
Este projeto é licenciado sob a Licença MIT.