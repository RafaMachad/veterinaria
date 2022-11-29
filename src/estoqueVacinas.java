public class estoqueVacinas {
    
    public String vaxName;
    public int vaxQT;
    
    
   
    public int aplicarVax(){
        return vaxQT--;
    }

    public static void menuVax() {
        System.out.println("Escolha a vacina que deseja aplicar:");
        System.out.println("1) Raiva");
        System.out.println("2) Verme tipo 1");
        System.out.println("3) Verme tipo 2");
        System.out.println("4) Gripe");
        
    
    }
    public String recibo(){
        System.out.println("Retire seu comprovante contra "+ vaxName +" obrigado!");
        return vaxName; 
    }
    public int fechamentoQT(){
        System.out.println("Vacinas do tipo "+vaxName+" aplicadas: "+(100-vaxQT));
        if (vaxQT<=10) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("É PRECISO SOLICITAR A COMPRA DA VACINA PARA "+vaxName+".");
            System.out.println("QUANTIDADE RECOMENDADA: " + (100-vaxQT));
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        return vaxQT;
    }

    }
    

