# Proyecto Eureka Semana 1

## Conceptos a manejar 

- Estructura de un proyecto Spring boot 
- Entender las bases de la orientación a objetos  
- Conocer el concepto de una API Rest 
- Validar API por medio de Postman o programa similar 

## Que se evaluara

En esta ocasión se solicita realizar un ejercicio siguiendo estas instrucciones: - - - - 
- Crea un proyecto Spring Boot, usando la versión 3.x  
- Se te indicarán dos entidades con las que debes trabajar de aquí en adelante. Estas 
entidades estarán relacionadas entre sí, y se denominarán para efectos de este 
ejercicio “entidad primaria” y a la otra “entidad secundaria”.  
- El proyecto debe crear las acciones que respondan a lo siguiente: 
Despliegue de registros de la entidad principal 
Despliegue de registros de la entidad secundaria 
Despliegue de registros de la entidad principal por identificador 
Creación de un registro en la entidad principal  
Eliminación de un registro desde la entidad principal 
- La asociación entre las entidades se debe realizar de manera explícita por medio de 
un atributo en común. 
- Cada capa del proyecto debe estar debidamente separada. 

## Alcances

- Debes publicar el ejercicio en un repositorio GitHub 
- El repositorio debe tener un README que señale los pasos para descargar, compilar 
y ejecutar la solución 
- Se recomienda indicar en el README las URL que permitan acceder a los endpoints, 
junto a datos de ejemplos que permitan ejecutarlos. 

## Requisitos

- Java 21 o superior
- Maven 3.x
- Spring Boot 3.x

## Instalacion 

- Clonar repositorio:
```bash
git clone https://github.com/gdiazq/eureka1.git 
```

- Instalar Docker Desktop [https://docs.docker.com/desktop/install/windows-install/]

- Ingresar a la carpeta del proyecto

- Ejecutar el contenedor docker mediante comando con  
```bash
docker-compose up -d
```

- Compilar el proyecto
```bash
mvn clean install 
```

- Ejecutar la aplicacion
```bash
mvn spring-boot:run
```

## Ejecucion de los endpoints

Se recomienda instalar postman, thunderbird como extension para vscode o utilizar el comand curl para linux

- Listar todos los customer

```bash
GET localhost:8080/customer
```

- Listar todos los project

```bash
GET localhost:8080/project
```

- Buscar cliente por id

```bash
GET localhost:8080/customer/{id}
```
Ejemplo: localhost:8080/customer/1

- Crear nuevo cliente
```bash
POST localhost:8080/customer
```
Ejemplo: localhost:8080/customer
```json
{
    "nombre": "Cliente F",
    "casa_matriz": "Casa Matriz F"
}
```

- Eliminar cliente por id
```bash
DELETE localhost:8080/customer/{id}
```
Ejemplo: localhost:8080/customer/6

## Datos de ejemplo

No son necesarios ya que si se genera el docker con docker-compose la base de datos ya tendra datos en BBDD, aunque se usaron estos datos
```sql
INSERT INTO clientes (nombre, casa_matriz)
VALUES
    ('Cliente A', 'Casa Matriz A'),
    ('Cliente B', 'Casa Matriz B'),
    ('Cliente C', 'Casa Matriz C'),
    ('Cliente D', 'Casa Matriz D'),
    ('Cliente E', 'Casa Matriz E');

INSERT INTO proyectos (cliente_id, nombre)
VALUES
    (1, 'Proyecto Alpha'),
    (2, 'Proyecto Beta'),
    (3, 'Proyecto Gamma'),
    (4, 'Proyecto Delta'),
    (5, 'Proyecto Epsilon');
```





