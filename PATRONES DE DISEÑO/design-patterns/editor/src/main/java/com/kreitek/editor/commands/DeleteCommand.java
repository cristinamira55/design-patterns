package com.kreitek.editor.commands;

import com.kreitek.editor.Command;

import java.util.ArrayList;

import static java.awt.SystemColor.text;

public class DeleteCommand implements Command {
    private final int lineNumber;
    private String deletedText;

    public DeleteCommand(int lineNumber) {

        this.lineNumber = lineNumber;
    }

    @Override
    public void execute(ArrayList<String> documentLines) {

        if (documentLines.size() > lineNumber) {
            deletedText = documentLines.get(lineNumber);
            documentLines.remove(lineNumber);
        }
    }

    @Override
    public void undo(ArrayList<String> documentLines) {
        documentLines.add(lineNumber, deletedText);
    }
}
