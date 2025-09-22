# Editor de Texto con Undo/Redo 📝

Un programa sencillo en Java que simula un editor de texto básico con funcionalidades de **deshacer (undo)** y **rehacer (redo)** usando la estructura de datos Stack (Pila).

## ¿Qué hace este programa? 🤔

Este programa te permite:
- ✅ Agregar texto
- ↩️ Deshacer la última acción (undo)
- ↪️ Rehacer una acción deshecha (redo)
- 👀 Ver el texto actual
- 🚪 Salir del programa

## ¿Cómo funciona? ⚙️

El programa utiliza **dos pilas (Stack)**:
- **Pila de Undo**: Guarda todo el texto que vas agregando
- **Pila de Redo**: Guarda el texto que has deshecho para poder rehacerlo después

### Ejemplo de uso:
1. Agregas "Hola" → Se guarda en la pila de undo
2. Agregas "Mundo" → Ahora tienes "Mundo" como texto actual
3. Haces undo → "Mundo" se mueve a la pila de redo, y vuelves a "Hola"
4. Haces redo → "Mundo" regresa a la pila de undo

## Requisitos 📋

- **Java 8 o superior** instalado en tu computadora
- Un editor de texto o IDE (como IntelliJ IDEA, Eclipse, VS Code, etc.)
- Conocimientos básicos de Java

## ¿Cómo ejecutar el programa? 🚀

### Paso 1: Descargar el código
Copia el código en un archivo llamado `TextEditor.java`

### Paso 2: Compilar
Abre la terminal/cmd en la carpeta donde guardaste el archivo y ejecuta:
```bash
javac TextEditor.java
```

### Paso 3: Ejecutar
```bash
TextEditor.java
```

## Menú de opciones 📋

Cuando ejecutes el programa verás este menú:

```
--- MENÚ ---
1) Añadir texto
2) Deshacer (undo)
3) Rehacer (redo)
4) Mostrar texto actual
5) Salir
```

### Descripción de cada opción:

**1) Añadir texto**: 
- Te permite escribir texto que se guardará como la versión más reciente
- El texto anterior se puede recuperar con "deshacer"

**2) Deshacer (undo)**:
- Elimina el último texto agregado
- El texto eliminado se guarda para poder rehacerlo después

**3) Rehacer (redo)**:
- Restaura el último texto que fue deshecho
- Solo funciona si previamente has usado "deshacer"

**4) Mostrar texto actual**:
- Muestra el texto que está actualmente "activo"
- Si no hay texto, muestra "(Pila vacía)"

**5) Salir**:
- Cierra el programa

## Ejemplo práctico 💡

```
Ejecutas el programa:

1. Eliges opción 1 y escribes "Primera línea"
2. Eliges opción 4 → Muestra: "Primera línea"
3. Eliges opción 1 y escribes "Segunda línea"  
4. Eliges opción 4 → Muestra: "Segunda línea"
5. Eliges opción 2 (deshacer) → Vuelve a "Primera línea"
6. Eliges opción 3 (rehacer) → Regresa a "Segunda línea"
```

## Conceptos que puedes aprender 📚

- **Stack (Pila)**: Estructura de datos LIFO (Last In, First Out)
- **Scanner**: Para leer entrada del usuario
- **Switch-case**: Para manejar las opciones del menú
- **Bucles while**: Para mantener el programa corriendo
- **Manejo de excepciones**: Verificar si las pilas están vacías

## Posibles mejoras 🔧

Si quieres practicar más, puedes agregar:
- Guardar el texto en un archivo
- Permitir editar texto existente
- Agregar más opciones como "limpiar todo"
- Implementar un límite de acciones para deshacer
- Agregar colores en la consola

## ¿Problemas comunes? 🐛

**Error de compilación**: 
- Verifica que tengas Java instalado: `java -version`
- Asegúrate de que el archivo se llame exactamente `TextEditor.java`

**El programa no responde**:
- Asegúrate de escribir solo números (1-5) en el menú
- Presiona Enter después de escribir tu opción

## Autor 👨‍💻

David Acevedo Lopez
Alejandro Rendon Moncada
