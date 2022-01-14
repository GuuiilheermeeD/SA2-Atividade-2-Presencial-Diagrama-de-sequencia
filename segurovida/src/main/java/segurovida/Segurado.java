package segurovida;

public class Segurado {
	public String nome;
	public String nascimento;
	public boolean fumante;
	public String sexo;
	public int profissao;
	public float salario;
	public int idade;
	public float mensalidade;
	public double cobertura;
	
	public void CalcularSeguro()
	{
		float mensal;
	
			mensal = (this.salario * 5)/ 100;
		
			if((this.idade <= 18) && (this.idade >= 65)){
			System.out.println("Erro! Idade invalida para segurados");
			};
			
			
			if( this.profissao == 6 && this.profissao == 7) {
			System.out.println("Erro! Profição Invalida para segurados");
			}
			
			
			if(this.sexo == "F" && (this.idade >= 26) && (this.idade <=45)) {
				
				mensal = ((mensal + this.salario * 1) /100);
				
			};
			
			if(this.sexo == "F" && (this.idade >= 46) && (this.idade <=65)) {
			
				mensal = ((mensal + this.salario * 2) /100);
				
			};
			
			if(this.sexo == "M" && (this.idade >= 26) && (this.idade <=45)) {
				
				mensal = ((mensal + this.salario * 2) /100);
				
			};
			
			if(this.sexo == "F" && (this.idade >= 46) && (this.idade <=65)) {
				mensal = ((mensal + this.salario * 3) /100);
				
			};
			
			if(this.fumante = true) {
				mensal = ((mensal + this.salario * 2)/100);
			}
			
			
			this.mensalidade = mensal;
			
			float salario1 = 1500;
			float salario2 = 3000;
			float salario3 = 5000;
			double cober1 = 150000;
			double cober2 = 250000;
			double cober3 = 350000;
			double cober4 = 500000;
			
			if(this.salario <= salario1 ){
				
				this.cobertura = cober1;
				
			}else if ((this.salario > salario1 )&& (this.salario <= salario2)){
				
							this.cobertura = cober2;
							
			}else if((this.salario > salario2) && (this.salario <=  salario3)){
				
							this.cobertura = cober3;
			}else if(this.salario > salario3) {
				this.cobertura = cober4;
			};
		};

	};
