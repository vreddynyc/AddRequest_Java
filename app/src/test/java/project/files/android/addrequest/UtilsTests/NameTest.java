package project.files.android.addrequest.UtilsTests;

import junit.framework.Assert;

import org.junit.Test;

import project.files.android.addrequest.Utils.Name;

import static org.junit.Assert.assertEquals;


public class NameTest {

    private String mFullName = "John Robert Edwards";

    @Test
    public void testGetFirstName() {

        String actualFirstName = "John";
        String resultFirstName = Name.getFirstName(mFullName);

        assertEquals(actualFirstName, resultFirstName);
    }

    @Test
    public void testGetMiddleName() {

        String actualMiddleName = "Robert";
        String resultMiddleName = Name.getMiddleName(mFullName);

        assertEquals(actualMiddleName, resultMiddleName);
    }

    @Test
    public void testGetLastName() {

        String actualLastName = "Edwards";
        String resultLastName = Name.getLastName(mFullName);

        assertEquals(actualLastName, resultLastName);
    }

}