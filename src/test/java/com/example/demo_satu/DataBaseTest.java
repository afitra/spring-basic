package com.example.demo_satu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataBaseTest {

    @Test
    void tesSigleTon() {
//        model 1
        Database database1 = Database.getInstance();
        Database database2 = Database.getInstance();
        Assertions.assertSame(database1, database2);

//      model 2
        var database3 = Database.getInstance();
        var database4 = Database.getInstance();
        Assertions.assertSame(database3, database4);
    }
}
