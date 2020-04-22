# Microservice with Spring boot and Docker

One Paragraph of project description goes here

## Prerequisites

you should install Java >=8 and Docker


### Installing

git clone https://github.com/joserafael872/RepositoryH2.git

mvnw clean package

docker build -t RepositoryH2 .

docker run -d -p 2220:2220 RepositoryH2


#### Description

Este es un microservicio de persistencia con una BD creada con H2, expone 2 endpoints uno para insertar clientes y otro para obtener clientes mediante busqueda por nombre, este microservicio se registra a un eureka server para poder ser consumida. 	
      
1. Insertar clientes
2. Obtener información de un cliente en específico.

#### Versioning

0.0.1

#### Last modification date:
22/04/2020 by Deployment José Rafael


### To Do


### Endpoints
> /repository/insert-data POST

### Request data

URL : 
localhost:2220/repository/insert-data

> Test data : 

> **Request OK: ** {
  "nombre": "JUAN",
  "apellidos": "FRANCISCO PALENCIA",
  "fecha_nacimiento": "05/05/1987",
  "sexo": "M",
  "numero_cuenta": "123456789",
  "saldo": "765",
  "producto": "CLASICA"
}

### Response data

http status de ok "200"

### Endpoints
> /repository/get-data POST

### Request data

URL : 
localhost:2220/repository/get-data

> Test data : 

> **Request OK: ** {
    "nombre": "JUAN"
}

> **Response OK: ** {
	"nombre": "JUAN",
    "apellidos": "FRANCISCO PALENCIA",
    "fecha_nacimiento": "05/05/1987",
    "sexo": "M",
    "cuentas": [
        {
            "numero_cuenta": "123456789",
            "saldo": "765",
            "producto": "CLASICA"
        },
        {
            "numero_cuenta": "123456789",
            "saldo": "345",
            "producto": "PREMIER"
        }
    ]    
}
