public class PracticeCodility
{
    public static void main(String [] args)
    {
        int [] A = {6,42,11,7,1,42};
        int X = 7;
        int Y = 42;
        System.out.println(solution(X,Y,A));
    }

public static int solution(int X, int Y, int[] A) {
        int N = A.length;
        int result = 0;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;
            else if (A[i] == Y)
                nY += 1;
            if (nX == nY)
                result = i;
        }
        return result;
    }
}