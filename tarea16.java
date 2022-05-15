import javax.swing.JOptionPane;

public class tarea16 {
    public static void main(String args[]) {
        String[] but = { "°F a °C", "°C a °F" };
        String val;
        int window = JOptionPane.showOptionDialog(null, "Elige una opción.", "Botón", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, but, but[0]);

        float tempe, resp = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca los grados: "));

        if (window == 0) {
            val = "°C.";
            tempe = (resp - 32) * 5 / 9;
        } else {
            val = "°F.";
            tempe = (resp * 9 / 5) + 32;
        }
        JOptionPane.showMessageDialog(null, "El resultado de la conversinon es " + tempe + " " + val, "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}