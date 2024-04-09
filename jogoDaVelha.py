def imprimir_tabuleiro(tabuleiro):
    """Imprime o tabuleiro do jogo da velha."""
    print("    1   2   3")
    for i, linha in enumerate(tabuleiro):
        print(f"{i+1}   {' | '.join(linha)}")
        if i < 2:
            print("  " + "-" * 11)


def verificar_vitoria(tabuleiro, jogador):
    """Verifica se o jogador venceu."""
    # Verifica linhas e colunas
    for i in range(3):
        if all(tabuleiro[i][j] == jogador for j in range(3)) or \
           all(tabuleiro[j][i] == jogador for j in range(3)):
            return True
    # Verifica diagonais
    if all(tabuleiro[i][i] == jogador for i in range(3)) or \
       all(tabuleiro[i][2-i] == jogador for i in range(3)):
        return True
    return False

def verificar_empate(tabuleiro):
    """Verifica se houve empate."""
    return all(all(posicao != ' ' for posicao in linha) for linha in tabuleiro)


def jogador_atual(rodada):
    """Determina o jogador atual."""
    return 'X' if rodada % 2 == 0 else 'O'

def jogar():
    """Função principal para jogar o jogo da velha."""
    tabuleiro = [[' ']*3 for _ in range(3)]
    rodada = 0
    vitorias_X = 0
    vitorias_O = 0
    empates = 0

    print("Bem-vindo ao Jogo da Velha!")
    imprimir_tabuleiro(tabuleiro)

    while True:
        jogador = jogador_atual(rodada)
        print(f"\nVez do jogador {jogador}")

        # Entrada de jogada
        while True:
            try:
                linha = int(input("Digite o número da linha (1-3): ")) - 1
                coluna = int(input("Digite o número da coluna (1-3): ")) - 1
                if 0 <= linha < 3 and 0 <= coluna < 3 and tabuleiro[linha][coluna] == ' ':
                    break
                else:
                    print("Posição inválida. Tente novamente.")
            except ValueError:
                print("Entrada inválida. Por favor, digite um número.")

        # Atualiza tabuleiro
        tabuleiro[linha][coluna] = jogador
        rodada += 1

        imprimir_tabuleiro(tabuleiro)

        # Verifica fim do jogo
        if verificar_vitoria(tabuleiro, jogador):
            print(f"\nO jogador {jogador} venceu!")
            if jogador == 'X':
                vitorias_X += 1
            else:
                vitorias_O += 1
            break
        elif verificar_empate(tabuleiro):
            print("\nO jogo terminou em empate!")
            empates += 1
            break

    print(f"Placar: X - {vitorias_X}, O - {vitorias_O}, Empates - {empates}")


if __name__ == "__main__":
    jogar()

                                                    
