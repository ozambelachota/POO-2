let btn = document.getElementById("btn_display")
 
let tabla = document.getElementById('tabla')

const ocultarTabla = ()=>{
  if(tabla.classList.contains('table_visible')){
    tabla.classList.remove('table_visible')
  }else{
    tabla.classList.add('table_visible')
  }

}

btn.addEventListener('click', ()=> ocultarTabla())