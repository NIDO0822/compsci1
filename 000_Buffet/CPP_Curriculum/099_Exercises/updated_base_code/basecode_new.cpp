// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int x = 5;
	cout << x << endl;
	while(true){
		x = x + 1;
		cout<< x << endl;
		if(x == 25){
		break;
	}
	}
	cout << endl;
	int y = 15;
	cout << y << endl;
	while(true){
		y = y - 1;
		cout<< y << endl;
		if(y == 5){
		break;
	}
	}
	cout << endl;
	for( int i = 5; i <= 25; i = i + 1){
		cout << i << endl;
	}	
	cout << endl;
	for( int z = 15; z >= 5; z = z - 1){
		cout << z << endl;
		
}
}
