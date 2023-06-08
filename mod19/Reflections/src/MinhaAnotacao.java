import java.lang.annotation.*;
import java.lang.reflect.*;

// Defina uma anotação personalizada
@Retention(RetentionPolicy.RUNTIME)
@interface MinhaAnotacao {
    String valor();
}