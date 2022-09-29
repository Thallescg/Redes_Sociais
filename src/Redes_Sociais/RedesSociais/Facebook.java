package Redes_Sociais.RedesSociais;


import Redes_Sociais.Interface.Compartilhamento;
import Redes_Sociais.Interface.VideoConferencia;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {
    
    @Override
    public void fazStreaming() {
        System.out.println("Está fazendo stream pelo Facebook");
    }
    
    @Override
    public void compartilhar() {
        System.out.println("Está fazendo compartilhando pelo Facebook");
    }
    
    @Override
    public void postarFoto(){
        System.out.println("Postou uma foto pelo Facebook");
    };
    
    @Override
    public void postarVideo(){
        System.out.println("Postou um video pelo Facebook");
    };
    
    @Override
    public void postarComentario(){
        System.out.println("Postou um comentario pelo Facebook");
    };
    
    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação pelo Facebook");
    };
    
}
