import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException  {
        // vacina: raiva, verme, verme2, gripe.
        //cada vacina: 100 doses estoque. 400 total.
        //if dose x <= 10 = solicitar compra
        //inicio: vacinas disponiveis:  x (100), x1(98), y(87), y2(100). 
        //VACINAS: Raiva, Verme tipo 1, Verme tipo 2, Gripe.
        //retire seu comprovante contra <nome vacina> obrigado!
        //menu : aplicar vacina, encerrar expediente.
        //1- doses totais aplicadas no dia. 2- total de cada dose. 
        //3- doses restantes 
        // disclaimer: dose tal necessita de compra de xx doses para completar o estoque (restam xx em estoque)
        //  disclaimer if: is dose tal abaixo de 20 reforçar com uma mensagem diferente!
        
        
        //estoqueVacinas vax1 = new estoqueVacinas();
        //vax1.vaxName = "Raiva";
        //vax1.vaxQT = 10;
        //System.out.println(vax1.vaxName +", "+ vax1.vaxQT);
        //System.out.println("====teste================");
        //vax1.aplicarVax();
        //System.out.println(vax1.vaxQT);

        Scanner sc = new Scanner(System.in);

        int escolha1 =0;
        estoqueVacinas vax1 = new estoqueVacinas();
        estoqueVacinas vax2 = new estoqueVacinas();
        estoqueVacinas vax3 = new estoqueVacinas();
        estoqueVacinas vax4 = new estoqueVacinas();

        //raiva:
        vax1.vaxName = "Raiva";
        vax1.vaxQT = 100;

        vax2.vaxName = "Verme tipo 1";
        vax2.vaxQT = 100;

        vax3.vaxName = "Verme tipo 2";
        vax3.vaxQT = 100;

        vax4.vaxName = "Gripe";
        vax4.vaxQT = 100;

        boolean loop = true;
        while(loop == true){
        limpatela();
        Banner.TelaInicial();
        System.out.print("Escolha uma opção: ");
        escolha1 = sc.nextInt();

        switch (escolha1) {
            case 1:
                limpatela();
                Banner.banner();
                estoqueVacinas.menuVax();
                int escolha = 0;
                Scanner caramba = new Scanner(System.in);
                escolha = caramba.nextInt();
                switch (escolha) {
                    case 1:
                    if(vax1.vaxQT > 0){
                        vax1.recibo();
                        vax1.aplicarVax();}
                       enter.enter();
                        break;
                    case 2:
                    if(vax2.vaxQT > 0){
                        vax2.recibo();
                        vax2.aplicarVax();}
                        break;
                    case 3: 
                    if(vax3.vaxQT > 0){
                        vax3.recibo();
                        vax3.aplicarVax();}
                        enter.enter();
                        break;
                    case 4:
                    if(vax4.vaxQT > 0){ 
                        vax4.recibo();
                        vax4.aplicarVax();}
                        enter.enter();
                        break;
                    default:
                        break;
                }//fim sub-switch
                break;
            case 2:
            limpatela();
            Banner.banner();
            System.out.println("----------------------");
            System.out.println("  FECHAMENTO DO DIA: ");
            System.out.println("----------------------");
            vax1.fechamentoQT();
            vax2.fechamentoQT();
            vax3.fechamentoQT();
            vax4.fechamentoQT();
            System.out.println("==========================================");
            System.out.print("Total de vacinas aplicadas no dia: ");
            System.out.println((400-(vax1.vaxQT+vax2.vaxQT+vax3.vaxQT+vax4.vaxQT)));
            System.out.println("==========================================");
            loop = false;
                break;


            default:
                break;
        }//fim switch
        
    }//fim loop
        
        
    }
    public static void limpatela() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
