
#include<stdio.h>
#include<iostream>
#include<string.h>
int main(){
    using namespace std;
    char cmd[110] ;
   // string cmd;
    int num = 0;
    int numOfOnline = 0;
    while(gets(cmd)){
        if(cmd[0]=='+')numOfOnline++;
        else if(cmd[0]=='-')numOfOnline--;
        else{
            int i;
            for(i=0;i<110;i++){
                if(cmd[i]==':')break;
            }
            num +=(strlen(cmd)-1-i)*numOfOnline;
            
        }
    }
    printf("%d",num);
    return 0;
}