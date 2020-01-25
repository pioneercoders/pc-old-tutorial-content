			<h5>Difinition</h5>
			<p>The loops in C language are used to execute a block of code or a part of the program several times.</p>
			<h4>Types of Loops:</h4>
			<ul>
				<li>For</li>
				<li>While</li>
				<li>do while</li>
			</ul>
			<h4>For</h4>
			<ul>
				<li>The initialization statement is executed only once.</li>
				<li>Then, the condition statement is evaluated. If the condition statement is false (0), for loop is terminated. But if the condition statement is true (nonzero), codes inside the body of for loop is executed and then again checks the condition.</li>
				<li>This process repeats until the test expression is false</li>
				<li>The for loop is commonly used when the number of iterations is known.</li>
			</ul>
			<h5>Flow Chart:</h5>
			@IMG_START@C/CforLoop/png@IMG_END@
			<h5>Syntax:</h5>
@CODE_START@@C@for(initialization;condition;incrment/decrement){  
		//code to be executed  
}@CODE_END@
			<h5>Example:</h5>
@CODE_START@@C@//printing numbers from 1 to 10 using for loop
#include <stdio.h>
int main () {
	int number;
 	for(number=0;number<=10;number++) {
	  printf("%d\n", number);
  	}
   		return 0;
}@CODE_END@
			<h4>While</h4>
			<ul>
				<li>The while loop evaluates the condition statement.</li>
				<li>If the condition statement is true (nonzero), codes inside the body of while loop is evaluated. The test expressioncondition statement is evaluated again. The process goes on until the condition statement is false.</li>
				<li>When the condition statement is false, the while loop is terminated.</li>
			</ul>
			<h5>Flow Chart:</h5>	
		@IMG_START@C/CwhileLoop/png@IMG_END@	
			<h5>Syntax:</h5>
@CODE_START@@C@while( condition ) {
	statement(s);
}@CODE_END@
			<h5>Example:</h5>
@CODE_START@@C@//printing numbers from 1 to 10 using while loop
#include <stdio.h>
int main () {
	int number = 1;
	while( number &lt;= 10 ) {
		printf("%d\n", number);
			number = number + 1;
	}
	   return 0;
}@CODE_END@
			<h4>do while</h4>
			<ul>
				<li>The code block (loop body) inside the braces is executed once.</li>
				<li>Then, the condition statement is evaluated. If the condition statement is true, the loop body is executed again. This process goes on until the condition statement is evaluated to 0 (false).</li>
				<li>When the test expression is false (nonzero), the do...while loop is terminated.</li>
			</ul>
			<h5>Flow Chart:</h5>
		@IMG_START@C/CdowhileLoop/png@IMG_END@	
			<h5>Syntax</h5>
@CODE_START@@C@do {
	statement(s);
} while( condition );
@CODE_END@
<h5>Example:</h5>
@CODE_START@@C@//printing numbers from 1 to 10
#include <stdio.h>
int main () {
	int number = 1;
	/* do loop execution */
	do{
		printf("%d\n", number);
		number = number + 1;
	  }while( number &lt;= 10 );
	   return 0;
}@CODE_END@
