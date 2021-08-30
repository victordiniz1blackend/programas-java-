public class Principal {
    Veiculos a1, a2;

    public void entraDados(){
        a1 = new Veiculos();
        a1.setAno(2018);
        a1.setPlaca("aqc-2525");
        a1.setPreco(284682);
        a2 = new Veiculos();
        a2.setAno(2021);
        a2.setPlaca("aa-1212");
        a2.setPreco(2.000000000);



    }
    public void mostraDados(){
        System.out.println("-----------");
        System.out.println("ano  :" + a1.getAno());
        System.out.println("placa:  "+ a1.getPlaca());
        System.out.println("preco  :" + a1.getPreco());
        System.out.println("-------------");
        System.out.println("-----------");
        System.out.println("ano  :" + a2.getAno());
        System.out.println("placa:  "+ a2.getPlaca());
        System.out.println("preco  :" + a2.getPreco());
        System.out.println("-------------");

    }
    public static void main (String args[]){
        Principal p = new Principal();
        p.entraDados();
        p.mostraDados();

    }

}
