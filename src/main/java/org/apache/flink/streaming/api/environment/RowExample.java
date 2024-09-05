package org.apache.flink.streaming.api.environment;

import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.api.java.typeutils.RowTypeInfo;
import org.apache.flink.types.Row;

public class RowExample {
    public static void main(String[] args) {
        RowTypeInfo rowTypeInfo = new RowTypeInfo(Types.INT,
                Types.STRING);
        Row row = new Row(rowTypeInfo.getArity());
        row.setField(0, 1);
        row.setField(1, "Hello");

        int intValue = (int)row.getField(0);
        String stringValue = (String)row.getField(1);

        System.out.println("First Field: " + intValue);
        System.out.println("Second Field: " + stringValue);
    }
}
