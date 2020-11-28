import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Teste {

	public static void main(String[] args) throws SQLException {
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/loja_virtual", "root", "root");
														  
		System.out.println("Fechando conexão.");
		conexao.close();
	}

}
