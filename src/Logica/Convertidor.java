package Logica;

public class Convertidor {

    private String IP;
    private String Bin;

    public Convertidor() {

    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getBin() {
        return Bin;
    }

    public void setBin(String bin) {
        Bin = bin;
    }

    public String ConvertirABinario(){

        StringBuilder IpenBinario = new StringBuilder();


        String[] ocatetos = this.IP.split("\\.");
        for(String ocatetoseparado : ocatetos){

            int ValorDec = Integer.parseInt(ocatetoseparado);
            String ValorBin = "";

            while(ValorDec > 0){

                int resto = ValorDec % 2;
                ValorBin = resto + ValorBin;
                ValorDec = ValorDec / 2;


            }

            while (ValorBin.length() < 8){

                ValorBin = "0" + ValorBin;

            }

            IpenBinario.append(ValorBin).append(".");



        }

       IpenBinario.deleteCharAt(IpenBinario.length() - 1);


        return IpenBinario.toString();
    }

    public String ConvertirAIP(){

        StringBuilder IpenDecimal = new StringBuilder();
        String[] ocatetos = this.Bin.split("\\.");

        for(String ocatetosseparados : ocatetos){
            int valorDec = 0;
            int potencia = 7;

            for(char bit : ocatetosseparados.toCharArray()){

                int Valordebit = Character.getNumericValue(bit);
                valorDec += Valordebit * Math.pow(2, potencia);
                potencia--;

            }

            IpenDecimal.append(valorDec).append(".");


        }

        IpenDecimal.deleteCharAt(IpenDecimal.length() -1);


        return IpenDecimal.toString();
    }





}
