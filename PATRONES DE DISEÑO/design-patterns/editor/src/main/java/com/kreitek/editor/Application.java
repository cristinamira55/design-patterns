package com.kreitek.editor;

public class Application {

    public static void main(String[] args) {

        EditorFactory editorFactory = new EditorFactory();
        Editor editor = editorFactory.getEditor(args);
        editor.run();
    }
}
