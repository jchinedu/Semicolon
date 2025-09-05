def function1(matrix):
    n = len(matrix)
    diagonal1 = 0
    diagonal2 = 0
    for i in range(n):
        diagonal1 += matrix[i][i]
        diagonal2 += matrix[i][n-i-1]

    return diagonal1, diagonal2


matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

result = function1(matrix)
print(result)
