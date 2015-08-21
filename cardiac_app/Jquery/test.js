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

//  alert("out. "+val);
//if good, enter ROSC mode

//if bad, move to next dialog compressions
if(val=="bad"){
  $('#p1').modal('hide');
  $('#compressions').modal('show');
}
}


function compressionsChangeListener(e){
  document.getElementById("reason").style.visibility = "hidden";
  if(e.value=='abort')
   document.getElementById("reason").style.visibility = "visible";
 }
