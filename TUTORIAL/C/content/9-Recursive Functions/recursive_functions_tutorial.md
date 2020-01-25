
			<h3>Recursive Functions</h3>
			
			<p>A function that calls itself is known as recursive function and the process in which a function calls itself is known as recursion in C programming.</p>
			
			<p><b>Example of recursion in C programming</b></p>
			
			<p>Write a C program to find sum of first n natural numbers using recursion. Note: Positive integers are known as natural number i.e. 1, 2, 3....n</p>
			
			<p>In, this simple C program, sum() function is invoked from the same function. If n is not equal to 0 then, the function calls itself passing argument 1 less than the previous argument it was called with. Suppose, n is 5 initially. Then, during next function calls, 4 is passed to function and the value of argument decreases by 1 in each recursive call. When, n becomes equal to 0, the value of n is returned which is the sum numbers from 5 to 1.</p>
			
			<p>For better visualization of recursion in this example:</p>
@CODE_START@@C@sum(5) 
=5+sum(4)	
=5+4+sum(3) 
=5+4+3+sum(2) 
=5+4+3+2+sum(1) 
=5+4+3+2+1+sum(0) 
=5+4+3+2+1+0 
=5+4+3+2+1 
=5+4+3+3 
=5+4+6 
=5+10 
=15@CODE_END@		
		<p>Every recursive function must be provided with a way to end the recursion. In this example when, n is equal to 0, there is no recursive call and recursion ends.</p>
	
		<p><b>Advantages and Disadvantages of Recursion</b></p>
		
		<p>Recursion is more elegant and requires few variables which make program clean. Recursion can be used to replace complex nesting code by dividing the problem into same problem of its sub-type.</p>
	
		<p>In other hand, it is hard to think the logic of a recursive function. It is also difficult to debug the code containing recursion.</p>
		
		<h3 class="subheading">IV. Comparison of Recursion and iteration</h3>
		
		<p>The differences between recursion and iteration cab be stated as below</p>
		
		<p class="blue">Recursion Vs. Iteration</p>
		
		<table class="pc-table">
							<tr> 
							<td style="font-weight:bold">Recursion </td>
							<td><b>Iteration</b></td>							
							</tr>
							
							<tr> 
							<td>Recursion is the term given to the mechanism of defining a set or procedure in terms of itself. </td>
							<td>Iteration is the block of statement executed repeatedly using loops.</td>							
							</tr>
							
							<tr> 
							<td>A conditional statement is required in the body of the function for stopping the function execution.</td>
							<td>The iteration control statement itself contains statement for stopping the iteration. At every execution, the condition is checked.</td>
							</tr>
							
							<tr> 
							<td>At some places, use of recursion generates extra overhead. Hence, better to skip when easy solution is available with iteration.</td>
							<td>All problems can be solved with iteration.</td>
							</tr>
							
							<tr> 
							<td>Recursion is expensive in terms of speed and memory..</td>
							<td>Iteration does not create any overhead. All the programming languages support iteration.</td>
							</tr>
		</table>
		
				<p>The C programming language supports recursion, i.e., a function to call itself. But while using recursion, programmers need to be careful to define an exit condition from the function, otherwise it will go in infinite loop.</p>
				
				<p>Recursive function are very useful to solve many mathematical problems like to calculate factorial of a number, generating Fibonacci series, etc.</p>
		
		<p><b>Number Factorial</b></p>
		<p>Following is an example, which calculates factorial for a given number using a recursive function:</p>
		<p><b>Fibonacci Series</b></p>
		<p>Following is another example, which generates Fibonacci series for a given number using a recursive function:</p>
		
		
		
