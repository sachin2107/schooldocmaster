var CommonFunction = function(){
	this.selectedRowIndex = function(eventObj, options,password){
		alert('radio index..'+eventObj.value);
		options = options || {};
		var email = options.email || 'No email';
		var pwd = options.password || 'No Password';
		alert('email...'+email.value);
		alert('password...'+pwd.value);
	}
};
var commonFunction = new CommonFunction();
