# Spring Boot API

## Descripción

Esta es una API RESTful desarrollada con Spring Boot. La API permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en una entidad de ejemplo.

## Requisitos Previos

Antes de empezar, asegúrate de tener instalados los siguientes requisitos:

- [Java JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) o superior
- [Maven](https://maven.apache.org/download.cgi)
- [Git](https://git-scm.com/downloads)

## Instalación

1. Clona el repositorio en tu máquina local:

    ```bash
    git clone https://github.com/FabricioOlivera/api.git
    ```

2. Navega al directorio del proyecto:

    ```bash
    cd demo
    ```

3. Compila y construye el proyecto con Maven:

    ```bash
    mvn clean install
    ```

## Ejecución

1. Ejecuta la aplicación:

    ```bash
    mvn spring-boot:run
    ```

2. La API estará disponible en `http://localhost:8080`.

## Endpoints

### Crear una Entidad

- **URL**: `/v1/employes/`
- **Método**: `POST`
- **Cuerpo de la Solicitud**:
    ```json
    {
        "firstName": "Anderson",
        "secondName": "Rosales",
        "born": "1829-12-30",
        "position": "product manager"
    }
    ```
- **Respuesta Exitosa**:
    - **Código**: `201 CREATED`
    - **Cuerpo**:
        ```json
        {       
        "employeId": 13,
        "firstName": "Andrea",
        "secondName": "Peres",
        "born": "1829-12-31",
        "position": "Full Stack"
        }
        ```

### Obtener Todas las Entidades

- **URL**: `/v1/employes`
- **Método**: `GET`
- **Respuesta Exitosa**:
    - **Código**: `200 OK`
    - **Cuerpo**:
        ```json
       [
        {
        "employeId": 9,
        "firstName": "Anderson",
        "secondName": "Rosales",
        "born": "1829-12-30",
        "position": "product manager"
       },
       {
        "employeId": 14,
        "firstName": "Juan Pablo",
        "secondName": "Montoya",
        "born": "1995-02-26",
        "position": "product manager"
       },
       {
        "employeId": 16,
        "firstName": "Jorge",
        "secondName": "Olivera",
        "born": "2015-02-03",
        "position": "help desk"
       }
      ]
       
        
        ```


### Actualizar una Entidad

- **URL**: `/api/entidades/{id}`
- **Método**: `PUT`
- **Parámetros de Ruta**:
    - `id`: ID de la entidad
- **Cuerpo de la Solicitud**:
    ```json
    {
          
        "employeId": 16,
        "firstName": "Anderson",
        "secondName": "Rosales",
        "born": "1829-12-30",
        "position": "product manager"
    
    }
    ```
- **Respuesta Exitosa**:
    - **Código**: `200 OK`
    - **Cuerpo**:
        ```json
        {
            "employeid": 1,
            "nombre": "Nombre Actualizado",
            "descripcion": "Descripción Actualizada"
        }
        ```

### Eliminar una Entidad

- **URL**: `/api/entidades/{id}`
- **Método**: `DELETE`
- **Parámetros de Ruta**:
    - `id`: ID de la entidad
- **Respuesta Exitosa**:
    - **Código**: `204 NO CONTENT`


