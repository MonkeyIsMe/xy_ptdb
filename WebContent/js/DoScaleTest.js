/**
 * 
 */

var t =  0;

//量表的长度
var scale_length;

var score = "";

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
    next(0);
});

$("#buttonB").click(function () {
    next(1);
});

$("#buttonC").click(function () {
    next(2);
});

$("#buttonD").click(function () {
    next(3);
});

$("#buttonE").click(function () {
    next(4);
});


function next(x){
	
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
		        	if(x == 0){
			        	var ans = date[0].c_Score;
			        	score = score + ans;
		        	}
		        	else if(x == 1){
			        	var ans = date[1].c_Score;
			        	score = score + ans;
		        	}
		        	else if(x == 2){
			        	var ans = date[2].c_Score;
			        	score = score + ans;
		        	}
		        	else if(x == 3){
			        	var ans = date[3].c_Score;
			        	score = score + ans;
		        	}
		        	else if(x == 4){
			        	var ans = date[4].c_Score;
			        	score = score + ans;
		        	}
		        	//alert(score);
		    }
		    }); 
	}
	});
	
	t++;
	if(t > scale_length){
		$.ajax({
			url:'CreateReport.action',
			type:"POST",
			async: false,
			data:{
				score:score,
			},
			dataType: "json",
			success:function(data){
				alert(1111);
			}
		});
	}
	else{
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
}