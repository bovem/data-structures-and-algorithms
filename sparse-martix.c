#include <stdio.h>
//#include <conio.h>

void main() {
    int m,n,i,j,index=0;

    struct nonzero {
        int row[m];
        int column[n];
        int element[m*n];
    } nonzero;

    printf("\nPROGRAM FOR SPARSE MATRIX AND RETURING NON ZERO ELEMENTS WITH POSITIONS\n");
    printf("Enter number of row in matrix:");
    scanf("%d",&m);
    printf("\nEnter number of columns in matrix:");
    scanf("%d",&n);

    int arr [m][n];

    //clrscr();
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            printf("Enter element at [%d][%d]:",i,j);
            scanf("%d",&arr[i][j]);
        }
    }

    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            printf("%d\t",arr[i][j]);
        }
        printf("\n");
    }

    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            if (arr[i][j] != 0){
                nonzero.row[index] = i;
                nonzero.column[index] = j;
                nonzero.element[index] = arr[i][j];
                index += 1;
            }   
        }
    }

    for (i=0;i<index;i++){
        printf("Element %d at [%d][%d]\n",nonzero.element[i],
                nonzero.row[i],nonzero.column[i]);
    } 
    //getch();

}