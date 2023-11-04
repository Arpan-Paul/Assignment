const display = document.querySelector('.display');
const buttons = document.querySelectorAll('button');
buttons.forEach(function(button){
    button.addEventListener('click', calculate);
});
function calculate(event){
    const clickedButtonValue = event.target.value;
    if(clickedButtonValue === '='){
        if(display.value !==''){
            display.value = eval(display.value.replace("%", "/100"));
        }
    }else if(clickedButtonValue === 'AC'){
        display.value='';
    }
    else if(clickedButtonValue ==='DEL'){
        display.value= display.value.toString().slice(0,-1);
    }
    else{
        display.value +=clickedButtonValue;
    }
}