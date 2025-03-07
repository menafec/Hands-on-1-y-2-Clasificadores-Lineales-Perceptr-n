# Perceptrón en Java

Este proyecto implementa diferentes versiones del algoritmo de Perceptrón en Java, incluyendo:

- **Perceptrón con sesgo**
- **Perceptrón sin sesgo**
- **Perceptrón estándar**
- **Perceptrón clasificador**

## Estructura del Proyecto

El proyecto está organizado en las siguientes clases principales:

### 1. `Main`
Esta clase contiene el método `main` y es el punto de entrada del programa. Se encarga de crear instancias de las clases de perceptrón y ejecutar el entrenamiento y clasificación.

### 2. `Perceptron`
Clase base que implementa la lógica general del algoritmo de Perceptrón. Contiene métodos para:
- Inicialización de pesos
- Cálculo de la salida
- Entrenamiento del modelo

### 3. `PerceptronConSesgo`
Extiende la clase `Perceptron` e incluye un término de sesgo para mejorar la capacidad de aprendizaje del modelo.

### 4. `PerceptronSinSesgo`
Implementa un Perceptrón sin el término de sesgo, útil para comparar el rendimiento con la versión que incluye sesgo.

### 5. `PerceptronClasificador`
Clase específica para tareas de clasificación binaria, basada en el Perceptrón. Permite evaluar la precisión del modelo y probar nuevas instancias.

## Requisitos
- Java 8 o superior
- Un entorno de desarrollo como Visual Studio Code, IntelliJ IDEA o Eclipse

## Cómo Ejecutar
1. Compilar los archivos Java:
   ```sh
   javac Main.java
   ```
2. Ejecutar el programa:
   ```sh
   java Main
   ```

## Ejemplo de Salida
El clasificador ha convergido correctamente en la época 7

Pesos finales: w1=1.0467 w2=0.5095 | Sesgo=-1.3917
--- Entrenamiento finalizado ---

Entrenando Perceptrón para OR...

--- Inicio del entrenamiento ---

Época 1:
...
Época 2:
....

Época 3:
.....

Época 4:
......

Época 5:
.......

El clasificador ha convergido correctamente en la época 5




