# Lección 6: Clases y objetos: fabrica tus personajes

- **Duración objetivo:** 8 minutos
- **Editor en línea:** JDoodle
- **Código:** `leccion-06-clases-objetos` (se parte del starter y se llega al completed)
- **Diapositivas:** 26 a 30 de `Java_desde_cero.pptx`
- **Objetivos de aprendizaje:**
  1. Explicar la diferencia entre clase (plano) y objeto (personaje fabricado).
  2. Definir una clase con atributos, constructor y métodos.
  3. Crear objetos con `new` y llamar a sus métodos.

| Tiempo | Pantalla | Narración |
|--------|----------|-----------|
| 0:00–0:25 | [EN PPT: Diapositiva 1/5 – portada] | Imagina que tu juego tiene cincuenta personajes. Si cada uno necesita nombre, nivel y vida, ¿crearías ciento cincuenta variables sueltas? Sería difícil mantenerlas ordenadas. Java nos ofrece una forma de agrupar datos y acciones: las clases y los objetos. Hoy construiremos un molde para fabricar personajes. |
| 0:25–0:55 | [EN PPT: Diapositiva 2/5 – antes (variables sueltas) vs. después (clase)] | En la lección anterior creaste métodos y recibiste datos con Scanner. Ahora vamos a juntar en un solo lugar la información y las acciones de un personaje. Aprenderás qué es una clase, qué es un objeto, para qué sirve un constructor y cómo fabricar objetos con la palabra new. Esta es la base de la programación orientada a objetos, o POO. |
| 0:55–1:40 | [EN PPT: Diapositiva 3/5 – clase Personaje (plano) → new → objetos luna y kai] | Una clase es como el plano de una fábrica. Describe qué características tendrá algo y qué acciones podrá realizar. Un objeto es cada cosa concreta fabricada con ese plano. Por ejemplo, la clase Personaje dice que todo personaje tiene nombre, nivel y vida, y que puede presentarse y subir de nivel. Luna y Kai serán dos objetos distintos: comparten la misma estructura, pero cada uno guarda sus propios valores. Si Luna sube de nivel, Kai no cambia. La clase se escribe una sola vez; los objetos, todos los que necesites. |
| 1:40–2:30 | [EN EDITOR: abrir starter-files/leccion-06-clases-objetos/Main.java; completar atributos nombre, nivel y vida] | Abrimos JDoodle y pegamos el archivo de la lección 6. Fíjate que arriba de public class Main hay un espacio para la clase Personaje: ahí van a vivir sus datos y sus acciones. Declaramos tres atributos: String nombre, int nivel e int vida. Los atributos son variables que pertenecen a cada objeto: cada personaje tendrá su propio nombre, su propio nivel y su propia vida. Observa que Personaje no lleva public: todo el código está en un solo archivo y solo la clase Main puede ser pública. Por ahora dejamos los atributos así; en la siguiente lección aprenderemos a protegerlos. |
| 2:30–3:25 | [EN EDITOR: escribir constructor Personaje(String nombre, int nivel); dibujar flecha de this.nombre al atributo y de nombre al parámetro] | Ahora creamos el constructor: un método especial que prepara al objeto en el momento en que se fabrica. Tiene dos reglas: se llama exactamente igual que la clase, Personaje, y no lleva tipo de retorno, ni siquiera void. Recibe nombre y nivel. Dentro escribimos this.nombre igual a nombre. ¿Por qué this? Porque hay dos cosas con el mismo nombre: el atributo del objeto y el parámetro que llega. this.nombre significa «el nombre de este objeto», y el nombre de la derecha es el parámetro. Hacemos lo mismo con nivel. Por último, this.vida igual a 100, para que todo personaje nuevo empiece con la vida completa. |
| 3:25–4:15 | [EN EDITOR: completar presentarse() y subirNivel()] | Agreguemos las acciones. Escribimos void presentarse, que muestra «Soy», más nombre, más «, nivel», más nivel. Después, void subirNivel, que hace nivel igual a nivel más uno. Fíjate en dos detalles. Primero, estos métodos no llevan static: pertenecen a cada objeto, así que siempre se usan a través de un personaje concreto. Segundo, no necesitan parámetros, porque el objeto ya conoce su propio nombre y su nivel. Recuerda el código de colores: los atributos, en azul, son los datos; los métodos, en verde, son lo que el objeto sabe hacer. |
| 4:15–5:10 | [EN EDITOR: completar main con new Personaje("Luna", 1) y new Personaje("Kai", 3)] | Ya tenemos el plano. Ahora vamos a fabricar. Dentro de main escribimos Personaje luna igual a new Personaje y, entre paréntesis, «Luna» y 1. Léelo de izquierda a derecha: Personaje es el tipo, luna es el nombre de la variable, y new Personaje fabrica un objeto nuevo usando el constructor, que recibe «Luna» y el nivel 1. Este proceso se llama instanciar, y el objeto creado es una instancia. Repetimos para Kai, con nivel 3. Ahora tenemos dos objetos independientes. La variable luna guarda la referencia al primero, es decir, sabe dónde encontrarlo, y kai guarda la referencia al segundo. |
| 5:10–5:55 | [EN EDITOR: llamar luna.presentarse(), kai.presentarse(), luna.subirNivel(); luna.presentarse(); ejecutar] | Para pedirle algo a un objeto usamos el nombre de la variable, un punto y el método. Escribimos luna.presentarse y kai.presentarse. Luego luna.subirNivel y otra vez luna.presentarse. Ejecuta y revisa la consola: primero «Soy Luna, nivel 1», luego «Soy Kai, nivel 3» y al final «Soy Luna, nivel 2». Luna subió de nivel, pero Kai sigue en 3. Eso demuestra que cada objeto guarda sus propios datos y que el método solo afecta al objeto que lo llamó. |
| 5:55–6:30 | [EN EDITOR: borrar «= new Personaje("Luna", 1)»; ejecutar; resaltar en rojo el mensaje de error; restaurar y ejecutar] | Un error común: declarar la variable pero olvidar fabricar el objeto. Borra temporalmente la parte de new y deja solo Personaje luna con punto y coma; luego ejecuta. Java muestra el error «variable luna might not have been initialized», es decir, la variable luna no ha sido inicializada. Tenemos la caja con etiqueta, pero está vacía: no hay ningún personaje dentro. Lo corregimos volviendo a escribir igual a new Personaje con sus datos. |
| 6:30–7:00 | [EN PPT: diapositiva 5/5 – reto] | Tu reto es crear una clase Mascota con un atributo nombre y un método hacerSonido. Después crea una mascota con new y llama al método. No necesitas copiar la clase Personaje palabra por palabra: usa la misma idea con una mascota. [PAUSA DE GRABACIÓN: dejar el reto visible entre 5 y 8 segundos]. |
| 7:00–7:30 | [EN EDITOR: mostrar una posible clase Mascota y su instancia] | Una posible solución: una clase Mascota con el atributo String nombre, un constructor que recibe el nombre y lo guarda con this, y un método void hacerSonido que muestra, por ejemplo, nombre más «dice: ¡guau!». En main creamos Mascota miMascota igual a new Mascota con «Toby» y llamamos a miMascota.hacerSonido. Es el mismo patrón: clase, atributos, constructor, métodos y objeto. |
| 7:30–8:00 | [EN PPT: diapositiva 5/5 – resumen y avance] | Tip de oro: los nombres de clases empiezan con mayúscula, como Personaje, y los de variables con minúscula, como luna. Ya sabes fabricar objetos. Pero hay un problema: cualquiera podría escribir luna.vida igual a menos 999. En la siguiente lección aprenderemos a proteger esos datos y a manejar varios personajes a la vez con arreglos. |

## Pausa interactiva
"Pausa y crea una clase `Mascota` con un atributo `nombre` y un método `hacerSonido()`. Después crea una mascota con `new` y llama al método."

## Descripción sugerida para YouTube
```
Lección 6 de 8: Clases, objetos, constructores y métodos (POO).
Practica aquí (sin instalar nada): [ENLACE A JDOODLE PRECARGADO]
Código del curso: [ENLACE AL REPOSITORIO]
```

## Lista de verificación
- [ ] La clase `Personaje` va arriba, sin `public`, en el mismo archivo `Main.java`.
- [ ] Mostrar el error real al olvidar `new` ("variable luna might not have been initialized") y su corrección.
- [ ] Sin nombres de autores en pantalla.
