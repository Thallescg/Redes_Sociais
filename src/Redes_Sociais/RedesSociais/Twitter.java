package Redes_Sociais.RedesSociais;


import Redes_Sociais.Interface.Compartilhamento;

public class Twitter extends RedeSocial implements Compartilhamento {
    
    @Override
    public void compartilhar() {
        System.out.println("Está fazendo compartilhando pelo Twitter");
    }
    
    @Override
    public void postarFoto(){
        System.out.println("Postou uma foto pelo Twitter");
    };
    
    @Override
    public void postarVideo(){
        System.out.println("Postou um video pelo Twitter");
    };
    
    @Override
    public void postarComentario(){
        System.out.println("Postou um comentario pelo Twitter");
    };
    
    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação pelo Twitter");
    };
    
}
