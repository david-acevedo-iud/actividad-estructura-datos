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
- Si no hay texto, muestra "Nada para mostrar"

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

- ## Capturas de pantalla de ejecución
![be3e913d-a9cc-43b0-a6a5-d0e0d9d54c05](https://github.com/user-attachments/assets/9c7d50a0-c908-41cd-8a38-ea8a4886f719)
![41157d85-51cc-4693-beb5-2f50350e9f59](https://github.com/user-attachments/assets/a0dc750c-23db-44cf-a565-c192d84e449d)
![b9fc0952-22eb-4088-9fee-4d8c1eb7ac1c](https://github.com/user-attachments/assets/22792a1b-e7c4-4ebe-9929-9f09156a28b5)
![97e52842-c93e-4eb4-ac05-96bac79ecd9a](https://github.com/user-attachments/assets/ad64105d-e48d-4a33-b3d7-08b7b779c2ac)
![16b84d1d-0d9f-417a-9a27-252177c9c308](https://github.com/user-attachments/assets/4d27502b-3116-4b25-99f5-ea61df003b69)
![a39fbc9f-063d-41bb-8fd5-13681636ac5e](https://github.com/user-attachments/assets/23c9a8b4-3ec5-4c12-bfa9-f40e52535fb9)
![e42c36b5-5422-4d14-8811-d1852d06105e](https://github.com/user-attachments/assets/b2b85b84-3fe6-4157-8bde-2f63cb514ba1)
![842ff74d-739c-4c81-a49a-c58cb7f6e86b](https://github.com/user-attachments/assets/f4aee51b-6793-45f6-a518-5ebad3c3bd0a)
![b8895c61-3891-4335-9923-52151b203cbd](https://github.com/user-attachments/assets/9199e8cb-e3b6-41fb-a8d4-4d0d55265f89)
![d82df534-dc25-4f96-91db-e4d8bef41222](https://github.com/user-attachments/assets/c6a34dc8-72a0-42c8-9999-01994fc031de)
![ae9b60e2-bdb8-4b5f-87ba-caed9ca00bdf](https://github.com/user-attachments/assets/8ed236f1-5264-4f63-a7e9-4556b859eedc)


## Autores 👨‍💻

David Acevedo Lopez - 1020447532
Alejandro Rendon Moncada - 1152467574
