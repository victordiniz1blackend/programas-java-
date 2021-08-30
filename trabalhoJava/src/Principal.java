public class Principal {
    Veiculos a1, a2;
    Funcionario t1,t2;

    public void entraDados(){
        a1 = new Veiculos();
        a2 = new Veiculos();
        t1 = new Funcionario();
        t2 = new Funcionario();
        a1.setPlacas("bcd-ai51");
        a2.setPlacas("a1cd-a232");
        a1.setAno(2018);
        a2.setAno(2020);
        a1.setPreco(3660.20);
        a2.setPreco(40515.45);
        t1.setCtps(652065475);
        t2.setCtps(578654822);
        t1.setNome("victor diniz");
        t2.setNome("leony diniz");
        t1.setSalario(5000.50);
        t2.setSalario(10000.50);

    }

    public void mostraDados(){
        System.out.println("---------------");
        System.out.println("placa    :" + a1.getPlacas());
        System.out.println("ano:    " + a1.getAno());
        System.out.println("preço   :" + a1.getPreco());
        System.out.println("------------------");
        System.out.println("placa    : " +a2.getPlacas() );
        System.out.println("ano       :" + a2.getAno());
        System.out.println("preço      :" + a2.getPreco());
        System.out.println("-----------------");
        System.out.println("Ctps   :" + t1.getCtps());
        System.out.println("nome   : " + t1.getNome());
        System.out.println("salario: " + t1.getSalario());
        System.out.println("--------------------");
        System.out.println("ctps   : " + t2.getCtps());
        System.out.println("nome   : " + t2.getNome());
        System.out.println("salario   :" + t2.getSalario());
        System.out.println("--------------");

    }

    public static void main (String args[]){
        Principal p = new Principal();
        p.entraDados();
        p.mostraDados();

    }
}
