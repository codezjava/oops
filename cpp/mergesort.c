#include<iostream.h>
#include<coni.h>
void merge(int a[],int,int,int);
void mergesort(int a[],int,int)
void main()
{

    clrscr();
    int arr[30],i,n;
    cout<<"\n how many no you want to sort:";
    cin>>n;
    cout<<"Enter the elements of the array:";
    for(i=0;i<n;i++)
    {

        cin>>arr[i];

    }
    mergesort(arr,0,n-1);
    cout<<"\n the sorted array is :\n";
    for(i=0;i<n;i++)
        cout<<arr[i]<,"\t";
    getch();
}
void merge(int arr[],int beg,int mid,int end)
{

    int i=beg,j=mid+1,index=beg,temp[30],k;
    while(i<=mid)&&(j<=end))
    {
        if(arr[i]<arr[j])
            {

                temp[index]=arr[j];
                i++
            }
            else
            {
                temp[index]=arr[j];
                j++;
            }
            index ++;
    }
    if(i>mid)
        for(k=j;k<=end;k++)
    {

        temp[index]=arr[k];
        index ++;
    }
    for(k=beg;k<index;k++)
        arr[k]=temp[k];
}
void mergesort(int arr[],int beg,int end)
{

    int mid;
    if(beg,end)
    {
        mid=(beg+end)/2;
        mergsort(arr,beg,mid);
        mergsort(arr,mid+1,end);
        merg(arr,beg,mid,end);

    }
}
