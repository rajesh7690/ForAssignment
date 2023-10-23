

function validate(){
    
    var fname=document.getElementById('fname').value;
    var lname=document.getElementById("lname").value;
    var dob=document.getElementById("dob").value;
    var country=document.getElementById("country").value;

    var male=document.getElementById("male");
    var female=document.getElementById("female");

    var profession=document.getElementById("profession").value;
    var email=document.getElementById("email").value;
    var mobile=document.getElementById("mobile").value;

    
    if(fname && lname && dob && profession && email && 
        mobile && country &&
         ((male.checked && !female.checked) || (!male.checked && female.checked))){
        alert(`fname=${fname}, lname=${lname},
        dob=${dob}, country=${country},
        gender=${male.checked?"male":"female"}, profession=${profession},
        email=${email}, mobile=${mobile}`);
        return true;
    }
    
    
    alert("failed");
    return false;
    
    
}