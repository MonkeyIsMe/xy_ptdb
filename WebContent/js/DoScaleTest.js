/**
 * 
 */

function nextScale(){
	$("#next").click(function () {
	    Scale();
	});
}

function Scale(){
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
		        	$("#op1").empty();
		        	$("#op2").empty();
		        	$("#op3").empty();
		        	$("#op4").empty();
		        	$("#op5").empty();
		        	$("#op1").prepend(date[0].c_Content);
		        	$("#op2").prepend(date[1].c_Content);
		        	$("#op3").prepend(date[2].c_Content);
		        	$("#op4").prepend(date[3].c_Content);
		        	$("#op5").prepend(date[4].c_Content);
		    }
		    }); 
	}
	});
}

var t = 0;

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
	        url:'http://localhost/xy_ptdb/queryChoice.action',
	        type: "POST",
	        async: false,
	        dataType: "json",
	        data:{"id":id},
	        success: function(date) {
	        	$("#op1").prepend(date[0].c_Content);
	        	$("#op2").prepend(date[1].c_Content);
	        	$("#op3").prepend(date[2].c_Content);
	        	$("#op4").prepend(date[3].c_Content);
	        	$("#op5").prepend(date[4].c_Content);
	    }
	    }); 
}
});

//alert(scale_length);
loadchange();

function loadchange(){
	if($("#option1").change()){
		nextScale();
	}
	else if($("#option2").change()){
		nextScale();
	}
	else if($("#option3").change()){
		nextScale();
	}
	else if($("#option4").change()){
		nextScale();
	}
	else if($("#option5").change()){
		nextScale();
	}
}


$("#first").click(function () {
    pre_one();
});


function pre_one(){
	t--;
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
		        	$("#op1").empty();
		        	$("#op2").empty();
		        	$("#op3").empty();
		        	$("#op4").empty();
		        	$("#op5").empty();
		        	$("#op1").prepend(date[0].c_Content);
		        	$("#op2").prepend(date[1].c_Content);
		        	$("#op3").prepend(date[2].c_Content);
		        	$("#op4").prepend(date[3].c_Content);
		        	$("#op5").prepend(date[4].c_Content);
		    }
		    }); 
	}
	});
}

