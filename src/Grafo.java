import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Grafo<T> {
	private Map<T, List<T>> map;
	
	public Grafo()
	{
		map = new HashMap<>();
	}

	
	public void addVertice(T v)
	{
		map.put(v, new LinkedList<T>());
	}
	
	public void addBorda(T origem, T destino, boolean bidirecional) {
		if(!map.containsKey(origem))
		{
			addVertice(origem);
		}
		if(!map.containsKey(destino))
		{
			addVertice(destino);
		}
		map.get(origem).add(destino);
		if(bidirecional == true)
		{
			map.get(destino).add(origem);
		}
	}
	
	public void contaVertices()
	{
		System.out.println("O grafo possui: " + map.keySet().size() + " vertices");
	}
	
	public void contaBordas(boolean bidirecional)
	{
		int contador = 0;
		for(T v : map.keySet())
		{
			contador += map.get(v).size();
		}
		if(bidirecional == true)
		{
			contador = contador/2;
		}
		System.out.println("O grafo possui: " + contador + " bordas");
	}
	
}
