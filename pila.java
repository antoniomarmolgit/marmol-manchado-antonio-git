/*
*@author Antonio Marmol
 *Esto es una prueba que hacemos con antoniomm 
 */

import java.util.ArrayList;

public class Pila<T> {
	private ArrayList<T> pila = null;

	Pila() {

		pila = new ArrayList<T>();

	}

	void push(T element) {
		pila.add(element);
	}

	T pop() {

		if (pila.size() == 0)
			return null;
		return pila.remove(pila.size() - 1);

	}

	T top() {

		if (pila.size() == 0)
			return null;
		return pila.get(pila.size() - 1);

	}

	void show() {
		System.out.println(pila);

	}
	
	boolean IsEmpty (){
		if (pila.size()==0)
		return true;
		return false;
	}

}

