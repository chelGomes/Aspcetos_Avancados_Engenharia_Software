package imc;

public class Pessoa {
    private float peso;
    private float altura;
    private char sexo;

    public String calculaIMC() {
        float imc = (float) (peso / Math.pow(altura, 2));
        String condicao;

        if( sexo == 'F') {
            if (imc < 19.1f) {
                condicao = "abaixo do peso";
            } else {
                if (imc < 25.8f) {
                    condicao = "no peso normal";
                } else {
                    if (imc < 27.3f) {
                        condicao = "marginalmente acima do peso";
                    } else {
                        if (imc < 32.3f) {
                            condicao = "acima do peso ideal";
                        } else {

                                condicao = "obeso";
                            }
                        }
                    }
                }
            }
        else {
            if (imc < 20.7f) {
                condicao = "abaixo do peso";
            } else {
                if (imc < 26.4f) {
                    condicao = "no peso normal";
                } else {
                    if (imc < 27.8f) {
                        condicao = "marginalmente acima do peso";
                    } else {
                        if (imc < 31.1f) {
                            condicao = "acima do peso ideal";
                        } else {

                            condicao = "obeso";

                        }
                    }
                }
            }
        }
        return condicao;
    }

    public char getSexo() {
        return sexo;
    }
    
    public void setSexo(char sexo){
        if(!(sexo == 'F'|| (sexo == 'M'))){
            throw new IllegalArgumentException("valor invalido, somente F ou M");
        }
        this.sexo = sexo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }


}

/*tabela com peso e altura no limite das condicao*/
