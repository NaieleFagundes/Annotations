import java.lang.reflect.Field;

public class ProgramaTeste {

    public ProgramaTeste(){
        Veiculo fusca = new Veiculo();
        fusca.setAno(2001);
        fusca.setPlaca("IQJ-9186");
        if (veiculoPagaImposto(fusca)){
            System.out.println("PAGA");

        }else{
            System.out.println("NÃO PAGA");
        }

    }

    private boolean veiculoPagaImposto(Veiculo v) {
        //pega class
        Class c =v.getClass();

        Field[] campos = c.getDeclaredFields();
        for (Field f : campos) {
            if(f.isAnnotationPresent(AnoValidation.class ) ){
                //pega o ano da anotação
                //teto
                var av = f.getAnnotation (AnoValidation.class);
                int teto = av.value();
                if (v.getAno() > teto){
                    return true;//paga imposto
                }

            }

        }
        return false;
    }

    static void main(String[] args) {
        new ProgramaTeste();

    }
}
