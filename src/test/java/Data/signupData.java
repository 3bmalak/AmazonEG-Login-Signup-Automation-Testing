package Data;

import org.testng.annotations.DataProvider;

public class signupData {
    @DataProvider(name = "signupData")
    public Object[][] getdata(){
        Object[][] data={
                {"Youssef Abdelmalak","01200393020","EfuGDDQaxSN4-u5","EfuGDDQaxSN4-u5",1},
                {"Marko Milad","01201012452","#DSFFDSASDdsa225","#DSFFDSASDdsa225",2},
        };
        return data;
    }

}
