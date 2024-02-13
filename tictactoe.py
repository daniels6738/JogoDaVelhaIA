import random

def copiarTabuleiro(tabuleiro):
    copia = []

    for i in tabuleiro:
        copia.append(i)
    return copia

def imprimirTabuleiro(tabuleiro):
    copia = copiarTabuleiro(tabuleiro)

    for i in range(1,10):
        if(tabuleiro[i] == ''):
            copia[i] = str(i)
        else:
            copia[i] = tabuleiro[i]
    
    print(' ' + copia[7] + '|' + copia[8] + '|' + copia[9])
    print('-------')
    print(' ' + copia[4] + '|' + copia[5] + '|' + copia[6])
    print('-------')
    print(' ' + copia[1] + '|' + copia[2] + '|' + copia[3])

def verificaVencedor(tab, let):
	#Dado um quadro e uma letra, esta funcao retorna True se a letra passada vence o jogo
	return((tab[7] == let and tab[8] == let and tab[9] == let) or #linha de cima
		(tab[4] == let and tab[5] == let and tab[6] == let) or #linha do meio
		(tab[1] == let and tab[2] == let and tab[3] == let) or #linha de baixo
		(tab[7] == let and tab[4] == let and tab[1] == let) or #coluna da esquerda
		(tab[8] == let and tab[5] == let and tab[2] == let) or #coluna do meio
		(tab[9] == let and tab[6] == let and tab[3] == let) or #coluna da direito
		(tab[7] == let and tab[5] == let and tab[3] == let) or #diagonal principal
		(tab[9] == let and tab[5] == let and tab[1] == let)) #diagonal secundaria

