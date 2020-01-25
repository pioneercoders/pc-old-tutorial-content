<h4>Array of Structures</h4>
	
	<p>Before starting of array of structures, let us first analyze, where we would need array of structures. Consider example 1 program, in a class, we do not have just one student. But there may be at least 40 students. So here we can have a common structure definition for all the 40 students. This would be possible when we will make an array of the structure. An array of a structure is declared in the same way as we had declared an array of built-in data type.</p>
	
	<p><b>PROBLEM STATEMENT:</b>A school teacher wants to save his students details in a record. Student details like</p>
		
			<p>1.Student Name ---> String Type Data</p>
			<p>2. Student Roll number ---->Number Type Data</p>
			<p>3.Student class ---> Number Type Data</p>
			<p>4. Student Phone Number ---> Number Type Data</p>
			<p>Help to teacher to do same by using a computer program.</p>
			
			<p><b>SOLUTION:</b></p>
			<p>STEP1:Declare Character array to store Student name.</p>
			<p>STEP2:Declare Integer variable to store Student roll number.</p>
			<p>STEP3:Declare Integer variable to store Student class.</p>
			<p>STEP4:Declare Double variable to store Student Phone number.</p>
			
			<p>SOLUTION ANALYSIS:</p>
			<p>The solution which is suggested is quite good where student count is 1 or 2.
				But if student count is huge?</p>
		<table class="pc-table">
			<tr>
				<td>Number of students</td>
				<td>Number of Array to be Declared</td>
			</tr>
			<tr>
				<td>50</td>
				<td>50*4=200</td>
			</tr>
			<tr>
				<td>100</td>
				<td>100*4=400</td>
			</tr>				
			<tr>
				<td>200</td>
				<td>200*4=800</td>
			</tr>	
		</table>
	<p>Where the student count is increasing the array declarations also exponentially increasing. So by this analysis we came to know that the solution which suggested is not accurate.</p>
	
	<p><b>Best Solution:</b></p>
	<p>1.Declare a template with required data types</p>
	<p>2.Create many number of instances for this template as many as we required.</p>
	<p>3.Each instance give to each student.</p>
	<p>This best solution can be achieve in programming scenario by using ‘STRUCTURE’ concept.</p>
		
	<p><b>Differences between Arrays and Structures</b></p>
		
	<table class="pc-table">
		<tr>
			<td><b>Arrays</b></td>
			<td><b>Structures</b></td>		
		</tr>	

		<tr>
			<td>1.An array represents a group of elements of same data type.</td>
			<td>1.A structure represents a group of elements of
				different data types having a single name.</td>		
		</tr>	
		<tr>
			<td>2.It is very difficult to organize complex data by using arrays concept.</td>
			<td>2.It is easy to organize complex data by using structure concept.</td>		
		</tr>		
		<tr>
			<td>3.Memory will be allocated for the array at the time of its declaration.</td>
			<td>3.	Memory is allocated only at the time of declaration	of structure variables.
		</td>		
				</tr>	
		<tr>
			<td>4.	There is no special keyword in declaration of an array.
				Syntax: int Arrayname[ArraySize].
			</td>
			<td>4.	A special keyword ‘struct’ is used in declaration of structure.
				Syntax:  struct StructureIdentifier
				{
					Structure Member1;
					Structure Member2;
					. . . . . .
				}Structure Variables;
			</td>		
		</tr>	
		<tr>
			<td>An array elements are referred by index.</td>
			<td>5.	A structure elements can be referred by its structure variable name.</td>		
		</tr>	
		<tr>
			<td>An array is a derived data type.</td>
			<td>A structure is a user defined data type.</td>		
		</tr>			
	</table>	
		
		
	
	<p>The general syntax for declaring an array of a structure.</p>

@CODE_START@@C@struct Struct_Identifier 
{	
data_type member_name1;	
data_type member_name2;	
data_type member_name3;	
. . . . . . . . . . . . . . . . . . . ;	
};	
struct struct_Identifier struct_var[size];@CODE_END@	

		<h4>Nested Structures</h4>	
		<p>When a structure includes another structure, it is a nested structure. There is no limit to the number of structures that can be nested. In nested structures each low level structures are declared separately and then grouped in the high level structure. We must declare the innermost structure first, then the next level, working upward toward the outer structure.</p>
	<h4>Pointer to Structures</h4>
	
	<p>The address of a given structure variable can be obtained by using address operator ‘&’. We can use pointer to structures to access structure members by using their address. The operator which is used in this context is arrow operator '&#8594;' </p>
			
	<p><b>Declare and initialize a pointer variable to a structure</b></p>	
	
	<p>We can declare a pointer variable of structure type in three ways:</p>
	
@CODE_START@@C@Method 1:
struct STUDENT 
{ char	Sname[30];	
int	SRollno;	
}stu1, * ptr = &stu1 ; 'stu1' of STUDENT type . */  @CODE_END@	

@CODE_START@@C@Method 2:
struct STUDENT	
{ char	Sname[30];	
int	SRollno;	
};	
struct STUDENT stu1, * ptr = &stu1; 
void main( )	
{ . . .	
. . .	}	
/*Second variable declared as pointer variable of STUDENT type 
with global scope and initialize to address of variable ‘stu1’ 
of STUDENT type . */@CODE_END@		

@CODE_START@@C@Method 3:
struct STUDENT 
{ char	Sname[30]; 
int	SRollno;	
};	
void main( )	
{	
struct SUDENT stu1, * ptr = &stu1;	
}	
/* Second variable declared as pointer variable of STUDENT type
 with local scope and initialize to address of variable ‘stu1’ 
 of STUDENT type . */@CODE_END@		
	
	<p>Accessing structure member using pointer through the use of a special operator called arrow operator.</p>
	
	<p><b>Pointer with in Structures</b></p>
	
	<p>Structure may contain the pointer variable as member. Pointers are used to store the address of memory location. They can be de-referenced by ‘ * ’ operator. Whenever we need to print the content of variable pointed by some pointer, we have to dereference the pointer variable.</p>
	
	<h4>Structures and Functions</h4>
	
	<p>A user define function can access the members of a structure in 3 ways.</p>
	<ul>
		<li>Passing individual structure members as parameters to a function.</li>
		<li>Passing the entire structure by its name (pass – by – Value) to a function.</li>
		<li>Passing the entire structure by its address (pass – by – Address) to a function.</li>
	</ul>
	
	<p><b>Passing the Entire Structure</b></p>
	
	<p>Passing a structure is really no different from passing individual elements. Since the structure is a type, we simply specify the type in the formal parameters of the called function. Similarly, the function can return a structure. The same pass – by – value rules apply when we pass a structure to a function.</p>

	<p><b>Self-Referential Structures</b></p>
	
	<p>Self – referential structures are those structures that contain a reference to data of its same type, i.e., in addition to other data, a self referential structure contains a pointer to a data that is of the same type as that of the structure. For example, consider the structure node given as follows.</p>
	
	<p><b>Example;</b></p>
@CODE_START@@C@struct node{	
int val; 
struct node *next; 
}; @CODE_END@		
	<p>Self-referential structure is used in data structure such as binary tree, linked list, stack, Queue etc.

</p>
