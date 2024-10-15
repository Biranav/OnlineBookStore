//index
let index=document.getElementById("index")
let admina=document.getElementById("Admin")
let customera=document.getElementById("Customer")
let ses1=document.getElementById("signup1")
let ses2=document.getElementById("signup2")
admina.addEventListener("click",
	function(){
		index.style.display="none";
		ses1.style.display="block";
	}
)
customera.addEventListener("click",
	function(){
		index.style.display="none";
		ses2.style.display="block";
	}
)


// section 1
let form1=document.getElementById("form1")
let uname1=document.getElementById("adminName")
uname1.addEventListener("focusout",
    function(){
        if(uname1.value == ""){
            let p1=document.getElementById("p1")
            let para1=document.getElementById("para1")
            p1.style.display="block"
            // let p=document.createElement("p")
            // form.appendChild(p)
            para1.textContent="**User Name Required"
            para1.style.color="red"
        }
        let val=String(uname1.value)
        for(i=0;i<val.length;i++){
            if(val[i] >="0" && val[i]<="9"){
                let p1=document.getElementById("p1")
                let para1=document.getElementById("para1")
                p1.style.display="block"
                para1.textContent="*Enter only String Values"
                para1.style.color="red" 
            }
        }
    }
)

let cpwd1=document.getElementById("adminpwd1")
let npwd1=document.getElementById("newpwd1")
cpwd1.addEventListener("focusout",
    function(){
        if(npwd1.value!=cpwd1.value){
            let p2=document.getElementById("p2")
            let para2=document.getElementById("para2")
            p2.style.display="block"
            para2.textContent="** New Password is not matched"
            para2.style.color="red"
        }
    }
)

let icon1=document.getElementById("icon1")
icon1.addEventListener("click",
    function(){
        cpwd1.setAttribute("type",Text)
    }
)
let email1=document.getElementById("adminemail")
let button1 = document.getElementById("spansubmit1")
button1.addEventListener("click",
    function(){
        button1.textContent="Login Succussful ....."

        uname1.value=""
        email1.value=""
		npwd1.value=""
        cpwd1.value=""
    }
)


// section 2
let form2=document.getElementById("form2")
let uname2=document.getElementById("customerName")
uname2.addEventListener("focusout",
    function(){
        if(uname2.value == ""){
            let p3=document.getElementById("p3")
            let para3=document.getElementById("para3")
            p3.style.display="block"
            // let p=document.createElement("p")
            // form.appendChild(p)
            para3.textContent="**User Name Required"
            para3.style.color="red"
        }
        let val=String(uname2.value)
        for(i=0;i<val.length;i++){
            if(val[i] >="0" && val[i]<="9"){
                let p3=document.getElementById("p3")
                let para3=document.getElementById("para3")
                p3.style.display="block"
                para3.textContent="*Enter only String Values"
                para3.style.color="red" 
            }
        }
    }
)

let cpwd2=document.getElementById("customerpwd")
let npwd2=document.getElementById("newpwd2")
cpwd2.addEventListener("focusout",
    function(){
        if(npwd2.value!=cpwd2.value){
            let p4=document.getElementById("p4")
            let para4=document.getElementById("para4")
            p4.style.display="block"
            para4.textContent="** New Password is not matched"
            para4.style.color="red"
        }
    }
)

let icon2=document.getElementById("icon2")
icon2.addEventListener("click",
    function(){
        cpwd2.setAttribute("type",Text)
    }
)
let email2=document.getElementById("customeremail")
let button2 = document.getElementById("spansubmit2")
button2.addEventListener("click",
    function(){
        button2.textContent="Login Succussful ....."

        uname2.value=""
        email2.value=""
		npwd2.value=""
        cpwd2.value=""
    }
)

