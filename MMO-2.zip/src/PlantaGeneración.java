import java.util.Arrays;

public class PlantaGeneración {
private int idp;
private String recursop;
private String ciudadp;
private String fechaInicialp;
private String fechasMantenimiento [];
private double factorDeDisponibilidad;
private double presupuestoMantenimiento;
@Override
public String toString() {
	return "PlantaGeneración [id=" + idp + ", recurso=" + recursop + ", ciudad=" + ciudadp + ", fechaInicial="
			+ fechaInicialp + ", fechasMantenimiento=" + Arrays.toString(fechasMantenimiento)
			+ ", factorDeDisponibilidad=" + factorDeDisponibilidad + ", presupuestoMantenimiento="
			+ presupuestoMantenimiento + "]";
}
public PlantaGeneración(int id, String recurso, String ciudad, String fechaInicial, String[] fechasMantenimiento,
		double factorDeDisponibilidad, double presupuestoMantenimiento) {
	super();
	this.idp = id;
	this.recursop = recurso;
	this.ciudadp = ciudad;
	this.fechaInicialp = fechaInicial;
	this.fechasMantenimiento = fechasMantenimiento;
	this.factorDeDisponibilidad = factorDeDisponibilidad;
	this.presupuestoMantenimiento = presupuestoMantenimiento;
}
public int getId() {
	return idp;
}
public void setId(int id) {
	this.idp = id;
}
public String getRecurso() {
	return recursop;
}
public void setRecurso(String recurso) {
	this.recursop = recurso;
}
public String getCiudad() {
	return ciudadp;
}
public void setCiudad(String ciudad) {
	this.ciudadp = ciudad;
}
public String getFechaInicial() {
	return fechaInicialp;
}
public void setFechaInicial(String fechaInicial) {
	this.fechaInicialp = fechaInicial;
}
public String[] getFechasMantenimiento() {
	return fechasMantenimiento;
}
public void setFechasMantenimiento(String[] fechasMantenimiento) {
	this.fechasMantenimiento = fechasMantenimiento;
}
public double getFactorDeDisponibilidad() {
	return factorDeDisponibilidad;
}
public void setFactorDeDisponibilidad(double factorDeDisponibilidad) {
	this.factorDeDisponibilidad = factorDeDisponibilidad;
}
public double getPresupuestoMantenimiento() {
	return presupuestoMantenimiento;
}
public void setPresupuestoMantenimiento(double presupuestoMantenimiento) {
	this.presupuestoMantenimiento = presupuestoMantenimiento;
}
public void lolafechasMantenimiento() {
	for(int i=0;i<fechasMantenimiento.length;i++) {
		System.out.println(fechasMantenimiento[2]);
		}
	}
}
