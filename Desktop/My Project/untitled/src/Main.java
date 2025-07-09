//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public int array(number) {
    int result;
    int number;
    if (number == 0) {
        result = 10;
    } else if (number == 1) {
        result = 1;
    } else {
        int digits =[];
        for (int i = 9; i >= 2; i--) {
            while (result % i == 0) {
                digits.push(i);
                result /= i;
            }
        } if (result > 1) return -1;
    }


    return result;
}
}