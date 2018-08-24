/**
 * 
 */

var t =  0;

//量表的长度
var scale_length;

$.ajax({ 
    url:'DoScale.action',
    type: "POST",
    async: false,
    dataType: "json",
    success: function(data) {
    	var id = data[t].i_ID;
    	$("#problem").prepend(data[t].i_Content);
    	//获取量表的长度
    	scale_length = data.length;
    	$.ajax({ 
	        url:'queryChoice.action',
	        type: "POST",
	        async: false,
	        dataType: "json",
	        data:{"id":id},
	        success: function(date) {
	        	//alert(date);
	        	//alert(t);
	        	if(date.length == 4){
	        		$("#option1").prepend(date[0].c_Content);
		        	$("#option2").prepend(date[1].c_Content);
		        	$("#option3").prepend(date[2].c_Content);
		        	$("#option4").prepend(date[3].c_Content);
		        	$("#buttonE").attr("style","display:none");
	        	}
	        	else if(date.length == 5){
		        	$("#option1").prepend(date[0].c_Content);
		        	$("#option2").prepend(date[1].c_Content);
		        	$("#option3").prepend(date[2].c_Content);
		        	$("#option4").prepend(date[3].c_Content);
		        	$("#option5").prepend(date[4].c_Content);
	        	}
	    }
	    }); 
}
});


$("#buttonA").click(function () {
    next();
});

$("#buttonB").click(function () {
    next();
});

$("#buttonC").click(function () {
    next();
});

$("#buttonD").click(function () {
    next();
});

$("#buttonE").click(function () {
    next();
});


function next(){
	t++;
	$.ajax({ 
	    url:'DoScale.action',
	    type: "POST",
	    async: false,
	    dataType: "json",
	    success: function(data) {
	    	var id = data[t].i_ID;
	    	$("#problem").empty();
	    	$("#problem").prepend(data[t].i_Content);
	    	//获取量表的长度
	    	scale_length = data.length;
	    	$.ajax({ 
		        url:'queryChoice.action',
		        type: "POST",
		        async: false,
		        dataType: "json",
		        data:{"id":id},
		        success: function(date) {
		        	
		        	if(date.length == 4){
		        		$("#option1").empty();
			        	$("#option2").empty();
			        	$("#option3").empty();
			        	$("#option4").empty();
			        	$("#option5").empty();
			        	$("#option1").prepend(date[0].c_Content);
			        	$("#option").prepend(date[1].c_Content);
			        	$("#option3").prepend(date[2].c_Content);
			        	$("#option4").prepend(date[3].c_Content);
			        	//$("#op5").prepend(date[4].c_Content);
			        	$("#buttonE").attr("style","display:none");
		        	}
		        	else if(date.length == 5){
		        		$("#option1").empty();
			        	$("#option2").empty();
			        	$("#option3").empty();
			        	$("#option4").empty();
			        	$("#option5").empty();
			        	$("#option1").prepend(date[0].c_Content);
			        	$("#option2").prepend(date[1].c_Content);
			        	$("#option3").prepend(date[2].c_Content);
			        	$("#option4").prepend(date[3].c_Content);
			        	$("#option5").prepend(date[4].c_Content);
		        	}
		        	
		    }
		    }); 
	}
	});
}