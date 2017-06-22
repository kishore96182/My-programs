#include<stdio.h>
#include<string.h>
int main()
{
  char str[20];
  int i;
  printf("enter stri");
  scanf("%s",str);
  for(i=0;i<=strlen(str);i++)
  {
      if(str[i]>=65&&str[i]<=90)
       str[i]=str[i]+32;
  }
  printf("lower is %s",str);
  return 0;
}
