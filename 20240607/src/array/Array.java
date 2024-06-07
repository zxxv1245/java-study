package array;

public class Array {
    public static void main(String[] args) {
//        int[] students;
//        students = new int[]{90, 80, 70, 60 ,50}; // 배열 생성과 초기화

//        int[] students = new int[]{90, 80, 70, 60 ,50}; // 배열 선언,생성과 초기화

//        int[] students = {90, 80, 70, 60 ,50, 40};
//
//        for (int i = 0; i<students.length; i++){
//            System.out.println("학생" + (i+1) +  " 점수 : " + students[i]);
//        }

        // 2차원 배열

//        int[][] arr = new int[2][3];
//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//
//        for (int i = 0; i<arr.length;i++){
//            for (int j = 0; j<arr[i].length;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }



//        int[][] arr1 = new int[5][5];
//
//        int value = 1;
//        for (int i = 0; i<arr1.length;i++){
//            for (int j = 0; j<arr1[i].length;j++) {
//                arr1[i][j] = value++;
//                System.out.print(arr1[i][j] + " ");
//            }
//            System.out.println();
//        }

        // 향상된 for 문
        int[] numbers = {1,2,3,4,5};
//       단축키 iter
//        for (int number : numbers) {
//
//        }


//        for (int i = 0; i < numbers.length; i++){
//            int number = numbers[i];
//            System.out.println(number);
//        }
//
//        for (int number : numbers) {
//            System.out.println("향상된" + number);
//        }

        // for each문을 사용할 수 없는 경우, 증가하는 index 값 필요
        // index 값이 직접적으로 필요한 경우는 일반 for 문이 더 나음

        for (int i = 0; i<numbers.length; i++){
            System.out.println(i +" 결과 " + numbers[i]);
        }
    }
}
