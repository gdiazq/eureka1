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




