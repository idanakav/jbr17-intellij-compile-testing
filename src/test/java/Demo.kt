import com.google.common.truth.Truth.assert_
import com.google.testing.compile.JavaFileObjects
import com.google.testing.compile.JavaSourcesSubjectFactory.javaSources
import org.junit.jupiter.api.Test
import javax.tools.JavaFileObject


class Demo {
    @Test
    fun test() {
        println("Hello, world!")
        val javaFileObjects: List<JavaFileObject> = listOf(
            JavaFileObjects.forSourceString(
                "com.example.T",
                """
                        public class T {
                            public static void main(String[] args) {
                                System.out.println("Hi");
                            }
                }
                """.trimIndent()
            )
        )
        assert_()
            .about(javaSources())
            .that(javaFileObjects)
            .compilesWithoutError()
    }
}