### **Abstraction in Java – A Complete Explanation for Teaching**

#### **What is Abstraction?**

**Abstraction** is one of the four fundamental principles of **Object-Oriented Programming (OOP)**. It is the process of **hiding implementation details** and only **showing the essential features** of an object.

🔹 **Definition**:  
_"Abstraction is a process of hiding the internal details and showing only the necessary information to the user."_

🔹 **Example from Real Life:**  
Think about a **car**:

- You only need to know how to **start the car (turn the key or press a button)**.
- You don’t need to understand **how the engine works internally, how fuel ignites, or how gears shift.**
- The **internal mechanics are hidden**, and only the **essential functionalities** are provided.

Similarly, in Java, **abstraction allows us to define a blueprint (interface or abstract class) without exposing the internal implementation.**

---

## **How to Achieve Abstraction in Java?**

In Java, **abstraction can be achieved in two ways**:

1. **Abstract Classes** (0% to 100% abstraction)
2. **Interfaces** (100% abstraction, before Java 8)

---

## **1️⃣ Abstract Classes in Java**

An **abstract class** in Java is a class that **cannot be instantiated (you cannot create an object of it)** and is meant to be **inherited** by other classes.

### **🔹 Syntax of Abstract Class**

```java
abstract class Vehicle {
    abstract void start();  // Abstract method (without implementation)

    void stop() {           // Concrete method (with implementation)
        System.out.println("Vehicle stopped.");
    }
}
```

Here,

- `start()` is an **abstract method** (no implementation).
- `stop()` is a **concrete method** (it has a body).
- The class is declared `abstract` because it contains an abstract method.

---

### **🔹 Example of Abstract Class in Action**

```java
abstract class Vehicle {
    abstract void start();  // Abstract method (only declaration)

    void stop() {           // Concrete method (has a body)
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    void start() {  // Providing implementation for the abstract method
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {
    void start() {  // Providing different implementation
        System.out.println("Bike starts with a kick.");
    }
}

public class AbstractionExample {
    public static void main(String args[]) {
        Vehicle myCar = new Car();
        myCar.start();   // Output: Car starts with a key.
        myCar.stop();    // Output: Vehicle stopped.

        Vehicle myBike = new Bike();
        myBike.start();  // Output: Bike starts with a kick.
        myBike.stop();   // Output: Vehicle stopped.
    }
}
```

🔹 **Explanation:**

- The **Vehicle class** is **abstract** and defines an **abstract method `start()`**.
- **Car and Bike** inherit `Vehicle` and **provide their own implementations** of `start()`.
- The `stop()` method is **inherited as it is** (no need for overriding).
- **Objects cannot be created for `Vehicle`, but references can be used for polymorphism.**

---

## **2️⃣ Interface in Java**

An **interface** is a **fully abstract blueprint** where all methods are **public and abstract by default**.

🔹 **Before Java 8:**

- Interfaces could only have **abstract methods (100% abstraction).**
- All methods are **public & abstract by default**.
- All fields are **public, static, and final by default**.

🔹 **After Java 8:**

- Interfaces can now have **default and static methods** (with implementations).

### **🔹 Syntax of Interface**

```java
interface Vehicle {
    void start(); // Abstract method (by default public and abstract)
}
```

### **🔹 Example of Interface in Action**

```java
interface Vehicle {
    void start();  // Abstract method (no body)

    default void stop() {   // Default method (Java 8 feature)
        System.out.println("Vehicle stopped.");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with a kick.");
    }
}

public class InterfaceExample {
    public static void main(String args[]) {
        Vehicle myCar = new Car();
        myCar.start();   // Output: Car starts with a key.
        myCar.stop();    // Output: Vehicle stopped.

        Vehicle myBike = new Bike();
        myBike.start();  // Output: Bike starts with a kick.
        myBike.stop();   // Output: Vehicle stopped.
    }
}
```

🔹 **Key Differences from Abstract Class**:

- **No need to use `abstract` keyword** in the interface methods.
- A class implements an interface using the `implements` keyword.
- **Multiple interfaces can be implemented** (Unlike abstract classes, where multiple inheritance is not possible).

---

## **🎯 Key Differences: Abstract Class vs Interface**

| Feature               | Abstract Class                              | Interface                               |
| --------------------- | ------------------------------------------- | --------------------------------------- |
| Abstraction Level     | 0% to 100%                                  | 100% (Before Java 8)                    |
| Method Implementation | Can have both abstract and concrete methods | Only abstract methods (Before Java 8)   |
| Fields                | Can have instance variables                 | Only `public static final` variables    |
| Constructor           | Can have constructors                       | Cannot have constructors                |
| Multiple Inheritance  | **Not supported**                           | **Supported** (via multiple interfaces) |
| Access Modifiers      | Can be **public, protected, private**       | Methods are **public by default**       |
| Performance           | Faster                                      | Slower due to interface call overhead   |

---

## **🎯 When to Use What?**

- **Use Abstract Class** when:

  - You want to **partially implement behavior** in a base class.
  - You expect subclasses to share some **common functionality**.
  - You need to define **non-static or non-final fields**.

- **Use Interface** when:
  - You need **100% abstraction**.
  - You want to implement **multiple inheritance**.
  - You are defining a **contract for different classes to follow**.

---

## **Conclusion**

- **Abstraction is a key principle in Java** that helps in designing a clean and maintainable codebase.
- It allows **hiding unnecessary details** and **exposing only the required functionalities**.
- **Abstract classes** provide a way to define a **common blueprint** with partial implementations.
- **Interfaces** enforce **strict contracts** and support **multiple inheritance**.
