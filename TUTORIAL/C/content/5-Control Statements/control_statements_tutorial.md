		<ul>
			<li>A program is nothing but the execution of sequence of one or more instructions.</li>
			<li>Quite often, it is desirable to alter the sequence of the statements in the program depending upon certain circumstances.</li>
			<li>i.e., we have a number of situations where we may have to change the order of execution of statements based on certain conditions or Repeat a group of statements until certain specified conditions are met.</li>
			<li>This involves a kind of decision making to see whether a particular condition has occurred or not and direct the computer to execute certain statements accordingly.</li>
			<li>Based on application, it is necessary / essential</li>
		</ul>
		<p>1.To alter the flow of a program</p>
		<p>2.Test the logical conditions</p>
		<p>3.Control the flow of execution as per the selection.</p>
		
		<p><b>C supports mainly three types of control statements: </b></p>
	
		@IMG_START@C/CcontrollStatements1/png@IMG_END@
		<p><b>Simple if statement:</b></p>
		<ul><li>The if statement is a powerful decision making statement and is used to control the flow of execution of statements.</li></ul>
		<p><b>Syntax:</b></p>
@CODE_START@@C@if(condition/expression)
	Statements;
Rest of the program	
@CODE_END@			
		<p style="margin-left:20px; "><b>OR</b></p>		
@CODE_START@@C@if(condition/expression){
	Statements;
}
Rest of the program	
@CODE_END@		
		<ul>
			<li>It is basically a "Two-way" decision statement (one for TRUE and other for FALSE)</li>
			<li>The statement as executed only when the condition is true.</li>
			<li>In case the condition is false the compiler skips the lines within the “if Block”.</li>
			<li>The condition is always enclosed within a pair of parenthesis ie ( ).</li>
			<li>The conditional statement should not the terminated with Semi-colons (;)</li>
			<li>The Statements following the "if"-statement are normally enclosed in Curly Braces { }.</li>
			<li>The Curly Braces indicates the scope of "if" statement.</li>
			<li>The default scope is one statement. But it is good practice to use curly braces even with a single statement.</li>
			<li>The statement block may be a single statement or a group of statements.</li>
			<li>If the Test Expression / Condition is TRUE, the Statement Block will be executed and executes rest of the program.</li>
			<li>If the Test Expression / Condition is FALSE, the Statement Block will be skipped and rest of the program executes next.</li>
		</ul>
		<p><b>FLOW CHART:</b></p>
		@IMG_START@C/CcontrollStatements2/png@IMG_END@
<h3>1.Write a Program to display a number if user enters negative number.</h3>
@CODE_START@@C@#include &lt;stdio.h&gt;
int main() {
	int number;
	printf("Enter an integer: ");
	scanf("%d",&number);
	// Test expression is true if number is less than 0
	if(number &lt; 0) {
		printf("you entered %d\n",number);
	}
	printf("Welcome To Pioneercoders\n");
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter an integer: 5</p>
	<p>Welcome To Pioneercoders</p>
	<p>Enter an integer:-2</p>
	<p>You entered -2</p>
	<p>Welcome To Pioneercoders</p>
</div>
		
		
	<p><b>"if-else" Statement</b></p>
	<ul>
		<li>It is observed that the if statement executes only when the condition following if is true.</li>
		<li>It does nothing when the condition is false.</li>
		<li>In if-else either True-Block or False – Block will be executed and not both</li>
		<li>The “else” Statement cannot be used without “if”.</li>
	</ul>	
	<p><b>Syntax</b></p>
	@CODE_START@@C@if(Test Expression or Condition){
	Statements;/*true block (or) if block */
}
else{
	Statements;/*false block (or) else block */
}@CODE_END@	
	<p><b>Flow Chart</b></p>
	@IMG_START@C/CcontrollStatements3/png@IMG_END@
	<h3>2.Write a Program to find weather a given no is even or odd</h3>
@CODE_START@@C@#include &lt;stdio.h&gt;
int main() {
	int number;
	printf("Enter an integer: ");
	scanf("%d",&number);
	//True if remainder is 0
	if(number%2 == 0){
		printf("%d is an even integer.\n",number);
	}
	else{
		printf("%d is an odd integer.\n",number);
	}	
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter an integer: 2</p>
	<p>2 is an even integer</p>
	<p>Enter an integer: 5</p>
	<p>5 is an odd integer</p>
</div>
	<p><b>Nested "if-else" Statement:</b></p>

	<ul><li>Using of one if-else statement in another if-else statement is called as nested if-else control statement. 
When a series of decisions are involved, we may have to use more than one if-else statement in nested form.</li></ul>

	<p><b>Syntax:</b></p>
	@CODE_START@@C@if(Test Condition1){
		if(Test Condition2){
			Statement-1
		}
		else{
			Statement-2
		}
	}
	else{
		if(Test Condition3){
			Statement-3
		}
		else{
			Statement-4
		}
	}
@CODE_END@

	<ul>
		<li>If Test Condition-1 is true then enter into outer if block, and it checks Test Condition2 if it is true then Statement-1 executed if it is false then else block executed i.e Statement-2.</li>
		<li>If Test Condition-1 is false then it skips the outer if block and it goes to else block and Test Condition-3 checks if it is true then Statement-3 executed, else Statement-4 executed</li>
	</ul>
	
	<p><b>Flow chart:</b></p>
	@IMG_START@C/CcontrollStatements4/png@IMG_END@
	<p><b>The "else – if" Ladder:  </b></p>
	<ul>
		<li>This is another way of putting if’s together when multiple decisions are involved.</li>
		<li>A multipath decision is a chain of if s in which the statement associated with each else is an if.</li>
		<li>Hence it forms a ladder called else–if ladder.</li>
	</ul>
	<p><b>Syntax</b></p>
	@IMG_START@C/CcontrollStatements5/png@IMG_END@
	<ul>
		<li>The above construction is known as else if ladders.</li>
		<li>The conditions are evaluated from top to bottom.</li>
		<li>As soon as a true condition is found, the statement associated with it is executed and the control is transferred to the Rest of the Program Statement–X (skipping rest of the ladder).</li>
		<li>When all the " n? conditions become false, then the final else containing the default statement will be executed.</li>
	</ul>
	<p><b>Fig:else-if ladder</b></p>
	@IMG_START@C/CcontrollStatements6/png@IMG_END@
	<h3>3.Write a Program to check whether an integer entered by the user is odd or even</h3>
@CODE_START@@C@#include &lt;stdio.h&gt;
int main() {
	int number1, number2;
	printf("Enter two integers: ");
	scanf("%d %d",&number1, &number2);
	//checks if two integers are equal
	if(number1== number2){
		printf("Result: %d = %d\n",number1, number2);
	}
	//checks if number1 is greater than number2
	else if(number1 > number2){
		printf("Result: %d > %d\n",number1, number2);
	}
	//if the best expression is false
	else(number1 > number2){
		printf("Result: %d &lt; %d\n",number1, number2);
	}
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter two integers: 11 11</p>
	<p>Result: 11 = 11</p>
	<p>Enter two integers: 10 12</p>
	<p>Result: 10 < 12</p>
</div>

	
	<p><b>The "switch-case" Statement:  </b></p>
	<ul>
		<li>The switch statement causes a particular group of statements to be chosen from several available groups.</li>
		<li>The selection is based upon the current value of an expression which is included within the switch statement.</li>
		<li>The switch statement is a multi-way branch statement.</li>
		<li>In a program if there is a possibility to make a choice from a number of options, this structured selection  is useful.</li>
		<li>The switch statement requires only one argument of int or char data type, which is checked with number of case options.</li>
		<li>The switch statement evaluates expression and then looks for its value among the case constants.</li>
		<li>If the value matches with the case constant, then that particular case statement is executed.</li>
		<li>If no one case constant not matched, then the default is executed</li>
		<li>Here switch, case and default are reserved words or keywords</li>
		<li>Every case statement terminates with colon ":".</li>
		<li>In switch each case block should end with break statement, i.e.</li>
	</ul>
	<p><b>Syntax</b></p>
	
	@CODE_START@@C@Switch(expression){
		Case exp1: statementements 1;
		Break;
		Case exp2: statementements 2;
		Break;
		Case exp3: statementements 3;
		Break;
		Case default: statementements n;
}@CODE_END@	
	
	
	<p><b>The switch( ) Organization:  </b></p>
	<ul>
		<li>The entire case structure following switch( ) should be enclosed with pair of curly braces { }.</li>
		<li>In the block the variable or expression can be a character or an integer.</li>
		<li>Each case statement must contain different constant values.</li>
		<li>Any number of case statements can be provided.</li>
		<li>If the case structure contains multiple statements, they need not be enclosed within pair of curly braces</li>
		<li>Each and every case must and should ends with break statement else it will continuous the next case statements</li>
	</ul>

	<p><b>The switch( ) Execution:  </b></p>
	
	<ul>
		<li>When one of the cases satisfies, the statements following it are executed</li>
		<li>In case there is no match, the default case is executed.</li>
	</ul>	
	<p><b>Flow Chart:</b></p>
	@IMG_START@C/CcontrollStatements7/png@IMG_END@
	
	<p><b>Sample Program:  </b></p>
@CODE_START@@C@Switch(expression)	
int i = 1;
switch(i){
 case 1:    
   printf(" case 1 ");        // No break
 case 2:
   printf(" case 2 ");        // No break
   break;
 case 3:
   printf(" case 3 ");
   break;
}
@CODE_END@		
<div class="output-panel"> 
<p>case 1  </p>
<p>case 2  </p>
</div>

<p> In above program case 1 is not ends with break so it entred into case 2 also and then it breaked. so every case in switch must and should ends with break else it continuous to next case </p>
