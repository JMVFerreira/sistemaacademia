/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacademia;

import br.com.academia.dao.AlunoDAO;
import br.com.academia.model.Aluno;
import java.sql.SQLException;
import java.time.LocalDate;

public class TesteAlunoDAO {

    public static void main(String[] args) {

        Aluno a = new Aluno();
        a.setNome("Aluno Teste");
        a.setCpf("11122233344");
        a.setDataNascimento(LocalDate.of(2000, 1, 1));
        a.setTelefone("11999999999");
        a.setEmail("teste@teste.com");

        AlunoDAO dao = new AlunoDAO();

        try {
            dao.inserir(a);
            System.out.println("Aluno inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir aluno:");
            e.printStackTrace();
        }
    }
}

