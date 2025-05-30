#include <stdio.h>
int main() {
    int n;
    printf("enter the number");
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        for (int s = 0; s < n - i - 1; s++)
            printf(" ");
        for (char ch = 'A'; ch <= 'A' + i; ch++)
            printf("%c", ch);
        for (char ch = 'A' + i - 1; ch >= 'A'; ch--)
            printf("%c", ch);
        printf("\n");
    }
}
