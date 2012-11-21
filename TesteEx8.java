/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucian
 */
public class TesteEx8 {

    
    static void verificarSeIgual(String esperado, String atual, String mensagem) {
        if (atual.equals(esperado))
          System.out.println("OK " + mensagem);
        else
          System.out.println("FALHOU " + mensagem + "\nesp: " + esperado + "\natu: " + atual);
  
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ex8 ex8 = new Ex8();
        String esperado = "Aluno: Pablo Bender; Média: 7,10; Situacao: Aprovado";
        String atual = ex8.formatarAluno("Pablo Bender", 7.1, "Aprovado");
        verificarSeIgual(esperado, atual, "Aluno formatado corretamente");
        
        ex8 = new Ex8();
        esperado = "Fulano de Tal";
        ex8.setNomeAluno(0, esperado);
        atual = ex8.getNomeAluno(0);
        verificarSeIgual(esperado, atual, "Salvou Fulano");
        
        esperado = "Ciclano";
        ex8.setNomeAluno(1, esperado);
        atual = ex8.getNomeAluno(1);
        verificarSeIgual(esperado, atual, "Salvou Ciclano");
        
        atual = ex8.getNomeAluno(0);
        verificarSeIgual("Fulano de Tal", atual, "Fulano ainda esta salvo");
        
        
        double mediaEsperada = 7.8;
        double[] notas = new double[] {7, 7, 8, 8, 9};
        double mediaAtual = ex8.calcularMedia(notas);
        verificarSeIgual(String.valueOf(mediaEsperada), String.valueOf(mediaAtual), "Calcula a Média de {7, 7, 8, 8, 9}");
        
        mediaEsperada = 3.9;
        notas = new double[] {2, 5, 2.5, 0, 10};
        mediaAtual = ex8.calcularMedia(notas);
        verificarSeIgual(String.valueOf(mediaEsperada), String.valueOf(mediaAtual), "Calcula a media de {2, 5, 2.5, 0, 10}");
        
        
        notas = new double[] {7,7,8,8,9};
        ex8.setNotasAluno(0, notas);
      
        mediaEsperada = 7.8;
        mediaAtual = ex8.getMediaAluno(0);
        verificarSeIgual(String.valueOf(mediaEsperada), String.valueOf(mediaAtual), "Calcula a media do aluno [0]");

        notas = new double[] {2, 5, 2.5, 0, 10};
        ex8.setNotasAluno(1, notas);
      
        mediaEsperada = 3.9;
        mediaAtual = ex8.getMediaAluno(1);
        verificarSeIgual(String.valueOf(mediaEsperada), String.valueOf(mediaAtual), "Calcula a media do aluno [1]");
    }
}
