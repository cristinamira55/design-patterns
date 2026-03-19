package com.kreitek.editor;

public class Application {

    public static void main(String[] args) {
        DisplayStrategy strategy;

        if (args.length > 0 && args [0].equals("json")){
            strategy = new JsonDisplayStrategy();
        }else{
            strategy = new TextDisplayStrategy();
        }
        EditorFactory editorFactory = new EditorFactory();
        Editor editor = editorFactory.getEditor(strategy);
        editor.run();
    }

}
