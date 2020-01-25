		<h3>I.User-Defined Functions:</h3>
		
		<p>C functions can be classified in two categories: Library functions and User defined functions.
			The difference between this two functions is, Library functions are already built in and we need not to write its code, just we have to call and used it in our code,  
			whereas a User defined function has to be written as we need and it get executed during the program run.</p>
						
		<h4>Need for User-Defined functions:</h4>
		
		<p>There are times when certain operation or calculation are to be repeated during a program. For instance, we may use a factorial of a number or printing some string lines in the program. In this situations we may repeat the code in our program .Here, user-defined functions can be really helpful and can save our time and program space.</p>
	
		<p><b>Syntax</b></p>
@CODE_START@@C@function_type function_name(parameter list){
			local variable declaration;
			executable statement 1;
			executable statement 2;
			.......................
			.......................
			.......................
		return statement;
}@CODE_END@	
		
		<p><b>Explanation of the Syntax:</b></p>
		
		<p><b>1)Function Header:</b></p>	
		<p>The first line in the above given syntax is known as header function. The function header consists of three parts: return type, function name and the function parameter list.</p>
		<p><b>Return type:</b>This may consist of the datatypes that you use. For example float, int, double. NOTE: If datatype is not specified then C will assume it as int type. And if the function does not return any value then use void. it can be considred as out put of the function.</p>
		<p><b>Function name:</b>This may consist of any name that is suitable for user's understanding. For example: If you have made user defined function for factorial then use fact and if for simple multiplication then mul.</p>
		<p><b>Parameter List: </b>It declares the variables that are to be used in the function and that are going to be called in the program, it can be considred as input values for the function.</p>
		
		<p><b>2)Function Body:</b></p>
		<p>The function body contains the declaration statement necessary for performing the required task. The body enclosed in braces contain three parts:</p>
		<p>A return statement that returns the value evaluated by the function.</p>		
		<p>Function statement that perform the task of the function.Using void as shown below:</p>
		<p>Local declaration that specify the variable needed by the function.</p>
		<p><b>NOTE:</b>If function does not return any value, we can omit the return statement.</p>
		<p><b>Fucntion call:</b></p>
		<p>A function can be called simply using the function name followed by a list of actual parameters(or arguments), if any enclosed in parentheses. Let's take an example for multiplication of two numbers.</p>
	
		<p>When the compiler encounters a function call, the control is transferred to the function mul( ). This function is then executed line by line as described and a value is returned when a return statement is encountered. This value is assigned to y. This is illustrated below:</p>
		
		<p><b>Example of user-defined function:</b></p>	
			<p><b>Write a C program to add two integers. Make a function add to add integers and display sum in main() function.</b></p>
			
			
@CODE_START@@C@#include <stdio.h>

int add(int a, int b);         // function prototype

int main(){
    int number1,number2,sum;

    printf("Enters two numbers: ");
    scanf("%d %d",&number1,&number2);

    sum = add(number1, number2);        // function call

    printf("sum = %d",sum);

    return 0;
}

int add(int a,int b){         // function definition   
    int result;                     // function local variables
    result = a+b;
    return result;                  // return statement
}
@CODE_END@			
			
			
			<h4>Function prototype(declaration):</h4>
			
			<p>Every function in C programming should be declared before they are used. These type of declaration are also called function prototype. Function prototype gives compiler information about function name, type of arguments to be passed and return type.</p>
			
			<p><b>Syntax of function prototype</b></p>
			@CODE_START@@C@return_type function_name( datatype(1) argument(1),....,datatype(n) argument(n) );@CODE_END@	
			<p>In the above example,int add(int a, int b); is a function prototype which provides following information to the compiler:</p>
			
			<ul>
				<li>name of the function is add()</li>
				<li>return type of the function is int.</li>
				<li>two arguments of type int are passed to function.</li>
			</ul>
			
			<p>Function prototype are not needed if user-definition function is written before main() function.</p>
			
			<p><b>Function call</b></p>
			
			<p>Control of the program cannot be transferred to user-defined function unless it is called (invoked).</p>
			
			<p><b>Syntax of function call</b></p>
			@CODE_START@@C@function_name(argument(1),....argument(n));@CODE_END@	
			<p>In the above example, function call is made using statement add(number1,number2); from main(). This make the control of program jump from that statement to function definition and executes the codes inside that function.</p>
			
			<p><b>Function definition</b></p>
			
			<p>Function definition contains programming codes to perform specific task.</p>
			
			<p><b>Passing arguments to functions</b></p>
			
			<p>In programming, argument/parameter is a piece of data(constant or variable) passed from a program to the function.</p>
			
			<p>In above example two variable, number1 and number2 are passed to function during function call and these arguments are accepted by arguments a and b in function definition.</p>
			<p>Arguments that are passed in function call and arguments that are accepted in function definition should have same data type. For example:</p>		

			<p>If argument number1 was of int type and number2 was of float type then, argument variable a should be of type int and b should be of type float,i.e., type of argument during function call and function definition should be same.</p>
			
			<p>A function can be called with or without an argument.</p>
			
			<p><b>Return Statement</b></p>
			
			<p>Return statement is used for returning a value from function definition to calling function</p>
			
			<p><b>Syntax of return statement</b></p>
			
			@CODE_START@@C@return (expression);@CODE_END@	
			
			<p>OR</p>
			
			<p><b>For example:</b></p>
@CODE_START@@C@return;
return a;
return (a+b);		
@CODE_END@	
			
			<p>In above example, value of variable add in add() function is returned and that value is stored in variable sum in main() function. The data type of expression in return statement should also match the return type of function.</p>
			
			<p><b>Types of User-defined Functions(Function Designs) in C:</b></p>
			
			<p>For better understanding of arguments and return in functions, user-defined functions can be categorised as:</p>
			<ul>
				<li>Function with no arguments and no return value</li>
				<li>Function with no arguments and return value</li>
				<li>Function with arguments but no return value</li>
				<li>Function with arguments and return value.</li>
			</ul>
			<p>Let's take an example to find whether a number is prime or not using above 4 cateogories of user defined functions.</p>
			
			<p><b>Function with no arguments and no return value.</b></p>
			<p>Function prime() is used for asking user a input, check for whether it is prime of not and display it accordingly. No argument is passed and returned form prime() function.</p>
			
			<p><b>Function with no arguments but return value</b></p>
			<p>There is no argument passed to input() function But, the value of n is returned from input() to main() function</p>
			
			<p><b>Function with arguments and no return value</b></p>
			<p>Here, check_display() function is used for check whether it is prime or not and display it accordingly. Here, argument is passed to user-defined function but, value is not returned from it to calling function.</p>
			
			<p><b>Function with argument and a return value</b></p>
			<p>Here, check() function is used for checking whether a number is prime or not. In this program, input from user is passed to function check() and integer value is returned from it. If input the number is prime, 0 is returned and if number is not prime, 1 is returned.</p>
			
			
