package unittest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReturnNameLatNameTest {
    ReturnNameLastName returnNameLastName = new ReturnNameLastName();

    @Test
    public void numbersMultiplied35Test() {
        Assert.assertEquals(returnNameLastName.getNameLastname(15), "Alex Khadasevich", "Method didn't return Full Name");
    }

    @Test
    public void numbersMultiply3Test() {
        Assert.assertEquals(returnNameLastName.getNameLastname(9), "Alex", "Method didn't return First Name");
    }

    @Test
    public void numbersMultiply5Test() {
        Assert.assertEquals(returnNameLastName.getNameLastname(20), "Khadasevich", "Method didn't return Last name");
    }

    @Test
    public void numbersNotMultiplied35Test() {
        Assert.assertEquals(returnNameLastName.getNameLastname(11), "Ошибка", "Method didn't return error message");
    }
}
