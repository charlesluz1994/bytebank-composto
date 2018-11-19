
public class TestaBanco {

	public static void main(String[] args) {
		Cliente charles = new Cliente();
		charles.nome = "Charles Luz";
		charles.cpf = "428.282.308-99";
		charles.profissao = "Programador";
		
		Conta contaDoCharles = new Conta();
		contaDoCharles.deposita(100);
		
		contaDoCharles.titular = charles;
		
		System.out.println(contaDoCharles.titular.nome);

	}

}
