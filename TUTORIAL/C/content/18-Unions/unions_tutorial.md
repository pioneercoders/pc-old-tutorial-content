
		<p>A union is a user defined data type similar to structure. It is a collection of variables of different data types. The only difference between a structure and a union is that in case of unions, memory is allocated only to the biggest union member and all other members should share the same memory. In case of a structure, memory is allocated to all the structure members individually. Thus unions are used to save memory. They are useful for applications that involve multiple members, where values need not be assigned to all the members at any one time.</p>
	
		<p><b>Declaring a union</b></p>
		
		<p>The syntax for declaration a union is the same as that of declaring a structure. The only difference is that instead of using the keyword struct, the keyword union would be used.</p>
@CODE_START@@C@union Identifier
{	
data_type var_name;	
data_type var_name;	
. . . . . . . . . . . . .;	
}union variable;@CODE_END@
<p><span>Memory allocation in structure</span></p>
@CODE_START@@C@union POINT	
{	
int	a;	
float	b;	
char	c;	
}pont1;@CODE_END@		
		<p>Memory allocation representation</p>
@CODE_START@@C@2bytes&#8594;int
4bytes&#8594;float
1byte&#8594;char
@CODE_END@	
	
		@IMG_START@C/Unions1/png@IMG_END@
		<p><span>Memory allocation in union</span></p>
		
		
		<p><b>Union variable declaration</b></p>
		
		<p>Union variable can be declared as same as declaration of structure variable. We can declare a union variable with global declaration or with local declaration.</p>
@CODE_START@@C@union POINT 
{	
int a; float b; char c; }point1,point2;	
void main( )	
{	
. . . . .	
}@CODE_END@
<p><span>Global declaration of union variable</span></p>
@CODE_START@@C@union POINT 
{	
int a; float b; char c; }point1,point2; 
void main( ) 
{ 
union POINT point1,point2; 
. . . . . . . . . 
}@CODE_END@				
<p><span>Local declaration of union variable</span></p>		
	
			
	<p><b>Initializing union</b></p>
	<p>Initialization of a union variable is similar like initialization of structure a structure variable. Only one different is in the allocation of memory size. A union member’s share the same memory space, so fresh data replaces any existing data.</p>
	
	
	<p><b>Array of union variables</b></p>
	<p>Like structures we can also have an array of union variables. However, because of the problem of new data overwriting existing data in the other fields, the program may not display the accurate result.</p>
	
	<p><b>Union inside structure</b></p>
	<p>Unions can be very useful when declared inside a structure. Consider below example which illustrates such a scenario.</p>
		
	<h4>typedef keyword</h4>
	<p>A typedef declaration lets you define your own identifiers that can be used in place of basic data type such as int, float, and double. A typedef declaration does not reserve storage. The names you define using typedef are not new data types, but synonyms for the data types or combinations of data types they represent.</p>
	
	<h4>BIT FIELDS</h4>
	<p>Suppose your C program contains a number of TRUE/FALSE variables grouped in a structure calledstatus, as follows:</p>
@CODE_START@@C@struct{	
unsigned int widthValidated;	
unsigned int heightValidated;	
} status;@CODE_END@		
	<p>This structure requires 8 bytes of memory space but in actual we are going to store either 0 or 1 in each of the variables. The C programming language offers a better way to utilize the memory space in such situation. If you are using such variables inside a structure then you can define the width of a variable which tells the C compiler that you are going to use only that number of bytes. For example, above structure can be re-written as follows:</p>

@CODE_START@@C@struct{	
unsigned int age : 3; 
} Age;@CODE_END@		
	<p>Now, the above structure will require 4 bytes of memory space for status variable but only 2 bits will be used to store the values. If you will use up to 32 variables each one with a width of 1 bit , then also status structure will use 4 bytes, but as soon as you will have 33 variables, then it will allocate next slot of the memory and it will start using 8 bytes. Let us check the following example to understand the concept:</p>

		<p><b>Bit Field Declaration</b></p>		
		<p>The declaration of a bit-field has the form inside a structure:</p>
		<p>Below the description of variable elements of a bit field:</p>
		
	<table class="pc-table">
		<tr>
			<td>Elements</td>
			<td>Description</td>
		</tr>		
		<tr>
			<td>Type</td>
			<td>An integer type that determines how the bit-field's value is Type
				interpreted. The type may be int, signed int, unsigned int.
			</td>
		</tr>
		<tr>
			<td>member_name</td>
			<td>The name of the bit-field.</td>
		</tr>
		<tr>
			<td>The number of bits in the bit-field. The width must be less than or Width
				equal to the bit width of the specified type.
			</td>
		</tr>
	</table>
		
		<p>The variables defined with a predefined width are called bit fields. A bit field can hold more than a single bit for example if you need a variable to store a value from 0 to 7 only then you can define a bit field with a width of 3 bits as follows:</p>
@CODE_START@@C@struct{	
unsigned int age : 3; 
} Age;  @CODE_END@			
		<p>The above structure definition instructs C compiler that age variable is going to use only 3 bits to store the value, if you will try to use more than 3 bits then it will not allow you to do so. Let us try the following example:</p>


		
