public class Principal {

    Pessoa a1,a2;
    Personagem b1,b2;

    public void entraDados(){
        a1 = new Pessoa();
        a2 = new Pessoa();
        b1 = new Personagem();
        b2 = new Personagem();
        a1.setUsuario("dragonfable");
        a2.setUsuario("odinson");
        a1.setSenha("6654dasd");
        a2.setSenha("5651232dqa");
        a1.setEmail("leone.dinizzz@gmail.com");
        a2.setEmail("victor,diniz@gmail.com");
        b1.setClasse("mago");
        b2.setClasse("clero");
        b1.setNivel(100);
        b2.setNivel(99);
        b1.setNome("magoSupremo");
        b2.setNome("danteHomes");


    }
    public void mostraDados(){
        System.out.println("usuario: " +  a1.getUsuario() );
        System.out.println("senha:  " +   a1.getSenha());
        System.out.println("e-mail  : " + a1.getEmail());
        System.out.println("------------------------------" );
        System.out.println("usuario: " + a2.getUsuario() );
        System.out.println("senha:   " + a2.getSenha() );
        System.out.println("e-mail:  " +  a2.getEmail());
        System.out.println("--------------------------------" );
        System.out.println("classe:  " + b1.getClasse() );
        System.out.println("nivel: " + b1.getNivel());
        System.out.println("nome: " + b1.getNome());
        System.out.println("---------------------------------" );
        System.out.println("classe" + b2.getClasse() );
        System.out.println("nivel" + b2.getNivel() );
        System.out.println("nome" + b2.getNome() );
        System.out.println("----------------------------------" );
    }

    public static void main (String args[]){
        Principal p = new Principal();
        p.mostraDados();
        p.entraDados();


    }
}
