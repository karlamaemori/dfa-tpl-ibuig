# DFA Activity - TPL

This program has two versions:
1. **Without Scanner** - I use hardcoded strings in the main method.
2. **With Scanner** - I use "Scanner input" to allow user to type strings in the console.

## State Transition Rules:

| Current State | Input `0` | Input `1` |
|--------------|-----------|-----------|
| **q0**       | Go to q1  | Stay at q0|
| **q1**       | Stay at q1| Go to q2  |
| **q2**       | Go to q1  | Go to q0  |

---

## DFA Given Pattern:
![DFA Image](https://github.com/karlamaemori/dfa-tpl-ibuig/blob/main/DFA%20Image.PNG)

