# Build a number guessing game

A number guessing game. The computer picks a secret number from 1 to 100. The player has 7 attempts, and after each guess the program says `Too high!` or `Too low!`.

When the round ends, the player can play again with a new number.

## Features

- Pick a random secret number from 1 to 100 for every round.
- When started with a number, like `java GuessingGame 42`, use it as the seed of `Random` so the game can be replayed exactly (MentorNxt's hidden tests do this); started without one, pick truly random numbers.
- Read guesses with `Scanner` and print `Too high!`, `Too low!` or `Correct!`.
- Allow at most 7 attempts. After 7 wrong guesses, print `Out of attempts. The number was 51.` (the secret number).
- Do not count guesses outside 1 to 100; ask again instead.
- Show how many attempts the player used.
- Ask `Play again? (y/n)` and start a new round on `y` or `Y`.

## How to run

```
javac *.java
java GuessingGame
```

## Sample run (your numbers will differ)

```
=== Number Guessing Game ===

I am thinking of a number from 1 to 100.
You have 7 attempts.
Your guess: 50
Too high!
Your guess: 25
Too low!
Your guess: 150
Please guess a number from 1 to 100.
Your guess: 37
Too high!
Your guess: 35
Correct! Attempts used: 4
Play again? (y/n): n
Thanks for playing!
```

## Author

ShaikNajima21
