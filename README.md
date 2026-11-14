# TMS — Java Core homework (TeachMeSkills, 2021)

My very first programming repository. It contains the homework and lecture notes I wrote while taking the **Java Core** course at the [TeachMeSkills](https://teachmeskills.com/) programming school, from **May to October 2021** (145 commits).

It is the starting point of my path in software development, kept as it was written back then, with a light clean-up in 2026 (see [2026 clean-up](#2026-clean-up)).

## Tech

- **Java 11**, plain Java project (no Maven/Gradle, no external libraries)
- Originally written in Eclipse
- Code comments are in Russian

## Repository structure

```
TeachMeSkills/
└── src/
    ├── homework_lesson1/       # one package per lesson
    ├── homework_lesson2/
    ├── ...
    └── homework_lesson19/
```

Each lesson is a package. Small tasks are single files with a `main` method (`Task1.java`, `Task2.java`, ...). Bigger tasks live in sub-packages (`taskshop/`, `taskrobot/`, ...) with an `Application`/`Main` class as the entry point. Files named `Class.java` / `Note.java` are lecture notes with demo code.

## What was done in each lesson

| Lesson | Topic | What's inside |
|---|---|---|
| [1](TeachMeSkills/src/homework_lesson1) | Conditionals | `if/else`, `switch`: digit count and sign of a number, triangle existence check, counting positives/negatives, Russian plural endings |
| [2](TeachMeSkills/src/homework_lesson2) | Loops | `while`, `do-while`, `for`, nested loops, `break/continue`: series sums, multiplication without `*`, star triangles |
| [3](TeachMeSkills/src/homework_lesson3) | Arrays | `Scanner` input, `Random` fill, min/max, search, counting, duplicates, bubble sort (20 tasks) |
| [4](TeachMeSkills/src/homework_lesson4) | 2D arrays | Matrices: diagonals, elements above/below a diagonal, transposition |
| [5](TeachMeSkills/src/homework_lesson5) | OOP basics | Classes, fields, constructors, `this`, getters/setters, overloading, varargs (`Phone`, `Computer`) |
| [6](TeachMeSkills/src/homework_lesson6) | OOP practice | Encapsulation, enums, recursion, matrix class (add/multiply), library readers (`taskreader`) |
| [7](TeachMeSkills/src/homework_lesson7) | Inheritance & polymorphism | Abstract classes, overriding, `super`, composition, `equals/hashCode/toString`: animals & vet, shapes, cars, students, online shop, transport hierarchy |
| [8](TeachMeSkills/src/homework_lesson8) | Interfaces & enums | Interfaces, abstract classes, `instanceof`, enums with fields and per-constant methods: spaceport, robot, clothes, musical instruments, seasons |
| [9](TeachMeSkills/src/homework_lesson9) | Strings | `String` API, `StringBuilder`: substrings, char replacement, palindromes, splitting text into sentences |
| [10](TeachMeSkills/src/homework_lesson10) | Exceptions | Custom checked exception thrown and caught (`Car.start()`) |
| [11](TeachMeSkills/src/homework_lesson11) | I/O streams | Byte/char streams, buffered I/O, `File`, serialization: copy palindrome lines, filter sentences, blacklist censorship, serialize objects |
| [12–13](TeachMeSkills/src/homework_lesson12_13) | Collections & generics | `ArrayList`, `ArrayDeque`, `HashSet`, `TreeSet`, `HashMap`, `Comparable/Comparator`, generic classes and methods; examples from lecture notes and online tutorials |
| [14](TeachMeSkills/src/homework_lesson14) | Lambdas | Functional interfaces, default/static methods, class vs anonymous class vs lambda |
| 15–18 | Stream API, Java 9–12, RegExp, XML/JSON | Topic placeholders only — no homework was given for these lessons |
| [19](TeachMeSkills/src/homework_lesson19) | Multithreading | `Thread` vs `Runnable`, `join()`, lambdas as tasks |

Every source file starts with a short Russian comment `/* Описание (2026): ... */` (or the original task statement) explaining what it does.

## How to run

**Requirements:** JDK 11 or newer.

### From the command line

All commands are run from the `TeachMeSkills` folder (lesson 11 reads and writes files using paths relative to it).

```bash
cd TeachMeSkills

# compile everything into out/
javac -encoding UTF-8 -d out $(find src -name "*.java")

# run any task by its full class name (package + class)
java -Dfile.encoding=UTF-8 -cp out homework_lesson1.Task1
java -Dfile.encoding=UTF-8 -cp out homework_lesson7.taskshape.Application
```

On Windows PowerShell, compile with:

```powershell
cd TeachMeSkills
javac -encoding UTF-8 -d out (Get-ChildItem -Recurse src -Filter *.java).FullName
java "-Dfile.encoding=UTF-8" -cp out homework_lesson1.Task1
```

`-Dfile.encoding=UTF-8` makes Cyrillic output display correctly in the console.

### From an IDE

- **IntelliJ IDEA:** *File → Open* the `TeachMeSkills` folder, right-click `src` → *Mark Directory as → Sources Root*, set the project SDK to 11+, then run any class with a `main` method. Set the run configuration's working directory to `TeachMeSkills`.
- **Eclipse:** *File → New → Java Project*, untick *Use default location* and point it to the `TeachMeSkills` folder.

### Notes

- Many tasks in lessons 3–5 and 9 read input from the keyboard (`Scanner`) — type a value and press Enter.
- `homework_lesson11.Note` echoes keyboard input until you type `q`.
- Many tasks use `Random`, so the output differs from run to run.

## 2026 clean-up

In 2026 I revisited the repository and checked that every program compiles and runs: all 217 files compile, and all 116 programs with a `main` method run. Changes made:

- **Encoding:** lessons 1–3 (29 files) were saved in Windows-1251 while the rest were UTF-8, so Cyrillic showed up as garbage on GitHub. Everything is UTF-8 now.
- **File paths:** lesson 11 used absolute paths like `C:\repositories\TMS\...` that only existed on my old PC; they are now relative to the `TeachMeSkills` folder.
- **Bug fixes**, each marked in the code with a `// fix 2026: ...` comment:
  - `homework_lesson2/Class.java` — infinite loop in the `continue` demo;
  - `homework_lesson9/task2` — result was never printed; crash on strings shorter than 4 characters;
  - `homework_lesson11` — `NullPointerException` in `finally` blocks when a file could not be opened.
- **Wording:** replaced a few profane words in output strings and comments (`homework_lesson7/transporttask`, `homework_lesson8/taskseasons`, `homework_lesson9/task4`) with neutral ones.
- **Comments:** added `/* Описание (2026): ... */` descriptions to files that had none.
- **Housekeeping:** removed Eclipse/IntelliJ project files from Git and extended `.gitignore`.

The rest of the code is intentionally left as it was written in 2021.

### Known issues (left as-is)

These are beginner mistakes I'd do differently today; they are kept for history:

- Some solutions don't fully match their task statement (e.g. `homework_lesson2/Task5` converts one value instead of printing a table; `homework_lesson3/Task10` doesn't keep its result).
- `homework_lesson1/Task1` never prints the "one-digit" case; `homework_lesson1/Task7` handles plural endings wrong for 111–114.
- `homework_lesson6/taskmatrix` is a first, broken attempt (the author's own note says so); `taskmatrixv1` is the working version.
- `homework_lesson7/taskshop` crashes on input longer than 7 characters.
- Part of the comments in `homework_lesson2/Task2.java` and `homework_lesson3/Task9.java` were already corrupted in the original 2021 commits and could not be recovered.
- Lessons 15–18 contain only topic stubs.
