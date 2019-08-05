# tests

document.write("<div id='divID'> 	<p id='pID'> <span id='idbraun'>braun</span> <span id='idgelb'> gelb</span> </p> </div>");

var element = document.getElementById('idbraun').parentElement;
var c = document.getElementById("idbraun").parentElement.children;

	var i;
	for (i = 0; i < c.length; i++) {
    
    	if(c[i].id === "idbraun"){
        	document.write("Ich habe Braun gefunden!" + "<br>");
        }
    
		document.write(c[i].id + "<br>");
	}

document.write(element.id );
