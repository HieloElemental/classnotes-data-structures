# Sorting arrays

```java
public static int[] sortingAlgorithm(int[] x){
    int n = x.lenght;
    int ordered = new int[n];
    int pos = 0;
    for(int i = 0; i < n; i++){
        int pos = x.min();
        ordered[i] = x[pos];

    }
}
```

## BubbleSort
```java
Scanner input = new Scanner(System.in);
int N = input.nextInt();
int x[] = new int[N];
for(int i = 0; i < N; i++) {
    x[i] = input.nextInt();
}

//BubbleSort
int aux;
for(int i = 1; i < N; i++) {
    for(int j = 0; j < N-i; j++) {
        if(x[j] > x[j+1]){
            aux = x[j];
            x[j]
        }
    }
}
```


# Eficiencia de algoritmos
  