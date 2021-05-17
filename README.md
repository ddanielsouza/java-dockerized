# java-dockerized
##### Exemplo de aplicação JAVA criada sem ajuda de IDE e rodando em docker <br>

O objetivo é demonstrar uma aplicação java simples rodando no docker 

### Executando

#### Usando docker
```sh
docker-compose -f docker-compose.yaml up --build
```

#### Sem docker (Linux) e monitorar mudanças nos arquivos ".java"
```sh
./startup.sh
```

#### Sem docker (Linux)

Compila todos arquivos ".java"
```sh
find . -name "*.java" -print | xargs javac -d ./target  
```

Executa

```sh
java -classpath ./target br.com.jtest.Main
```

