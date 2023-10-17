# Cardápio Online em Java com MySQL - CRUD

Bem-vindo ao repositório do projeto Cardápio Online em Java com banco de dados MySQL. Este projeto utiliza o Spring Boot com um controlador REST para lidar com as operações CRUD.


## Tecnologias Utilizadas

- Java17
- Spring Boot
- MySQL
- Hibernate

## Instruções de Uso

Siga as instruções abaixo para configurar, executar e utilizar o sistema do cardápio.

### Configuração do Banco de Dados

1. Certifique-se de ter um servidor MySQL instalado e em execução.
2. Crie um banco de dados chamado `cardapio` no seu servidor MySQL.

### Configuração do Projeto

1. Clone este repositório para o seu ambiente de desenvolvimento.

```
git clone https://github.com/AlineSiqueira/cardapio.git
```

2. Importe o projeto.

3. Configure as credenciais do banco de dados no arquivo `application.properties` dentro do diretório `src/main/resources`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/cardapio
spring.datasource.username=seu-usuario-mysql
spring.datasource.password=sua-senha-mysql
```

### Executando o Aplicativo

1. Inicie o aplicativo a partir da sua IDE ou usando o seguinte comando:

```
./mvnw spring-boot:run
```

2. O aplicativo será executado em `http://localhost:8080`.

### Utilizando as Funcionalidades

O sistema oferece as seguintes funcionalidades:

- **Adicionar Item ao Cardápio**: Envie uma solicitação POST para `/cardapio/salvar` com os dados do item a ser adicionado ao cardápio.

- **Consultar Itens do Cardápio**: Envie uma solicitação GET para `/cardapio/buscar` para obter a lista de todos os itens no cardápio.

- **Editar Item do Cardápio**: Envie uma solicitação POST para `/cardapio/editar` com os dados atualizados do item a ser editado.

- **Excluir Item do Cardápio**: Envie uma solicitação DELETE para `/cardapio/deletar/{id}` para excluir um item com base em seu ID.

Lembre-se de utilizar as ferramentas apropriadas, como Postman ou cURL, para testar as solicitações REST.

## Contribuindo

Sinta-se à vontade para contribuir para este projeto, reportando problemas ou enviando solicitações de pull. Toda contribuição é bem-vinda.

## Autor

Este projeto foi desenvolvido por [AlineSiqueira](https://github.com/AlineSiqueira).


---
