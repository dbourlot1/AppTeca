# AppTeca

Catálogo de aplicaciones desarrollado en **Kotlin** con **Jetpack Compose**, como parte de la cursada de Aplicaciones Móviles.
Está dividido en ramas, correspondiendo la main al Laboratorio_3A, y las otras 2 ramas poseen los nombres de sus correspondientes laboratorios

## Funcionalidades

- **Listado de apps**: catálogo navegable con nombre, categoría y estado de favorito.
- **Búsqueda**: filtro en tiempo real por nombre o categoría.
- **Favoritos**: marcar/desmarcar apps como favoritas, con filtro para ver solo las favoritas.
- **Detalle de app**: pantalla individual con descripción completa y acción de favorito.
- **Animaciones**: reordenamiento animado de la lista al filtrar (`Modifier.animateItem()`).
- **Edge-to-edge**: diseño que respeta la barra de estado del sistema.

## Arquitectura

- **UI**: Jetpack Compose (`MainActivity.kt`)
- **Estado**: `AppTecaViewModel` con `StateFlow`, consumido vía `collectAsStateWithLifecycle()`
- **Modelo de datos**: `App` (data class)

## Requisitos

- Android Studio (última versión estable recomendada)
- JDK 17+
- SDK de Android configurado (el proyecto usa el Gradle Wrapper, no hace falta instalar Gradle aparte)

## Cómo clonar y ejecutar

```bash
git clone <https://github.com/dbourlot1/AppTeca.git>
```

1. Abrí la carpeta del proyecto en Android Studio (**File → Open**).
2. Dejá que sincronice Gradle automáticamente (usa el wrapper incluido en el repo).
3. Corré la app con el botón **Run ▶** sobre un emulador o dispositivo físico.

No hace falta configurar nada manualmente: `local.properties` se genera solo con la ruta del SDK de tu máquina al abrir el proyecto.

## Estructura del proyecto

```
app/
 └── src/main/java/com/example/appteca3/
      ├── MainActivity.kt       # UI y composables principales
      ├── AppTecaViewModel.kt   # Lógica de estado y filtrado
      └── ui/theme/             # Tema de la app (colores, tipografía)
```
