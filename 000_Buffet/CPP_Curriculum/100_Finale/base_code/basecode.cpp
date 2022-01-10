// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
		for(int i=0; i < 20; i++){
	gotoxy(35,1+i);
	cout << "*" << endl;
	gotoxy(30,1+i);
	cout << "*" << endl;
	gotoxy(25,1+i);
	cout << "*" << endl;
	gotoxy(20,1+i);
	cout << "*" << endl;
	gotoxy(15,1+i);
	cout << "*" << endl;
	gotoxy(10,1+i);
	cout << "*" << endl;
	gotoxy(5,1+i);
	cout << "*" << endl;
	sleep(1);
	gotoxy(35,1+i);
	cout << " " << endl;
	gotoxy(30,1+i);
	cout << " " << endl;
	gotoxy(25,1+i);
	cout << " " << endl;
	gotoxy(20,1+i);
	cout << " " << endl;
	gotoxy(15,1+i);
	cout << " " << endl;
	gotoxy(10,1+i);
	cout << " " << endl;
	gotoxy(5,1+i);
	cout << " " << endl;
	}
	
	gotoxy(18,7);
	cout << "✰" << endl;
	gotoxy(17,8);
	cout << "/" << endl;
	gotoxy(19,8);
	cout << "\\" << endl;
	gotoxy(16,9);
	cout << "/" << endl;
	gotoxy(15,10);
	cout << "/" << endl;
	gotoxy(14,11);
	cout << "/" << endl;
	gotoxy(13,12);
	cout << "/" << endl;
	gotoxy(20,9);
	cout << "\\" << endl;
	gotoxy(21,10);
	cout << "\\" << endl;
	gotoxy(22,11);
	cout << "\\" << endl;
	gotoxy(23,12);
	cout << "\\" << endl;
	gotoxy(14,12);
	cout << "_________" << endl;
	gotoxy(15,13);
	cout << "🎁" << endl;
	gotoxy(18,13);
	cout << "☐" << endl;
	gotoxy(13,13);
	cout << "🎁"<< endl;
	gotoxy(22,13);
	cout << "🎁" << endl;
	gotoxy(19,13);
	cout << "🎁" << endl;
	
	while(true){
		gotoxy(18,9);
	cout << "*" << endl;
	gotoxy(17,10);
	cout << "*" << endl;
	gotoxy(18,10);
	cout << "*" << endl;
	gotoxy(19,10);
	cout << "*" << endl;
		gotoxy(16,11);
	cout << "*" << endl;
		gotoxy(17,11);
	cout << "*" << endl;
		gotoxy(18,11);
	cout << "*" << endl;
		gotoxy(19,11);
	cout << "*" << endl;
		gotoxy(20,11);
	cout << "*" << endl;
	sleep(1);
		gotoxy(18,9);
	cout << " " << endl;
	gotoxy(17,10);
	cout << " " << endl;
		gotoxy(18,10);
	cout << " " << endl;
		gotoxy(19,10);
	cout << " " << endl;
		gotoxy(16,11);
	cout << " " << endl;
		gotoxy(17,11);
	cout << " " << endl;
		gotoxy(18,11);
	cout << " " << endl;
		gotoxy(19,11);
	cout << " " << endl;
		gotoxy(20,11);
	cout << " " << endl;
	sleep(1);
	
	}
		

}
