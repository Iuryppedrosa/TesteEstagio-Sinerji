✨ Trata-se de um algoritmo em Java onde é exercitado POO, o teste foi enviado pela empresa **Sinerji** para uma vaga de Estágio em Desenvolvimento de Software em Java.

💡 Durante o exercício foi praticado **POO**, com **herança**, **polimorfismo**, **abstração**. Utilizei **lambda stream** para comparar valores.

📄 Segue o texto de instruções para o teste, abaixo:



# Java - Orientação a Objetos

Uma empresa possui três tipos de cargos com seus respectivos salários e benefícios:

| Cargo      | Salário                | Benefício                      |
|------------|------------------------|--------------------------------|
| Secretário | R$ 7000,00 + R$ 1000,00 por ano de serviço | 20% sobre o salário           |
| Vendedor   | R$ 12000,00 + R$ 1800,00 por ano de serviço | 30% sobre o valor vendido     |
| Gerente    | R$ 20000,00 + R$ 3000,00 por ano de serviço | Não tem benefícios            |

O seguinte quadro de funcionários:

| Nome           | Cargo      | mês/ano da contratação |
|----------------|------------|------------------------|
| Jorge Carvalho | Secretário | 01/2018                |
| Maria Souza    | Secretário | 12/2015                |
| Ana Silva      | Vendedor   | 12/2021                |
| João Mendes    | Vendedor   | 12/2021                |
| Juliana Alves  | Gerente    | 07/2017                |
| Bento Albino   | Gerente    | 03/2014                |

E o seguinte registro de vendas:

| Vendedor    | mês 12/2021 | mês 01/2022 | mês 02/2022 | mês 03/2022 | mês 04/2022 |
|-------------|-------------|-------------|-------------|-------------|-------------|
| Ana Silva   | R$ 5200,00  | R$ 4000,00  | R$ 4200,00  | R$ 5850,00  | R$ 7000,00  |
| João Mendes | R$ 3400,00  | R$ 7700,00  | R$ 5000,00  | R$ 5900,00  | R$ 6500,00  |

Utilizando os conceitos de Orientação a Objetos, implemente em Java:

- Um método que receba uma lista de funcionários, mês e ano e retorne o valor total pago (salário e benefício) a esses funcionários no mês.
- Um método que receba uma lista de funcionários, mês e ano e retorne o total pago somente em salários no mês.
- Um método que receba uma lista somente com os funcionários que recebem benefícios, mês e ano e retorne o total pago em benefícios no mês.
- Um método que receba uma lista de funcionários, mês e ano e retorne o que recebeu o valor mais alto no mês.
- Um método que receba uma lista somente com os funcionários que recebem benefícios, mês e ano e retorne o nome do funcionário que recebeu o valor mais alto em benefícios no mês.
- Um método que receba uma lista de vendedores, mês e ano e retorne o que mais vendeu no mês.
