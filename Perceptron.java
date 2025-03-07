// Librerías necesarias
import java.util.Random;

// Clase base Perceptron (Abstracta)
abstract class Perceptron {
    protected double[] weights; // Pesos sinápticos
    protected double bias; // Sesgo
    protected double learningRate; // Tasa de aprendizaje
    protected int epochs; // Número de iteraciones

    // Constructor del Perceptrón
    public Perceptron(int inputSize, double learningRate, int epochs) {
        this.weights = new double[inputSize]; // Inicializa el arreglo de pesos
        this.bias = new Random().nextDouble() * 2 - 1; // Inicializa el sesgo aleatoriamente
        this.learningRate = learningRate;
        this.epochs = epochs;
        initializeWeights(); // Llama a la función para inicializar pesos
    }

    // Método para inicializar los pesos aleatoriamente en el rango [-1,1]
    private void initializeWeights() {
        Random rand = new Random();
        for (int i = 0; i < weights.length; i++) {
            weights[i] = rand.nextDouble() * 2 - 1;
        }
    }

    // Función de activación escalón
    protected int activation(double x) {
        return x >= 0 ? 1 : 0;
    }

    // Función Sigmoide
    protected double sigmoid(double x) {
        return 1 / (1 + Math.exp(-x));
    }

    // Método abstracto para entrenar el perceptrón
    public abstract void train(double[][] inputs, double[] expectedOutputs);
}