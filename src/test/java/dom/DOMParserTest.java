package dom;

import com.gusakov.xml.util.Constant;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.gusakov.xml.parser.AbstractParser;
import com.gusakov.xml.parser.ParserBuider;

public class DOMParserTest {

    AbstractParser parserBuider = null;

    @Before
    public void setUp() throws Exception {
        parserBuider = new ParserBuider().createDeviseParser("dom");
    }

    @After
    public void tearDown() throws Exception {
        parserBuider = null;
    }

    @Test
    public void checkParser() {
        int expected = 16;
        parserBuider.parseDevices(Constant.XMLFILE_PATH);
        int actual = parserBuider.getDeviceStore().getDeviceList().size();
        Assert.assertEquals(expected, actual);
    }

}
