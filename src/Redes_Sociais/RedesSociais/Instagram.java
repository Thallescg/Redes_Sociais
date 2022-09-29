package Redes_Sociais.RedesSociais;


public class Instagram extends RedeSocial {
    
    @Override
    public void postarFoto(){
        System.out.println("Postou uma foto pelo Instagram");
    };
    
    @Override
    public void postarVideo(){
        System.out.println("Postou um video pelo Instagram");
    };
    
    @Override
    public void postarComentario(){
        System.out.println("Postou um comentario pelo Instagram");
    };
    
    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação pelo Instagram");
    };
    
}
