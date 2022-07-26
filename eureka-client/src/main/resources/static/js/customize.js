//var show=function(){
//    alert("안녕하세요!");
//};
//
//loadDoc = () => {
//	return new Promise((resolve,reject) => {
//		const xhttp = new XMLHttpRequest();
//		xhttp.onload = () => {
//			if (xhttp.status === 200) {
//				data = xhttp.responseText;
//				data = JSON.parse(data);
//				resolve(data);
//			}
//			else {
//				reject("Error");
//			}
//		};
//		xhttp.open("GET", "v1/canditbl", true);
//		xhttp.send();
//	});
//}