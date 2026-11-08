//El Filtro de Direcciones IP Locales

public class apuntes_array3 {
    public static void main(String[] args) {
        // Array de IPs de origen que intentan acceder al servidor
        String[] ipsOrigen = {
            "192.168.1.15", 
            "8.8.8.8", 
            "192.168.1.100", 
            "10.0.0.5", 
            "192.168.2.10"
        };

        int contadorLocales = 0;
        int contadorExternas = 0;

        System.out.println("=== CLASIFICACIÓN DE TRÁFICO IP ===");

        // Recorremos el array con un bucle for
        for (int i = 0; i < ipsOrigen.length; i++) {
            String ipActual = ipsOrigen[i];

            // Condicional evaluando si comienza con la subred local
            if (ipActual.startsWith("192.168.")) {
                contadorLocales++;
                System.out.println("IP " + ipActual + " -> Tráfico LOCAL (Permitido directo)");
            } else {
                contadorExternas++;
                System.out.println("IP " + ipActual + " -> Tráfico EXTERNO (Pasa por pasarela)");
            }
        }

        System.out.println("\n--- RESUMEN FINAL ---");
        System.out.println("IPs de Red Local: " + contadorLocales);
        System.out.println("IPs Externas     : " + contadorExternas);
    }
}