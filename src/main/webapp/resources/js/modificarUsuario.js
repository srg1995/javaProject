$(document).ready(function(){
	existeUsuario();
});

function existeUsuario(){
	$("#comprobarExistencia").on("click",function(){
		var usuario = $("#inputNombreAntiguo").val()
		$.ajax({
			type: "POST",
			url: "http://localhost:8686/pru2/existeUsuario.ajax",
			data: usuario,
			dataType: 'text',
			contentType: 'text/plain; charset=utf-8',
			async: true,
			success: function(data) {
				console.log("exito"+data)
				if(data == "true"){
					$(".marcarErrores").hide()
					$(".existe-formulario").hide();
					$("#formularioOculto").show();
				}
				else if(data == "false"){
					$(".marcarErrores").show()
				}
			},
			error: function(xhr, status, error)  {
				console.log("error")
			}
		});
	});
}