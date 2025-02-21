## why java.
## hello world.
## data types.

Here's a table summarizing the **data types in Java**, categorized into **primitive** and **non-primitive** types.

### **Primitive Data Types in Java**
Primitive data types are built-in types that represent simple values.

| Data Type   | Size                   | Default Value | Description                                  |
| ----------- | ---------------------- | ------------- | -------------------------------------------- |
| **byte**    | 1 byte (8-bit)         | 0             | Stores small integers (-128 to 127)          |
| **short**   | 2 bytes (16-bit)       | 0             | Stores integers (-32,768 to 32,767)          |
| **int**     | 4 bytes (32-bit)       | 0             | Stores integers (-2³¹ to 2³¹-1)              |
| **long**    | 8 bytes (64-bit)       | 0L            | Stores large integers (-2⁶³ to 2⁶³-1)        |
| **float**   | 4 bytes (32-bit)       | 0.0f          | Stores decimal numbers with single precision |
| **double**  | 8 bytes (64-bit)       | 0.0d          | Stores decimal numbers with double precision |
| **char**    | 2 bytes (16-bit)       | '\u0000'      | Stores a single Unicode character            |
| **boolean** | 1 bit* (JVM-dependent) | false         | Stores `true` or `false`                     |

> *The size of `boolean` depends on JVM implementation but is generally 1 bit or 1 byte.*

---

## variables.
## typecasting.
## operators.

Here's a **single table** that categorizes and lists all the Java operators along with their descriptions and examples:  

| **Category**   | **Operator** | **Description**              | **Example**     |
| -------------- | ------------ | ---------------------------- | --------------- |
| **Arithmetic** | `+`          | Addition                     | `a + b`         |
|                | `-`          | Subtraction                  | `a - b`         |
|                | `*`          | Multiplication               | `a * b`         |
|                | `/`          | Division                     | `a / b`         |
|                | `%`          | Modulus (Remainder)          | `a % b`         |
| **Relational** | `==`         | Equal to                     | `a == b`        |
|                | `!=`         | Not equal to                 | `a != b`        |
|                | `>`          | Greater than                 | `a > b`         |
|                | `<`          | Less than                    | `a < b`         |
|                | `>=`         | Greater than or equal to     | `a >= b`        |
|                | `<=`         | Less than or equal to        | `a <= b`        |
| **Logical**    | `&&`         | Logical AND                  | `a && b`        |
|                |              |                              |                 | Logical OR | `a |  | b` |
|                | `!`          | Logical NOT                  | `!a`            |
| **Assignment** | `=`          | Assign value                 | `a = b`         |
|                | `+=`         | Add and assign               | `a += b`        |
|                | `-=`         | Subtract and assign          | `a -= b`        |
|                | `*=`         | Multiply and assign          | `a *= b`        |
|                | `/=`         | Divide and assign            | `a /= b`        |
|                | `%=`         | Modulus and assign           | `a %= b`        |
|                | `&=`         | Bitwise AND and assign       | `a &= b`        |
| **Unary**      | `+`          | Unary plus                   | `+a`            |
|                | `-`          | Unary minus                  | `-a`            |
|                | `++`         | Increment (Pre/Post)         | `a++ / ++a`     |
|                | `--`         | Decrement (Pre/Post)         | `a-- / --a`     |
| **Ternary**    | `? :`        | Ternary conditional operator | `a > b ? a : b` |
