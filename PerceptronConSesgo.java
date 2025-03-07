// Clase PerceptronConSesgo (Entrena para la compuerta OR)
class PerceptronConSesgo extends Perceptron {
    public PerceptronConSesgo(double learningRate, int epochs) {
        super(2, learningRate, epochs); // 2 entradas
    }

    // Implementación del entrenamiento
    @Override
    public void train(double[][] inputs, double[] expectedOutputs) {
        for (int epoch = 0; epoch < epochs; epoch++) {
            for (int i = 0; i < inputs.length; i++) {
                // Calcula la suma ponderada con sesgo
                double weightedSum = weights[0] * inputs[i][0] + weights[1] * inputs[i][1] + bias;
                double output = this.sigmoid(weightedSum); // Aquí se usa la función sigmoide

                double error = expectedOutputs[i] - output;

                // Actualización de pesos y sesgo
                weights[0] += learningRate * error * inputs[i][0];
                weights[1] += learningRate * error * inputs[i][1];
                bias += learningRate * error;

                // Mostrar cálculos paso a paso
                System.out.printf("OR: x1=%.1f x2=%.1f | Sum=%.4f | Output=%.4f | Error=%.4f\n",
                        inputs[i][0], inputs[i][1], weightedSum, output, error);
            }
        }
        System.out.println("Pesos finales para OR: w1=" + weights[0] + " w2=" + weights[1] + " bias=" + bias);
    }
}