
import cucumber.api.java.ru.*;
import org.junit.Assert;

public class StepDefinition {
    int a;
    int b;
    int result;

    @Пусть("^есть два числа (\\d+) и (\\d+)$")
    public void есть_два_числа_и(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Если("^сложить их$")
    public void сложить_их(){
        result = a + b;
    }

    @То("^получим (\\d+)$")
    public void получим(int res){
        Assert.assertEquals(res, result);
    }
}
