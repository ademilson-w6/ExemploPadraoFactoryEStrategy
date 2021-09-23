public class TesteFactory {
    public static void main(String[] args) {

        FactoryPessoa factoryPessoa = new FactoryPessoa();

        String nome = "Carlos";
        String sexo = "F";
        Pessoa pessoa = factoryPessoa.getPessoa(nome,sexo);







    }
}
