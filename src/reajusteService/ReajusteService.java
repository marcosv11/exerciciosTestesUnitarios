package reajusteService;

import java.math.BigDecimal;

import exFuncionarioBonificacao1.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
		BigDecimal porcentual = desempenho.percentualReajuste();
		BigDecimal reajuste = funcionario.getSalario().multiply(porcentual);
		funcionario.reajustarSalario(reajuste);
	}

}