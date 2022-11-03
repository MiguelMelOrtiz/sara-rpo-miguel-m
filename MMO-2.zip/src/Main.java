import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("Bienvenidos Energy de France");
		System.out.println("Para saber más ingrese una opción");
		ArrayList<AgenteMercado> lista=new ArrayList<>(8);
		Scanner linea=new Scanner(System.in);
		while(true) {
			System.out.println("1. Listar los datos de los Agentes de Mercado");
			System.out.println("2. Listar los datos de la Planta de Generación");
			System.out.println("3. Mostrar Agentes de Mercado");
			System.out.println("4. Mostrar Planta de Generación");
			System.out.println("5. Salir");
			int opcion=linea.nextInt();
			AgenteMercado[] dd=new AgenteMercado[8];
			PlantaGeneración[] kk=new PlantaGeneración[1];
			switch(opcion) {
			case 1:
				System.out.println("Ingrese los agentes de mercado");
				int w=linea.nextInt();
				for(int i=0;i<w;i++) {
					System.out.println("Ingrese el id del agente de mercado");
					Long id=linea.nextLong();
					System.out.println("Ingrese el nombre del agente de mercado");
					String nombre=linea.next();
					PlantaGeneración [] pg=new PlantaGeneración [2]; 
					System.out.println("Ingrese la planta de generación inscrita");
					for(int j=0;j<1;j++) {
						String plantasGeneración=linea.next();
					}
					System.out.println("Ingrese la ciudad a del agente de mercado");
					String ciudad=linea.next();
					System.out.println("Ingrese el presidente del agente de mercado");
					String presidente=linea.next();
					System.out.println("Ingrese el dinero dispoible");
					double dineroDisponible=linea.nextDouble();
					dd[i]=new AgenteMercado(id, nombre, pg, ciudad, presidente, dineroDisponible);
				}
				
				break;
			case 2:
				for(int j=0;j<2;j++) {
					System.out.println("Ingrese el id de la planta de generación");
					int idp=linea.nextInt();
					System.out.println("Ingrese los recursos de la planta de generación");
					String recursosp=linea.next();
					System.out.println("Ingrese la ciudad a la que pertenece la planta de generación");
					String ciudadp=linea.next();
					System.out.println("Ingrese la fecha incial de la planta de generación");
					String fechaInicial=linea.next();
					String [] fm=new String[2];
					System.out.println("Ingrese la fecha de mantenimiento de la planta de generación");
					for(int i=0;i<1;i++) {
						String fechasMantenimiento=linea.next();
					}
					System.out.println("Ingrese el factor de la dispoibilidad de la planta de generación");
					double factorDeDisponibilidad=linea.nextDouble();
					System.out.println("Ingrese el presupuesto del mantenimiento de la planta de generación");
					double presupuestoMantenimiento=linea.nextDouble();
					kk[j]=new PlantaGeneración(idp,recursosp,ciudadp, fechaInicial, fm, factorDeDisponibilidad, presupuestoMantenimiento);
				}
				break;
			case 3: 
				System.out.println("Agentes de Mercado");
				for(AgenteMercado l:dd) {
					l.listaAgenteMercado();
				}
				break;
			case 4:
				System.out.println("Plantas de Generación");
				for(AgenteMercado l:dd) {
					for(PlantaGeneración m:l.getPlantasGeneración()) {
						System.out.println(m);
					}
				}
			case 5:
				System.out.println("Vuelva pronto, ha sido un placer atenderlo");
				return;
			default:
				System.out.println("Lea bien las opciones dadas");
				break;
			}
		}
	}
}