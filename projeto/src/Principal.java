public class Principal {
    Professor p1;
    Aluno a1;

    public void entraDados(){
        a1 = new Aluno();
        p1 = new Professor();

        a1.setNome("victor");
        a1.setRa(541651651);
        a1.setEnem(50020);
        a1.setCidade("sao paulo");
        p1.setCidade("sao paulo");
        p1.setNome("gabriel");
        p1.setSalario(5421520);
        p1.setTitulacao("ti");

    }

    public void mostraDados(){
    System.out.println("nome" + a1.getNome());
    System.out.println("ra" + a1.getRa());
    System.out.println("enem" + a1.getEnem());
    System.out.println("cidade" + a1.getCidade());
    System.out.println("-----------");
    System.out.println("nome" + p1.getNome());
    System.out.println("cidade" + p1.getCidade());
    System.out.println("salario" + p1.getSalario());
    System.out.println("titulaçao" + p1.getTitulacao());
    }

    public static void main (String args[]){
    Principal  p = new  Principal();
        p.entraDados();
        p.mostraDados();


    }
}
