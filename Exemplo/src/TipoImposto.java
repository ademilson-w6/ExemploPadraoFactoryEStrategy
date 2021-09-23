public enum TipoImposto {


    ICMS {
        @Override
        public Imposto obterImposto() {
            return new ICMS();
        }
    },
    IPI {
        @Override
        public Imposto obterImposto() {
            return new IPI();
        }
    };


    public abstract Imposto obterImposto();
}
