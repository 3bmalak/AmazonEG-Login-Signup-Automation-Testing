package Data;

import org.testng.annotations.DataProvider;

public class signInData {
    @DataProvider(name = "signinData")
    public Object[][] getdata2(){
        Object[][] data={
                {"01200393020","EfuGDDQaxSN4-u5"},
                {"01201012452", "#DSFFDSASDdsa225"},
        };
        return data;
    }
}
