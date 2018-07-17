/*

 */

function writeToPage() {
	document.write("<h1>document.write!</h1>");
}

function changeSection() {
	let el = document.getElementById("magicSection");

	let n = math.random(0, 3);

	switch (n) {
	case 0:
		el.setAttribute("style=");
		break;

	}

}

npcN = 0;

function addNPC() {
	let nameIn = document.getElementById("npc_name").value;
	let classIn = document.getElementById("npc_class").value;
	let table = document.getElementById("the_table");

	let idText = document.createTextNode(++npcN);
	let nameText = document.createTextNode(nameIn);
	let classText = document.createTextNode(classIn);

	let del = document.createTextNode("X");

	let td1 = document.createElement("td");
	let td2 = document.createElement("td");
	let td3 = document.createElement("td");
	let td4 = document.createElement("td");

	let delBut = document.createElement("button");
	delBut.setAttribute("onclick", "removeRow(" + npcN + ")");
	delBut.setAttribute("style", "color:red;");
	delBut.appendChild(del);

	td1.appendChild(idText);
	td2.appendChild(nameText);
	td3.appendChild(classText);
	td4.appendChild(delBut);

	let row = document.createElement("tr");
	row.appendChild(td1);
	row.appendChild(td2);
	row.appendChild(td3);
	row.appendChild(td4);

	row.setAttribute("id", npcN);
	table.appendChild(row);

	document.getElementById("npc_name").value = "";
	document.getElementById("npc_class").value = "";
}

function removeRow(x) {
	document.getElementById(x).remove();
}

window.onload = function() {
	var d1 = document.getElementById("1");
	var d2 = document.getElementById("2");
	var d3 = document.getElementById("3");

	d1.addEventListener("click", d1click);
	d2.addEventListener("click", d2click);
	d3.addEventListener("click", d3click);

	function d1click() {
		window.alert("d1 clicked");
		
	}
	function d2click() {
		window.alert("d2 clicked");
	}
	function d3click() {
		window.alert("d3 clicked");
		event.stopPropagation();
	}
}