package indonative.museumid.credits;

/**
 * Created by andika on 12/13/16.
 */

public @interface CreatorInfo {
    String teamName() default "Indonative";
    String[] creators() default "";
}
