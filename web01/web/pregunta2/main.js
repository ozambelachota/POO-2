const form = document.querySelector('form')

form.addEventListener('submit',(evt)=>{
  evt.preventDefault()
  if(validateForm()){
    alert('enviando formulario')
    form.reset()
  }
} )

const validateForm = ()=>{
  let selectTipo = document.getElementById('tipoDocumento').value
  let numeroDocumento = document.getElementById('numeroDocumento').value
  let numeroExpediente = document.getElementById('expediente').value
  let sumilla = document.getElementById('sumillaDocumento').value 
  let fecha = document.getElementById('fechaIngresoPP').value
  let archivo = document.getElementById('archivoDocumento').value
  if(selectTipo==0){
    alert('seleccione tipo de archivos')
    return false
  }
  if(numeroDocumento.length==0 || numeroDocumento.length>15 ){ 
    alert('campo numero de documento vacio o sobrepasa los 15 caracteres') 
    return false
  }
  if(numeroExpediente.length==0 || numeroExpediente.length>20 ){
    alert('campo numero de expediente vacio o supera los 20 caracteres')
    return false
  }
  if(sumilla.length==0 || sumilla.length>100){
    alert('campo sumilla vacio o supera los 100 caracteres')
    return false
  }
  sumatoriaNumerosImpares(numeroDocumento)
  return true
} 
const sumatoriaNumerosImpares=(cant)=>{
  let suma = 0
  for (let i = 1; i <= cant.length; i++) {
    if (i%2 !==0){
      suma+=i
    }
  }
  alert(`suma de numeros impares es = ${suma}`)
}