#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool verificaPalindromo(char vetor[], int posicao){

    if( posicao > strlen(vetor)/2)
        return true;

    if(vetor[posicao]!= vetor[strlen(vetor) - posicao - 1])
        return false;

    return verificaPalindromo(vetor,posicao+1);
}

bool chamaPalindromo(char vet[]){
    return verificaPalindromo(vet, 0);
}

void respostaFinal(char vet[]){
    if (chamaPalindromo(vet))
        printf("SIM\n");
    else
        printf("NAO\n");
}

int main(){
    char palavra[512];
    scanf(" %[^\n]", palavra);

    do {
        respostaFinal(palavra);
        scanf(" %[^\n]", palavra);
    } while(strcmp(palavra, "FIM"));

    return 0;
}