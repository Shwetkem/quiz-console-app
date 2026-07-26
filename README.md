# Quiz Console App

A simple terminal-based multiple-choice quiz game built in Java, focused on practicing core Object-Oriented Programming concepts.

## What it does

- Presents 5 multiple-choice questions, one at a time, in the terminal
- Accepts the user's answer choice (1-4) for each question
- Calculates and displays a final score at the end

## Project structure

The project is split across three classes, each with a single responsibility:

- **Question.java** - a plain data model representing one question (id, question text, four options, correct answer). Uses private fields with getters/setters, and overrides `toString()` for readable output.
- **QuestionService.java** - holds the business logic: stores the list of questions, runs the quiz loop (`playQuiz()`), collects user input, and calculates the score (`displayScore()`).
- **Main.java** - the entry point. Creates a `QuestionService` and drives the program, keeping the "how it's used" separate from "how it works."

## Concepts practiced

- **Encapsulation** - Question fields are private, accessed only through getters/setters
- **Separation of concerns** - data model (Question), logic (QuestionService), and execution (Main) are kept in separate classes rather than one large file
- **Arrays of objects** - questions and user selections are managed using arrays of Question and String
- **Method overriding** - `toString()` is overridden in Question for custom object printing

## Known limitations

- Input isn't validated - entering anything other than 1-4 may throw an error or be silently marked incorrect. Planned as a future improvement.
- Question set is hardcoded (fixed array size of 5); not yet dynamic or loaded from an external source.
