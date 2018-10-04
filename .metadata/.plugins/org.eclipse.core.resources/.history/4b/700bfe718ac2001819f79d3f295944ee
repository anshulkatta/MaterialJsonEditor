function getProducts() {
	var xhttp = new XMLHttpRequest();
	var params= encodeURI("limit=2");
	xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	    	console.log(responseText);
	    }
	  };
	xhttp.open("POST", "https://haxv-akatta-2/bpocore/market/api/v1/products", true);
	xhttp.setRequestHeader("Content-type", "application/json");
	var token = getCookie("BP_TOKEN");
	xhttp.setRequestHeader("Authorization", "Bearer" + " " + token);
	xhttp.send(params);
}