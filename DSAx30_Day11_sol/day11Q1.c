#include <stdio.h>
#include <stdlib.h>
struct ListNode {
    int val;
    struct ListNode* next;
};
struct ListNode* createNode(int val) {
    struct ListNode* node = (struct ListNode*)malloc(sizeof(struct ListNode));
    node->val = val;
    node->next = NULL;
    return node;
}
struct ListNode* inputList(int n) {
    if (n <= 0) return NULL;
    int x;
    printf("Enter %d elements: ", n);
    scanf("%d", &x);
    struct ListNode* head = createNode(x);
    struct ListNode* current = head;

    for (int i = 1; i < n; i++) {
        scanf("%d", &x);
        current->next = createNode(x);
        current = current->next;
    }
    return head;
}
void printList(struct ListNode* head) {
    while (head != NULL) {
        printf("%d ", head->val);
        head = head->next;
    }
    printf("\n");
}
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode dummy;
    dummy.next = NULL;
    struct ListNode* current = &dummy;
    int carry = 0;

    while (l1 || l2 || carry) {
        int val1 = l1 ? l1->val : 0;
        int val2 = l2 ? l2->val : 0;
        int sum = val1 + val2 + carry;
        carry = sum / 10;
        current->next = createNode(sum % 10);
        current = current->next;
        if (l1) l1 = l1->next;
        if (l2) l2 = l2->next;
    }
    return dummy.next;
}
int main() {
    int n1, n2;
    printf("Enter size of first number list: ");
    scanf("%d", &n1);
    struct ListNode* l1 = inputList(n1);
    printf("Enter size of second number list: ");
    scanf("%d", &n2);
    struct ListNode* l2 = inputList(n2);
    struct ListNode* sum = addTwoNumbers(l1, l2);
    printf("Sum list: ");
    printList(sum);
    return 0;
}
