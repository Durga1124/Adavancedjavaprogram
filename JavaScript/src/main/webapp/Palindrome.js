

function number(){
	//read the number in variable
	var num=document.getElementById("numberinput").value
	
	//check the number palindrome or not
	var rev=0,rem,temp;
	temp=num;
	while(temp>0)
	{
		rem=parseInt(temp%10)
		rev=rev*10+rem
		temp=parseInt(temp/10)
	}
	if(num==rev)
  {
	  document.getElementById('numberoutput').value=rev+"palindrome"
	  
  }
  else{
	 document.getElementById('numberoutput').value=rev+"notapalindrome"
  }
  
}