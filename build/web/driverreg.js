var errorMsg = '';

function changeBgColor(field) {
    field.style.backgroundColor = '#FF9966';
}

function driversubmitForm() {
    var fName = document.getElementById('fName'); 
    var lName = document.getElementById('lName');
    var dateofbirth=document.getElementById('dob');
    var nic = document.getElementById('nic');
    var tel = document.getElementById('tel');
    var address = document.getElementById('address');
    var license = document.getElementById('license');
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
    if (dob.value == '') {
        errorMsg += '';
        changeBgColor(dob);
    }
   
    if (nic.value == '') {
        errorMsg += '';
        changeBgColor(nic);
    }
   
   
    if (tel.value == '') {
        errorMsg += 'Please provide at least one telephone number\n';
        changeBgColor(tel);
    } 
    if (address.value == '') {
        errorMsg += '';
        changeBgColor(address);
    } 
    if (license.value == '') {
        errorMsg += '';
        changeBgColor(license);
    } 
    
    if (username.value == '') { // check if the username field is empty or not
        errorMsg += '';
        changeBgColor(username);
    } else {
       
        var alphaExp = /^[0-9a-zA-Z]+$/; // from net
        if (!username.value.match(alphaExp)) // check whether the value inside the username field is matching with the expression.
            errorMsg += 'User name can cotain alpha numeric characters only\n';
    }
    if (email.value == '') {
        errorMsg += '';
        changeBgColor(email);
    } 

   
    if (password.value == '') {
        errorMsg += '';
        changeBgColor(password);
    } else if (password.value.length < 6) // check min characters
        errorMsg += 'Passowrd should have at least 6 characters\n';

    if (password.value !== rePassword.value) // check if both password fields match or not
        errorMsg += 'Passwords doesn\'t match\n';
    if (errorMsg != '') {
       alert(errorMsg);
        errorMsg = ''; // assign null for var errorMsg.. otherwsie new error msg will be added to the previous error msg of the errorMsg when the user clicks on the submit button after correcting the form.
        resetColor(); // background color of the required field will be yellow if the user input a blank field.. after the error is fixed, we need to remove the background color. it can be done using this function.
        return false;
    } else {
        return true;
    }

}

function resetColor() {
    var x = document.getElementById("registration1"); // assign form to var x
    for (var i = 0; i < x.length; i++) { // access each an every elements of the form
        if (x.elements[i].value != '') { // basically check, this field is != ''
            removeColor(x.elements[i]); // if empty pass the specific element to removeColor()
        }
    }
}
function removeColor(field) { // Get parameter from resetColor()
    field.style.backgroundColor = ''; // Change the background color
}






