# Encanta Eventos Sociales

Sitio web para la empresa de organización de eventos sociales y corporativos "Encanta Eventos Sociales".

## Características

- Página principal con banner promocional
- Sección de servicios
- Galería de eventos con comentarios emocionales
- Formulario de contacto
- Páginas legales (Políticas de Privacidad, Términos y Condiciones, Preguntas Frecuentes, Derechos ARCO)
- Sistema de login
- Diseño responsive con colores dorado y negro
- Icono flotante de WhatsApp

## Tecnologías

- Spring Boot 4.0.0
- Java 17
- Thymeleaf
- Maven

## Despliegue en Render

1. Conecta tu repositorio de GitHub a Render
2. Selecciona el servicio tipo "Web Service"
3. Configura:
   - **Build Command**: (Render detectará automáticamente el Dockerfile)
   - **Start Command**: (Se ejecutará automáticamente desde el Dockerfile)
   - **Environment Variables**:
     - `PORT`: Render lo asignará automáticamente

## Desarrollo Local

```bash
mvn spring-boot:run
```

La aplicación estará disponible en `http://localhost:8080`

## Estructura del Proyecto

```
Encanta/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/admin/encanta/
│   │   │       ├── controller/
│   │   │       │   └── WebController.java
│   │   │       └── EncantaApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── css/
│   │       │   ├── js/
│   │       │   └── images/
│   │       ├── templates/
│   │       └── application.properties
│   └── test/
└── pom.xml
```

## Licencia

© 2024 Encanta Eventos Sociales. Todos los derechos reservados.

