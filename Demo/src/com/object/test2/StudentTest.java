package com.object.test2;

public class StudentTest {
    public static void main(String[] args) {
        /*
            定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
            学生的属性：学号，姓名，年龄。
            要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
            要求2：添加完毕之后，遍历所有学生信息。
            要求3：通过id删除学生信息
            如果存在，则删除，如果不存在，则提示删除失败。
            要求4：删除完毕之后，遍历所有学生信息。
            要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁*/

        //1 定义数组

        Student[] arr = new Student[4];
        //2添加学生
        Student s1 = new Student("1", "赵四", 33);
        Student s2 = new Student("2", "刘能", 38);
        Student s3 = new Student("3", "谢广坤", 45);
        Student s4 = new Student("heima002", "黑马", 8);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        arr[3] = s4;
        //遍历学生信息
        printArr(arr);
        Boolean flag = hasTarget(arr, "1");
        if (flag) {
            removeItem(arr, "1");
            System.out.println("学生信息删除成功");
            printArr(arr);
        } else {
            System.out.println("删除失败");
        }
        Boolean hasFlag = hasTarget(arr, "heima002");
        if (hasFlag) {
            setArrItem(arr, "heima002");
            printArr(arr);
        }
       /* System.out.println(s1.getName());
        System.out.println(s1.getAge());
        s1.setName("刘能");
        s1.setAge(45);
        String getName = s1.getName();
        int getAge = s1.getAge();
        System.out.println(getName);
        System.out.println(getAge);*/
    }

    public static void setArrItem(Student[] arr, String id) {
        for (int i = 0; i < arr.length; i++) {
            Student item = arr[i];

            if (item != null && item.getId() == id) {
                int age = item.getAge();
                item.setAge(age + 1);
            }
        }
    }

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student item = arr[i];
            if (item != null) {
                System.out.println(item.getId() + "，" + item.getName() + "，" + item.getAge());
            }
        }
    }

    public static boolean hasTarget(Student[] arr, String id) {
        for (int i = 0; i < arr.length; i++) {
            Student item = arr[i];
            if (item != null && item.getId() == id) {
                return true;
            }

        }
        return false;

    }

    public static void removeItem(Student[] arr, String id) {
        for (int i = 0; i < arr.length; i++) {
            Student item = arr[i];
            if (item.getId() == id) {
                arr[i] = null;
            }
        }
    }
}
