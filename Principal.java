public class Principal {
    public static void main(String[] args){


        Estudante e1 = new Estudante(6587, "Carlos Alberto de Nobrega", true);       
        Boletim b1 = new Boletim();
        double media_e1 = b1.Media(9.0, 8.7);
        Frequencia f1 = new Frequencia(1);


        Estudante e2 = new Estudante(3689, "Rita Cândida Sobrado", true);
        Boletim b2 = new Boletim();
        double media_e2 = b2.Media(5.0,6.2);
        Frequencia f2 = new Frequencia(2);


        Estudante e3 = new Estudante(5231, "Charlize Theron da Silva Prado", false);
        Boletim b3 = new Boletim();
        double media_e3 = b3.Media(10,9.7);
        Frequencia f3 = new Frequencia(0);

        e1.imprimirRelatorio(media_e1, f1);
        e2.imprimirRelatorio(media_e2, f2);
        e3.imprimirRelatorio(media_e3, f3);



    }
}
