 #include <stdio.h>
 int main()
{
    char ch;
    printf("enter character ");
    scanf("%c", &ch);
    if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
    {
        printf("%c is alpha", ch);
    }
    else
    {
        printf("%c not ", ch);
    }
    return 0;
} 
