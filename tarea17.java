import javax.swing.JOptionPane;

public class tarea17 {
    public static void main(String args[]) {
        String[] but = { "Dólar americano", "Euro", "Yen", "Dólar de Hong Kong" };
        String val = "";
        int window = JOptionPane.showOptionDialog(null, "Elige una opción de conversión de peso mexicano a:", "Botón",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, but, but[0]);

        float cant = 0, resp = Float
                .parseFloat(JOptionPane.showInputDialog(null, "Introduzca la cantidad en pesos mexicanos: "));

        switch (window) {
            case 0: {
                val = "dolares americanos.";
                cant = resp / (203 / 10);
                break;
            }
            case 1: {
                val = "euros.";
                cant = resp / (2358 / 100);
                break;
            }
            case 2: {
                val = "yenes.";
                cant = (float) (resp / 0.18);
                break;
            }
            case 3: {
                val = "dolares hongkonés.";
                cant = (float) (resp * 0.39);
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "La conversión quedó en " + cant + " " + val, "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
