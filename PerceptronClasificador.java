// Implementación del perceptrón para compuertas lógicas
class PerceptronClasificador extends Perceptron {
    public PerceptronClasificador(double learningRate, int epochs) {
        super(2, learningRate, epochs); // 2 entradas (x1 y x2)
    }

    // Implementación del entrenamiento
    @Override
    public void train(double[][] inputs, double[] expectedOutputs) {
        System.out.println("\n--- Inicio del entrenamiento ---");
        for (int epoch = 0; epoch < epochs; epoch++) {
            int errorCount = 0;
            System.out.println("\nÉpoca " + (epoch + 1) + ":");
            for (int i = 0; i < inputs.length; i++) {
                // Calcula la suma ponderada con sesgo
                double weightedSum = weights[0] * inputs[i][0] + weights[1] * inputs[i][1] + bias;
                int output = activation(weightedSum);
                double error = expectedOutputs[i] - output;

                // Imprimir cálculos paso a paso
                System.out.printf("Patrón %d: x1=%.1f x2=%.1f | Suma Ponderada=%.4f | Salida=%d | Esperado=%.0f | Error=%.1f\n",
                        i + 1, inputs[i][0], inputs[i][1], weightedSum, output, expectedOutputs[i], error);

                if (error != 0) {
                    errorCount++;
                    weights[0] += learningRate * error * inputs[i][0];
                    weights[1] += learningRate * error * inputs[i][1];
                    bias += learningRate * error;

                    System.out.printf("  ¡Ajuste realizado! Nuevos pesos: w1=%.4f w2=%.4f | Nuevo sesgo=%.4f\n",
                            weights[0], weights[1], bias);
                }
            }

            if (errorCount == 0) {
                System.out.println("\nEl clasificador ha convergido correctamente en la época " + (epoch + 1));
                break;
            }
        }
        System.out.printf("\nPesos finales: w1=%.4f w2=%.4f | Sesgo=%.4f\n", weights[0], weights[1], bias);
        System.out.println("--- Entrenamiento finalizado ---");
    }
}