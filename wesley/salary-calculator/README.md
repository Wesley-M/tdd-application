### Calculadora de Salário

Deve-se implementar uma calculadora de salário de funcionários. Um funcionário contém nome, e-mail, salário-base e cargo. De acordo com seu cargo, a regra para cálculo do salário líquido é diferente:

- Caso o cargo seja DESENVOLVEDOR, o funcionário terá desconto de 20% caso o salário seja maior ou igual que 3.000,00, ou apenas 10% caso o salário seja menor que isso.


- Caso o cargo seja DBA, o funcionário terá desconto de 25% caso o salário seja maior ou igual que 2.000,00, ou apenas 15% caso o salário seja menor que isso.


- Caso o cargo seja TESTADOR, o funcionário terá desconto de 25% caso o salário seja maior ou igual que 2.000,00, ou apenas 15% caso o salário seja menor que isso.


- Caso o cargo seja GERENTE, o funcionário terá desconto de 30% caso o salário seja maior ou igual que 5.000,00, ou apenas 20% caso o salário seja menor que isso.

#### Usando a calculadora

Para usar a calculadora, primeiro importe a classe `SalaryCalculator` e faça:

- Todos os campos dos empregados são obrigatórios. Null ou vazio não são aceitos.
- Salário não pode ser null, 0 ou negativo.
- Como os campos são obrigatórios, setters inválidos não são permitidos.

```java
Manager manager = new Manager('Felipe', 'felipe@gmail.com', 3000);
SalaryCalculator.getSalary(manager); // 3000 * 0.8 = 2400

manager.setName(null);       // Throws IllegalArgumentException
manager.setName("");         // Throws IllegalArgumentException
manager.setEmail(null);      // Throws IllegalArgumentException
manager.setEmail("");        // Throws IllegalArgumentException
manager.setBaseSalary(null); // Throws IllegalArgumentException
manager.setBaseSalary(-1);   // Throws IllegalArgumentException
```
