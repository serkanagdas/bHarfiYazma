public class Main {
    public static void main(String[] args) {
        System.out.println("B");
        String[][] letter2 = new String[7][4];

        for (int i = 0; i < letter2.length; i++)
        {
            for (int j = 0; j < letter2[i].length; j++)
            {
                if (i == 0 || i == 3 || i==6)
                {
                    letter2[i][j] = " * ";
                }
                else if (j == 0 || j == 3)
                {
                    letter2[i][j] = " * ";
                }
                else
                {
                    letter2[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter2)
        {
            for (String col : row)
            {
                System.out.print(col);
            }
            System.out.println();
        }

    }
}