import java.util.ArrayList;
import java.util.Collections;

public class Valores implements ValoresITF {
	
	public static void main(String[] args) {
		Valores v = new Valores();
		v.ins(1);
		v.ins(2);
		
	}
	
	private final ArrayList<Integer> lista = new ArrayList<>();
	

	@Override
	public boolean ins(int v) {
		
				
		if (v > 0 && lista.size() >= 10) {
			return false;
		}
		
		return this.lista.add(v);
		
	}

	@Override
	public int del(int i) {
		
		int valor = i;
		if (lista.isEmpty()) {
			return -1;	
			
		} else {
			lista.remove(i);
			return lista.get(valor);
		}
		
	}

	@Override
	public int size() {
		int qtd = lista.size();
		return qtd;
	}

	@Override
	public double mean() {
		
		double media;
		
		media = lista.stream().mapToDouble(a -> a).average().orElse(-1);
		
		return media;
		
	}

	@Override
	public int greater() {
		
		int maior = Collections.max(lista);
		
		return maior;
	}

	@Override
	public int lower() {
		
		int menor = Collections.min(lista);
		
		return menor;
	}

}