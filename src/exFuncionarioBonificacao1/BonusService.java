package exFuncionarioBonificacao1;

import java.math.BigDecimal;

public class BonusService {

	
	public BigDecimal calculaBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if(valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new  IllegalArgumentException("Funcionario com osalario maior que o permitido para o bonus");
		}
		return valor;
	}
	
	
}
