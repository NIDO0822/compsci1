// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char a;
	cout << "input a character" << endl;
	cin >> a;
	int b;
	cout << "how many times?" << endl;
	cin >> b;
	int c;
	char d;
	cout << "H or V" << endl;
	cin >> d;
	for(c = 0;c<b;c++)
	{
		if(d == 'V'){
		cout << a << endl;	
		}
		if(d == 'H'){
		cout << a;
	}
	}
		
	

	
}
