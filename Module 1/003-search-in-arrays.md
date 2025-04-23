# Searching inside array

the search array efficency is O(n) by default, but it can be better.

If the array is sorted and making a binary search

```java
static int binarySearch(int[] a, int x){
    int sta = 0, end = a.length - 1, pos;
    while(sta <= end) {
        pos = (sta+end)/2;
        if(a[pos] == x){
            return pos;
        }else if(x < a[pos]){
            end = pos-1;
        }else{
            sta = pos-1;
        }
    }
}
```

**Note:** when you divide the possibilities in two, you have 1 bit of information

f(n) = 3+4*log2(n)+1

O(log2(n))