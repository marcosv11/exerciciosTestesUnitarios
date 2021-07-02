package reajusteService;

import java.math.BigDecimal;

public enum Desempenho {

	BOM {
		@Override
		public BigDecimal percentualReajuste() {

			return new BigDecimal("0.15");
		}
	},
	A_DESEJAR {
		@Override
		public BigDecimal percentualReajuste() {

			return new BigDecimal("0.03");
		}
	},
	OTIMO {
		@Override
		public BigDecimal percentualReajuste() {

			return new BigDecimal("0.30");
		}
	};

	public abstract BigDecimal percentualReajuste();
}
