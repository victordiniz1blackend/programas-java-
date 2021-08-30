public class Principal {
    Fornecedor f1;
    Funcionario g1;
    Cliente c1,c2;

    public void entraDados(){
        f1 = new Fornecedor();
        g1 = new Funcionario();
        c1 = new Cliente();
        c2 = new Cliente();

        c1.setNome("gabriel");
        c1.setEmail("leone.diniz@gmail.com");
        c1.setEndereco("marcioso 202");
        c1.setCpf(874-651-65187494);
        c2.setNome("gabi");
        c2.setEmail("leoenusudfb@gamil.com");
        c2.setCpf(563-561-65-23);
        c2.setEndereco("marif 232");
        g1.setNome("joao");
        g1.setCpf(841321-51-65-55);
        g1.setSalario(54561564.285);
        g1.setCtps(5-616516-515416-51);
        c1.setNome("lucas");
        c1.setCpf(1263351-56-15-5);
        c1.setEndereco("pedinho 212");
        c1.setEmail("pedoro.dos@hmail.com");

    }
    public void mostraDados(){
        System.out.println("nome" + c1.getNome() );
        System.out.println("email" + c1.getEmail());
        System.out.println("endereco" + c1.getEndereco());
        System.out.println("nome" + c2.getNome());
        System.out.println("cpf" + c2.getCpf());
        System.out.println("email" + c2.getEmail());
        System.out.println("endereco" + c2.getEndereco());
        System.out.println("nome" + g1.getNome() );
        System.out.println("salario" + g1.getSalario());
        System.out.println("ctps" + g1.getCtps());
        System.out.println("nome" + c1.getNome());
        System.out.println("cpf" + c1.getCpf());
        System.out.println("endereco" + c1.getEndereco());
        System.out.println("email" + c1.getEmail());


    }

    public static void main (String args[]){

        Principal p = new Principal();
        p.entraDados();
        p.mostraDados();

    }

}
