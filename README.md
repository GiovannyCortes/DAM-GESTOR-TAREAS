# Guía de Markdown para GitHub

Markdown es un lenguaje de marcado ligero que permite dar formato al texto utilizando caracteres especiales, sin necesidad de escribir HTML. Se utiliza habitualmente en GitHub para documentar proyectos, escribir archivos `README.md`, describir *issues*, crear *pull requests* y redactar comentarios.

El objetivo de esta guía es aprender las herramientas de formato más útiles para documentar correctamente un proyecto.

## Índice

- [1. Títulos y encabezados](#1-títulos-y-encabezados)
- [2. Formato del texto](#2-formato-del-texto)
- [3. Párrafos y saltos de línea](#3-párrafos-y-saltos-de-línea)
- [4. Listas](#4-listas)
- [5. Enlaces](#5-enlaces)
- [6. Imágenes](#6-imágenes)
- [7. Código](#7-código)
- [8. Citas](#8-citas)
- [9. Tablas](#9-tablas)
- [10. Listas de tareas](#10-listas-de-tareas)
- [11. Separadores](#11-separadores)
- [12. Alertas de GitHub](#12-alertas-de-github)
- [13. Emojis](#13-emojis)
- [14. HTML dentro de Markdown](#14-html-dentro-de-markdown)
- [15. Menciones y referencias de GitHub](#15-menciones-y-referencias-de-github)
- [16. Buenas prácticas](#16-buenas-prácticas)

---

## 1. Títulos y encabezados

Los títulos se crean utilizando el carácter `#`. Cuantos más caracteres se escriban, menor será el nivel del encabezado.

### Sintaxis

```markdown
# Título de nivel 1
## Título de nivel 2
### Título de nivel 3
#### Título de nivel 4
##### Título de nivel 5
###### Título de nivel 6
```

### Resultado

# Título de nivel 1
## Título de nivel 2
### Título de nivel 3

**Consejo:** utiliza los encabezados para organizar la documentación por secciones. En GitHub, los encabezados también pueden generar un índice de navegación.

Un archivo README normalmente comienza con un título de nivel 1 que identifica el proyecto.

---

## 2. Formato del texto

Markdown permite destacar información importante o modificar la apariencia del texto.

| Formato | Sintaxis | Resultado |
|---|---|---|
| Negrita | `**texto**` | **texto** |
| Cursiva | `*texto*` | *texto* |
| Negrita y cursiva | `***texto***` | ***texto*** |
| Tachado | `~~texto~~` | ~~texto~~ |
| Código en línea | `` `texto` `` | `texto` |

### Ejemplo práctico

```markdown
Este proyecto está desarrollado en **Java**.

La aplicación utiliza *programación orientada a objetos*.

La versión ~~1.0~~ ha sido sustituida por la versión 2.0.

Para ejecutar la aplicación, utiliza `java Main`.
```

### Resultado

Este proyecto está desarrollado en **Java**.

La aplicación utiliza *programación orientada a objetos*.

La versión ~~1.0~~ ha sido sustituida por la versión 2.0.

Para ejecutar la aplicación, utiliza `java Main`.

---

## 3. Párrafos y saltos de línea

Los párrafos se separan dejando una línea en blanco entre ellos.

```markdown
Este es el primer párrafo.

Este es el segundo párrafo.
```

Para introducir un salto de línea sin crear un párrafo nuevo, puedes terminar una línea con dos espacios o utilizar una etiqueta HTML `<br>`.

```markdown
Primera línea.  
Segunda línea.
```

**Importante:** pulsa Enter una sola vez no siempre produce un salto visible en Markdown. Dejar una línea en blanco es la opción más sencilla para separar párrafos.

---

## 4. Listas

Markdown permite crear listas ordenadas, listas sin ordenar y listas anidadas.

### 4.1. Listas sin ordenar

Puedes utilizar `-`, `*` o `+`.

```markdown
- Java
- Python
- Kotlin
- C#
```

Resultado:

- Java
- Python
- Kotlin
- C#

### 4.2. Listas ordenadas

Utiliza números seguidos de un punto.

```markdown
1. Crear el repositorio.
2. Clonar el proyecto.
3. Implementar la funcionalidad.
4. Subir los cambios.
```

Resultado:

1. Crear el repositorio.
2. Clonar el proyecto.
3. Implementar la funcionalidad.
4. Subir los cambios.

### 4.3. Listas anidadas

Puedes incluir sublistas dentro de una lista utilizando espacios de indentación.

```markdown
- Backend
  - Java
  - Spring Boot
- Frontend
  - HTML
  - CSS
  - JavaScript
```

Resultado:

- Backend
  - Java
  - Spring Boot
- Frontend
  - HTML
  - CSS
  - JavaScript

**Consejo:** mantén una indentación consistente para que las listas se representen correctamente.

---

## 5. Enlaces

Los enlaces permiten dirigir al lector a otras páginas web, archivos del repositorio o secciones del propio documento.

### 5.1. Enlaces externos

```markdown
[Visitar GitHub](https://github.com)
```

Resultado: [Visitar GitHub](https://github.com)

### 5.2. Enlaces a archivos del repositorio

```markdown
[Ver el código Java](src/Main.java)
```

La ruta debe corresponder a un archivo real del repositorio.

### 5.3. Enlaces a secciones del README

```markdown
[Ir a las buenas prácticas](#16-buenas-prácticas)
```

GitHub genera identificadores para los encabezados. Generalmente, se utilizan letras minúsculas, se sustituyen los espacios por guiones y se eliminan muchos signos de puntuación.

**Importante:** comprueba el enlace cuando el título contenga tildes, símbolos o nombres repetidos.

---

## 6. Imágenes

Puedes insertar imágenes utilizando una sintaxis similar a la de los enlaces, añadiendo `!` al principio.

### Sintaxis

```markdown
![Texto alternativo](ruta/de/la/imagen.png)
```

### Ejemplo

```markdown
![Logo de GitHub](https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png)
```

El texto alternativo describe la imagen y ayuda a la accesibilidad.

### Imágenes almacenadas en el repositorio

Una estructura habitual sería:

```text
mi-proyecto/
├── README.md
├── src/
└── docs/
    └── arquitectura.png
```

Para insertar la imagen desde el README:

```markdown
![Arquitectura del proyecto](docs/arquitectura.png)
```

**Buenas prácticas:**

- Utiliza imágenes optimizadas para no aumentar innecesariamente el tamaño del repositorio.
- Añade un texto alternativo descriptivo.
- Comprueba que las rutas relativas funcionan desde la ubicación del README.
- Puedes utilizar capturas de pantalla para documentar interfaces o explicar cómo ejecutar una aplicación.

---

## 7. Código

Esta es una de las funcionalidades más importantes al documentar proyectos de programación.

### 7.1. Código en línea

Utiliza una pareja de acentos graves (backticks).

```markdown
Para imprimir un mensaje, utiliza `System.out.println()`.
```

Resultado:

Para imprimir un mensaje, utiliza `System.out.println()`.

### 7.2. Bloques de código

Utiliza tres acentos graves al principio y al final.

````markdown
```
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, mundo");
    }
}
```
````

Resultado:

```
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, mundo");
    }
}
```

### 7.3. Resaltado de sintaxis

Puedes indicar el lenguaje después de los tres acentos graves para activar el resaltado de sintaxis.

#### Java

````markdown
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, mundo");
    }
}
```
````

#### Python

````markdown
```python
def saludar(nombre):
    print(f"Hola, {nombre}")

saludar("Ana")
```
````

#### SQL

````markdown
```sql
SELECT nombre, precio
FROM productos
WHERE precio > 10;
```
````

#### JSON

````markdown
```json
{
  "nombre": "Producto",
  "precio": 19.99,
  "disponible": true
}
```
````

**Consejo:** utiliza siempre que puedas el lenguaje correspondiente (`java`, `python`, `sql`, `json`, `javascript`, `csharp`, etc.). Facilita la lectura y comprensión del código.

---

## 8. Citas

Las citas se crean utilizando el símbolo `>` al principio de la línea.

```markdown
> Esta es una cita.

> Una buena documentación facilita el mantenimiento del software.
```

Resultado:

> Esta es una cita.

> Una buena documentación facilita el mantenimiento del software.

También puedes anidar citas:

```markdown
> Cita principal.
>
> > Cita dentro de otra cita.
```

Son útiles para incluir advertencias, explicaciones o fragmentos de documentación externa.

---

## 9. Tablas

Las tablas permiten organizar datos en filas y columnas.

### Sintaxis

```markdown
| Lenguaje | Tipo | Uso |
|---|---|---|
| Java | Compilado a bytecode | Aplicaciones empresariales |
| Python | Interpretado habitualmente | Automatización y datos |
| Kotlin | Compilado a bytecode | Desarrollo Android |
```

### Resultado

| Lenguaje | Tipo | Uso |
|---|---|---|
| Java | Compilado a bytecode | Aplicaciones empresariales |
| Python | Interpretado habitualmente | Automatización y datos |
| Kotlin | Compilado a bytecode | Desarrollo Android |

### Alinear columnas

Puedes utilizar dos puntos en la línea separadora:

```markdown
| Izquierda | Centro | Derecha |
|:---|:---:|---:|
| Texto | Texto | Texto |
| Java | Python | Kotlin |
```

Resultado:

| Izquierda | Centro | Derecha |
|:---|:---:|---:|
| Texto | Texto | Texto |
| Java | Python | Kotlin |

- `:---` alinea a la izquierda.
- `:---:` centra el contenido.
- `---:` alinea a la derecha.

**Cuándo utilizarlas:** para documentar parámetros, comparar tecnologías, describir endpoints, presentar estados o resumir requisitos.

---

## 10. Listas de tareas

GitHub permite crear listas de tareas interactivas mediante casillas de verificación.

### Sintaxis

```markdown
- [x] Crear el repositorio.
- [x] Añadir el README.
- [ ] Implementar el DAO.
- [ ] Añadir pruebas unitarias.
- [ ] Crear la documentación final.
```

### Resultado

- [x] Crear el repositorio.
- [x] Añadir el README.
- [ ] Implementar el DAO.
- [ ] Añadir pruebas unitarias.
- [ ] Crear la documentación final.

`[x]` representa una tarea completada y `[ ]` una tarea pendiente.

Estas listas son especialmente útiles en GitHub para:

- Planificar funcionalidades.
- Crear listas de comprobación en las *issues*.
- Definir tareas pendientes en una *pull request*.
- Seguir el progreso de una práctica.

---

## 11. Separadores

Puedes crear una línea horizontal utilizando tres o más guiones, asteriscos o guiones bajos.

```markdown
---
```

Resultado:

---

Los separadores ayudan a dividir secciones grandes, aunque conviene no utilizarlos en exceso.

---

## 12. Alertas de GitHub

GitHub Flavored Markdown permite crear bloques especiales para destacar información relevante.

### Nota

```markdown
> [!NOTE]
> Información adicional que puede resultar útil.
```

> [!NOTE]
> Información adicional que puede resultar útil.

### Consejo

```markdown
> [!TIP]
> Utiliza nombres descriptivos para las variables y los métodos.
```

> [!TIP]
> Utiliza nombres descriptivos para las variables y los métodos.

### Importante

```markdown
> [!IMPORTANT]
> No subas contraseñas ni claves privadas al repositorio.
```

> [!IMPORTANT]
> No subas contraseñas ni claves privadas al repositorio.

### Advertencia

```markdown
> [!WARNING]
> Una operación de borrado puede eliminar datos de forma irreversible.
```

> [!WARNING]
> Una operación de borrado puede eliminar datos de forma irreversible.

### Precaución

```markdown
> [!CAUTION]
> Ejecuta este comando únicamente si entiendes sus consecuencias.
```

> [!CAUTION]
> Ejecuta este comando únicamente si entiendes sus consecuencias.

Estas alertas son una extensión de GitHub, por lo que su representación puede variar en otros visores de Markdown.

---

## 13. Emojis

Puedes insertar emojis utilizando sus caracteres directamente o los códigos compatibles con GitHub.

```markdown
:rocket: Lanzamiento del proyecto.

:white_check_mark: Tarea completada.

:warning: Hay un problema pendiente.

:bug: Error encontrado.

:books: Documentación.
```

Resultado:

:rocket: Lanzamiento del proyecto.

:white_check_mark: Tarea completada.

:warning: Hay un problema pendiente.

:bug: Error encontrado.

:books: Documentación.

También puedes copiar y pegar emojis directamente:

```markdown
🚀 Nueva versión
✅ Pruebas completadas
🐛 Error corregido
📚 Documentación actualizada
```

**Consejo:** utiliza los emojis con moderación en documentación técnica para mantener una presentación profesional y consistente.

---

## 14. HTML dentro de Markdown

Markdown permite utilizar algunas etiquetas HTML cuando necesitas un formato que no está disponible directamente.

### Texto centrado

```html
<p align="center">
  Texto centrado
</p>
```

### Imagen centrada

```html
<p align="center">
  <img src="docs/logo.png" alt="Logo del proyecto" width="200">
</p>
```

### Texto pequeño

```html
<sub>Texto secundario</sub>
```

**Importante:** GitHub filtra determinadas etiquetas y atributos HTML por motivos de seguridad. No todas las etiquetas o propiedades funcionan en todos los visores de Markdown. Para la mayoría de los casos, es preferible utilizar Markdown estándar.

---

## 15. Menciones y referencias de GitHub

Una de las ventajas de Markdown en GitHub es que permite enlazar elementos del propio sistema de gestión del proyecto.

### 15.1. Referenciar una issue

```markdown
Relacionado con #12.
```

Si existe una *issue* número 12 en el mismo repositorio, GitHub genera automáticamente un enlace.

### 15.2. Referenciar una pull request

```markdown
Revisar los cambios de #25.
```

Si el número corresponde a una *pull request*, GitHub enlaza con ella.

### 15.3. Cerrar una issue desde un commit o pull request

Puedes utilizar palabras clave como:

```markdown
Closes #12
Fixes #15
Resolves #18
```

Cuando el commit llega a la rama predeterminada mediante el flujo correspondiente, o se fusiona la *pull request* que contiene la referencia, GitHub puede cerrar automáticamente las *issues* asociadas.

**Importante:** escribir simplemente `#12` enlaza la referencia, pero no cierra la issue. Para automatizar el cierre se necesita una palabra clave reconocida y cumplir las condiciones de GitHub.

### 15.4. Mencionar a un usuario

```markdown
@usuario
```

Esto puede notificar al usuario mencionado, dependiendo del contexto y de la configuración de GitHub.

### 15.5. Referenciar un commit

Puedes pegar el identificador del commit:

```markdown
Corregido en el commit `a1b2c3d`.
```

GitHub puede reconocer los identificadores de commit y convertirlos en enlaces.

**Aplicación práctica:** estas referencias son fundamentales para relacionar tareas, cambios de código y revisiones dentro de un equipo.

---

## 16. Buenas prácticas

Un README debe explicar rápidamente qué hace el proyecto y cómo utilizarlo.

### Estructura recomendada

```markdown
# Nombre del proyecto

Breve descripción de la aplicación.

## Características

- Funcionalidad principal.
- Funcionalidad secundaria.

## Tecnologías

- Java
- PostgreSQL
- Maven

## Requisitos previos

- JDK instalado.
- Base de datos configurada.

## Instalación

1. Clonar el repositorio.
2. Configurar la base de datos.
3. Ejecutar la aplicación.

## Uso

Explicar cómo iniciar y utilizar el proyecto.

## Autor

Nombre del autor.
```

### Recomendaciones generales

1. **Sé claro y conciso.** Evita incluir información que no aporte valor.
2. **Utiliza encabezados jerárquicos.** No elijas los niveles solo por su tamaño visual.
3. **Incluye ejemplos de código.** Es más fácil comprender una instrucción cuando se acompaña de un ejemplo.
4. **Usa enlaces relativos para archivos internos.** Así la documentación funciona dentro del repositorio.
5. **Mantén el README actualizado.** Si cambia la forma de ejecutar el proyecto, actualiza también las instrucciones.
6. **No abuses del formato.** La negrita, las tablas y los emojis deben facilitar la lectura.
7. **Nunca publiques secretos.** No incluyas contraseñas, tokens, claves API ni información sensible.
8. **Comprueba la vista previa.** GitHub permite visualizar cómo se renderiza el Markdown antes de confirmar los cambios.

---

## 17. Recursos oficiales

Para profundizar en Markdown y conocer las particularidades de GitHub:

- [Guía oficial de Markdown de GitHub](https://docs.github.com/es/get-started/writing-on-github)
- [Sintaxis básica de escritura](https://docs.github.com/es/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)
- [Sintaxis avanzada de Markdown](https://docs.github.com/es/get-started/writing-on-github/working-with-advanced-formatting)
- [Acerca del README](https://docs.github.com/es/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/about-readmes)

---

## 18. Práctica propuesta

Para comprobar que has entendido los conceptos, crea un archivo `README.md` para un proyecto de ejemplo.

Debe incluir:

- [ ] Un título y varios encabezados.
- [ ] Una descripción con palabras en negrita y cursiva.
- [ ] Una lista de tecnologías.
- [ ] Una lista numerada con los pasos de instalación.
- [ ] Un enlace a una página oficial.
- [ ] Una imagen o un logotipo.
- [ ] Un bloque de código con resaltado de sintaxis.
- [ ] Una tabla que describa varias funcionalidades.
- [ ] Una lista de tareas pendientes.
- [ ] Una alerta de GitHub.
- [ ] Una referencia a una *issue* del repositorio.

**Objetivo:** aprender a utilizar Markdown para crear documentación clara, útil y profesional, aplicando lo aprendido a un repositorio real de GitHub.
