package ObjectOriented.Concept;
/*
배열
-2차원 배열
-3차원 배열
-다차원 배열

+
업무에서는 대부분 제네릭 클래스를 사용하기 때문에 배열을 자주 활용하지 않음
* */
public class 배열초기화테스트 {
    public static void main(String[] args) {
        int[] arr1 = {
                1,
                2,
                3
        };

        int[][] arr2 = {
                {1,2,3},
                {1,2,3},
                {1,2,3}
        };

        int[][][] arr3= {
            {
                    {1,2,3},
                    {1,2,3},
                    {1,2,3}
            },
            {
                    {1,2,3},
                    {1,2,3},
                    {1,2,3}
            },
            {
                    {1,2,3},
                    {1,2,3},
                    {1,2,3}
            }
        };


        String[][] str = {
                {"a1","b1","c1"},
                {"a2","b2","c2"},
                {"a3","b3","c3"}
        };

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j <str[i].length ; j++) {
                System.out.print(str[i][j]);
            }
            System.out.println();
        }

    }
}
