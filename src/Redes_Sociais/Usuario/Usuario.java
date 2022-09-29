package Redes_Sociais.Usuario;

import Redes_Sociais.RedesSociais.RedeSocial;

public class Usuario {

    private String nome;
    private String email;
    public RedeSocial[] redesSociais;

    public Usuario (){
        redesSociais = new RedeSocial[4];
    }

    public Usuario (RedeSocial[] redesSociais){
        this.redesSociais = redesSociais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
