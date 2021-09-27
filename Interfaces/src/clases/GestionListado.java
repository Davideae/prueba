package clases;

import java.util.ArrayList;

import interfaces.IGestionListado;

public class GestionListado implements IGestionListado {
	public ArrayList<Integer> listado;
	private int contNumeros;
	
	public GestionListado() 
	{
		this.listado = new ArrayList<Integer>();
		//this.contNumeros = 0;
	}

	@Override
	public void nuevo(int numero) {
		if(this.listado.size() == 18) 
		{
			System.out.println("No introducido, el listado esta lleno");
		}
		else if(this.listado.contains(numero)) 
		{
			System.out.println("No introducido. Ya se encuentra en el listado");
		}else {
			this.listado.add(numero);
			this.listado.sort(null);
		}
	}

	@Override
	public void listar() {
		if(this.listado.size()==0) 
		{
			System.out.println("Listado vacio");
		}else 
		{
			for(int i=0;i<this.listado.size();i++) 
			{
				System.out.println(this.listado.get(i));
			}
		}
		
	}

	@Override
	public void eliminar(Integer numero) {
		if(listado.remove(numero)==false) 
		{
			System.out.println("No se encuentra el valor seleccionado");
		}else {
			listado.remove(numero);
			System.out.println("Valor eliminado");
		}
		
	}

	@Override
	public void eliminar() {
		this.listado.clear();
		System.out.println("Se han eliminado todos los elementos");
	}

	

}
