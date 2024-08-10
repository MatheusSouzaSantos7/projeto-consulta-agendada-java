import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class Data
{

        Scanner ler = new Scanner(System.in);
        private int dia, mes, ano;

        Data()
        {
            getDia();
            getMes();
            getAno();
        }
        

        Data(int d, int m, int a){
            dia = d;
            mes = m;
            ano = a;
        }

        // Métodos que recebem dia, mês e ano, respectivamente com passagem de parâmetros
        public void setDia(int d) {dia = d;}
        public void setMes(int m) {mes = m;}
        public void setAno(int a) {ano = a;}

        // Métodos que recebem dia, mês e ano sem passagem de parâmetro
        public void setDia()
        {
            while (true) {
                try{
                    do{
                        System.out.print("Digite o dia: ");
                        dia = ler.nextInt();
                    }while(dia < 0 || dia > 31);
                    break;
                }
                catch(Exception e){ // Se tiver excessão, vai continuar o loop.
                    System.out.println("Valor não aceito! tente novamente!");
                    ler.next();
                }
            }
        }

        public void setMes()
        {
            while (true) {
                try{
                    do{
                        System.out.print("Digite o mês: ");
                        mes = ler.nextInt();
                    }while(mes < 0 || mes > 12);
                    break;
                }
                catch(Exception e){
                    System.out.println("Valor não aceito! tente novamente!");
                    ler.next();
                }
            }
        }

        public void setAno()
        {
            while (true) {
                try{
                    do{
                        System.out.print("Digite o ano: ");
                        ano = ler.nextInt();
                    }while(ano < 0);
                    break;
                }
                catch(Exception e){
                    System.out.println("Valor não aceito! tente novamente!");
                    ler.next();
                }
            }            
        }

    // Métodos que retornam o dia, mês e ano, respectivamente
    public int getDia(){return dia;}
    public int getMes(){return mes;}
    public int getAno(){return ano;}

    // Método que devolve a data no formato: dd/mm/aaaa;
    public String mostra1() {
        return String.format("%02d/%02d/%d", dia, mes, ano);
    }

    public String mostra2() 
    {
        String mesPorExtenso;
        switch (mes) {
            case 1:
                mesPorExtenso = "Janeiro";
                break;
            case 2:
                mesPorExtenso = "Fevereiro";
                break;
            case 3:
                mesPorExtenso = "Março";
                break;
            case 4:
                mesPorExtenso = "Abril";
                break;
            case 5:
                mesPorExtenso = "Maio";
                break;
            case 6:
                mesPorExtenso = "Junho";
                break;
            case 7:
                mesPorExtenso = "Julho";
                break;
            case 8:
                mesPorExtenso = "Agosto";
                break;
            case 9:
                mesPorExtenso = "Setembro";
                break;
            case 10:
                mesPorExtenso = "Outubro";
                break;
            case 11:
                mesPorExtenso = "Novembro";
                break;
            case 12:
                mesPorExtenso = "Dezembro";
                break;
            default:
                mesPorExtenso = "Mês inválido";
        }
        return String.format("%02d/%s/%d", dia, mesPorExtenso, ano);
    }

    // Método que devolve um boolean informando se o ano é ou não bissexto;
    public boolean bissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

        // Esse método deve retornar a quantidade de dias transcorridos no ano até a data digitada.
        public int diasTranscorridos()
        {
            return (mes * 30 + dia);
        }

        public void apresentaDataAtual()
        {
            Date dataAtual = new Date();
            DateFormat formato = DateFormat.getDateInstance(DateFormat.FULL);
            System.out.println("Data atual: " + formato.format(dataAtual));
        } 
    
}