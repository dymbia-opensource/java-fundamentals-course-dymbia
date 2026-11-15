# Lección 7: Encapsulación y arreglos: protege a tu equipo

- **Duración objetivo:** 8 minutos
- **Editor en línea:** OnlineGDB
- **Código:** `leccion-07-encapsulacion-arreglos`
- **Objetivos de aprendizaje:**
  1. Explicar la encapsulación como una protección de los datos.
  2. Usar `private`, getters y setters con validación.
  3. Guardar varios objetos en un arreglo y recorrerlo con `for`.

| Tiempo | Pantalla | Narración |
|--------|----------|-----------|
| 0:00 | Personaje con vida = -999 | "Con lo que hicimos, cualquiera podría escribir `luna.vida = -999`. ¡Un personaje con vida negativa! Hay que protegerlo." |
| 0:20 | Repaso de clases | "Ya fabricas objetos con `new`. Hoy los proteges y los reúnes en un equipo." |
| 0:40 | Animación: caja fuerte con una ranura | "**Encapsulación** es guardar los datos en una caja fuerte. Nadie los toca directo: solo por la ranura que tú diseñas." |
| 1:30 | `private int vida;` | "`private` significa 'solo la propia clase puede tocar esto'. Si intentas usar `luna.vida` desde fuera, Java marca un error." |
| 2:15 | `getVida()` | "Un **getter** es un método que permite leer el dato. Por convención se llama `get` seguido del nombre del atributo." |
| 3:00 | `setVida(int vida)` con `if / else if / else` | "Un **setter** permite cambiar el dato, pero con reglas. Aquí la vida nunca baja de 0 ni sube de 100." |
| 4:00 | Prueba: `setVida(500)` y se imprime 100 | "Aunque alguien intente poner 500, el setter lo deja en 100. Los datos quedaron protegidos." |
| 4:30 | Mochila con ranuras numeradas desde 0 | "Ahora, ¿cómo guardamos varios personajes? Con un **arreglo**: una mochila con ranuras numeradas. ¡Empiezan en 0, no en 1!" |
| 5:15 | `Personaje[] equipo = new Personaje[3];` | "Creamos un arreglo de 3 espacios. Todavía están vacíos: hay que llenarlos con `new Personaje(...)`." |
| 6:00 | `for` con `equipo.length` | "Con un `for` recorremos el arreglo. `equipo.length` dice cuántos espacios tiene." |
| 6:30 | Se usa `equipo[3]` y aparece el error | "Error común: pedir la posición 3 en un arreglo de 3. Las posiciones son 0, 1 y 2. Java avisa con `ArrayIndexOutOfBoundsException`." |
| 7:00 | **PAUSA** | "Pausa: ¿qué pasa si alguien intenta poner vida = -50? Escríbelo y compruébalo." |
| 7:20 | Solución | "La vida queda en 0. El setter hizo su trabajo." |
| 7:35 | Tip de oro | "Tip de oro: haz privados los atributos por defecto y abre solo lo necesario." |
| 7:45 | Avance | "Tienes todas las piezas. A armar el juego completo. Lección 8." |

## Pausa interactiva
"Pausa: ¿qué pasa si alguien intenta poner vida = -50?"

## Descripción sugerida para YouTube
```
Lección 7 de 8: Encapsulación (private, getters y setters) y arreglos de objetos.
Practica aquí (sin instalar nada): [ENLACE AL EDITOR EN LÍNEA PRECARGADO]
Código del curso: [ENLACE AL REPOSITORIO]
```

## Lista de verificación
- [ ] Mostrar el error de acceso a un atributo `private`.
- [ ] Mostrar el error de índice fuera del arreglo.
- [ ] Sin nombres de autores en pantalla.
