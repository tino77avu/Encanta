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

## Despliegue en Netlify (sitio estático)

Netlify no ejecuta Java/Spring Boot; se despliega una **versión estática** del sitio (HTML/CSS/JS) desde la carpeta `netlify-public/`.

1. Entra en [netlify.com](https://www.netlify.com) e inicia sesión.
2. **Add new site** → **Import an existing project** → conecta tu repositorio de GitHub (por ejemplo `tino77avu/Encanta`).
3. Si el repositorio tiene la raíz en la carpeta del proyecto (donde está `netlify.toml`):
   - **Build command**: lo toma de `netlify.toml` (copia CSS, JS e imágenes a `netlify-public/`).
   - **Publish directory**: `netlify-public`.
4. Si tu repo tiene el proyecto dentro de una subcarpeta (por ejemplo `Encanta/`):
   - En **Site configuration** → **Build & deploy** → **Build settings** → **Base directory**: escribe `Encanta`.
   - Deja que **Build command** y **Publish directory** los tome de `netlify.toml`.
5. **Deploy site**.

Las rutas sin `.html` (por ejemplo `/servicios`, `/galeria`) funcionan gracias a las redirecciones definidas en `netlify.toml`. Para usar tu propio dominio, configúralo en **Domain management** en el panel de Netlify.

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

