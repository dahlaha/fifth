/**
 * Примеры матриц с известным определителем.
 *
 * @author Sergey Verkhushin
 */
public enum MatrixExample {
    A(
            new long[][] {
                    {9, 0, 3, 6},
                    {7, 9, 0, 6},
                    {9, 0, 3, 9},
                    {7, 2, 9, 2}
            },
            -1746),
    B(
            new long[][] {
                    {3, 5, 0, 2, 7, 0, 4, 7},
                    {1, 0, 6, 1, 4, 6, 9, 8},
                    {5, 4, 5, 6, 3, 1, 4, 0},
                    {7, 4, 7, 8, 8, 8, 8, 5},
                    {5, 7, 1, 2, 7, 6, 8, 3},
                    {4, 0, 3, 1, 1, 5, 6, 2},
                    {3, 5, 9, 0, 4, 6, 8, 8},
                    {6, 3, 0, 5, 6, 5, 4, 3}
            },
            237223),
    C(
            new long[][] {
                    {9, 0, 3, 6, 6, 2, 0, 1, 9, 2},
                    {7, 9, 0, 6, 9, 6, 2, 6, 5, 6},
                    {9, 0, 3, 9, 1, 1, 8, 5, 3, 5},
                    {7, 2, 9, 2, 2, 9, 9, 5, 5, 6},
                    {9, 5, 2, 4, 1, 3, 6, 1, 8, 1},
                    {4, 0, 5, 7, 1, 4, 8, 0, 5, 9},
                    {7, 2, 7, 6, 1, 5, 6, 8, 2, 1},
                    {9, 9, 6, 5, 4, 0, 2, 9, 9, 1},
                    {7, 6, 2, 9, 4, 2, 0, 9, 5, 5},
                    {3, 1, 2, 3, 8, 0, 3, 1, 1, 4}
            },
            42600677),
    D(
            new long[][] {
                    {9, 0, 3, 6, 6, 2, 0, 1, 9, 2, 3},
                    {7, 9, 0, 6, 9, 6, 2, 6, 5, 6, 7},
                    {9, 0, 3, 9, 1, 1, 8, 5, 3, 5, 1},
                    {7, 2, 9, 2, 2, 9, 9, 5, 5, 6, 0},
                    {9, 5, 2, 4, 1, 3, 6, 1, 8, 1, 6},
                    {4, 0, 5, 7, 1, 4, 8, 0, 5, 9, 7},
                    {7, 2, 7, 6, 1, 5, 6, 8, 2, 1, 8},
                    {9, 9, 6, 5, 4, 0, 2, 9, 9, 1, 0},
                    {7, 6, 2, 9, 4, 2, 0, 9, 5, 5, 8},
                    {3, 1, 2, 3, 8, 0, 3, 1, 1, 4, 8},
                    {4, 7, 6, 2, 8, 1, 3, 6, 2, 8, 7}
            },
            -3247578432L),
    E(
            new long[][] {
                    {9, 0, 3, 6, 6, 2, 0, 1, 9, 2, 3, 7},
                    {7, 9, 0, 6, 9, 6, 2, 6, 5, 6, 7, 6},
                    {9, 0, 3, 9, 1, 1, 8, 5, 3, 5, 1, 3},
                    {7, 2, 9, 2, 2, 9, 9, 5, 5, 6, 0, 7},
                    {9, 5, 2, 4, 1, 3, 6, 1, 8, 1, 6, 2},
                    {4, 0, 5, 7, 1, 4, 8, 0, 5, 9, 7, 4},
                    {7, 2, 7, 6, 1, 5, 6, 8, 2, 1, 8, 7},
                    {9, 9, 6, 5, 4, 0, 2, 9, 9, 1, 0, 0},
                    {7, 6, 2, 9, 4, 2, 0, 9, 5, 5, 8, 8},
                    {3, 1, 2, 3, 8, 0, 3, 1, 1, 4, 8, 9},
                    {4, 7, 6, 2, 8, 1, 3, 6, 2, 8, 7, 5},
                    {3, 8, 5, 5, 3, 3, 3, 4, 1, 8, 7, 2}
            },
            -46998828142L);

    private final long[][] matrix;
    private final long determinant;

    MatrixExample(long[][] matrix, long determinant) {
        this.matrix = matrix;
        this.determinant = determinant;
    }

    public long[][] getMatrix() {
        return matrix;
    }

    public long getDeterminant() {
        return determinant;
    }
}
