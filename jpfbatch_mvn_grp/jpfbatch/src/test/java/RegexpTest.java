/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author John Doe
 */
public class RegexpTest {

    public RegexpTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void hello() {

        String pattern = "^([a-zA-Z\\d_]+)\\(((<<SEPARADOR>>?[^<<SEPARADOR>>]+)*)\\)((<<SEPARADOR>>?[^<<SEPARADOR>>]+)*)$";

        pattern = pattern.replace("<<SEPARADOR>>", "\\|");

        Pattern pat = Pattern.compile(pattern);
        Matcher matcher = pat.matcher("H9OLA()ALGO|VA|AT.9=RAS");

        while (matcher.find()) {
            for(int i = 0; i <= matcher.groupCount(); i++)
            System.out.println("group " + i + ": " + matcher.group(i));
        }

        Assert.assertTrue(true);

    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
