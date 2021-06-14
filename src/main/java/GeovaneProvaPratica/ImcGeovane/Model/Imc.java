package GeovaneProvaPratica.ImcGeovane.Model;

public class Imc {
	private float altura,peso,imc;

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getImc() {
		return imc;
	}

	public void setImc(float imc) {
		this.imc = imc;
	}
	
	public String exibirImc() {
		this.imc = this.getPeso() / (this.getAltura() * this.getAltura());
		if(imc < 18.5) {
			return ("IMC: " + this.imc + " Você está baixo do peso com o risco elevado para sua saúde!");
		}else if(imc >= 18.5 && this.imc < 24.99 ) {
			return ("IMC: " + this.imc + " Você está com o peso Ideal, sem risco para sua saúde!");
		}else if(imc >= 25 && this.imc < 29.99) {
			return("IMC: " + this.imc + " Você está com excesso de Peso, risco elevado para sua saúde!");
		}else if(imc >= 30 && this.imc < 34.44) {
			return("IMC: " + this.imc + "  Você está com obesidade Grau 1, risco muito elevado para sua saúde!");
		}else if(imc >= 35 && this.imc < 39.99) {
			return("IMC: " + this.imc + " Você está com obesidade Grau 2, risco muitíssimo elevado para sua saúde!");
		}else if(imc >= 40) {
			return("IMC:" + this.imc + "  Você está com obseridade Grau 3, cuidado Obesidade Mórbida!");
		}
		return ("Erro");
	}

}
