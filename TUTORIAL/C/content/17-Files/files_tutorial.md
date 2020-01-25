

	<p>A file is a place on disk where group of related data are stored. C supports a number of functions that have the ability to perform basic file operations, which include:</p>

	<ul>
		<li>Naming a file</li>
		<li>Opening the file</li>
		<li>Reading data from the file</li>
		<li>Writing data to the file</li>
		<li>Closing the file</li>
	</ul>
	<p>There are two distinct ways to perform file operations in C. The first one is known as the low level I/O and uses UNIX system calls. The second method is referred to as the high level I/O operation and uses functions in C's standard I/O library.</p>

	<h3>FILE TYPES</h3>
	<p>DOS treats files in two different ways viz., as binary or text files. Almost all UNIX Systems do not make any distinction between the two. If a file is specified as the binary type, the file I/O functions do not interpret the contents of the file when they read from or write to the file. But, if the file is specified as the text type the I/O functions interpret the contents of the file.</p> 
	<p><b>The basic differences in these two types of files are</b></p>

	
	<p><b>I.</b>ASCII 0xla is considered an end-of-file character by the file I/O function 
		when reading from a text file and they assume that the end of the file has been reached.
	<p><b>II.</b>In case of DOS a new file is stored as the sequence 0*0d 0*0a on the disk in case of text files. UNIX stores \n as 0* 0a both on disk and in memory.</p>

	<h3>FILE Operations</h3>
	<p><b>1. Opening a File:</b></p>
	<p>C communicates with files using a new data type called a file pointer. This type is defined within stdio. h, and written as FILE *. A file pointer called output_file is declared in a statement like e</p>
	@CODE_START@@C@FILE *output_file; @CODE_END@	


	<p>If we want to store data in a file into the secondary memory, we must specify certain things about the file to the operating system. They include the filename, data structure, purpose.</p>
	<p>The general format of the function used for opening a file is <b>FILE*fp;</b></p>

	@CODE_START@@C@fp = fopen("filename", "mode");@CODE_END@

	<p>The first statement declares the variable fp as a pointer to the data type FILE. As stated earlier, File is a structure that is defined in the I/O Library. The second statement opens the file named filename and assigns an identifier to the FILE type pointer fp. This pointer, which contains all the information about the file, is subsequently used as a communication link between the system and the program.</p>

	<p>The second statement also specifies the purpose of opening the file. The mode does this job.</p>

	<p>r open the file for read only. w open the file for writing only.</p>
	<p>a open the file for appending data to it.</p>

	<p>r+	open an existing file for update (reading and writing)</p>

	<p>w+	create a new file for update. If it already exists, it will be overwritten.</p>
	<p>a+	open for append; open for update at the end of the file</p>

	<p><b>Consider the following statements:</b></p>

	@CODE_START@@C@FILE *pl, *p2;@CODE_END@
	pI =fopen("data" ,"r"); p2=fopen("results", "w");

	<p>In these statements the pI and p2 are created and assigned to open the files data and results respectively the file data is opened for reading and result is opened for writing. In case the results file already exists, its contents are deleted and the files are</p>

	<p><b>2. Closing the File:</b></p>

	<p>The input output library supports the function to close a file; it is in the following format.</p>

	<p><b>f close(file -'pointer);</b></p>

	<p>A file must be closed as soon as all operations on it have been completed. This would close the file associated with the file pointer.</p>

Observe the following program ..
@CODE_START@@C@FILE *p 1 *p2;@CODE_END@

Pl = fopen ("Input","w"); p2 = fopen ("Output" ,"r");
……
……

fclose(p1); fclose(p2);

<p>The above program opens two files and closes them after all operations on them are completed, once a file is closed its file pointer can be reversed on other file.</p>

@CODE_START@@C@
#include&lt;stdio.h&gt;
main() {
   FILE *fp;

   fp = fopen("/tmp/test.txt", "w+");
   fprintf(fp, "This is testing for fprintf...\n");
   fputs("This is testing for fputs...\n", fp);
   fclose(fp);
}
@CODE_END@
<p>
When the above code is compiled and executed, it creates a new file test.txt in /tmp directory and writes two lines using two different functions. 
</p>

