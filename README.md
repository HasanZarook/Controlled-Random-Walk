
# Obstacles Lab – Controlled Random Walk 🏃‍♂️🛑

## Overview

This Java program simulates a **controlled walk with obstacles**. Two characters are tracked:

1. **Ali** – moves according to user input (North, South, East, West).
2. **Hasan** – moves randomly at each time step.

The program also includes **hurdles**, which prevent Ali from moving into certain positions.

---

## Features

### Ali’s Movement

* Controlled via user input:

  * `1` → North
  * `2` → South
  * `3` → East
  * `4` → West
* Checks for hurdles at each step. If a hurdle exists at the next position, Ali’s movement is blocked.

### Hasan’s Movement

* Moves randomly in one of four directions:

  * `0` → East
  * `1` → West
  * `2` → North
  * `3` → South
* Position is printed after every move.

### Obstacles

* Predefined hurdles on the grid:

```java
int[][] hurdles = {{0, 1}, {2, 2}, {3, 3}, {4, 4}, {3, 4}};
```

* Ali cannot move into positions where hurdles exist.

---

## How It Works

1. User enters the total number of time steps.
2. Ali and Hasan start at `(0,0)`.
3. For each time step:

   * Hasan moves randomly.
   * Ali moves according to user input, avoiding hurdles.
   * Current positions of both characters are printed.

### Example Output

```
Ali's Starting point 0,0
Hasan's Starting position : 0,0
Hasan's Current position : 1,0
press 1 for north
press 2 for south
press 3 for east
press 4 for west
1
Ali's Current Position:(0,1)
there is hurdle
```

---

## Key Concepts Covered ✅

1. **2D Grid movement**
2. **User input handling**
3. **Random movement using `Random`**
4. **Collision detection with hurdles**
5. **Loops and conditional statements**

---

## Author ✍️

* **Edited / Enhanced by:** Hasan Zarook 


Do you want me to do that?
