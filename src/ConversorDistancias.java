import javax.swing.JOptionPane;

public class ConversorDistancias {
	
	static void convertirDistancia( double distancia) {
		double CM_TO_MTS = 100;
		double CM_TO_KMS = 100000;
		double MTS_TO_MILLA = 1609;
		double KMS_TO_MILLA = 1.609;
		double MTS_TO_YARDA = 1.094;
		double KMS_TO_YARDA = 1094;
		double MTS_TO_PIE = 3.281;
		double KMS_TO_PIE = 3281;
		
		String opcionMenu;

		opcionMenu = (JOptionPane.showInputDialog(null, "Elige la distancia que deseas convertir  ", "Conversor Monedas Alura ONE", JOptionPane.PLAIN_MESSAGE, null,
			new Object[] { "Selecciona", "Centimetros a Metros", "Centimetros a Kilometros",
										 "Metros a Millas", "Kilometros a Millas", 
										 "Metros a Yardas", "Kilometros a Yardas",
										 "Metros a Pies", "Kilometros a Pies"},
			"Selecciona")).toString();
		
		switch (opcionMenu) {
		//DE CENTRIMETROS A METROS
	case "Centimetros a Metros":
		JOptionPane.showMessageDialog(null, "Son " + (distancia / CM_TO_MTS) + " Metros");
		break;
		//DE KILOMETROS A METROS
	case "Kilometros a Metros":
		JOptionPane.showInternalMessageDialog(null, "Son " + (distancia / CM_TO_KMS) + " Kilometros");
		break;
		//DE METROS A MILLAS
	case "Metros a Millas":
		JOptionPane.showInternalMessageDialog(null, "Son " + distancia / MTS_TO_MILLA + " Millas");
		break;
		//DE KILOMETROS A MILLAS
	case "Kilometros a Millas":
		JOptionPane.showInternalMessageDialog(null, "Son " + distancia / KMS_TO_MILLA + " Millas");
		break;
		//DE METROS A YARDAS
	case "Metros a Yardas":
		JOptionPane.showInternalMessageDialog(null, "Son " + distancia / MTS_TO_YARDA + " Yardas");
		break;
		//DE KILOMETROS A YARDAS
	case "Kilometros a Yardas":
		JOptionPane.showInternalMessageDialog(null, "Son " + distancia / KMS_TO_YARDA  + " Yardas");
		break;
		//DE METROS A PIES
	case "Metros a Pies":
		JOptionPane.showInternalMessageDialog(null, "Son " + distancia / MTS_TO_PIE + " Pies");
		break;
		//DE KILOMETROS A PIES
	case "Kilometros a Pies":
		JOptionPane.showInternalMessageDialog(null, "Son " + distancia / KMS_TO_PIE + " Pies");
		break;
	
	default:

		break;

	}
		
	}

}
