import Redes_Sociais.RedesSociais.Facebook;
import Redes_Sociais.RedesSociais.RedeSocial;
import Redes_Sociais.RedesSociais.Twitter;
import Redes_Sociais.Usuario.Usuario;

public class Main {

    public static void main(String[] args) {

        RedeSocial[] redes = new RedeSocial[10];
        Facebook facebook = new Facebook();
        Twitter twitter = new Twitter();

        redes[0] = facebook;
        redes[1] = twitter;

        Usuario usuario = new Usuario(redes);

        usuario.setNome("Thalles");
        usuario.setEmail("thalles.costa@get.inatel.br");

        usuario.redesSociais[0].setSenha("12349875");
        usuario.redesSociais[0].setNumAmigos(323);
        usuario.redesSociais[0].fazStreaming();
        usuario.redesSociais[0].compartilhar();
        usuario.redesSociais[0].curtirPublicacao();

        usuario.redesSociais[1].setSenha("34839874");
        usuario.redesSociais[1].setNumAmigos(3846);
        usuario.redesSociais[1].postarComentario();
        usuario.redesSociais[1].postarFoto();
        usuario.redesSociais[1].postarVideo();

    }

}
















