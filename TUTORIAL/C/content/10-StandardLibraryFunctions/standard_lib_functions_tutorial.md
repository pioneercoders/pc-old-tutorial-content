
			<h3>The Standard Library Functions</h3>

			<p>Some of the "commands" in C are not really "commands" at all but are functions. For example, we have been using <b>printf</b> and <b>scanf</b> to do input and output, and we have used rand to generate random numbers - all three are functions</p>
			
			<p>A list of the most common libraries and a brief description of the most useful functions they contain follows:</p>
			
			<p><b>1.stdio.h: I/O functions:</b></p>
			<ul>
				<li><b>getchar()</b>  returns the next character typed on the keyboard.</li>
				<li><b>putchar()</b> outputs a single character to the screen. </li>
				<li><b>printf()</b> as previously described </li>
				<li><b>scanf()</b> as previously described</li>
			</ul>
			
			<p><b>2.string.h: String functions</b></p>
			<ul>
				<li><b>strcat()</b> concatenates a copy of str2 to str1</li>
				<li><b>strcmp()</b> compares two strings</li>
				<li><b> strcpy()</b> copys contents of str2 to str1</li>
			</ul>
			<p><b>3.ctype.h: Character functions</b></p>
			<ul>
				<li><b>isdigit()</b> returns non-0 if arg is digit 0 to 9</li>
				<li><b>isalpha()</b> returns non-0 if arg is a letter of the alphabet </li>
				<li><b>isalnum()</b> returns non-0 if arg is a letter or digit </li>
				<li><b>islower() </b> returns non-0 if arg is lowercase letter </li>
				<li><b>isupper()</b> returns non-0 if arg is uppercase letter</li>
			</ul>
			<p><b>4.math.h: Mathematics functions</b></p>
			<ul>
				<li><b>acos()</b> returns arc cosine of arg</li>
				<li><b>asin()</b> returns arc sine of arg </li>
				<li><b>atan()</b> returns arc tangent of arg</li>
				<li><b>cos()</b> returns cosine of arg </li>
				<li><b>exp()</b> returns natural logarithim e </li>
				<li><b>fabs()</b> returns absolute value of num </li>
				<li><b>sqrt()</b> returns square root of num	</li>
			</ul>
			<p><b>5.time.h: Time and Date functions</b></p>
			<ul>
				<li><b>time()</b> returns current calender time of system</li>
				<li><b>difftime()</b> returns difference in secs between two times </li>
				<li><b>clock()</b> returns non-0 if arg is a letter or digit </li>
			</ul>
			
			<p><b>6.stdlib.h:Miscellaneous functions</b></p>
			<ul>
				<li><b>malloc() </b> provides dynamic memory allocation, covered in future sections</li>
				<li><b>rand()</b> as already described previously </li>
				<li><b>srand()</b> used to set the starting point for rand() </li>
			</ul>
			<p>In the C Programming Language, the Standard Library Functions are divided into several header files.</p>
			
			<p>The following is a list of functions found within the <b> &lt;stdio.h&gt; </b>header file:</p>
			
			<p><b>Formatted Input/Output functions</b></p>
			<ul>
				<li><b>fprintf</b> Formatted File Write</li>
				<li><b>fscanf</b> Formatted File Read</li>
				<li><b>printf</b> Formatted Write scanf</li>
				<li><b>sprintf</b>Formatted Read</li>
				<li><b>sscanf</b>Formatted String Write</li>
				<li>Formatted String Read</li>
			</ul>
			<p><b>File Operation functions</b></p>
			<ul>
				<li><b>fclose</b> Close File</li>
				<li><b>fflush</b> Flush File Buffer</li>
				<li><b>fopen</b> Open File</li>
				<li><b>freopen </b> Reopen File</li>
				<li><b>remove</b> remove</li>
				<li><b>rename</b> Rename File</li>
			</ul>
			<p><b>Character Input/Output functions</b></p>
			<ul>
				<li><b> fgetc</b> Read Character from File</li>
				<li><b>fgets </b> Read String from File</li>
				<li><b>fputc</b> Write Character to File</li>
				<li><b>fputs</b> Write String to File</li>
				<li><b>getc</b> Read Characters from File</li>
				<li><b>getchar</b> Read Character</li>
				<li><b>gets </b> Read String</li>
				<li><b>putc</b> Write Character to File</li>
				<li><b>putchar </b> Write Character</li>
				<li><b>puts</b> Write String</li>
				<li><b>ungetc </b> Unread Character</li>
			</ul>
			<p><b>File Positioning functions</b></p>
			<ul>
				<li><b>fgetpos</b> Get File Position</li>
				<li><b>fseek</b> File Seek</li>
				<li><b>fsetpos</b> Set File Position</li>
				<li><b>ftell </b> Determine File Position</li>
				<li><b>rewind</b> Rewind File</li>
			</ul>
			
