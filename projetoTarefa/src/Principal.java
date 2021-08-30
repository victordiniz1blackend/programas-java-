
public class Principal {
    Professor p1;
    Administrativo a1;
    Monitor m1;
    Estagiario es1;
    public void entraDados(){
        es1 = new Estagiario();
        es1.setCpf(84-84-84-1);
        es1.setEnem(800.1);
        es1.setNome("victor");
        es1.setRa(84184-851-516-1);
        es1.setDepartamento("ti.software");
        p1 = new Professor();
        p1. setCpf(56495654-564-564);
        p1.setTitulacao("administrador");
        p1.setCtps(5614658-645-45-2);
        p1.setNome("victor");
        //adm
        a1 = new Administrativo();
        a1.setCpf(4654654-654-64);
        a1.setCtps(45-6465-4564-5);
        a1.setNome("bibi");
        a1.setAdicional(6.526216);
        //monitor
        m1 =  new Monitor();
        m1.setCpf(8-49-894-4);
        m1.setNome("gabriel");
        m1.setArea("ti");
        m1.setEnem(600.0);
        m1.setRa(651-65561-1);
    }
    public void mostraDados(){
        System.out.println("-------monitor-------");
        System.out.println("nome:  " + p1.getNome());
        System.out.println("cpf:  " + p1.getCpf());
        System.out.println("titulação:   " + p1.getTitulacao());
        System.out.println("cpts:  " + p1.getCtps());

        System.out.println("--------professor--------");

        System.out.println("nome:  " + p1.getNome());
        System.out.println("cpts:   " + p1.getCtps());
        System.out.println("cpf:    " + p1.getCpf());
        System.out.println("titulação:  " + p1.getTitulacao());


        System.out.println("--------administrativo-----------");

        System.out.println("nome:   " + a1.getNome());
        System.out.println("cpf:    " + a1.getCpf() );
        System.out.println("ctps:    " + a1.getCtps() );
        System.out.println("adicional: " + a1.getAdicional()) ;


        System.out.println("-----------estagiario-------------- ");
        System.out.println("nome:  " + es1.getNome());
        System.out.println("cpf:   " + es1.getCpf());
        System.out.println("ra:    " + es1.getRa());
        System.out.println("enem:  " + es1.getEnem());
        System.out.println("departamento:  " + es1.getDepartamento());

    }

    public static void main (String args[]){
        Principal p = new Principal();
        p.entraDados();
        p.mostraDados();

    }

}
