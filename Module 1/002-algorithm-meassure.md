# How do we meassure an algorithm
The most simple way is count how much code instructions it has

## Example 1

```java
import java.util.scanner;

public class Main {
    public static void main(String args[]){
        int x, i;
        long r;
        r = 0;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        for (i=1; i<=x; i++){
            r += i;
        }
        System.out.println();
    }
}
```

Basic operations amount: 7 + 3x

## Example 2

```java
import java.util.scanner;

public class Main {
    public static void main(String args[]){
        int x;
        long r;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        r = x*(x+1)/2;
        System.println(r);
    }
}
```

Basic operations amount: 6

# "Big Oh" notation.

- consider the worst case
- focus on big "n" values
- don't focus on constant or lesser values

Example 1: f(n) = 7+3n, so O(n)
Example 2: f(n) = 6, so O(1) _this means constant_

An algorithm is more efficient than other if its "Oh" is less

when you use a loop (or recrsion), you're basically disguising some "n" operations

## Example 3

### Alt 1
```java
import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n, i, greatest;
        n = input.nextInt();
        int x[] = new int[n];
        for (i=0; i<n; i++){
            x[i] = input.nextInt();
        }
        greatest = x[0];
        for(i = 1; i < n; i++){
            if(x[i] > greatest){
                greatest = x[i];
            }
        }
        System.out.println(greatest);
    }
}
```
f(n) = 8 + 3n + 4(n-1) = 4 + 7n

### Alt 2
```java
import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n, i, gerater;
        n = input.nextInt();
        int x[] = new int[n];
        greater = 0;
        for (i=0; i<n; i++){
            x[i] = input.nextInt();
            if(x[i] > greater){
                greater = x[i];
            }
        }
        System.out.println(mayor);
    }
}
```

f(n) = 8 + 5n

So the Alt 2 is _slightly_ better than two

### Alt 3
```java
import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n, i, gerater, x;
        n = input.nextInt();
        greater = 0;
        for (i=0; i<n; i++){
            x = input.nextInt();
            if(x > greater){
                greater = x;
            }
        }
        System.out.println(mayor);
    }
}
```

f(x) = 8 + 5n (But doesn't uses THAT much memory)

```java
for(j=0; j<m; m++){
    System.out.println();
}
```

f(m) = 3m

```java
for(i=0; i<n; i++){
    for(j=0; j<m; j++){
        System.out.print();
    }
}
```

f(m,n) = 2n(3m)

**Cuando m y n tienden a infinito:**

f(n) = 6n²


## Exercise

design an algorithm