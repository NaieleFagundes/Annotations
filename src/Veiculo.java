public class Veiculo {

    private String placa;
    @AnoValidation(value = 2010)//PERSONALIZAÇÃO. SE TIRAR O VALOR, ELE USA O TETO DO ANO VALIDATION
    private int ano;

    public Veiculo(){
        System.out.println("Objeto criado!");
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
