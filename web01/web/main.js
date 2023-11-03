let btn = document.getElementById('btn_factorial')

function mostrar(){
    let idDiv = document.getElementById('idDiv')
    if(idDiv.style.display==='block'){
        idDiv.style.display='none'
    }else{
        idDiv.style.display='block'
    }
}

function calcular(){
    let respuesta= confirm("desea calcular la suma de dos numeros")
    if(respuesta){
        let n= prompt("ingrese numero :")
        let n2= prompt("ingrese otro numero :")
        let sum = parseInt(n)+parseInt(n2)
        alert(sum)
    }else{
        alert("no entro")
    }
}
function factorial(){
    let resultado=1;
    let text= prompt('ingrese el numero :')
    let nFactorial=parseInt( text)

    for(let i = nFactorial;i>0;i--){
        console.log(i)
        resultado*=i
        console.log("acumulado=",resultado)
    }
    console.log(resultado)
    alert(resultado)
}
btn.addEventListener('click',()=> factorial())

