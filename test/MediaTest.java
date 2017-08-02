import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by lggui on 01/08/2017.
 */
public class MediaTest {

    private Media mediaProcessor;

    @Before
    public void setUp(){
        mediaProcessor = new Media();
    }

    @Test
     public void testMedia(){

        double[] valores = {5,9,3};
        double expectedResult = mediaProcessor.calcularMedia(valores);
        Assert.assertEquals(expectedResult, 17/3.0, 0);

    }

    @Test
    public void getStringArrayAsDoubleArray(){
        String[] valores = {"5","9","3"};
        double[] expectedResult = new double[]{5,9,3};
        double[] result = mediaProcessor.convertToDoubleArray(valores);
        assertThat(expectedResult, CoreMatchers.is(result));
     }

}
