package datos.pagos;

import datos.modelos.Habitacion;

@FunctionalInterface
public interface IFormaPago {
	
	void reservar(double monto,Habitacion hab);
	
}
