/* Static Array */
public int search_for_position(int[] a) {
    for(int i; i < a.length; i++) {
        if (a[i]==x) {
            return i;
        }
    }
}

/* "Dynamic" Array */
// these are the ones who's lenght can be changed
public int[] append_to_array(int[] a, int e) {
    int b = new int[a.length + 1];
    for(int i = 0; i < a.length){
        b[i] = a[i];
    }
    b[a.length] = e;
    return b;
}

/** 
 * IN MOST PROGRAMING LANGUAGES ARRAYS ARE STATIC!
 * 
 * On the ones where they are "dynamic" are mostly
 * statics that are duplicated to one bigger in 
 * the background
 *
 * 
 * An old practice when the arrays weren't dynamic
 * was making the array extra-long only if needed
 * 
 * int[] myArray = new int[10000]
 */

//! Exercise of insertion and removal
// pop an element from the array
public int[] pop_array(int[] a){
    int[] b = new int[a.length - 1];
    for(int i = 0; i < b.length; i++){
        b[i] = a[i];
    }
    return b;
}

// shift an element from the array
public int[] shift_array(int[] a){
    int[] b = new int[a.length -1];
    for(int i = 0; i < b.length; i++){
        b[i] = a[i + 1];
    }
}

// remove single element
public int[] remove_array_element_at(int[] a, int index){
    int[] b = new int[a.length - 1];
    for(int i = 0; i < index; i++){
        b[i] = a[i];
    }
    for(int i = index; i < b.length, i++){
        b[i] = a[i+1];
    }
    return b;

    /**
     * for(int i = 0; i < b.length; i++){
     *     if(if < 2){
     *         b[i] = a[i]
     *     } else {
     *         b[i] = a[i+1]
     *     }
     * }
     */

    /**
     * int j = 1;
     * for(int i = 0; i < b.length; i++){
     *     if(i == index){
     *         j++;
     *     }
     *     b[i] = a[j];
     *     j++;
     * }
     */
}