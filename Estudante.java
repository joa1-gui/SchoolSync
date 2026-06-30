public class Estudante{

    int matricula;
    String nome;
    boolean mensalidade;
    
        public Estudante(int matricula, String nome, boolean mensalidade){
            this.matricula = matricula;
            this.nome = nome;
            this.mensalidade = mensalidade;
        }
    

        public void imprimirRelatorio(double media, Frequencia frequencia) {
            

            System.out.println("\nAluno: " + this.nome + " (Matrícula: " + this.matricula + ")");
            

            if (this.mensalidade == false) {
                System.out.println("Aviso: Dados retidos por pendência financeira");
            } else {
                System.out.println("Financeiro: Mensalidade em dia");
                

                if (media < 7) {
                    System.out.println("Média Final: " + media + " Reprovado");
                } else {
                    System.out.println("Média Final: " + media + " Aprovado");
                }

                if (frequencia.numero_faltas < 5) {
                    System.out.println("Faltas: " + frequencia.numero_faltas + " Frequência alta");
                } else {
                    System.out.println("Faltas: " + frequencia.numero_faltas + " - Frequência baixa");
                }
            }
            System.out.println("------------------------------------");
        }
    }
