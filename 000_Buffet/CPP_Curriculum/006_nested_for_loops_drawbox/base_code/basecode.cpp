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
	cout << "how many rows?" << endl;
	cin >> b;
	int c;
	int d;
	cout << "how many columns?" << endl;
	cin >> d;
	int e;
	for(c = 0;c<b;c++)
	{
	gotoxy(25+c,10);
	cout<< a;
		for(e = 0;e<d;e++){
			gotoxy(25+c,10+e);
			cout<< a;
		}
	}
}
