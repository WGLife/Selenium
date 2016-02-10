package helpers;

import org.testng.annotations.DataProvider;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by student on 2/9/2016.
 */
public class CommonDataProvider {

    private static final String LOGIN_DATA_PROVIDER = "src/main/resources/loginProvider";

    private static Object[][] getDataFromFile(String file, String devider) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String str;
        List<String> lines = new LinkedList<String>();
        while ((str = bufferedReader.readLine()) != null) {
            lines.add(str);
        }
        int rows = lines.size();
        int columns = lines.get(0).split(devider).length;
        Object[][] datasets = new Object[rows][columns];
        int index = 0;
        for (String line : lines) {
            datasets[index] = line.split(devider);
            ++index;
        }
        return datasets;
    }

//    @DataProvider
//    public Object[][] loginTestDataProvider() {
//        return new Object[][] {
//                new Object[] {"Eugen", 10, true},
//                new Object[] {"Andrew", 13, false}
//        };
//    }
//
    @DataProvider
    public static Object[][] loginTestDataProvider() throws IOException {
        return getDataFromFile(LOGIN_DATA_PROVIDER, ",");
    }
}
