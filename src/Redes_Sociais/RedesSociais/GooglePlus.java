
package Redes_Sociais.RedesSociais;


import Redes_Sociais.Interface.Compartilhamento;
import Redes_Sociais.Interface.VideoConferencia;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    
    @Override
    public void fazStreaming() {
        System.out.println("Está fazendo stream pelo GooglePlus");
    }
    
    @Override
    public void compartilhar() {
        System.out.println("Está fazendo compartilhando pelo GooglePlus");
    }
    
    @Override
    public void postarFoto(){
        System.out.println("Postou uma foto pelo GooglePlus");
    };
    
    @Override
    public void postarVideo(){
        System.out.println("Postou um video pelo GooglePlus");
    };
    
    @Override
    public void postarComentario(){
        System.out.println("Postou um comentario pelo GooglePlus");
    };
    
    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação pelo GooglePlus");
    };
    
}
