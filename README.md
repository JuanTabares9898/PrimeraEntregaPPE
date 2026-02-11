# PrimeraEntregaPPe - Sistema de Gestión de Estudiantes

API REST sencilla desarrollada con Spring Boot para la gestión de estudiantes. Este proyecto fue creado con Spring Initializr y almacena los datos en memoria (sin base de datos).

## Características

- API REST para gestión de estudiantes
- Almacenamiento en memoria (ArrayList)
- Operaciones GET y POST
- Pipeline CI/CD configurado
- Arquitectura MVC (Model-View-Controller)

## Prerrequisitos

- Java 25
- Gradle
- IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

## Estructura del Proyecto

```
PrimeraEntregaPPe/
├── .github/
│   └── workflows/
│       └── pipe.yaml
├── gradle/
├── src/
│   ├── main/
│   │   ├── java/com/example/PrimeraEntregaPPe/
│   │   │   ├── controller/
│   │   │   │   └── EstudianteController.java
│   │   │   ├── model/
│   │   │   │   └── Estudiante.java
│   │   │   ├── service/
│   │   │   │   └── EstudianteService.java
│   │   │   └── PrimeraEntregaPPeApplication.java
│   │   └── resources/
│   └── test/
├── build.gradle
└── gradlew
```

### Descripción de Componentes

- **Model**: Contiene la clase `Estudiante.java` con los atributos id, nombre y carrera
- **Service**: Lógica de negocio para gestionar la lista de estudiantes en memoria
- **Controller**: Endpoints REST para interactuar con la API

## Instalación

1. Clonar el repositorio:
```bash
git clone https://github.com/tu-usuario/PrimeraEntregaPPe.git
cd PrimeraEntregaPPe
```

2. Compilar el proyecto:
```bash
./gradlew build
```

3. Ejecutar la aplicación:
```bash
./gradlew bootRun
```

La aplicación estará disponible en `http://localhost:8080`

## Endpoints

### Obtener todos los estudiantes
```http
GET /estudiantes
```

**Respuesta exitosa (200 OK):**
```json
[
  {
    "id": "333",
    "nombre": "Juan Perez ochoa",
    "carrera": "Ingeniería de Sistemas"
  }
]
```

### Crear un nuevo estudiante
```http
POST /estudiantes
Content-Type: application/json
```

**Body:**
```json
{
  "id": "333",
  "nombre": "Juan Perez ochoa",
  "carrera": "Ingeniería de Sistemas"
}
```

**Respuesta exitosa (201 Created):**
```json
{
  "id": "333",
  "nombre": "Juan Perez ochoa",
  "carrera": "Ingeniería de Sistemas"
}
```

## Ejemplos de Uso

### Con cURL

**Obtener estudiantes:**
```bash
curl http://localhost:8080/estudiantes
```

**Crear estudiante:**
```bash
curl -X POST http://localhost:8080/estudiantes \
  -H "Content-Type: application/json" \
  -d '{
    "id": "333",
    "nombre": "Juan Perez ochoa",
    "carrera": "Ingeniería de Sistemas"
  }'
```

### Con Postman

1. **GET Request:**
   - URL: `http://localhost:8080/estudiantes`
   - Method: GET

2. **POST Request:**
   - URL: `http://localhost:8080/estudiantes`
   - Method: POST
   - Headers: `Content-Type: application/json`
   - Body (raw JSON):
   ```json
   {
     "id": "333",
     "nombre": "Juan Perez ochoa",
     "carrera": "Ingeniería de Sistemas"
   }
   ```

## Pipeline CI/CD

El proyecto incluye un pipeline configurado en `.github/workflows/pipe.yaml` que automatiza:

- Compilación del proyecto
- Ejecución de pruebas
- Validación del código
- (Agregar más detalles específicos del pipeline si es necesario)

## Tecnologías Utilizadas

- **Spring Boot** - Framework principal
- **Spring Web** - Para crear la API REST
- **Gradle** - Gestión de dependencias y construcción
- **Java** - Lenguaje de programación
- **GitHub Actions** - CI/CD

## Notas Importantes

- Los datos se almacenan **únicamente en memoria** (ArrayList)
- Los datos se pierden cuando se reinicia la aplicación
- No hay persistencia en base de datos
- Ideal para desarrollo, pruebas y demostraciones

## Contacto

Juan Jeronimo Tabares Cataño - [@JuanTabares9898](https://github.com/JuanTabares9898)

Link del proyecto: [https://github.com/JuanTabares9898/PrimeraEntregaPPE.git](https://github.com/JuanTabares9898/PrimeraEntregaPPE.git)

---
