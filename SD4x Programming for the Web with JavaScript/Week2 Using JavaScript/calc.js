"use strict";

var inp_past = '';
var ope = '';
var inp_current = '';

var equalsOp;
var equalsInp_current;

// First Load 
$("input[name='display']").val('');

// When number buttons pressed
$("button").click( function() {
	if (isNumber($(this).val())) {
		equalsOp = '';
		equalsInp_current = '';
		if (ope == '' && inp_past != '') {
			inp_past = '';
			inp_current = $(this).val();
		} else {
			inp_current = inp_current + $(this).val();
		}
		
		$("input[name='display']").val(parseFloat(inp_current));
		
	}

})

// When clear button pressed
$("button[id='clearButton']").click( function() {
	equalsOp = '';
	equalsInp_current = '';
	inp_past = '0';
	ope = '';
	inp_current = '';
	$("input[name='display']").val('');
})

// When equals button pressed
$("button[id='equalsButton']").click( function() {
	var temp = (equalsOp !== '');
	if (equalsOp !== '') {
		var calcResult = calcRes(inp_past, equalsOp, equalsInp_current);
		$("input[name='display']").val(calcResult);
		inp_past = calcResult;
	} else if (ope != '' && inp_current == '') {
		inp_current = '';
	} else if (inp_past == '') {
		inp_past = inp_current;
		ope = '';
		inp_current = '';
	} else if (inp_current == '') {
		ope = '';
	} else {
		equalsOp = ope;
		equalsInp_current = inp_current;
		var calcResult = calcRes(inp_past, ope, inp_current);
		$("input[name='display']").val(calcResult);
		inp_past = calcResult;
		ope = '';
		inp_current = '';		
	}

})

// When add button pressed
$("button[id='addButton']").click( function() {
	equalsOp = '';
	equalsInp_current = '';
	if (inp_past == '') {
		inp_past = inp_current;
	} else if (inp_current == '') {
		ope = '+';
	} else {
		var calcResult = calcRes(inp_past, ope, inp_current);
		$("input[name='display']").val(calcResult);
		inp_past = calcResult;
	}
	ope = '+';
	inp_current = '';

})

// When subtract button pressed
$("button[id='subtractButton']").click( function() {
	equalsOp = '';
	equalsInp_current = '';
	if (inp_past == '') {
		inp_past = inp_current;
	} else if (inp_current == '') {
		ope = '-';
	} else {
		var calcResult = calcRes(inp_past, ope, inp_current);
		$("input[name='display']").val(calcResult);
		inp_past = calcResult;
	}
	ope = '-';
	inp_current = '';
})

// When multiply button pressed
$("button[id='multiplyButton']").click( function() {
	equalsOp = '';
	equalsInp_current = '';
	if (inp_past == '') {
		inp_past = inp_current;
	} else if (inp_current == '') {
		ope = '*';
	} else {
		var calcResult = calcRes(inp_past, ope, inp_current);
		$("input[name='display']").val(calcResult);
		inp_past = calcResult;
	}
	ope = '*';
	inp_current = '';
})

// When divide button pressed
$("button[id='divideButton']").click( function() {
	equalsOp = '';
	equalsInp_current = '';
	if (inp_past == '') {
		inp_past = inp_current;
	} else if (inp_current == '') {
		ope = '/';
	} else {
		var calcResult = calcRes(inp_past, ope, inp_current);
		$("input[name='display']").val(calcResult);
		inp_past = calcResult;
	}
	ope = '/';
	inp_current = '';
})


// Define functions
function isNumber(valButton) {
	if (valButton != '') { return true; }
	else { return false; }
}

function calcRes(inp_past, ope, inp_current) {
	if (ope == "+") { return parseFloat(inp_past) + parseFloat(inp_current); }
	else if (ope == "-") { return parseFloat(inp_past) - parseFloat(inp_current); }
	else if (ope == "*") { return parseFloat(inp_past) * parseFloat(inp_current); }
	else { return parseFloat(inp_past) / parseFloat(inp_current); }
}

