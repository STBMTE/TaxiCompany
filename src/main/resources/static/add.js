$(document).ready(()=>{
    feather.replace()
    const addBtn = $('#add');
    addBtn.click(e=>{
        const nameVal = $('#firstName').val();
        const nameVal1 = $('#lastName').val();
        const nameVal2 = $('#surname').val();
        const nameVal3 = $('#licenseNum').val();
        const nameVal4 = $('#expirationDate').val();
        const nameVal5 = $('#address').val();
        const nameVal6 = $('#Age').val();
        const nameVal7 = $('#phoneNumber').val();
        $.ajax({
            method: "POST",
            url: "/save",
            contentType:"application/json",
            dataType:"json",
            data: JSON.stringify({
                "firstName": nameVal,
                "lastName": nameVal1,
                "surname": nameVal2,
                "licensNum": nameVal3,
                "expirationDate": nameVal4,
                "address": nameVal5,
                "age": nameVal6,
                "phoneNumber": nameVal7
            }),
            cache: false,
        }).done(value=>{
            $('#name').val('')
        })
    })
})