package Chap02.Array;

/**
 * 数据的操作演示
 */
////////////////////////////////////////////////////////////////
class ArrayApp {
    public static void main(String[] args) {
        long[] arr;                  // 声明一个数组
        arr = new long[100];         // 创建一个数组
        int nElems = 0;              // 有效元素数量，应该要小于数据的容量
        int j;                       // 循环变量
        long searchKey;              // 需查找的数据
//--------------------------------------------------------------
        arr[0] = 77;                 // 插入10个数据项
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        nElems = 10;                 // 设置元素数量10
//--------------------------------------------------------------
        for (j = 0; j < nElems; j++)      // 打印数组元素
            System.out.print(arr[j] + " ");
        System.out.println("");
//--------------------------------------------------------------
        searchKey = 66;              // 查找数据项： 66
        for (j = 0; j < nElems; j++)          // 迭代每一个元素
            if (arr[j] == searchKey)       // 判断是否需要找的数据
                break;                     // 如果找到了，则退出循环
        // 是否最后的元素，这里有一个for循环的特点，就是j++最后会执行一次，也就是j==nElems能表示没找到
        if (j == nElems)
            System.out.println("Can't find " + searchKey); // yes
        else
            System.out.println("Found " + searchKey);      // no
//--------------------------------------------------------------
        searchKey = 55;              // 删除元素： 55
        for (j = 0; j < nElems; j++)           // 查找该元素
            if (arr[j] == searchKey)
                break;
        for (int k = j; k < nElems; k++)       //每一个元素向前移动，覆盖要删除的元素
            arr[k] = arr[k + 1];
        nElems--;                         // 元素数量递减
//--------------------------------------------------------------
        for (j = 0; j < nElems; j++)      // 显示元素，查看结果
            System.out.print(arr[j] + " ");
        System.out.println("");
    }  // end main()
}  // end class ArrayApp
