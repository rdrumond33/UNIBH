#include <iostream>
#include <locale.h>
#include <vector>
#include <functional>
#include <algorithm>
#include <iterator>
#include <math.h>
#include <stdio.h>
#include <string.h>

using namespace std;

int TesteAscii(char *element) {

	if(strlen(element)-1==0) {
		if((element[0] >= 48 && element[0] <=57) || (element[0] >= 65 && element[0] <= 90) || (element[0] >= 97 && element[0] <= 122)){
		return 1;
		}
	}
	return 0;
}

void ImprimeConjunto (vector<char> &Conjunto) {

	sort(Conjunto.begin(),Conjunto.end());
	vector<char>::iterator it;
	it = unique (Conjunto.begin(), Conjunto.end());
	Conjunto.resize(distance(Conjunto.begin(),it));
	cout<<"{ ";
	for (it=Conjunto.begin(); it!=Conjunto.end(); ++it){
		cout << *it;
		if(it<Conjunto.end()-1) {
			cout<<" , ";
		}
	}
	cout<<" }";
}

void AdicionaElemento(vector<char> &Conjunto) {

	//Essa função adiciona elementos aos conjuntos da seguinte maneira:
	//Elementos fora do intervalo Ascii e com mais de um caractere são proibidos (ver TesteAscii)
	//Elementos duplicados são descartados (ver ImprimeConjunto)
	//Elementos do conjunto são ordenads (ver ImprmeConjunto)

	//Adicionar elemento ao conjunto: FEITO
	//Proibir caracteres especiais: FEITO (Win ok, Mac pendente)
	//Usar tabela ASCII: FEITO (Win ok, mac Pendente)
	//Proibir elementos com mesmo valor: FEITO
	//Alinhar elementos do conjunto: FEITO

	 int  parar=1;

	 while( parar == 1 ) {
		 char Elemento[1];
		 cout<<"\nInforme o elemento a ser adicionado: ";
		 cin>>Elemento;
		 if (TesteAscii(Elemento)==1) {
			 Conjunto.push_back(Elemento[0]) ;
			 cout<<"\nElemento armazenado com sucesso.\n Pressione 1 para adicionar mais um elemento.\n Pressione 2 para sair\n";
			 cin>>parar;
		 	}
		 else {
			 cout<<"\nValor informado não pode ser armazenado.\n";
		 }
	  fflush(stdin);//Limpa buffer de entrada de dados.
	  Elemento[0]='\0';
	 }
	 ImprimeConjunto(Conjunto);
}

void UniaodeConjuntos (vector<char> &Conjunto1, vector<char> &Conjunto2, vector<char> &ConjuntoR) {

	//Essa função ordena os conjuntos (redundancia), compara todos os elementos dos conjuntos informados e
	//os adiciona a um conjunto de saída, descartando os elementos duplicados.
	//Elementos duplicados são descartados (ver ImprimeConjunto)
	//Elementos do conjunto são ordenads (ver ImprmeConjunto)

	sort( Conjunto1.begin(), Conjunto1.end());
	sort( Conjunto2.begin(), Conjunto2.end());

	int i = 0, j = 0;
	ConjuntoR.clear();

	while(i < Conjunto1.size() && j < Conjunto2.size())
	if( Conjunto1[ i ] == Conjunto2[ j ] ) {
		ConjuntoR.push_back( Conjunto1[ i ] );
	   ++i, ++j;
	}
	else if( Conjunto1[ i ] < Conjunto2[ j ] )
		ConjuntoR.push_back( Conjunto1[ i++ ] );
	else
		ConjuntoR.push_back( Conjunto2[ j++ ] );
	while( i < Conjunto1.size()) ConjuntoR.push_back( Conjunto1[ i++ ] );
	while( j < Conjunto2.size()) ConjuntoR.push_back( Conjunto2[ j++ ] );
	ImprimeConjunto(ConjuntoR);
}

void IntercessaodeConjuntos (vector<char> &Conjunto1, vector<char> &Conjunto2, vector<char> &ConjuntoR) {

	//Essa função ordena os conjuntos (redundancia), compara os elementos dos conjuntos e
	//adiciona somente os que estão presentes nos dois conjuntos.
	//Elementos duplicados são descartados (ver ImprimeConjunto)
	//Elementos do conjunto são ordenads (ver ImprmeConjunto)

	sort( Conjunto1.begin(), Conjunto1.end());
	sort( Conjunto2.begin(), Conjunto2.end());

	int i=0, j=0;
	ConjuntoR.clear();

	for(i=0; i<Conjunto1.size(); i++) {
		for(j=0; j<Conjunto2.size(); j++) {
			if (Conjunto1[i] == Conjunto2[j]) {
				ConjuntoR.push_back( Conjunto1[ i ] );
			}
		}
	}
	ImprimeConjunto(ConjuntoR);
}

void DiferencadeConjuntos (vector<char> &Conjunto1, vector<char> &Conjunto2, vector<char> &ConjuntoR) {

	//Essa função percorre os conjuntos informados procurando elementos iguais.
	//Caso os elementos sejam iguais, o elemento é desconsiderado,
	//caso sejam diferentes, ele é adicionado ao Conjunto de Saída.
	//Nessa função as duas operaçoes são feitas (A-B e B-A), para eliminar, tire a segunda metade do código

	int i=0, j=0, l=0;
	ConjuntoR.clear();

	//A-B
	for(i=0; i<Conjunto1.size(); i++) {
		int found=0;
		for(j=0; j<Conjunto2.size(); j++) {
			if (Conjunto1[i] == Conjunto2[j]) {
				found=1;
				break;
			}
		}
		if(found==0) {
			ConjuntoR.push_back( Conjunto1[ l++ ] );
		}
	}
	//B-A
	for(i=0; i<Conjunto2.size(); i++) {
		int found=0;
		for(j=0; j<Conjunto1.size(); j++) {
			if (Conjunto1[i] == Conjunto2[j]) {
				found=1;
				break;
				}
			}
		if(found==0) {
			ConjuntoR.push_back( Conjunto2[ i ] );
		}
	}
	ImprimeConjunto(ConjuntoR);
}
void ConjuntoPotencia (vector<char> &Conjunto) {
    
    sort(Conjunto.begin(),Conjunto.end());
    
	int i, j;

	cout<<"Conjunto Potência do conjunto selecionado: \n\n\t\t{ ";
	cout<<"0, ";

	for(i=0;i<pow(2,Conjunto.size());i++) {
		for (j=0; j<Conjunto.size();j++){
			if (i &(1<<j)){
				cout << Conjunto[j];
				if(i<Conjunto.size()-1) {
					cout<<" , ";
				}
			}
		}
	}
	cout<<" }";
}

void PesquisarElemento (char &Elemento, vector<char> &Conjunto){

	//Nessa função o valor informado pelo usuário percorre o conjunto procurando
	//um elemento igual.

	int i=0;

	for(i=0; i<Conjunto.size(); i++) {
		if (Conjunto.at(i) == Elemento) {
			cout << "\nO elemento informado se encontra neste conjunto.";
		}
		else{
			cout << "\nO elemento informado não se encontra neste conjunto.";
		}
	}
}

void PCartesiano2Conj (vector<char> &Conjunto1, vector<char> &Conjunto2){

	cout << "\n{ ";

	for(int i = 0; i < Conjunto1.size(); i++)
		for(int j = 0; j < Conjunto2.size(); j++)
			cout << "( " << Conjunto1[i] << " , " << Conjunto2[j] << " )" ;
	cout << " }";
}

void PCartesiano3Conj (vector<char> &Conjunto1, vector<char> &Conjunto2, vector<char> &Conjunto3){

	cout << "\n{ ";

	for(int i = 0; i < Conjunto1.size(); i++)
		for(int j = 0; j < Conjunto2.size(); j++)
			for(int k = 0; k < Conjunto3.size(); k++)
			cout << "( " << Conjunto1[i] << " , " << Conjunto2[j]<< " , "  << Conjunto3[k] << " )" ;
	cout << " }";
}

void Subconjunto (vector<char> &Conjunto1, vector<char> &Conjunto2, vector<char> &ConjuntoR){

	//Essa função é a junção de outras duas: IntercessãodeConjuntos e ConjuntoPotencia

	sort( Conjunto1.begin(), Conjunto1.end());
	sort( Conjunto2.begin(), Conjunto2.end());

	int i=0, j=0, k=0, l=0;
	ConjuntoR.clear();

	for(i=0; i<Conjunto1.size(); i++) {
		for(j=0; j<Conjunto2.size(); j++) {
			if (Conjunto1[i] == Conjunto2[j]) {
				ConjuntoR.push_back( Conjunto1[ i ] );
			}
		}
	}
	for(k=0;k<pow(2,ConjuntoR.size());k++) {
		for (l=0; j<ConjuntoR.size();l++){
			if (k &(1<<l)){
				cout << ConjuntoR[l];
				if(i<ConjuntoR.size()) {
					cout<<" , ";
				}
			}
		}
	}
	cout<<" }";
}

void ConjuntosIguais (vector<char> &Conjunto1, vector<char> &Conjunto2) {

	sort( Conjunto1.begin(), Conjunto1.end());
	sort( Conjunto2.begin(), Conjunto2.end());

	int i=0;
	bool j=0;
	for( i=0; i<Conjunto1.size(); i++) {
		if (Conjunto1[i] != Conjunto2[i]) {
			cout << "Os conjuntos informados são diferentes.";
			j=1;
		}
	}
	if (j==0){
		cout << "Os conjuntos informados são iguais";
	}


}

int main() {
	setlocale(LC_ALL, "Portuguese");

	vector<char> A, B, C, R;
	//Conjuntos de Entrada.


	int Aok=0, Bok=0, Cok=0;
	//Contador de conjuntos lidos.

	char G='r';
	char M='r';
	//Condicional dos Menus.

	cout << "\t\tSUPER CONJUNTO v0.1\n\n";

	while (M=='r') {
		int h;
		cout << "\tEDITOR DE CONJUNTOS\n";
		cout << "Escolha a opção desejada: \n";
		cout << "1 - Editar Conjunto A \n";
		cout << "2 - Editar Conjunto B \n";
		cout << "3 - Editar Conjunto C \n";

		cin >> h;
		if(h==1) {
			AdicionaElemento(A);
			Aok=1;
		}
		else if(h==2) {
			AdicionaElemento(B);
			Bok=1;
		}
		else if(h==3) {
			AdicionaElemento(C);
			Cok=1;
		}
		else
			cout << "Opção Inválida.\n\n";
			cout << "\n\n";
			cout << "Pressione 'r' para rodar o EDITOR DE CONJUNTOS novamente.\n";
			cout << "Pressione qualquer outra tecla para executar o ANALISADOR DE CONJUNTOS: ";
			cin >> M;
	}

	while (G=='r') {

		int h;

		cout << "\n\n\tANALISADOR DE CONJUNTOS\n";
		cout << "Escolha a opção desejada: \n";
		cout << "1 - União de 2 Conjuntos \n";
		cout << "2 - Interseção de 2 Conjuntos \n";
		cout << "3 - Diferença entre 2 Conjuntos \n";
		cout << "4 - Conjunto Potência \n";
		cout << "5 - Verificar Subconjuntos entre Conjuntos \n";
		cout << "6 - Verificar Conjuntos Iguais \n";
		cout << "7 - Produto Cartesiano entre Conjuntos \n";
		cout << "8 - Pesquisar Elemento \n";
		cin >> h;

		if(h==1) {

			int h;

			cout << "Informe os conjutos de que deseja a união: ";
			cout << "1 - A e B \n";
			cout << "2 - B e C \n";
			cout << "3 - A e C \n";
			cin >> h;

			if (h==1)
				UniaodeConjuntos(A,B,R);
			else if (h==2)
				UniaodeConjuntos(B,C,R);
			else if (h==3)
				UniaodeConjuntos(A,C,R);
			}

		else if (h==2) {

			int h;

			cout << "Informe os conjuntos de que deseja a intercessão: ";
			cout << "1 - A com B \n";
			cout << "2 - B com C \n";
			cout << "3 - A com C \n";
			cin >> h;

			if (h==1)
				IntercessaodeConjuntos(A,B,R);
			else if (h==2)
				IntercessaodeConjuntos(B,C,R);
			else if (h==3)
				IntercessaodeConjuntos(A,C,R);
		}

		else if(h==3) {

			int h;

			cout << "Informe os conjuntos de que deseja a diferença: ";
			cout << "1 - A com B \n";
			cout << "2 - B com A \n";
			cout << "3 - B com C \n";
			cout << "1 - C com B \n";
			cout << "2 - A com C \n";
			cout << "3 - C com A \n";
			cin >> h;

			if (h==1)
				DiferencadeConjuntos(A,B,R);
			else if (h==2)
				DiferencadeConjuntos(B,A,R);
			else if (h==3)
				DiferencadeConjuntos(B,C,R);
			else if (h==4)
				DiferencadeConjuntos(C,B,R);
			else if (h==5)
				DiferencadeConjuntos(A,C,R);
			else if (h==6)
				DiferencadeConjuntos(C,A,R);
		}

		else if(h==4) {

			int h;

			cout << "Informe qual conjunto deseja ver o Conjunto Potência: ";
			cout << "1 - Conjunto A \n";
			cout << "2 - Conjunto B \n";
			cout << "3 - Conjunto C \n";
			cin >> h;

			if (h==1)
				ConjuntoPotencia(A);
			else if (h==2)
				ConjuntoPotencia(B);
			else if (h==3)
				ConjuntoPotencia(C);
			}

		else if(h==5) {

			int h;

			cout << "Informe quais conjuntos deseja ver os Subconjuntos: ";
			cout << "1 - Subconjuntos de A contidos em B \n";
			cout << "2 - Subconjuntos de B contidos em C \n";
			cout << "3 - Subconjuntos de C contidos em A \n";
			cin >> h;

			if (h==1)
				Subconjunto(A,B,R);
			else if (h==2)
				Subconjunto(B,C,R);
			else if (h==3)
				Subconjunto(C,A,R);
		}

		else if(h==6) {

			int h;

			cout << "Informe quais conjuntos deseja ver se são iguais: ";
			cout << "1 - A e B \n";
			cout << "2 - B e C \n";
			cout << "3 - C e A \n";
			cin >> h;

			if (h==1)
				ConjuntosIguais(A,B);
			else if (h==2)
				ConjuntosIguais(B,C);
			else if (h==3)
				ConjuntosIguais(C,A);
		}

		else if(h==7) {

			int h;

			cout << "Informe quais conjuntos deseja ver os Produto Cartesiano: ";
			cout << "1 - A e B \n";
			cout << "2 - B e C \n";
			cout << "3 - C e A \n";
			cout << "4 - A, B e C";
			cin >> h;

			if (h==1)
				PCartesiano2Conj(A,B);
			else if (h==2)
				PCartesiano2Conj(B,C);
			else if (h==3)
				PCartesiano2Conj(C,A);
			else if (h==4)
				PCartesiano3Conj(A,B,C);
		}

		else if(h==8) {

			char elemento;
			int h;

			cout << "Informe o elemento que deseja pesquisar: ";
			cin >> elemento;

			cout << "Informe em qual conjunto deseja pesquisar: ";
			cout << "1 - Conjunto A\n";
			cout << "2 - Conjunto B\n";
			cout << "3 - Conjunto C\n";
			cin >> h;

			if (h==1)
				PesquisarElemento(elemento,A);
			else if (h==2)
				PesquisarElemento(elemento,B);
			else if (h==3)
				PesquisarElemento(elemento,C);
		}

		else
			cout<<"Opção Inválida\n";

		cout<<"\n\n";
		cout << "Pressione 'r' para rodar o ANALISADOR DE CONJUNTOS novamente.\n";
		cout << "Pressione qualquer outra tecla para sair: ";
		cin>>G;

	}
}
