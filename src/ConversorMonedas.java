import javax.swing.JOptionPane;

public class ConversorMonedas{

	
	static void convertirMoneda( double montoIngresado) {
		double ARS_TO_USD = 0.0051;
		double ARS_TO_EUR = 0.0048;
		double ARS_TO_LIB = 0.043;
		double ARS_TO_YEN = 0.70;
		double ARS_TO_WON = 6.74;
	
		double USD_TO_ARS = 195.61;
		double EUR_TO_ARS = 206.37;
		double LIB_TO_ARS = 233.19;
		double YEN_TO_ARS = 1.43;
		double WON_TO_ARS = 0.15;

		String opcionMenu;

		opcionMenu = (JOptionPane.showInputDialog(null, "Elige la moneda a la que deseas convertir  ", "Conversor Monedas Alura ONE", JOptionPane.PLAIN_MESSAGE, null,
			new Object[] { "Selecciona", "Peso a Dólar", "Peso a Euro", "Peso a Libras", "Peso a Yen", "Peso a Won Coreano", "Dólar a Pesos", "Euro a Pesos", "Libras a Pesos", "Yen a Pesos", "Won Coreano a Pesos" },
			"Selecciona")).toString();

		switch (opcionMenu) {
			//DE PESOS ARGENTINO A DOLARES
		case "Peso a Dólar":
			JOptionPane.showMessageDialog(null, "U$D " + (montoIngresado * ARS_TO_USD) + " Dolares");
			break;
			//DE PESOS ARGENTINO A EUROS
		case "Peso a Euro":
			JOptionPane.showInternalMessageDialog(null, "€ " + (montoIngresado * ARS_TO_EUR) + " Euros");
			break;
			//DE PESOS ARGENTINO A LIBRAS
		case "Peso a Libras":
			JOptionPane.showInternalMessageDialog(null, "£ " + montoIngresado * ARS_TO_LIB + " Libras");
			break;
			//DE PESOS ARGENTINO A YEN JAPONES
		case "Peso a Yen":
			JOptionPane.showInternalMessageDialog(null, "¥ " + montoIngresado * ARS_TO_YEN + " Yenes");
			break;
			//DE PESOS ARGENTINO A WON COREANO
		case "Peso a Won Coreano":
			JOptionPane.showInternalMessageDialog(null, "₩ " + montoIngresado * ARS_TO_WON + " Wons");
			break;
			
			//DE DOLARES A PESOS ARGENTINO
		case "Dólar a Pesos":
			JOptionPane.showInternalMessageDialog(null, "$ " + montoIngresado * USD_TO_ARS  + " Pesos");
			break;
			//DE EURO A PESOS ARGENTINO
		case "Euro a Pesos":
			JOptionPane.showInternalMessageDialog(null, "$ " + montoIngresado * EUR_TO_ARS + " Pesos");
			break;
			//DE LIBRAS A PESOS ARGENTINO
		case "Libras a Pesos":
			JOptionPane.showInternalMessageDialog(null, "$ " + montoIngresado * LIB_TO_ARS + " Pesos");
			break;
			//DE YEN A PESOS ARGENTINO
		case "Yen a Pesos":
			JOptionPane.showInternalMessageDialog(null, "$ " + montoIngresado * YEN_TO_ARS + " Pesos");
			break;
			//DE WON COREANO A PESOS ARGENTINO
		case "Won Coreano a Pesos":
			JOptionPane.showInternalMessageDialog(null, "$ " + montoIngresado * WON_TO_ARS + " Pesos");
			break;
			
		default:

			break;

		}
		//return WON_TO_ARS;		
	}
}
	
