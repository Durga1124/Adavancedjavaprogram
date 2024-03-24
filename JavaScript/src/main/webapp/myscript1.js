
function convertToFahrenheit()
{ 
	// Read the FahernheitInput store in variable
   const  fahrenheitInput=document.getElementById('fahrenheitInput').value;

    //Convert the FahernheitInput into  celcius
    const celciusTemperature=(parseFloat(fahrenheitInput-32)*5/9);
    
    //set the output to celciusoutpput field
    document.getElementById('celciusoutput').value=celciusTemperature.toFixed(2);
}