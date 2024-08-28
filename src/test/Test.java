package test;
import modelo.ArregloUnidimensional;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vector = {1,3,2,4,2,5};
		ArregloUnidimensional arreglo = new ArregloUnidimensional(vector);
		int[] vectorOrdenado =arreglo.ordenarAscendente();
		int[] vectorOrdenado2 =arreglo.ordenarDescendente();
		System.out.println("vector ordenado aecendente");
		for(int i:vectorOrdenado) {
			System.out.println(i+" ");
		}
		System.out.println("\n-----------------------------------------------\n");
		for(int i:vectorOrdenado2) {
			System.out.println(i+" ");
		}
		System.out.println(arreglo.calcularPromedio());;
		System.out.println(arreglo.traerElMenor());
		System.out.println(arreglo.traerElMayor());
		System.out.println(arreglo.traerFrecuencia(2));
		System.out.println(arreglo.traermoda());
	}

}
