package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;
import java.util.List;

import static org.testng.Assert.*;

public class dropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        String option = "Option 2";
        DropdownPage dropdownPage = homePage.clickDropdownLink();
        dropdownPage.selectFromDropdownText(option);
        List<String> selectedOptions = dropdownPage.getSelectedOptionsText();

        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
