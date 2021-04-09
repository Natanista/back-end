package com.natanista.cursojava.aula36;

public class TesteContato {

    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Natan");


        //obj endereco
        Endereco end = new Endereco();
        end.setRua("Game of Thrones");
        end.setCep("Mari huana");
        end.setBairro("Leinds");
        end.setCidade("Baryeru");
        end.setEstado("SP");

        //obj telfone
        Telefone tel = new Telefone();
        tel.setDdd("11");
        tel.setNumero("1192737733");
        tel.setTipo("celular");

        //contato.setEndereco("Kings Lading");
        contato.setTelefone(tel);
        contato.setEndereco(end);

        if(contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        System.out.println(contato.getNome());
        System.out.println(contato.getTelefone());
    }
}
