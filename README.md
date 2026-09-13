# Elemental RPG Character Builder (inspired by Genshin Impact)

## Overview

This project demonstrates the **Builder Creational Design Pattern** in Java. The idea is inspired by elemental RPG games such as **Genshin Impact**, where a character can have many different properties such as an element, weapon type, level, statistics, artifacts, and abilities.Since a game character contains many configurable fields, using a normal constructor with many parameters can become difficult to read and maintain.

The Builder Pattern solves this problem by allowing a character to be created **step by step** using a fluent and readable API.

---

## Features

The project allows the creation of characters with the following properties:

- Name
- Element
- Weapon Type
- Level
- Health
- Attack
- Defense
- Artifact Set
- Elemental Skill
- Elemental Burst

The program contains both:

- Predefined characters created through the `CharacterDirector`
- Custom characters created directly with the `GameCharacterBuilder`
---
## Project Structure

```text
game_char/
│
├── src/
│   ├── GameCharacter.java
│   ├── GameCharacterBuilder.java
│   ├── CharacterDirector.java
│   └── Main.java
│
├── README.md
└── .gitignore
```
---
# Builder Pattern Implementation

The Builder Pattern in this project consists of four main parts:

```text
Main || (Acts as the client and demonstrates how the Builder Pattern works.)
  │
CharacterDirector || (Contains reusable predefined character configurations.)
  │
GameCharacterBuilder || (Constructs and validates GameCharacter objects.)
  │
GameCharacter || (Stores information about the finished character.)
```
---
# Builder Pattern Roles

| Builder Pattern Role | Class |
|---|---|
| Product | `GameCharacter` |
| Builder | `GameCharacterBuilder` |
| Director | `CharacterDirector` |
| Client | `Main` |

---
## 1. Product — GameCharacter

`GameCharacter` is the final complex object that is created.

It stores all information about a character.

Example fields:

<img width="748" height="311" alt="Screenshot 2026-09-13 at 21 06 36" src="https://github.com/user-attachments/assets/7d437685-322e-4b48-a430-4ac8b31a7a2e" />


The character receives its values from the Builder:

<img width="748" height="311" alt="Screenshot 2026-09-13 at 21 07 47" src="https://github.com/user-attachments/assets/94dd96ac-ad7d-49a6-a790-97303b12dd1d" />

---

## 2. Builder — GameCharacterBuilder

`GameCharacterBuilder` is responsible for constructing a character step by step. I created two custom characters(customCharacter1, aki)

Example of one character:

```java
GameCharacter customCharacter1 =
                new GameCharacterBuilder()
                        .setName("kazuha")
                        .setElement("anemo")
                        .setWeaponType("sword")
                        .setLevel(90)
                        .setHealth(17000)
                        .setAttack(1900)
                        .setDefense(750)
                        .setArtifactSet("Viridescent Venerer")
                        .setElementalSkill("Chihayaburu")
                        .setElementalBurst("Kazuha slash")
                        .build();
        System.out.println(customCharacter1);
```

The Builder uses a **fluent API**.

Each setter returns the same Builder object:

```java
public GameCharacterBuilder setElement(String element) {
    this.element = element;
    return this;
}
```
This makes object creation easier to read.

---

## 3. Director — CharacterDirector

`CharacterDirector` contains reusable configurations for predefined characters.

Instead of manually entering all character properties every time, the Director provides ready-made construction sequences.

For example:

<img width="748" height="339" alt="Screenshot 2026-09-13 at 21 12 41" src="https://github.com/user-attachments/assets/6562ef1a-1852-4d97-81b2-fdee2f9c5dd7" />

The project includes several predefined character configurations:

| Character | Element | Weapon |
|---|---|---|
| Aether | Pyro | Sword |
| Lumine | Hydro | Sword |
| Flins | Electro | Polearm |

The Director makes these configurations reusable.

---

## 4. Client — Main

`Main.java` acts as the client.

The client can create characters using the Director: As I've mentioned earlier, i created two characters in main(example of second char)

<img width="748" height="339" alt="Screenshot 2026-09-13 at 21 16 57" src="https://github.com/user-attachments/assets/aed29785-bf62-44a8-ae58-9f21a0c64741" />

This demonstrates that the Builder is flexible and is not limited to predefined Director configurations.

---

# Why Use the Builder Pattern?

Without the Builder Pattern, a game character could require a constructor with many parameters. This approach has several problems, because it is difficult to understand what each value means without looking at the constructor definition.

For example:

```text
70
14000
1700
650
```

It is not immediately obvious whether these numbers represent level, health, attack, defense, or something else. With the Builder Pattern each value clearly shows its purpose.

The Builder Pattern therefore provides:

- Better readability
- Step-by-step construction
- Easier modification
- Multiple character configurations
- Validation before object creation
- Fluent method chaining

---

# Validation

The Builder validates the character before creating the final object.

The `build()` method calls a separate validation method:

```java
public GameCharacter build() {
    validate();
    return new GameCharacter(this);
}
```

Example validation:

```java
private void validate() {
    if (name == null || name.isBlank()) {
        throw new IllegalStateException(
                "Character name cannot be empty"
        );
    }
```

This prevents the creation of invalid characters like this:

```text
Name: empty
Level: -10
Health: 0
Attack: -500
```
# Avoiding Magic Numbers

Numbers should not be beyond the allowed value. (max, min level)

```java
if (level < MIN_LEVEL || level > MAX_LEVEL) {
    throw new IllegalStateException(
            "Level must be between "
                    + MIN_LEVEL
                    + " and "
                    + MAX_LEVEL
    );
}
```
---

# Conclusion

The **Builder Pattern** is suitable for this project because a game character is a complex object with many configurable properties.

Instead of using a constructor with many arguments, `GameCharacterBuilder` allows the object to be created step by step.

`CharacterDirector` provides reusable predefined character configurations, while the Builder can also be used directly for custom characters.

The implementation demonstrates:

- The Builder Creational Design Pattern
- Product, Builder, Director, and Client roles
- Fluent API / method chaining
- Multiple character representations
- Object validation
- Clean Code principles

The result is a maintainable character creation system inspired by elemental RPG games.
