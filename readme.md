<h1>Como rodar o código corretamente</h1>
<section>
    Ao clicar para rodar, você verá o seguinte comando no console<br>
    

    
    Escolha o tamanho da pilha:
    
Então digite a quantidade requerida para criação das torres, ou seja, 3 pilhas, 3 torres e assim conseguinte.
</section>

<section>
    Ao digitar quantas pilhas serão utilizadas na torre, estas serão criadas com sua primeira torre embaralhada, com números aleatórios.
    
```
P.1     P.2     P.3
48               
1                
28  
```
E logo abaixo algumas opções
```
Organizar pilha em ordem decrescente ou crescente?
1. Crescente
2. Decrescente
```
Isso irá determinar como você vai organizar a torre
</section>
<section>
Logo em seguida, você poderá escolher entre algumas opções:

```
Cada pilha tem seu numero para manipulacao:
1. Stack 1
2. Stack 2
3. Stack 3
~~~~~~~~~~~~~~~~~~~~~~~~~~
0. Sair do jogo.
1. Movimentar.
2. Solucao automatica.
```

Caso você selecione a solução automática, o programa irá solucionar a torre e dizer quantos movimentos foram precisos.

```
P.1     P.2     P.3
                48
                28
                1
Jogo resolvido em: 7
```

Na opção de movimentar, você terá que selecionar qual stack você vai querer remover o topo, e em seguida onde você quer que esse topo seja colocado, depois será impresso as pilhas com os novos valores.

```
Qual pilha para remover o topo: 
1
~~~~~~~~~~~~~~~~~~~~~~~~~~
Qual pilha para adicionar ao topo: 
2
P.1     P.2     P.3
72      43       
10   
```
Ao finalizar o jogo, ou seja, quando alguma pilha ficar organizada crescente ou descrecente(depende do estilo de jogo selecionado), uma mensagem será impressa com quantas jogadas foram feitas até a resolução.

```
P.1     P.2     P.3
        59       
        49       
        24       
Jogo finalizado em 6 jogadas.
```
</section>