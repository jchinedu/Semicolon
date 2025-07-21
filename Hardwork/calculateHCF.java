public static int calculateHCF(int[] numbers) {
    int hcf = numbers[0];

    for (int i = 1; i < numbers.length; i++) {
        int num1 = hcf;
        int num2 = numbers[i];
        int minValue;

        if (num1 < num2) {
            minValue = num1;
        } else {
            minValue = num2;
        }

        for (int j = minValue; j >= 1; j--) {
            if (num1 % j == 0 && num2 % j == 0) {
                hcf = j;
                break;
            }
        }
    }

    return hcf;
}
