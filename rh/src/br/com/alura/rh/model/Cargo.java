package br.com.alura.rh.model;

public enum Cargo {

	ASSISTENTE {
		public Cargo getProximoCargo() {
			return ANALISTA;
		}
	},
	ANALISTA {
		public Cargo getProximoCargo() {
			return ESPECIALISTA;
		}
	},
	ESPECIALISTA {
		public Cargo getProximoCargo() {
			return GERENTE;
		}
	},
	GERENTE {
		public Cargo getProximoCargo() {
			return GERENTE;
		}
	};

	public abstract Cargo getProximoCargo();

}
