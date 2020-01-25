	<p> Software are used to automate the physical process in our life. To process we need data, programming languages are provided 
		data types to captured real world data and store in memory.</p>
	<ul>
		<li>Data Type tells about the Type of Data like numbers, strings etc.</li>
		<li>Data Type is a Data Storage Format that can contain a <b>Specific Type or Range of Values.</b></li>
		<li>When computer programs store data in variables, each variable must be assigned a <b>Specific data type.</b></li>
	</ul>
	<h3>Basic data types</h3>
	<table class="pc-table">
		<tr><td>Data Type </td> <td>Keyword to Use </td> <td> Memory Size </td> <td> Range </td></tr>
		<tr><td>Character</td> <td>char</td> <td>1 byte</td> <td> - 127 to 127 </td> </tr>
		<tr><td>integers</td> <td>int</td> <td>2 bytes </td> <td> - 32,767 to 32,767 </td> </tr>
		<tr><td>decimals</td> <td>float</td><td>4 bytes</td> <td> 1E-37 to 1E+37 with six digits of precision </td> </tr>
		<tr><td>decimals</td> <td>double</td><td>8bytes</td> <td> 1E-37 to 1E+37 with ten digits of precision </td> </tr>
		<tr><td>long numbers</td><td>long</td><td>4bytes</td> <td> -2,147,483,647 to 2,147,483,647 </td> </tr>
		
	</table>
	<h3>Explanation:</h3>
	<ul>
		<li>Whenever we declare variable in Computers memory, Computer must know the type of the data to be stored inside the memory.</li>
		<li>If we need to store the single character then the size of memory occupied will be different than storing the single integer number.</li>
		<li>The memory in our computers is organized in bytes. A byte is the minimum amount of memory that we can manage in C.</li>
		<li>A byte can store a relatively small amount of data one single character or a small integer (generally an integer between 0 and 255).</li>
	</ul>
	<h3>int-integer data types</h3>
	<ul>
		<li>Integers are whole numbers that can have both positive and negative values but no decimal values. Ex: 0, -5, 10</li>
		<li>In C programming, keyword int is used for declaring integer variable. </li>
	</ul>
	<p><b>Syntax:</b></p>
	@CODE_START@@C@ dataType variable_name = value; @CODE_END@
	<p><b>Example:</b></p>
	@CODE_START@@C@int studentId = 12;@CODE_END@
	<ul>
		<li>Here, studentId is a variable of type integer.</li>
		<li>You can declare multiple variable at once in C programming. </li>	
		<li>The size of int is either 2 bytes(In older PC's) or 4 bytes. If you consider an integer having size of 4 byte( equal to 32 bits), it can take 232 distinct states as: -231,-231+1, ...,-2, -1, 0, 1, 2, ..., 231-2, 231-1</li>
		<li>Similarly, int of 2 bytes, it can take 216 distinct states from -215 to 215-1. If you try to store larger number than 231-1, i.e,+2147483647 and smaller number than -231, i.e, -2147483648, program will not run correctly.</li>
	</ul>
	
	<h3>float-Floating types</h3>
	<ul>
		<li>Floating type variables can hold real numbers such as: 2.34, -9.382, 5.0 etc. You can declare a floating point variable in C by using either float or double keyword.</li>	
	</ul>
	<p><b>Example:</b></p>
	@CODE_START@@C@float accountBalance = 500.56;
double bookPrice = 25.8967563499;
	@CODE_END@
	<ul>
		<li>Here, accountBalance floating type and bookPrice double type variables.</li>
		<li>In C, floating values can be represented in exponential form as well.</li>
	</ul>
	@CODE_START@@C@float normalizationFactor = 22.442e2;@CODE_END@
	
	<h4>Difference between float and double</h4>
	<p>The size of float (single precision float data type) is 4 bytes. And the size of double (double precision float data type) is 8 bytes. Floating point variables has a precision of 6 digits whereas the precision of double is 14 digits.</p>
	
	<h3>char - Character types</h3>
	<ul><li>Keyword char is used for declaring character type variables.</li></ul>
	<p><b>Example:</b></p>
	@CODE_START@@C@char yes_char = 'y';@CODE_END@
	<ul>
		<li>Here, yes_char is a character variable. The value of yes_char is 'y'.</li>
		<li>The size of character variable is 1 byte.</li>
	</ul>
@CODE_START@@C@	#include <stdio.h>
	main(){
		int     sum = 100;
		char    letter = 'Z';
		float   set1 = 23.567;
		double  num2 = 11e+23;

		printf("Integer variable is %d\n", sum);
		printf("Character is %c\n", letter);
		printf("Float variable is %f\n", set1);
		printf("Double variable is %e\n", num2);
	}
@CODE_END@
<div class="output-panel"> 
	<p>
		Integer variable is 100 <br>
		Character variable is Z <br>
		Float variable is 23.567000 <br>
		Double variable is 11.000000e23
	</p>
</div>	


	
	
