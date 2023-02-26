import javax.swing.JOptionPane;

public class ConversorAlura {
	
	public static void main(String[] args) {
		
		String[] continuarOsalir = {"Continuar","Salir"};
		String opcionMenu = null;
		String cantidad;
		int continuar;
		double montoIngresado;
		double gradosIngresado;
		double distanciaIngresada;
		
		
			try {
				do {
					opcionMenu = (JOptionPane.showInputDialog(null, "Selecciona una opción de Conversion ", "Conversor Alura ONE - G4",
						JOptionPane.PLAIN_MESSAGE, null,
						new Object[] { "Selecciona", "Conversion de Monedas", "Conversion de Temperatura", "Conversion de Distancias" },
						"Selecciona")).toString();

				switch (opcionMenu) {
				//CONVERSOR DE MONEDAS
				case "Conversion de Monedas":
					cantidad = JOptionPane.showInputDialog("Ingrese el monto a cambiar");
					montoIngresado = Double.parseDouble(cantidad);
					//VERIFICA QUE EL VALOR INGRESADO SEA DIFERENTE DE 0
					if (montoIngresado != 0) {
						ConversorMonedas.convertirMoneda(montoIngresado);
					}
				break;
				
				//CONVERSOR DE TEMPERATURAS
				case "Conversion de Temperatura":
					cantidad = JOptionPane.showInputDialog("Ingresar los grados a converitr  ");
					gradosIngresado = Double.parseDouble(cantidad);

					ConversorTemperaturas.ConversionTem(gradosIngresado);
					break;
				
				//CONVERSOR DE DISTANCIAS
				case "Conversion de Distancias":
					cantidad = JOptionPane.showInputDialog("Ingresar la Distancia");
					distanciaIngresada= Double.parseDouble(cantidad);
					ConversorDistancias.convertirDistancia(distanciaIngresada);
				break;
				
				}
				continuar = JOptionPane.showInternalOptionDialog(null, "¿Deseas continuar?","Conversor Alura ONE - G4", 0, 0, null, continuarOsalir,"Continuar");
				
			} while (continuar == 0);

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "El valor ingresado no es valido. Intente de nuevo.");
		}  finally {
			JOptionPane.showInternalMessageDialog(null, "      Gracias por usar\nConversor Alura ONE - G4","Conversor Alura ONE - G4",0);
			}
	}
  
}


