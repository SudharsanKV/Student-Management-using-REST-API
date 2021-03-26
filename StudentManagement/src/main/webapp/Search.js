/**
 * 
 */
function getById(){
	
	//console.log('inside getbyid');
		var id = document.getElementById('search').value;
		var Url = "http://localhost:8080/StudentManagement/webapi/students/student/"+id;
	 	var ajax = new XMLHttpRequest();
		ajax.open('GET', Url, true);
   		ajax.setRequestHeader("Content-Type", "application/json");
   		ajax.send();
   		ajax.onreadystatechange = function(){
		   	if (ajax.readyState == 4 && ajax.status == 200) {
		   	// alert(xhr.responseText.headers.Host);
			   var response = JSON.parse(ajax.responseText);                       
				console.log(ajax.responseText);  
				
				document.getElementById('sdname').innerHTML = response.name;
				document.getElementById('sdgender').innerHTML = response.gender;
				document.getElementById('sddept').innerHTML = response.department;
				document.getElementById('sdemailid').innerHTML = response.emailid;
				document.getElementById('sdfname').innerHTML = response.fname;
				document.getElementById('sdfmobile').innerHTML = response.fmobile;
				document.getElementById('sdmname').innerHTML = response.mname;
				document.getElementById('sdmmobile').innerHTML = response.mmobile;
				document.getElementById('sdaddress').innerHTML = response.address;			
				
			}
		}
}