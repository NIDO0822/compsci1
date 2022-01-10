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
	int d;
	cout << "x coordinate:" << endl;
	cin >> c;
	cout << "y coordinate:" << endl;
	cin >> d;
	for(int e = 0; e < b; e++){
		gotoxy(c+e,d);
		cout << a;
	}
	

		
	

	
}
