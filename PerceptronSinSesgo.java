// Clase PerceptronSinSesgo (Entrena para la compuerta AND)
class PerceptronSinSesgo extends Perceptron {
    public PerceptronSinSesgo(double learningRate, int epochs) {
        super(2, learningRate, epochs); // 2 entradas (x1 y x2)
    }

    // Implementación del entrenamiento
    @Override
    public void train(double[][] inputs, double[] expectedOutputs) {
        for (int epoch = 0; epoch < epochs; epoch++) {
            for (int i = 0; i < inputs.length; i++) {
                // Calcula la suma ponderada
                double weightedSum = weights[0] * inputs[i][0] + weights[1] * inputs[i][1];
                double output = this.sigmoid(weightedSum); // Aquí se usa la función sigmoide
                double error = expectedOutputs[i] - output;

                // Actualización de pesos
                weights[0] += learningRate * error * inputs[i][0];
                weights[1] += learningRate * error * inputs[i][1];

                // Mostrar cálculos paso a paso
                System.out.printf("AND: x1=%.1f x2=%.1f | Sum=%.4f | Output=%.4f | Error=%.4f\n",
                        inputs[i][0], inputs[i][1], weightedSum, output, error);
            }
        }
        System.out.println("Pesos finales para AND: w1=" + weights[0] + " w2=" + weights[1]);
    }
}