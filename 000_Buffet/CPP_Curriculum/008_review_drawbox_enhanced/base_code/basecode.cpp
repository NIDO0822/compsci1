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
	int x;
	int y;
	cout << "x coordinate:" << endl;
	cin >> x;
	cout << "y coordinate:" << endl;
	cin >> y;
	int e;
	for(c = 0;c<b;c++)
	{
	gotoxy(x+c,y);
	cout<< a;
		for(e = 0;e<d;e++){
			gotoxy(x+c,y+e);
			cout<< a;
		}
	}
}
