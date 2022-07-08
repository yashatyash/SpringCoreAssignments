package com.yash.springcore.assignments.Ques7;

public class Arr1 {
    int a[]=new int[5];
    Arr2 obj2;
    public Arr1(int[] a, Arr2 obj2) {
        super();
        this.a = a;
        this.obj2 = obj2;
    }
    public void merge() {
        int c[]= new int[a.length+obj2.b.length];
        int index=0;
        for(int i=0;i<c.length;i++) {
            if(i<a.length)
                c[index++]=a[i];
            if(i<obj2.b.length)
                c[index++]=obj2.b[i];


        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<c.length;i++) {
            if(max<c[i])
                max=c[i];

        }
        System.out.println("maximum = "+max);
    }
}
