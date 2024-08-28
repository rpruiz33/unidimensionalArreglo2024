package modelo;

import java.util.Arrays;

public class ArregloUnidimensional {
private int vector[];

public int[] getVector() {
	return vector;
}

public void setVector(int[] vector) {
	this.vector = vector;
}

public ArregloUnidimensional(int[] vector) {
	super();
	this.vector = vector;
}

public int traerElMenor() {
	int min=vector[0];
	
	for (int i=0;i<vector.length;i++) {
		if(vector[i]<min) {
			min=vector[i];
		}
	}
	return min;
} 

public int traerElMayor() {
	int max=vector[0];
	
	for (int i=0;i<vector.length;i++) {
		if(vector[i]>max) {
			max=vector[i];
		}
	}
	return max;
} 

public double calcularPromedio() {
	double prom=0;
	for(int i=0;i<vector.length;i++) {
		prom=prom+vector[i];
	}
	return prom/vector.length;
}
public int[] ordenarAscendente() {
    int[] copiaVector = Arrays.copyOf(vector, vector.length);
    int aux;

    for (int i = 0; i < copiaVector.length - 1; i++) {
        for (int j = i + 1; j < copiaVector.length; j++) {
            if (copiaVector[i] > copiaVector[j]) {
                aux = copiaVector[i];
                copiaVector[i] = copiaVector[j];
                copiaVector[j] = aux;
            }
        }
    }

    return copiaVector;
}
public int [] ordenarDescendente() {
	int aux=0;
	 for (int i = 0; i < vector.length - 1; i++) {
         for (int j = i + 1; j < vector.length; j++) {
			if(vector[i]<vector[j]) {
				aux=vector[j];
				vector[j]=vector[i];
				vector[i]=aux;
			}
		}
	}
	return vector;
	
}
public double traerFrecuencia(float numero) {
	int cont=0;
		for (int i=0;i<vector.length;i++) {
		if(vector[i]==numero) {
			cont++;
		}
	}
		return(cont/vector.length);
}


public int traermoda() {
	int maxRepe = 0;
	int moda = 0;
	for (int i = 0; i < vector.length; i++) {
		int cont = 0;
		for (int j = 0; j < vector.length; j++) {
			if (vector[i] == vector[j]) {
				cont++;
			}

		}
		if (maxRepe < cont) {
			maxRepe = cont;
			moda = vector[i];
		}
	}
	return moda;
}
}