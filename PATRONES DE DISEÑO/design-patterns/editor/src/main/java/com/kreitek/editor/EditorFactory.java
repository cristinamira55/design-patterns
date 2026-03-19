package com.kreitek.editor;

public class EditorFactory {
    public Editor getEditor(DisplayStrategy displayStrategy) {
        return new ConsoleEditor(displayStrategy);
    }
}
