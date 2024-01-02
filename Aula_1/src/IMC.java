public class IMC {
    private float peso;
    private float altura;
    private char sexo;

    public String calculaIMC() {
        float imc = (float) (peso / Math.pow(altura, 2));
        String condicao;

        if( sexo == 'F') {
            if (imc < 19.1) {
                condicao = "abaixo do peso";
            } else {
                if (imc < 25.8) {
                    condicao = "no peso normal";
                } else {
                    if (imc < 27.3) {
                        condicao = "marginalmente acima do peso";
                    } else {
                        if (imc < 32.3) {
                            condicao = "acima do peso ideal";
                        } else {
                            if (imc >= 32.3) {
                                condicao = "obeso";
                            }
                        }
                    }
                }
            }
        }
            if (imc < 20.7) {
                condicao = "abaixo do peso";
            } else {
                if (imc < 26.4) {
                    condicao = "no peso normal";
                } else {
                    if (imc < 27.8) {
                        condicao = "marginalmente acima do peso";
                    } else {
                        if (imc < 31.1) {
                            condicao = "acima do peso ideal";
                        } else {
                            if (imc >= 31.1) {
                                condicao = "obeso";
                            }
                        }
                    }
                }
            }

        return calculaIMC();
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) throws Exception {
        if(sexo != 'F' || sexo != 'M') {
            this.sexo = sexo;
        }else{
            throw new Exception("Valor invalido, somente F ou M");
        }
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
