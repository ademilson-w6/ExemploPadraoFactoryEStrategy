public class Mulher extends Pessoa{

    public Mulher(String nome){
        this.nome = nome;
        System.out.println("Olá senhora "+this.nome + ", O seu sexo é: "+sexo.F.getDescricao());
    }


    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
}
