int value = 2;
int i = 0;
switch(value) {
        case 1:
i = 1;
        break;
        case 2:
i = 2;
        // break отсутствует - выполнение продолжается в case 3
        case 3:
i = 3;
        break;
        }
// При value = 2, i будет равно 3