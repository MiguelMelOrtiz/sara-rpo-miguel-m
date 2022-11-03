import java.util.Arrays;

public class AgenteMercado {
 private long id;
 private String nombre;
 private PlantaGeneración plantasGeneración[];
 private String ciudad;
 private String presidente;
 private double dineroDisponible;
@Override
public String toString() {
	return "AgenteMercado [id=" + id + ", nombre=" + nombre + ", plantasGeneración="
			+ Arrays.toString(plantasGeneración) + ", ciudad=" + ciudad + ", presidente=" + presidente
			+ ", dineroDisponible=" + dineroDisponible + "]";
}
public AgenteMercado(long id, String nombre, PlantaGeneración[] plantasGeneración, String ciudad, String presidente,
		double dineroDisponible) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.plantasGeneración = plantasGeneración;
	this.ciudad = ciudad;
	this.presidente = presidente;
	this.dineroDisponible = dineroDisponible;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public PlantaGeneración[] getPlantasGeneración() {
	return plantasGeneración;
}
public void setPlantasGeneración(PlantaGeneración[] plantasGeneración) {
	this.plantasGeneración = plantasGeneración;
}
public String getCiudad() {
	return ciudad;
}
public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}
public String getPresidente() {
	return presidente;
}
public void setPresidente(String presidente) {
	this.presidente = presidente;
}
public double getDineroDisponible() {
	return dineroDisponible;
}
public void setDineroDisponible(double dineroDisponible) {
	this.dineroDisponible = dineroDisponible;
}
public void listaAgenteMercado() {
	for(int i=0;i<plantasGeneración.length;i++) {
		System.out.println(plantasGeneración[8]);
		}
	}
}