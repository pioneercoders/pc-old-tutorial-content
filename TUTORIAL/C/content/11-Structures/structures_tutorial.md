		
		<p>A structure is basically a user-defined data type that can store related, probably of different data types together. A structure is similar to records. It stores related information about an entity having a single name. Each element in a structure is called structure member or structure field. Structure helps to organize complex data in a more meaningful way.</p>
	
		
	<h4>Structure Declaration and Definition</h4>
	<p>A structure is declared using the keyword struct . Like all data types, structures must be declared before using it. C has two ways to declare a structure.</p>
	
	<p>1.Tagged structure declaration.</p>
	<p>2.Typedef structure declaration.</p>
	
	<p><b>Tagged structure declaration</b></p>
	<p>A Tagged structure declaration can be used to define structure variables and return type. It is starts with the keyword ‘struct’. The second element is the tag. The tag is the identifier for the structure.</p>
	<!-- <img src="/pioneercoders/resources/images/CPointers7.png"> -->
	<p><b>Syntax</b></p>
	@CODE_START@@C@struct TAG
	{
		data_type var_name;
		data_type var_name;
		-------------------
	};@CODE_END@	
	<p><b>Example:</b></p>
	@CODE_START@@C@struct Student
	{
		char   Sname[25];
		int    SRollnumber;
		int    SClass;
		double SPhonenumber ;
	};@CODE_END@	
	
	<p><b>Typedef structure declaration</b></p>
	<p>The typedef structure declaration differs from the tagged structure declaration in two ways. First, the keyword ‘typedef’ added to the beginning of the definition. Second, an identifier is required at the end of the block and before the semicolon</p>
	<!-- <img src="/pioneercoders/resources/images/CPointers8.png"> -->
	<p><b>Syntax</b></p>
	@CODE_START@@C@typedef struct
	{
		data_type var_name;
		data_type var_name;
		------------------
	}Identifier;@CODE_END@

	<p><b>Example:</b></p>
	@CODE_START@@C@typedef struct
	{
		char   Sname[20];
		int    SRollnumber;
		int    SClass;
		double SPhonenumber;	
	}Student;@CODE_END@		
	<p><b>Note:</b>Memory is not allocated for the structure at the time of its declaration. It just gives a template that conveys to the C compiler how the structure is laid out in memory and gives details of the member names. Like any other data type; memory is allocated for the structure when we declare a variable of the structure.</p>
	
	<h4>Structure Variable Declaration</h4>
	
	<p>After a structure has been declared, we can declare variables using it. Declaration of structure variable can be done either as global variables or as local variables for a program.</p>
	
	<p><b>Global declaration of structure variables</b></p>
	
@CODE_START@@C@ struct STUDENT 
{	
char	Sname[20]; 
int	Srollnumber; 
int	Sclass; 
double Sphonenumber; 
}stu1,stu2; -->// Global declaration 
of structure variables 
main( )	
{	 
. . . . . . . . . ; 
. . . . . . . . . ; 
}@CODE_END@	

@CODE_START@@C@ struct STUDENT 
{	
char	Sname[20];	
int	Srollnumber;	
int	Sclass;	
double Sphonenumber;	
};	
struct STUDENT stu1,stu2;	
// Global declaration of structure variables 
main( )	
{	
. . . . . . . . . ;	
. . . . . . . . . ;	
}@CODE_END@		
		
	<p>Structure variable global declaration in TAGGED structure declaration.</p>	
@CODE_START@@C@typedef Structure 
{ 
char Sname[20]; 
int Srollnumber; 
int Sclass; 
}STUDENT; 
STUDENT stu1,stu2; //Global declaration of structure 
variables name() 
{ 
...............; 
...............; 
} @CODE_END@		
		
		<p>Structure variable global declaration in ‘ typeof ’ structure declaration.</p>

	<p><b>Local declaration of structure variable</b></p>
@CODE_START@@C@struct	STUDENT 
{	
char	Sname[20]; 
int	Srollnumber; 
int	Sclass; 
double	Sphonenumber; 
};	
main( )	 
{	
struct	STUDENT stu1,stu2 ; 
. . . . .	. . . . . . . . . ; 
}. . . . .	. . . . . . . . .;@CODE_END@		
	<p>Structure variable local declaration in tagged structure declaration</p>
@CODE_START@@C@ typedef	struct 
{ 
char	Sname[20]; 
int	Srollnumber; 
int	Sclass; 
double	Sphonenumber; 
}STUDENT; 
main( ) 
{ 
STUDENT stu1,stu2; 
. . . . . . . . . . . . .; 
. . . . . . . . . . . . .; 
} @CODE_END@		
	
	<p>Structure variable local declaration in typedef structure declaration.</p>
	<p><b>NOTE:</b>A structure declaration must be terminated with a semicolon ( ; ).</p>
	<p><b>Initialization of structure members</b></p>
	<p>Structure variable can be initialized in two ways: (i) Static Initialization  (ii) Dynamic Initialization</p>
	<p><b>Static structure variable initialization</b></p>
	
	<p>The structure variable static initialization is similar to the rules for array initialization. Initializing a structure means assigning some constants to the members of the structure. The initializers are enclosed in braces and separated by commas. They must match their corresponding types in the structure definition. The nested structure initializers must be enclosed in their own set of braces</p>
	
	@CODE_START@@C@typedef	struct 
{	
char	Sname[20]; 
int	Srollnumber; 
int	Sclass; 
double	Sphonenumber; 
}STUDENT; main( ) 
{ 
STUDENT stu1,stu2; 
stu1={“ SRINIVAS ” , 31, 4, 123456}; 
stu2={" KRISHNA" , 24, 10, 245315}; 
} @CODE_END@	
	
	<p><b>Note:</b>When one or more initializers are missing at static initialization of structure variable the structure members will be assigned null values, zero (0) for integers and floating-point numbers and null (‘\0’) character for characters and strings</p>
	
	<p><b>Dynamic structure variable initialization</b></p>
	
	<p>Dynamic initialization to a structure variable can be done by using input function ‘scanf( )’. Before going in detail we must know about operators used in structures.</p>
	
	<p><b>Accessing of the structure variables</b></p>
	
	
	<p>Before going to learn accessing of the structure variable members, it is must to know about operators used in structures.</p>
	
	<p><b>Operators used in structures</b></p>
	
	<p>Two operators are used to access members of structure variables.</p>
	
	<p>i)The structure ‘member operator’ ( . ), also called as ‘direct selection operator’, ‘dot operator’ or period operator.</p>
	<p>ii)The structure ‘pointer operator’ ( --> ), also called ‘arrow operator’</p>
	
	<p>The member operator accesses a structure member via the structure variable name. Member operator play a vital role in dynamic initialization of structure variables. To refers to a member in a structure we need to refer to both the structure variable and structure member respectively.</p>
	<p>The pointer operator –consisting of a minus sign (-) and a greater than ( > ) sign without space in between.It accesses a structure member via a pointer to the structure.</p>
	
	<p><b>Syntax</b></p>
	@CODE_START@@C@Struct_var . member_name@CODE_END@	
	<p><b>Note:</b></p>
	<ul>
		<li>C does not allow declaration of variables at the time of creating a typedef definition. So structure variables must be declared in an independent statement.</li>
		<li>A member of the structure cannot be accessed directly using its name. Rather you must use the structure variable name followed by dot operator before specifying the member name.</li>
	</ul>
	
@CODE_START@@C@	
#include <stdio.h>
struct Student
{
    int number;
    float marks;
} student1, student2;

int main()
{
    printf("1st Student\n");

    // Input of number for structure variable student1
    printf("Enter number: ");
    scanf("%d", &student1.number);

    // Input of marks for structure variable student1
    printf("Enter marks: ");
    scanf("%f", &student1.marks);

    printf("2nd Student\n");

    // Input of number for structure variable student2
    printf("Enter feet: ");
    scanf("%d", &student2.number);

    // Input of marks for structure variable student2
    printf("Enter inch: ");
    scanf("%f", &student2.marks);

    // printing sum of distance dist1 and dist2
    printf("Student  = %d\'-%.1f\"", sum.feet, sum.inch);
    return 0;
}
@CODE_END@

