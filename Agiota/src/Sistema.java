import java.util.ArrayList;

 class Sistema {

	
	public float saldo = 0;
	public float dinheiro;
	public int id_transacao = 0;
	public int id = 0;
	
	ArrayList<Cliente> clientes;
	ArrayList<Divida> dividas;
	
	public Sistema(float dinheiro) {
		this.dinheiro = dinheiro;
		clientes = new ArrayList<Cliente>();
		dividas =  new ArrayList<Divida>();
		saldo = saldo + dinheiro;
	}

	public String toString() {
		return "Sistema iniciado com : " + saldo + " " + clientes.toString() + "\n";
	}

	public void cadastrarClientes(String nome, String clienteid) {
		for (Cliente c1 : clientes)
			if (c1.nome.equals(nome))
				throw new RuntimeException("Pessoa já cadastrada");

		clientes.add(new Cliente(clienteid, nome));
	}

	public void emprestarDinheiro(String nome, float valor) {
		for (Cliente c1 : clientes)
			if (c1.nome.equals(nome) ) { 
				c1.saldo = valor + c1.saldo;
				this.cadastrarDivida(nome, valor);
		        return;
	        }
		
		throw new RuntimeException("Pessoa ou saldo invalido");
	}

	public void cadastrarDivida(String nome, float valor) {
	   if(valor <= saldo) {
		  saldo = saldo + valor;
	      this.dividas.add(new Divida(nome,valor, id));
	      id++;
	      return;
	   }
	   else
		   throw new RuntimeException ("Saldo inferior ao valor pedido");
	   
	}
	
	public String mostrarDividas() {
			 return "" + dividas.toString();
	}

    public String mostrarClientes() {
    	String saida =  "";
    	for(int i = 0; i < clientes.size(); i++)
    	   saida += ""+ this.clientes.get(i).mostrarSaldoClientes();
    	return saida;
    }
    
    
	public void mostrarClienteEspecifico(String nome) {
		int i = 0;
		for (Cliente c : clientes) {
			if (c.nome.equals(nome)) {
				System.out.println(c.mostrarSaldoClientes());
				while( dividas.get(i).nome.equals(nome)) {
					       System.out.println( dividas.get(i).toString());
		                   i++;       
				}
			}
		return;
		}
	    throw new RuntimeException("Cliente não encontrado");
	}

 
	public void receberDinheiro(String nome, float valor) {
		for (Cliente c : clientes)
			if (c.nome.equals(nome)) {
				if (c.saldo < 0) {
					c.saldo = saldo + valor;
					dinheiro = dinheiro + valor;
					this.dividas.add(new Divida(nome, valor, id));
					id++;
					return;
				}
			}

		throw new RuntimeException("Cliente nao encontrado");

	}

	public void matarCliente(String nome) {
		for( int i = 0; i < clientes.size(); i++) {
			if(clientes.get(i).nome.equals(nome)) {
				this.clientes.remove(clientes.get(i));
				apagarDividas(nome);
		        return;
			}
		}
		
		throw new RuntimeException("Cliente não encontrado");
	}
 
	public void apagarDividas( String nome) {
		for(int i = 0 ; i<dividas.size(); i++) {
			if(dividas.get(i).nome.equals(nome))
				this.dividas.remove(dividas.get(i));
			    i--;
		}
	}
	
}
