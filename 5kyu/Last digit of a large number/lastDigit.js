var lastDigit = function(str1, str2){  
 str1 = str1.slice(-1);
 str2 = str2.slice(-2);
 
 return (str2 == "0"? 1: 0) || Math.pow(str1, str2 % 4 || 4) % 10;
}