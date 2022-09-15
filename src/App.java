import java.time.LocalDate;

public class App {

    public static void main(String[] args) throws Exception {
        Professor professor1 = new Professor("Steve", "stevejava@gmail.com", "engenharia");

        Curso curso1 = new Curso("ADS", 2000, "Presencial", LocalDate.now(), LocalDate.now());

        Certificado certificado1 = new Certificado("Bill Gates", "ADS", 2000);

        Aluno aluno1 = new Aluno("Bill Gates", LocalDate.now(), "billgates@gmail.com");     
    }                               
}