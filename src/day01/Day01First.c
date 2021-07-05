#include <stdio.h>
#include <stdlib.h>
#include <errno.h>

int main() {
	// Pointer to File 
	FILE * pf;
	pf = fopen ("/home/arbeit/CodeOfAdvent/day01/input", "r");
	
	if (pf == NULL) {
		perror("fopen error");
		exit(EXIT_FAILURE);
	
	} else {

		char ch;
		int floor = 0;

   		while(( ch = fgetc(pf)) != EOF){
      		if (ch == '(') {
      			floor++;
      		} else {
      			floor--;
      		}
   		}
		fclose (pf);


		printf("Solution: %d\n", floor);
	}

	return 0;
}