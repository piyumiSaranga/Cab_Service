var errorMsg = '';

function changeBgColor(field) {
    field.style.backgroundColor = '#FF9966';
}

function submitForm() {
    var fName = document.getElementById('fName'); 
    var lName = document.getElementById('lName');
    var street1 = document.getElementById('street1');
    var street2 = document.getElementById('street2');
    var city = document.getElementById('city');
    var contry = document.getElementById('contry');
    var mobileNo = document.getElementById('mobileNo');
    var homeNo = document.getElementById('homeNo');
    var username = document.getElementById('username');
    var email = document.getElementById('email');
    var password = document.getElementById('password');
    var rePassword = document.getElementById('rePassword');
   

    if (fName.value == '') {
        errorMsg += '';
        changeBgColor(fName);
    }
    
    if (lName.value == '') {
        errorMsg += '';
        changeBgColor(lName);
    }
    if (street1.value == '') {
        errorMsg += '';
        changeBgColor(street1);
    }
    if (city.value == '') {
        errorMsg += '';
        changeBgColor(city);
    }
   
    if (contry.value == '') {
        errorMsg += '';
        changeBgColor(contry);
    }
   
    if (mobileNo.value == '' && homeNo.value == '') {
        errorMsg += '';
        changeBgColor(mobileNo);
    } else {
        if (mobileNo.value.length != 10 && homeNo.value.length != 10)
            errorMsg += 'Telephone number must be 10 digits\n';
        if (isNaN(mobileNo.value) || isNaN(homeNo.value))
            errorMsg += 'Telephone number should be numeric\n';
    }
    
    if (username.value == '') { // check if the username field is empty or not
        errorMsg += '';
        changeBgColor(username);
    } 
    
    if (email.value == '') {
        errorMsg += '';
        changeBgColor(email);
    } 

   
    if (password.value == '') {
        errorMsg += '';
        changeBgColor(password);
    } 
    if (password.value != rePassword.value) // check if both password fields match or not
        errorMsg += 'Passwords doesn\'t match\n';
    if (errorMsg != '') {
       alert(errorMsg);
        errorMsg = ''; // assign null for var errorMsg.. otherwsie new error msg will be added to the previous error msg of the errorMsg when the user clicks on the submit button after correcting the form.
        resetColor(); // background color of the required field will be yellow if the user input a blank field.. after the error is fixed, we need to remove the background color. it can be done using this function.
        return false;
    } else {
        return true;
    }



function resetColor() {
    var x = document.getElementById("registration"); // assign form to var x
    for (var i = 0; i < x.length; i++) { // access each an every elements of the form
        if (x.elements[i].value != '') { // basically check, this field is != ''
            removeColor(x.elements[i]); // if empty pass the specific element to removeColor()
        }
    }
}
function removeColor(field) { // Get parameter from resetColor()
    field.style.backgroundColor = ''; // Change the background color
}
 

}

