

function convertToINR()
{ 
	// Read the dollar store in variable
    const Dollar=document.getElementById('Dollar').value;

    //Convert the FahernheitInput into  celcius
    const Rupees=(parseFloat(Dollar)*82.89);
    
    //set the output to celciusoutpput field
    document.getElementById('Rupees').value=Rupees.toFixed(2);
}