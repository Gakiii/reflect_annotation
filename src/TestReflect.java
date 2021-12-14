import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflect {
    public static void main(String[] args) throws Exception {
        // to get the class and new a Instance of User
        Class aClass = Class.forName("User");
        User usr = (User) aClass.newInstance();

        //get method "setAge" and use it's invoke menthod to set value to age
        Method setAge = aClass.getDeclaredMethod("setAge", int.class);
        setAge.invoke(usr, 1000);
        System.out.println(usr);

        //combine reflect and annotation to dynamic to set the age
        Field age = aClass.getDeclaredField("age");
        TestAnnotation declaredAnnotation = age.getDeclaredAnnotation(TestAnnotation.class);
        int value = declaredAnnotation.value();
        age.set(usr, value);
        System.out.println(usr);

    }
}

