
# Day 3 - Java Learning Journey

## Topics Covered
1. Arrays in Java
2. Methods in Java
3. For Loop
4. Returning Values from Methods

---

## 1. Array Program

### Description
Created an integer array to store student marks and calculated the total marks using a for loop.

### Code
```java
int marks[] = {70, 80, 90, 85, 75};
int sum = 0;

for(int i = 0; i < marks.length; i++)
{
    sum = sum + marks[i];
}
System.out.println(sum);
```

### Output
```text
400
```

### Concepts Learned
- Array declaration and initialization
- Array indexing
- Array length property
- Accessing array elements using a for loop
- Calculating the sum of array elements

---

## 2. Methods Program

### Description
Created methods to display a message and calculate the sum of two numbers.

### Code
```java
class method
{
    static void display()
    {
        System.out.println("Student Management system");
    }

    static int add(int a, int b)
    {
        return a + b;
    }

    public static void main(String args[])
    {
        display();

        int result = add(20, 30);

        System.out.println("the sum of two no is:" + result);
    }
}
```

### Output
```text
Student Management system
the sum of two no is:50
```

### Concepts Learned
- Method declaration
- Static methods
- Method calling
- Parameters and arguments
- Return statement
- Void and int return types

---

## Day 3 - What I Learned

- How to work with arrays in Java.
- How to access array elements using loops.
- How to create and call methods.
- Difference between void and return types.
- How to reuse code using methods.

## Practice
- Find the largest number in an array.
- Calculate the average of array elements.
- Create a method to find the square of a number.
- Create a method to check whether a number is even or odd.

---

**Day 3 Completed!**

Continuing my Java programming learning journey, one step at a time. 🚀
