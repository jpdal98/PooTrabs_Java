
public class Animal {

	public int idanimal;
    public String nome;
	public String especie;
	public Cliente dono;
	
	public Animal(int idanimal, String nome, String especie, Cliente dono) {
		this.idanimal = idanimal;
		this.nome = nome;
		this.especie = especie;
		this.dono = dono;
	}
	
	public String toString() {
		return "Animal: " + idanimal + " : " + nome + " : " + especie + " : " + dono;
	}
}
