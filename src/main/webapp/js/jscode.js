
$(document).ready(function(){
    //se apeleaza dupa incarcarea completa a paginii
    
    $("#username").focusout(loginUseNameValidation);
    $("#password").focusout(loginPasswordValidation);

    $(".form form button").click(function(event){
       //nu se mai face submit la formular daca nu e completatt complet
        var isValid = validateAll();
        if(!isValid){
            event.preventDefault();
        }
    });


    $("#confirmpassword").focusout(validateConfirmPassword);
    $("#email").focusout(registerEmailValidation);


});

function loginUseNameValidation(){
    var username = $("#username");
    var text = $(username).val();
    if(text.length < 4){
        //adaug clasa error pe username
        $(username).addClass("error");
        return false;
    }else{
        $(username).removeClass("error");
        return true;
        // $("#username").next("p").hide();
    }
}

function loginPasswordValidation(){
    var password = $("#password");
    var text = $(password).val();
    if(text.length < 4){
        $(password).addClass("error");
        return false;
    }else{
        $(password).removeClass("error");
        return true;
    }
}


function validateAll(){
    return loginUseNameValidation() & loginPasswordValidation();
}

/*
function validateConfirmPassword(){
    var password = $("#password");
    var passwordText = $(password).val()
    var confirmpassword = $("#confirmpassword");
    var confirmpasswordText = $(confirmpassword).val();

    if(passwordText !== confirmpasswordText){
       $(confirmpassword).addClass("error");
       return false;
    }else{
       $(confirmpassword).removeClass("error");
       return true;
    }
}


function registerEmailValidation(){
    var email = $("#email"); 
    var text = $(email).val();
    if(text.length < 6){
        $(email).addClass("error");
        return false;
    }else{
        $(email).removeClass("error");
        return true;
    }
}*/