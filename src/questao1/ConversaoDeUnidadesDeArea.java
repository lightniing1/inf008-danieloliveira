package questao1;

public class ConversaoDeUnidadesDeArea {
	
	public double MetroQuadradoParaPeQuadrado (double valor) {
		valor = valor * 10.764;
		return valor;
	};
	
	public double MetroQuadradoParaAcre (double valor) {
		valor = valor / 4047; //Resultado vai ser aproximado
		return valor;
	};
	
	public double MetroQuadradoParaCentimetrosQuadrado (double valor) {
		valor = valor * 10000;
		return valor;
	};
	
	/***************/
	
	public double PeQuadradoParaCentimetrosQuadrado (double valor) {
		valor = valor / 0.0010764;
		return valor;
	};
	
	public double MilhaQuadradaParaAcre (double valor) {
		valor = valor * 640;
		return valor;
	};
	
	public double AcreParaPeQuadrado (double valor) {
		valor = valor * 43560;
		return valor;
	};
}
