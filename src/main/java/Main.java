import events.chips;
import events.joe;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

/*todo: add a pm system to PM's new users to the server
        add a click role system
        add soundboard like system for users
 */

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws Exception{
        JDABuilder jdaBuilder = JDABuilder.createDefault("");


        JDA jda;
        joe joe = new joe();
        jdaBuilder.addEventListeners(joe);
        chips chips = new chips();
        jdaBuilder.addEventListeners(chips);
        jdaBuilder.setActivity(Activity.playing("with my clit 💧🍆"));
        try {
            jda = jdaBuilder.build();

        } catch (LoginException e) {
            e.printStackTrace();

        }




    }





}
