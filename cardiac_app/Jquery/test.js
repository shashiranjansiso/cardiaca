function clickForPulse(e){
  var radio=document.querySelector('input[name="pulse"]:checked');
  if(radio==null){
    console.error("Pulse not defined..");
    return;
  }
  var val=radio.value;
  if(val==null){
    console.log("pulse is not selected");
    return;
  }

  alert("out. "+val);

}
