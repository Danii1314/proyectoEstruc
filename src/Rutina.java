public class Rutina {

    private String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};


    private String[][] ejercicios = {


            {"Press de banca", "Sentadillas", "Peso muerto", "Dominadas"},


            {"Curl de bíceps", "Press militar", "Remo", "Zancadas"},


            {"Extensiones de tríceps", "Abdominales", "Flexiones", "Plancha"},


            {"Press inclinado", "Peso muerto rumano", "Face pull", "Hip thrust"},


            {"Fondos", "Elevaciones laterales", "Curl martillo", "Crunch"}
    };

    public String obtenerRutinaDiaria() {

        java.time.DayOfWeek dia = java.time.LocalDate.now().getDayOfWeek();
        int indice = (dia.getValue() - 1) % 5;


        String rutina = "\n=== Rutina para " + diasSemana[indice] + " ===\n";


        for (String ejercicio : ejercicios[indice]) {
            rutina += "- " + ejercicio + "\n";
            rutina += "  Series: 4 x 12-15 repeticiones\n";
        }

        return rutina;
    }
}
