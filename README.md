# Projeto Spring + Docker + Postgres
Usado como template

## Arquitetura do projeto
Na raiz tem um docker compose que vai montar uma imagem do Spring e baixar um banco de dados e um adminier

Na imagem construída do Spring estão configuradas variáveis de ambiente que vão apontar para o Postgres em produção mas vai rodar o H2 caso eu rode o Spring localmente sem contêiner

antes do build eu preciso criar a imagem do Postgres e para isso eu posso rodar o comando

```terminal
cd .\spring\postgresteste\
mvn clean package -DskipTests
```

Depois basta voltar para a raiz
```terminal
cd ..\..\
```

E rodar o Docker compose
```terminal
docker-compose up --build
```

Obs: se hovuer erros, podemos tentar apagar as imagens geradas anteriormente
```terminal
docker container prune
docker image prune
```