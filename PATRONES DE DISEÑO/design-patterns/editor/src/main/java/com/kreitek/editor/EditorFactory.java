package com.kreitek.editor;

public class EditorFactory {
    public Editor getEditor(String[] args) {
        DisplayStrategy strategy;

        if (args.length > 0 && args [0].equals("json")){
            strategy = new JsonDisplayStrategy();
        }else{
            strategy = new TextDisplayStrategy();
        }
        return new ConsoleEditor(strategy);
    }
}
