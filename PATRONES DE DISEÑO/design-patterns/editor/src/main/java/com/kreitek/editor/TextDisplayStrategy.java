package com.kreitek.editor;

import java.util.ArrayList;

public class TextDisplayStrategy implements DisplayStrategy {

    @Override
    public void show(ArrayList<String> documentLines) {
        System.out.println("START DOCUMENT ==>");
        for (int index = 0; index < documentLines.size(); index++) {
            System.out.println("[" + index + "] " + documentLines.get(index));
        }
        System.out.println("<== END DOCUMENT");
    }
}
