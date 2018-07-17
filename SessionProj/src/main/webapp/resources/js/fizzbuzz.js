


function reset(){
	document.getElementById("nMax").value = 0;
	document.getElementById("nMin").value = 0;
	
	document.getElementById("fbSpace").innerHTML = "";
	document.getElementById("errorP").innerHTML = "";

}

function checkFizzBuzz(){
	let max = parseInt(document.getElementById("nMax").value);
	let min = parseInt(document.getElementById("nMin").value);
	
	document.getElementById("fbSpace").innerHTML = "";
	
	if(min > max){
		setError("MIN cannot be greater than MAX");
		return;
	}if(min < 0 || max < 0){
		setError("Negative values are not legal");
		return;
	}else if((max-min) > 10000){
		setError("too many results; range must be less than or equal to 10000")
	}else{
		document.getElementById("errorP").innerHTML = "";
	}
		
	
	printFizzBuzz(min, max);
		
}

function printFizzBuzz(x, y) {
	let i;
	let text;
	let fbSpace = document.getElementById("fbSpace");

	for (i = x; i <= y; i++) {
		if (i % 3 == 0 && i % 5 == 0) {
			text = document.createTextNode("fizz buzz");
		} else if (i % 3 == 0) {
			text = document.createTextNode("fizz");
		} else if (i % 5 == 0) {
			text = document.createTextNode("buzz");
		} else {
			text = document.createTextNode(i);
		}

		fbSpace.appendChild(text);
		fbSpace.appendChild(document.createElement("br"));

	}

}

function setError(msg){
	document.getElementById("errorP").innerHTML = msg;
}