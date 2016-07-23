var errorMsg = '';

function changeBgColor(field) {
    field.style.backgroundColor = 'red';
}
function VehicleSubmitForm()
{
    var vehicleNum=document.getElementById('vehicleNo');
    var vehicleType=document.getElementById('vehicletype');
    var noOfSeats=document.getElementById('seats');
    var type=document.getElementById('type');
    var issueDate=document.getElementById('issueDate');
    var expireDate=document.getElementById('expireDate');
    var owner=document.getElementById('owner');
    var ownership=document.getElementById('ownership');
    
    if (vehicleNum.value == '') {
        errorMsg += '';
        changeBgColor(vehicleNum);
    }
    if (vehicleType.value == '') {
        errorMsg += '';
        changeBgColor(vehicleType);
    }
    if (noOfSeats.value == '') {
        errorMsg += '';
        changeBgColor(noOfSeats);
    }
     if (type.value == '') {
        errorMsg += '';
        changeBgColor(type);
    }
    if (issueDate.value == '') {
        errorMsg += '';
        changeBgColor(issueDate);
    }
    if (expireDate.value == '') {
        errorMsg += '';
        changeBgColor(expireDate);
    }
     if (owner.value == '') {
        errorMsg += '';
        changeBgColor(owner);
    }
    if (ownership.value == '') {
        errorMsg += '';
        changeBgColor(ownership);
    }
}
function resetColor() {
    var x = document.getElementById("vehicleRegister"); // assign form to var x
    for (var i = 0; i < x.length; i++) { // access each an every elements of the form
        if (x.elements[i].value != '') { // basically check, this field is != ''
            removeColor(x.elements[i]); // if empty pass the specific element to removeColor()
        }
    }
}
function removeColor(field) { // Get parameter from resetColor()
    field.style.backgroundColor = ''; // Change the background color
}




