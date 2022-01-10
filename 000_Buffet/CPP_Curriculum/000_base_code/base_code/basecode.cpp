// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char a;
	cout << "insert a '*' please!"<< endl;
	cin >> a;
	if(a == '*'){
	for(int i=0; i < 10; i++){
		
	gotoxy(35,1+i);
	cout << "*" << endl;
	sleep(1);
	gotoxy(35,1+i);
	cout << " " << endl;
}
}
else{
	cout << "rerun code please!";
}
}
