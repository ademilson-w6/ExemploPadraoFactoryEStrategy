public class Homem extends Pessoa{

    public Homem(String nome){
        this.nome = nome;
        System.out.println("Olá senhor "+this.nome + ", O seu sexo é: "+sexo.M.getDescricao());
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
