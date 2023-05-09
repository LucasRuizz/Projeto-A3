
package projeto_a3;

import java.util.Scanner;

public class Projeto_A3 {

    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu id: ");
        int id_usuario = sc.nextInt();
        
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        
        System.out.println("Digite seu telefone: ");
        String telefone = sc.next();
        
        System.out.println("Digite seu email: ");
        String email = sc.next();
        
        Usuario user = new Usuario(id_usuario, nome, telefone, email);
        System.out.printf("id: %d, nome: %s, telefone: %s, email: %s%n", 
                user.getId_usuario(), user.getNome(), user.getTelefone(), user.getEmail());
        
    }
    
}
