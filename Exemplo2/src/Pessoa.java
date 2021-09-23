public abstract class Pessoa {

    public String nome;

    public enum sexo{
        M("MASCULINO"), F("FEMININO");

        private String descricao;

        sexo(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }







}
