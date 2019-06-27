import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 
 * Use this to bind a column to an object field. Contains information about:<li>index of file (Binding)</li> </li> <li>index of modelobject (Binding)</li> <li>Name of sourceFile (additional information)</li>
 *  
 * 
 * @author user
 *
 */
@Documented
@Retention(RUNTIME)
@Target(FIELD)
public @interface FileObjectBinding {
	
	/**
	 * @return the binded index of file
	 */
	int Index();
}
