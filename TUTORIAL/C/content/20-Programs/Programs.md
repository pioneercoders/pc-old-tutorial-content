<pc-accordion>
	<accordion-item>
	<accordion-title>1.Hello world programm</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
// printf() displays the string inside quotation
   printf("Hello, World!");
   return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Hello,World!</p>
</div>		
	</accordion-content>
	</accordion-item>
	<accordion-item>
	<accordion-title>2.Write a Program to Print an Integer</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	int number;
	// printf() dislpays the formatted output 
	   printf("Enter an integer: ");  
	// scanf() reads the formatted input and stores them
	   scanf("%d", &number);  
	// printf() displays the formatted output
	   printf("You entered: %d", number);
	   return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter a integer:25</p>
	<p>You entered:25</p>
</div>
	
	</accordion-content>
</accordion-item>
	<accordion-item>
	<accordion-title>3.Write a programm to add two integers</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	int firstNumber, secondNumber, sumOfTwoNumbers;
	printf("Enter two integers: ");
	// Two integers entered by user is stored using scanf() function
	scanf("%d %d", &firstNumber, &secondNumber);
	// sum of two numbers in stored in variable sumOfTwoNumbers
	sumOfTwoNumbers = firstNumber + secondNumber;
	// Displays sum      
	printf("%d + %d = %d", firstNumber, secondNumber, sumOfTwoNumbers);
	   return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter two integers: 12 11</p>
	<p>12 + 11 = 23</p>
</div>	
	</accordion-content>
</accordion-item>
	<accordion-item>
	<accordion-title>4.Write a Program to Check Whether a Number is Even or Odd</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	int number;
	printf("Enter an integer: ");
	scanf("%d", &number);
	// True if the number is perfectly divisible by 2
	if(number % 2 == 0)
		printf("%d is even.", number);
	else
		printf("%d is odd.", number);
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter an integer: -7</p>
	<p>-7 is odd.</p>
</div>	
	</accordion-content>
</accordion-item>
	<accordion-item>
	<accordion-title>5.Write a Program to Check Whether a Number is Positive or Negative</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	double number;
	printf("Enter a number: ");
	scanf("%lf", &number);
	if (number <= 0.0)
	{
		if (number == 0.0)
			printf("You entered 0.");
		else
			printf("You entered a negative number.");
	}
	else
		printf("You entered a positive number.");
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter an integer: -7</p>
	<p>-7 is odd.</p>
</div>	
	</accordion-content>
	</accordion-item>
	<accordion-item>
	<accordion-title>6.Write a Program to Multiply two Floating Point Numbers</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	double firstNumber, secondNumber, productOfTwoNumbers;
	printf("Enter two numbers: ");
	// Stores two floating point numbers in variable firstNumber and secondNumber respectively
	scanf("%lf %lf", &firstNumber, &secondNumber);  
	// Performs multiplication and stores the result in variable productOfTwoNumbers
	productOfTwoNumbers = firstNumber * secondNumber;  
	// Result up to 2 decimal point is displayed using %.2lf
	printf("Product = %.2lf", productofTwoNumbers);
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter two numbers: 2.4 1.12</p>
	<p>Product = 2.69</p>
</div>	
	</accordion-content>
</accordion-item>
	<accordion-item>
	<accordion-title>7.Write a Program to Find ASCII Value of a Character</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	char c;
	printf("Enter a character: ");
	// Reads character input from the user
	scanf("%c", &c);  
	// %d displays the integer value of a character
	// %c displays the actual character
	printf("ASCII value of %c = %d", c, c);
	return 0;
}@CODE_END@	
<div class="output-panel"> 
	<p>Enter a character: G</p>
	<p>ASCII value of G = 71</p>
</div>	
	</accordion-content>
	</accordion-item>		
		<accordion-item>
	<accordion-title>8.Write a Program to Compute Quotient and Remainder</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	int dividend, divisor, quotient, remainder;
	printf("Enter dividend: ");
	scanf("%d", ÷nd);
	printf("Enter divisor: ");
	scanf("%d", &divisor);
	// Computes quotient
	quotient = dividend / divisor;
	// Computes remainder
	remainder = dividend % divisor;
	printf("Quotient = %d\n", quotient);
	printf("Remainder = %d", remainder);
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter dividend: 25</p>
	<p>Enter divisor: 4</p>
	<p>Quotient = 6</p>
	<p>Remainder = 1</p>
</div>	
	</accordion-content>
</accordion-item>
	<accordion-item>
	<accordion-title>9.Write a Program to Find the Size of int, float, double and char</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	int integerType;
	float floatType;
	double doubleType;
	char charType;
	// Sizeof operator is used to evaluate the size of a variable
	printf("Size of int: %ld bytes\n",sizeof(integerType));
	printf("Size of float: %ld bytes\n",sizeof(floatType));
	printf("Size of double: %ld bytes\n",sizeof(doubleType));
	printf("Size of char: %ld byte\n",sizeof(charType));
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Size of int: 4 bytes</p>
	<p>Size of float: 4 bytes</p>
	<p>Size of double: 8 bytes</p>
	<p>Size of char: 1 byte</p>
</div>		
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>10.Write a Program to Demonstrate the Working of Keyword long</accordion-title>
	<accordion-content>
@CODE_START@@C@
#include 
int main()
{
	int a;
	long b;
	long long c;
	double e;
	long double f;
	printf("Size of int = %ld bytes \n", sizeof(a));
	printf("Size of long = %ld bytes\n", sizeof(b));
	printf("Size of long long = %ld bytes\n", sizeof(c));
	printf("Size of double = %ld bytes\n", sizeof(e));
	printf("Size of long double = %ld bytes\n", sizeof(f));
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Size of int = 4 bytes</p>
	<p>Size of long = 8 bytes</p>
	<p>Size of long long = 8 bytes</p>
	<p>Size of double = 8 bytes</p>
	<p>Size of long double = 16 bytes</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>12.Write a Program to Check Whether a Character is Vowel or Consonant</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	char c
	int isLowercaseVowel, isUppercaseVowel;
	printf("Enter an alphabet: ");
	scanf("%c",&c);
	// evaluates to 1 (true) if c is a lowercase vowel
	isLowercaseVowel = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	// evaluates to 1 (true) if c is an uppercase vowel
	isUppercaseVowel = (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
	// evaluates to 1 (true) if either isLowercaseVowel or isUppercaseVowel is true
	if (isLowercaseVowel || isUppercaseVowel)
		printf("%c is a vowel.", c);
	else
		printf("%c is a consonant.", c);
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter an alphabet: G</p>
	<p>G is a consonant.</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>13.Write a Program to Find the Largest Number Among Three Numbers</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	double n1, n2, n3;
	printf("Enter three numbers: ");
	scanf("%lf %lf %lf", &n1, &n2, &n3);
	if (n1>=n2)
	{
		if(n1>=n3)
			printf("%.2lf is the largest number.", n1);
		else
			printf("%.2lf is the largest number.", n3);
	}
	else
	{
		if(n2>=n3)
			printf("%.2lf is the largest number.", n2);
		else
			printf("%.2lf is the largest number.",n3);
	}
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter three numbers: -4.5</p>
	<p>3.9</p>
	<p>5.6</p>
	<p>5.60 is the largest number.</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>14.Write a Program to Check Leap Year</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	int year;
	printf("Enter a year: ");
	scanf("%d",&year);
	if(year%4 == 0)
	{
		if( year%100 == 0)
		{
			// year is divisible by 400, hence the year is a leap year
			if ( year%400 == 0)
				printf("%d is a leap year.", year);
			else
				printf("%d is not a leap year.", year);
		}
		else
			printf("%d is a leap year.", year );
	}
	else
		printf("%d is not a leap year.", year);
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter a year: 1900</p>
	<p>1900 is not a leap year</p>
	<br>
	<p>Enter a year: 2012</p>
	<p>2012 is a leap year.</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>15.Write a Program to Check Whether a Character is an Alphabet or not</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	char c;
	printf("Enter a character: ");
	scanf("%c",&c);
	if( (c>='a' && c<='z') || (c>='A' && c<='Z'))
		printf("%c is an alphabet.",c);
	else
		printf("%c is not an alphabet.",c);
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter a character: *</p>
	<p>* is not an alphabet</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>16.Write a Program to Calculate the Sum of Natural Numbers Using for Loop</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	int n, i, sum = 0;
	printf("Enter a positive integer: ");
	scanf("%d",&n);
	for(i=1; i <= n; ++i)
	{
		sum += i;   // sum = sum+i;
	}
	printf("Sum = %d",sum);
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter a positive integer: 100</p>
	<p>Sum = 5050</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>17.Write a Program to Calculate the Sum of Natural Numbers Using while Loop</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	int n, i, sum = 0;
	printf("Enter a positive integer: ");
	scanf("%d",&n);
	i = 1;
	while ( i <=n )
	{
		sum += i;
		++i;
	}
	printf("Sum = %d",sum);
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter a positive integer: 100</p>
	<p>Sum = 5050</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>18.Write a Program to Find Factorial of a Number</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	int n, i;
	unsigned long long factorial = 1;
	printf("Enter an integer: ");
	scanf("%d",&n);
	// show error if the user enters a negative integer
	if (n < 0)
		printf("Error! Factorial of a negative number doesn't exist.");
	else
	{
		for(i=1; i<=n; ++i)
		{
			factorial *= i;              // factorial = factorial*i;
		}
		printf("Factorial of %d = %llu", n, factorial);
	}
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter an integer: 10</p>
	<p>Factorial of 10 = 3628800</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>19.Write a Program to Generate Multiplication Table</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	int n, i;
	printf("Enter an integer: ");
	scanf("%d",&n);
	for(i=1; i<=10; ++i)
	{
		printf("%d * %d = %d \n", n, i, n*i);
	}
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter an integer: 9</p>
	<p>9 * 1 = 9</p>
	<p>9 * 2 = 18</p>
	<p>9 * 3 = 27</p>
	<p>9 * 4 = 36</p>
	<p>9 * 5 = 45</p>
	<p>9 * 6 = 54</p>
	<p>9 * 7 = 63</p>
	<p>9 * 8 = 72</p>
	<p>9 * 9 = 81</p>
	<p>9 * 10 = 90</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>20.Write a Program to Display Fibonacci Sequence</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	int i, n, t1 = 0, t2 = 1, nextTerm = 0;
	printf("Enter the number of terms: ");
	scanf("%d", &n);
	printf("Fibonacci Series: ");
	for (i = 1; i <= n; ++i)
	{
		// Prints the first two terms.
		if(i == 1)
		{
			printf("%d, ", t1);
			continue;
		}
		if(i == 2)
		{
			printf("%d, ", t2);
			continue;
		}
		nextTerm = t1 + t2;
		t1 = t2;
		t2 = nextTerm;
		printf("%d, ", nextTerm);
	}
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter the number of terms: 10</p>
	<p>Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>21.Write a Program to Find LCM of two Numbers</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	int n1, n2, minMultiple;
	printf("Enter two positive integers: ");
	scanf("%d %d", &n1, &n2);
	// maximum number between n1 and n2 is stored in minMultiple
	minMultiple = (n1>n2) ? n1 : n2;
	// Always true
	while(1)
	{
		if( minMultiple%n1==0 && minMultiple%n2==0 )
		{
			printf("The LCM of %d and %d is %d.", n1, n2,minMultiple);
			break;
		}
		++minMultiple;
	}
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter two positive integers: 72,120</p>
	<p>The LCM of 72 and 120 is 360.</p>
</div>	
	</accordion-content>
</accordion-item>
	<accordion-item>
	<accordion-title>22.Write a Program to Find GCD of two Numbers</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	int n1, n2, i, gcd;
	printf("Enter two integers: ");
	scanf("%d %d", &n1, &n2);
	for(i=1; i <= n1 && i <= n2; ++i)
	{
		// Checks if i is factor of both integers
		if(n1%i==0 && n2%i==0)
			gcd = i;
	}
	printf("G.C.D of %d and %d is %d", n1, n2, gcd);
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter two positive integers: 81,153</p>
	<p>GCD = 9</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>23.Write a Program to Display Characters from A to Z Using Loop</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	char c;
	for(c = 'A'; c <= 'Z'; ++c)
	   printf("%c ", c);
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>A B C D E F G H I J K L M N O P Q R S T U V W X Y Z</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>24.Write a Program to Count Number of Digits in an Integer</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	long long n;
	int count = 0;
	printf("Enter an integer: ");
	scanf("%lld", &n);
	while(n != 0)
	{
		// n = n/10
		n /= 10;
		++count;
	}
	printf("Number of digits: %d", count);
}@CODE_END@
<div class="output-panel"> 
	<p>Enter an integer: 2345</p>
	<p>Reversed Number = 5432</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>25.Write a Program to Reverse a Number</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	int n, reversedNumber = 0, remainder;
	printf("Enter an integer: ");
	scanf("%d", &n);
	while(n != 0)
	{
		remainder = n%10;
		reversedNumber = reversedNumber*10 + remainder;
		n /= 10;
	}
	printf("Reversed Number = %d", reversedNumber);
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter an integer: 2345</p>
	<p>Reversed Number = 5432</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>26.Write a Program to Calculate the Power of a Number</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	int base, exponent;
	long long result = 1;
	printf("Enter a base number: ");
	scanf("%d", &base);
	printf("Enter an exponent: ");
	scanf("%d", &exponent);
	while (exponent != 0)
	{
		result *= base;
		--exponent;
	}
	printf("Answer = %lld", result);
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter a base number: 3</p>
	<p>Enter an exponent: 4</p>
	<p>Answer = 81</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>27.Write a Program to Check Whether a Number is Palindrome or Not</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	int n, reversedInteger = 0, remainder, originalInteger;
	printf("Enter an integer: ");
	scanf("%d", &n);
	originalInteger = n;
	// reversed integer is stored in variable 
	while( n!=0 )
	{
		remainder = n%10;
		reversedInteger = reversedInteger*10 + remainder;
		n /= 10;
	}
	// palindrome if orignalInteger and reversedInteger are equal
	if (originalInteger == reversedInteger)
		printf("%d is a palindrome.", originalInteger);
	else
		printf("%d is not a palindrome.", originalInteger);
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter an integer: 1001</p>
	<p>1001 is a palindrome.</p>
</div>	
	</accordion-content>
</accordion-item>

<accordion-item>
	<accordion-title>28.Write a Program to Check Whether a Number is Prime or Not</accordion-title>
	<accordion-content>
@CODE_START@@C@#include <stdio.h>
int main()
{
    int n, i, flag = 0;
    printf("Enter a positive integer: ");
    scanf("%d",&n);
    for(i=2; i<=n/2; ++i)
    {
        // condition for nonprime number
        if(n%i==0)
        {
            flag=1;
            break;
        }
    }
    if (flag==0)
        printf("%d is a prime number.",n);
    else
        printf("%d is not a prime number.",n);
    return 0;
}@CODE_END@
<div class="output-panel">
	<p>Enter a positive integer: 29</p>
	<p>29 is a prime number.</p>
</div>	
	</accordion-content>
</accordion-item>	
	
<accordion-item>
	<accordion-title>29.Write a Program to Display Prime Numbers Between Two Intervals</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	int low, high, i, flag;
	printf("Enter two numbers(intervals): ");
	scanf("%d %d", &low, &high);
	printf("Prime numbers between %d and %d are: ", low, high);
	while (low < high)
	{
		flag = 0;
		for(i = 2; i <= low/2; ++i)
		{
			if(low % i == 0)
			{
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			printf("%d ", low);
		++low;
	}
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter two positive integers: 12</p>
	<p>30</p>
	<p>Prime numbers between 12 and 30 are: 13 17 19 23 29</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>30.Write a Program to Check Armstrong Number</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	int number, originalNumber, remainder, result = 0;
	printf("Enter a three digit integer: ");
	scanf("%d", &number);
	originalNumber = number;
	while (originalNumber != 0)
	{
		remainder = originalNumber%10;
		result += remainder*remainder*remainder;
		originalNumber /= 10;
	}
	if(result == number)
		printf("%d is an Armstrong number.",number);
	else
		printf("%d is not an Armstrong number.",number);
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter a three digit integer: 371</p>
	<p>371 is an Armstrong number.</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>31.Write aProgram to Display Factors of a Number</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	int number, i;
	printf("Enter a positive integer: ");
	scanf("%d",&number);
	printf("Factors of %d are: ", number);
	for(i=1; i <= number; ++i)
	{
		if (number%i == 0)
		{
			printf("%d ",i);
		}
	}
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter a positive integer: 60</p>
	<p>Factors of 60 are: 1 2 3 4 5 6 12 15 20 30 60</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>32.Write a Programming Code To Create Pyramid and Pattern</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	int i, j, rows;
	printf("Enter number of rows: ");
	scanf("%d",&rows);
	for(i=1; i<=rows; ++i)
	{
		for(j=1; j<=i; ++j)
		{
			printf("* ");
		}
		printf("\n");
	}
	return 0;
}@CODE_END@
<div class="output-panel"> 
<p>*</p>
<p>* *</p>
<p>* * *</p>
<p>* * * *</p>
<p>* * * * *</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>33.Write a program to Reverse a Sentence Using Recursion</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
void reverseSentence();
int main()
{
	printf("Enter a sentence: ");
	reverseSentence();
	return 0;
}
void reverseSentence()
{
	char c;
	scanf("%c", &c);
	if( c != '\n')
	{
		reverseSentence();
		printf("%c",c);
	}
}@CODE_END@
<div class="output-panel"> 
	<p>Enter a sentence: margorp emosewa</p>
	<p>awesome program</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>34.Write a Program to Find the Length of a String</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	char s[1000], i;
	printf("Enter a string: ");
	scanf("%s", s);
	for(i = 0; s[i] != '\0'; ++i);
	printf("Length of string: %d", i);
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter a string: Programiz</p>
	<p>Length of string: 9</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>35.Write a Program to Concatenate Two Strings</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	char s1[100], s2[100], i, j;
	printf("Enter first string: ");
	scanf("%s", s1);
	printf("Enter second string: ");
	scanf("%s", s2);
	// calculate the length of string s1
	// and store it in i
	for(i = 0; s1[i] != '\0'; ++i);
	for(j = 0; s2[j] != '\0'; ++j, ++i)
	{
		s1[i] = s2[j];
	}
	s1[i] = '\0';
	printf("After concatenation: %s", s1);
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter first string: lol</p>
	<p>Enter second string: :)</p>
	<p>After concatenation: lol:)</p>
</div>	
	</accordion-content>
</accordion-item>
<accordion-item>
	<accordion-title>36.Write a Program to Copy String Without Using strcpy()</accordion-title>
	<accordion-content>
@CODE_START@@C@#include 
int main()
{
	char s1[100], s2[100], i;
	printf("Enter string s1: ");
	scanf("%s",s1);
	for(i = 0; s1[i] != '\0'; ++i)
	{
		s2[i] = s1[i];
	}
	s2[i] = '\0';
	printf("String s2: %s", s2);
	return 0;
}@CODE_END@
<div class="output-panel"> 
	<p>Enter String s1: programiz</p>
	<p>String s2: programiz</p>
</div>	
	</accordion-content>
</accordion-item>
</pc-accordion>
