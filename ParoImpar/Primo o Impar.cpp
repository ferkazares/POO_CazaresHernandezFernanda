// PROGRAMAR para SABER si UN NÚMERO ES PAR o IMPAR
/*
Alumna: Cazares Hernandez Fernanda

*/
 
#include<iostream>

using namespace std;

int numero1;
void ParoImpar(int numero1);
int main(){
	
	cout<<"Ingresa el numero que desea evaluar: "<<endl;
	cin>>numero1;
	ParoImpar(numero1);
	
	
	
	
	
	
	return 0;
}
void ParoImpar(int numero1){
	if(numero1%2==0){
		cout<<"El numero es par"<<endl;
	}else{
		cout<<"El numero es impar"<<endl;
	}
}
