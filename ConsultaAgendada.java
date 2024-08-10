import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConsultaAgendada {

    // Input de dados
    Scanner ler = new Scanner(System.in);

    // Instâncias de outras classes.
    private Data data;
    private Hora hora;

    // Propriedades da classe
    private String nomePaciente;
    private static int quantidade;
    private String nomeMedico;

    /*  CONSTRUTORES. Qualquer construtor chamado deve acrescer 1 no atributo quantidade.
    * O construtor ConsultaAgendada deve nos permitir a digitação dos valores de data, 
    hora, nome do paciente e do médico; 

    * Os outros dois construtores devem receber os valores de data, hora, nome do
    paciente e do médico sob a forma de parâmetros; */
    
    ConsultaAgendada(){
        hora = new Hora();
        data = new Data();
        setNomePaciente();
        setNomeMedico();
        quantidade++;
    }
    
    ConsultaAgendada (int h, int mi, int s, int d, int m, int a, String p, String med){
        hora = new Hora(h, mi, s);
        data = new Data(d, m, a);
        nomePaciente = p;
        nomeMedico = med;
        quantidade++;
    }

    ConsultaAgendada (Data d, Hora h, String p, String m){
        hora = new Hora(h.getHor(), h.getMin(), h.getSeg());
        data = new Data(d.getDia(), d.getMes(), d.getAno());
        nomePaciente = p;
        nomeMedico = m;
        quantidade++;
    }

    // SETTERS SEM PASSAGEM DE PARÂMETROS
    /* Os métodos setData(), setHora(), setNomePaciente(), setNomeMedico() devem nos
    permitir alterar os valores das respectivas propriedades através da digitação de
    novos valores; */

    public void setData(){
        data.setAno();
        data.getMes();
        data.setDia();
    }

    public void setHora(){
        hora.setHor();
        hora.setMin();
        hora.setSeg();
    }

    public void setNomePaciente(){
        nomePaciente = ler.nextLine();
    }

    public void setNomeMedico(){
        nomeMedico = ler.nextLine();
    }

    /*  MÉTODOS SETTERS COM PASSAGEM DE PARÂMETROS
    * Os demais métodos “set” devem alterar os valores das propriedades a partir dos parâmetros recebidos; */
    public void setData(int a, int b, int c){
        data.setAno(a);
        data.setMes(b);
        data.setDia(c);
    }

    public void setHora(int a, int b, int c){
        hora.setHor(a);
        hora.setMin(b);
        hora.setSeg(c);
    }

    public void setNomePaciente(String p){ nomePaciente = p; }
    public void setNomeMedico(String m){ nomeMedico = m; }

    /* MÉTODOS GETTERS
    * O método getData() deve nos devolver a data no formato: dd/mm/aa; 
    * O método getHora() deve nos devolver a hora no formato: hh:mm:ss. */
    public int getAmostra(){
        return quantidade;
    }

    String getNomePaciente(){ return nomePaciente; }
    String getNomeMedico(){ return nomeMedico; }
    String getData(){ return data.mostra1(); }
    String getHora(){ return hora.getHora1(); }
}
