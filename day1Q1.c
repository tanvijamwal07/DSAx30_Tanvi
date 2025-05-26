#include <stdio.h>
int main() {
    int n;
    printf("enter the number:");
    scanf("%d", &n);
    int size = 2 * n - 1;
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            int min;
            if (i<j){
                min=i;
            }
            else{
                min=j;
            }
            if (min>size-i){
                min=size-i-1;
            }
            if(min>size-j-1){
                min=size-j-1;
            }
            printf("%d ", n - min);
        }
        printf("\n");
    }
}
