import javax.swing.JOptionPane;

public class ConversorTemperaturas {
	
	static void ConversionTem(double temperatura) {

		String opcionMenu;
	
		opcionMenu = (JOptionPane.showInputDialog(null, " ¿Que conversion de temperatura necesitas? ", "Temperatura", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Selecciona", "Celcius a Fahrenheit", "Celcius a Kelvin", "De Fahrenheit a Celcius", "De Fahrenheit a Kelvin", "De Kelvin a Celcius", "De Kelvin a Fahrenheit" },
				"Selecciona")).toString();

		switch (opcionMenu) {
		
		case "Celcius a Fahrenheit":
			JOptionPane.showInternalMessageDialog(null, ((temperatura * 1.8) + 32) + " °F");
			break;

		case "Celcius a Kelvin":
			JOptionPane.showInternalMessageDialog(null, (temperatura + 273.15) + " °K");
			break;
			
		case "De Fahrenheit a Celcius":
			JOptionPane.showInternalMessageDialog(null, ((temperatura - 32) / 1.8) + " °C");
			break;

		case "De Fahrenheit a Kelvin":
			JOptionPane.showInternalMessageDialog(null, (((temperatura - 32) * 0.55) + 273.15) + " °K");
			break;

		case "De Kelvin a Celcius":
			JOptionPane.showInternalMessageDialog(null, (temperatura - 273.15) + " °C");
			break;
			
		case "De Kelvin a Fahrenheit":
			JOptionPane.showInternalMessageDialog(null, (((temperatura - 273.15) * 0.55) + 32) + " °F");
			break;
			
		default:
			JOptionPane.showInternalMessageDialog(null, "Selecciona un opcion invalida ");
			break;
		}
	}
}
