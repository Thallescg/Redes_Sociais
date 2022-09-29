package Redes_Sociais.RedesSociais;


public abstract class RedeSocial{
    
    protected String senha;
    protected int numAmigos;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumAmigos() {
        return numAmigos;
    }

    public void setNumAmigos(int numAmigos) {
        this.numAmigos = numAmigos;
    }
    
    public void compartilhar() {
    
    }

    public void fazStreaming() {
        
    }
    
    public abstract void postarFoto();
    
    public abstract void postarVideo();
    
    public abstract void postarComentario();
    
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação");
    };
    
}
