const display = document.getElementById('display');
const buttons = document.querySelectorAll('.buttons button');

let expression = '';
let result = 0;

buttons.forEach(button => {
    button.addEventListener('click', () => {
        const value = button.textContent;

        if (value === 'C') {
            expression = '';
            result = 0;
            display.value = '';
        } else if (value === '←') {
            expression = expression.slice(0, -1);
            display.value = expression;
        } else if (value === '=') {
            try {
                result = eval(expression);
                display.value = result;
            } catch (error) {
                display.value = 'Error';
            }
        } else {
            expression += value;
            display.value = expression;
        }
    });
});
