# Microserviço de Pagamentos com Java e Spring, banco de dados MariaDB usando migrations, service discovery e registry, load balancer, circuit breaker, fallback e integração com microsserviços.

Neste microserviço de pagamentos iremos utilizar as migrations para criar as tabelas no banco de dados, fazer o 
versionamento do banco de dados utilizando o flyway.
O projeto de Discovery Server utilizaremos o Eureka Server que é um aplicativo que contém as informações sobre todos os 
aplicativos de serviço ao cliente. Cada serviço será registrado no servidor Eureka e o servidor Eureka conhece 
todos os aplicativos clientes em execução em cada porta e endereço IP. 
Podemos dizer que existem dois padrões principais de service discovery: client-side (descoberta do lado cliente) e 
server-side (descoberta do lado servidor).
* No client-side discovery, o cliente (no caso o microsserviço ou API Gateway) consulta o service registry, obtém a 
lista de instâncias do serviço que ele quer consumir e ele próprio é responsável por fazer o balanceamento de carga, 
escolhendo para qual instância irá direcionar a requisição (quando houver mais de uma instância do serviço que ele 
precisa consumir). 
* No server-side discovery ao invés do cliente consultar diretamente o service registry, é feita uma solicitação para 
uma camada intermediária como um DNS ou roteador, por exemplo, que faz a consulta ao service registry e o load balancing 
(balanceamento de carga), já encaminhando a requisição a uma das instâncias, garantindo que nenhum servidor seja 
sobrecarregado e desacoplando essa lógica do cliente.



### Para iniciar o microserviço de pagamentos, seguir os seguintes passos:
1) Subir a aplicação do Eureka Server que é um servidor central onde os microsserviços ficam cadastrados para permitir a 
descoberta: https://github.com/julianalgcora/server
2) Subir a aplicação da API Gateway onde é criado um ponto único de acesso à nossa aplicação: 
https://github.com/julianalgcora/gateway
3) Subir o microserviço de pedidos: https://github.com/julianalgcora/pedidos
4) Subir o microserviço de pagamentos
```shell
make init
make start
```
