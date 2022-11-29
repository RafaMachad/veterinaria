public class Principal {
    public static void main(String[] args)  {
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
        
        


        Banner.TelaInicial();
        
        estoqueVacinas vax1 = new estoqueVacinas();
        vax1.vaxName = "Raiva";
        vax1.vaxQT = 10;
        System.out.println(vax1.vaxName +", "+ vax1.vaxQT);
        System.out.println("====teste================");
        vax1.aplicarVax();
        System.out.println(vax1.vaxQT);
        
        
        
        
        
    }
    
}
