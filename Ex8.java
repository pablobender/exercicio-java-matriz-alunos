/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author Lucian
 */
public class Ex8 {

    public static final int QTD_ALUNOS = 3;
    public static final int QTD_PROVAS = 3;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ex8 ex8 = new Ex8();
        for (int nAluno = 0; nAluno < QTD_ALUNOS; nAluno++) {
            String nome = JOptionPane.showInputDialog(String.format("Informe o nome do aluno %d", nAluno + 1));
            ex8.setNomeAluno(nAluno, nome);
            double[] notas = new double[QTD_PROVAS];
            for (int nNota = 0; nNota < notas.length; nNota++) {
                String sNota = JOptionPane.showInputDialog(String.format("Informe a nota da prova %d", nNota + 1));
                notas[nNota] = Double.parseDouble(sNota);
            }
            ex8.setNotasAluno(nAluno, notas);
        }
        String relatorio = "";
        for (int nAluno = 0; nAluno < QTD_ALUNOS; nAluno++) {
            String aluno = ex8.getNomeAluno(nAluno);
            double media = ex8.getMediaAluno(nAluno);
            relatorio += ex8.formatarAluno(aluno, media, "Aprovado")+"\n";
        }
        JOptionPane.showMessageDialog(null, relatorio);
    }

    public String formatarAluno(String aluno, double media, String situacao) {
        return String.format("Aluno: %s; Média: %.2f; Situacao: %s", aluno, media, situacao);
    }
    private String[] nomesAlunos = new String[QTD_ALUNOS];

    public void setNomeAluno(int numAluno, String nomeAluno) {
        this.nomesAlunos[numAluno] = nomeAluno;
    }

    public String getNomeAluno(int numAluno) {
        return this.nomesAlunos[numAluno];
    }

    double calcularMedia(double[] notas) {
        double soma = 0.0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }
    private double[][] notasAlunos = new double[QTD_ALUNOS][QTD_PROVAS];

    void setNotasAluno(int numAluno, double[] notas) {
        notasAlunos[numAluno] = notas;
    }

    double getMediaAluno(int numAluno) {
        return this.calcularMedia(notasAlunos[numAluno]);
    }
}
