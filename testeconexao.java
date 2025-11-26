/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package sistemaacademia;

import br.com.academia.dao.conexao;
import java.sql.Connection;
import java.sql.SQLException;

public class testeconexao {

    public static void main(String[] args) {
        try (Connection con = conexao.getConnection()) {
            System.out.println("Conectado papai!");
        } catch (SQLException e) {
            System.out.println("Deu ruim fi:");
            e.printStackTrace();
        }
    }
}


