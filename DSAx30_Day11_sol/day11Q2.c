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
    int val;
    printf("Enter %d elements: ", n);
    scanf("%d", &val);
    struct ListNode* head = createNode(val);
    struct ListNode* current = head;
    for (int i = 1; i < n; i++) {
        scanf("%d", &val);
        current->next = createNode(val);
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
struct ListNode* middleNode(struct ListNode* head) {
    struct ListNode* slow = head;
    struct ListNode* fast = head;
    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;
    }
    return slow; 
}
int main() {
    int n;
    printf("Enter number of elements in the linked list: ");
    scanf("%d", &n);
    if (n <= 0) {
        printf("List must have at least 1 node.\n");
        return 0;
    }
    struct ListNode* head = inputList(n);
    printf("Full list: ");
    printList(head);
    struct ListNode* mid = middleNode(head);
    printList(mid);
    return 0;
}
