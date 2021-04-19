function addStudent()
{
	var name= document.getElementById('sdname').value;
	var gender = document.getElementById('sdgender').value;
	var department= document.getElementById('sddept').value;
	var emailid= document.getElementById('sdemailid').value;
	var fname= document.getElementById('sdfname').value;
	var fmobile= document.getElementById('sdfmobile').value;
	var mname= document.getElementById('sdmname').value;
	var mmobile= document.getElementById('sdmmobile').value;
	var address= document.getElementById('sdaddress').value;
	
	var x= JSON.stringify({ "name":name, "gender":gender, "department":department, "emailid":emailid, "fname":fname, "fmobile":fmobile,
	 "mname":mname, "mmobile":mmobile, "address":address});

		console.log("Inside function");
		//console.log(x);
   var Url = "http://localhost:8080/StudentManagement/webapi/students/addstudent";
   var ajax = new XMLHttpRequest();
   ajax.open('POST', Url, true);
   ajax.setRequestHeader("Content-Type", "application/json");
   ajax.send(x);
   ajax.onreadystatechange = function(){
	   if (ajax.readyState == 4 && ajax.status == 200) {
	   // alert(xhr.responseText.headers.Host);
		   var response = JSON.parse(ajax.responseText);                       
			//console.log(xhr.responseText);       //Printing the response in console for a check.
			
			var table = document.getElementById('table');
			
			var tr1 = document.createElement('tr');
			var th = document.createElement("th");
			var text = document.createTextNode("Name");
			th.appendChild(text);
			tr1.appendChild(th);
			
			var th1 = document.createElement("th");
			var text1 = document.createTextNode("Email-ID");
			th1.appendChild(text1);
			tr1.appendChild(th1);
			table.appendChild(tr1);
			
			
			var tr = document.createElement('tr');
			var td = document.createElement('td');
			var text2 = document.createTextNode(response.name);
			td.appendChild(text2);
			tr.appendChild(td);
			
			var td1 = document.createElement('td');
			var text3 = document.createTextNode(response.emailid);
			td1.appendChild(text3);
			tr.appendChild(td1);
			
			table.appendChild(tr);
		}
	}
    
			document.getElementById('sdname').value= "";
			document.getElementById('sdemailid').value= "";
			document.getElementById('sddept').value = "AGRI";
			document.getElementById('sdfname').value = "";
			document.getElementById('sdfmobile').value = "";
			document.getElementById('sdmname').value = "";
			document.getElementById('sdmmobile').value = "";
			document.getElementById('sdaddress').value = "";    		
}