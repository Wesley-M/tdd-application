# Aplicando TDD

## Wesley

### Bom: 

- Alta taxa de cobertura e maior confiança no código. Como a lógica sempre deve ser derivada dos testes,
  grande parte já está testada quando se termina de codificar.
  
- Maior sentimento de controle sobre o processo de desenvolvimento. Não há muito questionamento se o
  código faz sentido para o problema, quando você sabe que o seu propósito é justamente atender os
  casos de teste.
  
### Desafiador:

- Ingenuamente, pensava que o fluxo de desenvolvimento *sempre* seria do teste para o código. Mas não é
  exatamente assim. Mudanças no design/arquitetura do código podem alterar a forma que os testes são
  escritos. Então inevitavelmente testes vão mudar dependendo das escolhas que fizer na implementação.
  Ex. Heranças, Interfaces, Enums, composições, padrões de projeto, ...
  
- Dificilmente se pensa em todos os casos necessários para cubrir a sua especificação de início. Então algumas 
  vezes tem-se que ampliar os testes já existentes, mesmo que o código atual até já atenda esses cenários.

### Difícil:

- Bastante tempo é requerido para testar todos os casos de interesse. Mesmo em "aplicações simples". Então é necessária
  razoável paciência e entendimento que o processo vale a pena.
  
- Nem sempre se escreve testes certos ou bons de primeira. Então tem que se preparar para "adaptar o TDD" de vez em quando.
  Refatorando, reescrevendo e/ou removendo testes e comportamentos, mesmo depois de passarem.

## Felipe


