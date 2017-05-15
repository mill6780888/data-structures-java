package Chap04.Stack;

// stack.java
// demonstrates stacks
// to run this program: C>java StackApp
////////////////////////////////////////////////////////////////
class StackX {
    private int maxSize;        //数组容量
    private long[] stackArray;
    private int top;            // 栈顶指针

    //--------------------------------------------------------------
    public StackX(int s)         // 构造器
    {
        maxSize = s;             // 设置数组大小
        stackArray = new long[maxSize];  // 创建数组
        top = -1;                // 初始化栈顶
    }

    //--------------------------------------------------------------
    public void push(long j)    // 入栈
    {
        stackArray[++top] = j;     // increment top, insert item
    }

    //--------------------------------------------------------------
    public long pop()           // 出栈
    {
        return stackArray[top--];  // access item, decrement top
    }

    //--------------------------------------------------------------
    public long peek()          // 查看栈顶元素
    {
        return stackArray[top];
    }

    //--------------------------------------------------------------
    public boolean isEmpty()    // 是否空栈
    {
        return (top == -1);
    }

    //--------------------------------------------------------------
    public boolean isFull()     // 栈是否满了
    {
        return (top == maxSize - 1);
    }
//--------------------------------------------------------------
}  // end class StackX

////////////////////////////////////////////////////////////////
class StackApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(10);  // make new stack
        theStack.push(20);               // push items onto stack
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        while (!theStack.isEmpty())     // until it's empty,
        {                             // delete item from stack
            long value = theStack.pop();
            System.out.print(value);      // display it
            System.out.print(" ");
        }  // end while
        System.out.println("");
    }  // end main()
}  // end class StackApp
////////////////////////////////////////////////////////////////
