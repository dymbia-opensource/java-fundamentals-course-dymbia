# Lección 2: Variables: la ficha de tu personaje

- **Duración objetivo:** 6 minutos.
- **Editor en línea:** JDoodle.
- **Código:** `leccion-02-variables`.

## Objetivos de aprendizaje

1. Comprender qué es una variable mediante la analogía de una casilla del inventario.
2. Declarar variables utilizando los tipos `String`, `int`, `double` y `boolean`.
3. Mostrar información combinando texto y variables mediante el operador `+`.

## Guion de grabación

| Tiempo | Pantalla | Narración |
|---|---|---|
| **0:00 – 0:15** | **[EN PPT: Diapositiva 1 – Portada de la lección]** Ficha de personaje con espacios en blanco. | "¡Bienvenido a la lección 2! Todo personaje de videojuego tiene una ficha: un nombre, un nivel, una velocidad y hasta un estado. Pero ¿dónde guarda un programa toda esa información? ¡En variables!" |
| **0:15 – 0:35** | **[EN PPT: Diapositiva 2 – Misión del día]** Se muestran los objetivos de la lección. | "En la lección anterior aprendiste a mostrar mensajes en pantalla con `println`. Hoy daremos el siguiente paso: aprenderemos a guardar información para poder utilizarla y modificarla cuando sea necesario." |
| **0:35 – 1:15** | **[EN PPT: Diapositiva 3 – Una variable es una caja con nombre]** Animación de un inventario con casillas y etiquetas. | "Imagina que tu personaje tiene un inventario. Cada casilla guarda un objeto y tiene una etiqueta para identificarlo. Una variable funciona de manera parecida: es un espacio en la memoria que tiene un nombre y guarda un valor. Además, cada variable tiene un tipo que indica qué clase de dato puede almacenar." |
| **1:15 – 2:15** | **[EN PPT: Diapositiva 3]** Tabla de tipos de datos: `String`, `int`, `double` y `boolean`. | "En Java utilizaremos diferentes tipos de datos. Primero, `String`, para guardar textos, como el nombre de nuestro personaje. Después, `int`, para números enteros, como su nivel. También tenemos `double`, para números con decimales, como su velocidad. Y finalmente, `boolean`, que solo puede guardar dos valores: verdadero o falso. ¡Cada tipo tiene su propia función!" |
| **2:15 – 2:55** | **[EN PPT: Diapositiva 4 – Ahora, vamos a programar]** Se cambia a JDoodle. Se escribe `String nombre = "Luna";`. | "¡Ahora vamos a crear nuestra primera variable! En Java escribimos primero el tipo de dato, luego el nombre de la variable, el signo igual y finalmente el valor. Por ejemplo, aquí creamos una variable llamada `nombre`, de tipo `String`, que guarda el texto Luna. Recuerda que los textos deben escribirse entre comillas." |
| **2:55 – 3:35** | **[EN EDITOR DE CÓDIGO: JDoodle]** Se agregan las demás variables. | "Vamos a completar la ficha de nuestro personaje. Agregamos su nivel con `int`, su velocidad con `double` y su estado con `boolean`. Observa que los números decimales utilizan un punto, no una coma. Además, los valores `true` y `false` se escriben sin comillas." |
| **3:35 – 4:20** | **[EN EDITOR DE CÓDIGO: JDoodle]** Se agregan instrucciones `System.out.println()` para mostrar los datos. | "Pero ¿cómo podemos mostrar la información que guardamos? ¡Muy fácil! Utilizamos `System.out.println` y el operador `+` para unir un texto con el valor de una variable. Por ejemplo, podemos mostrar el nombre de nuestro personaje, su nivel y su velocidad. A esta unión de texto y datos la llamamos concatenación." |
| **4:20 – 4:50** | **[EN EDITOR DE CÓDIGO: JDoodle]** Se cambia `nivel = 1` por `nivel = 2` y se vuelve a ejecutar. | "¡Y aquí viene lo interesante! Las variables pueden cambiar su valor. Si nuestro personaje sube de nivel, podemos actualizar la variable escribiendo `nivel = 2`. Ejecutamos nuevamente el programa y veremos el nuevo valor. ¡Por eso se llaman variables!" |
| **4:50 – 5:10** | **[EN PPT: Diapositiva 5 – Tu misión]** Aparece la indicación de pausa. | "¡Ahora es tu turno! Pausa el video y crea la ficha de tu personaje favorito utilizando cuatro variables: su nombre, su nivel, su velocidad y si está vivo o no. ¡Inténtalo por tu cuenta!" |
| **5:10 – 5:30** | **[EN EDITOR DE CÓDIGO: JDoodle]** Se muestra una posible solución. | "¿Listo? Aquí tienes un ejemplo de cómo podría quedar. Recuerda que tu personaje puede tener otros datos y valores. Lo importante es que hayas utilizado correctamente los cuatro tipos de variables." |
| **5:30 – 5:45** | **[EN PPT: Diapositiva 5]** Se muestra el tip de oro. | "¡Tip de oro! Utiliza nombres claros para tus variables. Por ejemplo, `velocidad` nos dice qué información guarda, mientras que una letra como `x` no nos da muchas pistas. ¡Un buen nombre hace que tu código sea más fácil de entender!" |
| **5:45 – 6:00** | **[EN PPT: Diapositiva 5]** Se muestra la transición hacia una puerta de mazmorra. | "¡Excelente trabajo! Ya sabes guardar y mostrar los datos de tu personaje. Pero ¿qué pasa si queremos hacer cálculos o tomar decisiones con esa información? ¡Descúbrelo en la lección 3!" |

## Código para la demostración en JDoodle

### Resultado esperado

```text
Nombre: Luna
Nivel: 1
Velocidad: 1.5
¿Está vivo?: true
Nuevo nivel: 2
```

## Pausa interactiva

**Instrucción para el estudiante:**

"Pausa el video y crea la ficha de tu personaje favorito utilizando cuatro variables:

- `String`: nombre del personaje.
- `int`: nivel del personaje.
- `double`: velocidad del personaje.
- `boolean`: indica si está vivo (`true`) o no (`false`).

Después, utiliza `System.out.println()` y el operador `+` para mostrar los cuatro datos en pantalla."

## Descripción sugerida para YouTube

```text
Lección 2 de 8: Variables y tipos de datos en Java.

Aprende a crear variables utilizando String, int, double y boolean. También descubrirás cómo mostrar información combinando texto y variables con el operador +.

Practica aquí (sin instalar nada): [ENLACE A JDOODLE CON EL CÓDIGO PRECARGADO]
Código del curso: [ENLACE AL REPOSITORIO]
```

## Lista de verificación para la grabación

- [ ] El guion sigue el orden de las cinco diapositivas del PPT.
- [ ] Se explica la analogía de la variable como una casilla con nombre.
- [ ] Se explican los cuatro tipos de datos: `String`, `int`, `double` y `boolean`.
- [ ] Se muestra cómo declarar cada variable en JDoodle.
- [ ] Se explica la concatenación utilizando el operador `+`.
- [ ] Se muestra cómo modificar el valor de una variable.
- [ ] No aparecen nombres de autores en pantalla.
- [ ] La grabación respeta la duración aproximada de 6 minutos.