package com.kreitek.editor.commands;

import com.kreitek.editor.Command;

import java.util.ArrayList;

public class UndoCommand implements Command {
    private final ArrayList<Command> commandHistorial;

    public UndoCommand(ArrayList<Command> commandHistorial) {
        this.commandHistorial = commandHistorial;
    }


    @Override
    public void execute(ArrayList<String> documentLines) {
        if (!commandHistorial.isEmpty()) {
            Command lastCommand = commandHistorial.get(commandHistorial.size() - 1);
            this.commandHistorial.remove(commandHistorial.size() - 1);
            lastCommand.undo(documentLines);
        }
    }

    @Override
    public void undo(ArrayList<String> documentLines) {

    }

}
