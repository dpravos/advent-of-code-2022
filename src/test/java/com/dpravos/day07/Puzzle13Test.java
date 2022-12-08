package com.dpravos.day07;

import com.dpravos.shared.Input;
import com.dpravos.shared.PuzzleTest;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static com.dpravos.day07.Directory.ROOT_DIR;
import static org.junit.jupiter.api.Assertions.*;

class Puzzle13Test extends PuzzleTest {

    @Test
    void should_solve_example() {
        var puzzle = new Puzzle13(inputGetter);

        var solution = puzzle.solve();

        assertEquals("95437", solution);
    }

    @Test
    void should_get_size_of_directory() {
        var directory = new Directory("d");
        var file = new File("file", 10);
        directory.add(file);

        assertEquals(10, directory.size());

    }

    @Test
    void should_get_size_of_nested_directories() {
        var parent = new Directory("parent");
        var child = new Directory("child");
        var file = new File("file", 10);
        child.add(file);
        parent.add(child);

        assertEquals(10, parent.size());
    }

    @Test
    void should_list_all_directories_in_a_filesystem() {
        var root = new Directory(ROOT_DIR);
        var a = new Directory("a");
        var e = new Directory("e");
        var i = new File("i", 584);
        var f = new File("f", 29116);
        var d = new Directory("d");
        var j = new File("j", 4060174);
        e.add(i);
        a.add(e);
        a.add(f);
        root.add(a);
        d.add(j);
        root.add(d);

        var directories = root.directories();

        var expected = Set.of(root, a, e, d);

        assertEquals(expected, directories);
    }

    @Test
    void terminal_should_move_to_root() {
        CommandParser commandParser = new CommandParser();

        Terminal terminal = new Terminal(commandParser);

        terminal.parse(new Input("""
                $ cd /
                """));

        assertEquals(ROOT_DIR, terminal.pwd());
    }


    @Test
    void command_parser_cd() {
        CommandParser commandParser = new CommandParser();

        var commands = commandParser.parse(new Input("""
                $ cd /
                """));

        assertEquals(new ChangeDirectory(ROOT_DIR), commands.get(0));
    }

    @Test
    void terminal_should_recreate_dir_content() {
        CommandParser commandParser = new CommandParser();

        Terminal terminal = new Terminal(commandParser);

        terminal.parse(new Input("""
                $ cd /
                $ ls
                dir a
                14848514 b.txt
                """));

        var root = terminal.currentDirectory();

        Directory a = root.getDirectory("a");
        File b = root.getFile("b.txt");

        assertEquals("a", a.name());
        assertEquals(0, a.size());
        assertEquals("b.txt", b.name());
        assertEquals(14848514, b.size());
    }

    @Test
    void terminal_should_move_to_dir() {
        CommandParser commandParser = new CommandParser();
        Terminal terminal = new Terminal(commandParser);

        terminal.parse(new Input("""
                $ cd /
                $ ls
                dir a
                $ cd a
                """));

        assertEquals("a", terminal.pwd());
    }

    @Test
    void terminal_should_move_to_parent() {
        CommandParser commandParser = new CommandParser();
        Terminal terminal = new Terminal(commandParser);

        terminal.parse(new Input("""
                $ cd /
                $ ls
                dir a
                $ cd a
                $ cd ..
                """));

        assertEquals(ROOT_DIR, terminal.pwd());
    }
}