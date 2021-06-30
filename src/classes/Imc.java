package classes;

public class Imc implements IImc{

    public double altura;
    public double peso;
    public String sexo;
    final double FEMININO_ABAIXO_DO_PESO = 19.1;
    final double FEMININO_PESO_NORMAL = 25.8;
    final double FEMININO_MARGINALMENTE_ACIMA_DO_PESO = 27.3;
    final double FEMININO_ACIMA_DO_PESO_IDEAL = 32.3;
    final double MASCULINO_ABAIXO_DO_PESO = 20.7;
    final double MASCULINO_PESO_NORMAL = 26.4;
    final double MASCULINO_MARGINALMENTE_ACIMA_DO_PESO = 27.8;
    final double MASCULINO_ACIMA_DO_PESO_IDEAL = 31.1;


    public void setAltura(double altura) {
        this.altura = altura;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double calculaImc() {
        double imc = peso / Math.pow(altura, 2);
        return imc;
    }

    public String resultadoFinal(IImc iimc){
        double imc = iimc.calculaImc();
        if (sexo.equals("F")) {//1
            return getString(imc, FEMININO_ABAIXO_DO_PESO, FEMININO_PESO_NORMAL, FEMININO_MARGINALMENTE_ACIMA_DO_PESO, FEMININO_ACIMA_DO_PESO_IDEAL);
        }
        else {//11
            return getString(imc, MASCULINO_ABAIXO_DO_PESO, MASCULINO_PESO_NORMAL, MASCULINO_MARGINALMENTE_ACIMA_DO_PESO, MASCULINO_ACIMA_DO_PESO_IDEAL);
        }
    }

    private String getString(double imc, double abaixo_do_peso, double peso_normal, double marginalmente_acima_do_peso, double acima_do_peso_ideal) {
        if(imc < abaixo_do_peso){//12
            return "Abaixo do peso";//13
        }
        else if(imc < peso_normal){//14
            return "Peso normal";//15
        }
        else if(imc < marginalmente_acima_do_peso){//16
            return "Marginalmente acima do peso";//17
        }
        else if(imc < acima_do_peso_ideal){//18
            return "Acima do peso ideal";//19
        }
        else{
            return "Obeso";//20
        }
    }
}
