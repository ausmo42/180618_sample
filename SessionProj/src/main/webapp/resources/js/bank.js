window.onload = function() {
	getUsers();	
}

function getUsers(){
	let xhr = new XMLHttpRequest();
	let url = "SelectUserServlet";

	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4 && xhr.status == 200) {
			let data = JSON.parse(xhr.response);
			let table = document.getElementById("userTable");
			table.innerHTML = "<tr><th>ID</th><th>Name</th><th>Type</th></tr>"

			for (index in data) {
				let row = document.createElement("tr");
				
				let td1 = document.createElement("td");
				let td2 = document.createElement("td");
				let td3 = document.createElement("td");
				
				let t1 = document.createTextNode(data[index]["id"]);
				let t2 = document.createTextNode(data[index]["name"]);
				let t3 = document.createTextNode(data[index]["type"]);
				
				td1.appendChild(t1);
				td2.appendChild(t2);
				td3.appendChild(t3);
				
				row.appendChild(td1);
				row.appendChild(td2);
				row.appendChild(td3);
				
				table.appendChild(row);				
			}

		} else if (xhr.readyState == 4 && xhr.status != 200) {

		}
	}

	xhr.open("GET", url); // state 1
	xhr.send(); // state 2
}