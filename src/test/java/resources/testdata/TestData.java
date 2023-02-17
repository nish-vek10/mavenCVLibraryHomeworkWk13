package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "SearchDataSet")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
/*1*/              {"Tester", "Harrow", "up to 5 miles", "30000", "50000", "Per annum", "Permanent",
                    "Permanent Tester jobs in Harrow on the Hill"},
/*2*/              {"Retail", "Edgware", "up to 5 miles", "300", "500", "Per week", "Part Time",
                    "Part Time Retail jobs in Edgware"},
/*3*/              {"Web developer", "Essex", "up to 10 miles", "40000", "650000", "Per annum", "Permanent",
                    "Permanent Web Developer jobs in Essex"},
/*4*/              {"Data Analyst", "Manchester", "up to 1 mile", "50000", "75000", "Per annum", "Any",
                    "Data Analyst jobs in Manchester"},
/*5*/              {"Surgeon", "HA1 1AA", "up to 10 miles", "6000", "9000", "Per month", "Temporary",
                    "Temporary Surgeon jobs in HA1 1AA"},
/*6*/              {"Business Analyst", "Warwickshire", "up to 2 miles", "50", "100", "Per hour", "Permanent",
                    "Permanent Business Analyst jobs in Warwickshire"},
/*7*/              {"Geologist", "Surrey", "up to 25 miles", "250", "350", "Per day", "Any",
                    "Geologist jobs in Surrey"}
        };
        return data;
    }
}
