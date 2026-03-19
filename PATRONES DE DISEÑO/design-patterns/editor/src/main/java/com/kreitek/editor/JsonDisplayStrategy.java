package com.kreitek.editor;

import java.util.ArrayList;

public class JsonDisplayStrategy implements DisplayStrategy {

    @Override
    public void show(ArrayList<String> documentLines) {
        System.out.println("{");
        System.out.println("  \"doc\": [");
        for(int index= 0; index < documentLines.size(); index++) {
            String comma = (index < documentLines.size()-1) ? "," : "";
            System.out.println("   {\"line\":\"" + index + "\",\"text\":\"" + documentLines.get(index) + "\"}" + comma);
        }
        System.out.println("  ]");
        System.out.println("}");
    }
}
