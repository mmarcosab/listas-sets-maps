
Sempre consultar a documentação, muitas vezes o que você procura já está pronto:
https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html


### Colecoes
- O que é uma Collection?
Todos que forem filhos de Collection ou que implementam Collection
Collection é uma interface que define métodos e trabalha com uma coleção, 
com um punhado de objetos. E existem várias formas de trabalhar com um 
punhado de objetos, como uma forma que pode ter objetos repetidos e estarão 
em uma sequência de ordem que nós definirmos, que é a List, ou onde não pode 
haver objetos repetidos e que não sabemos, independentemente da ordem dos 
objetos, que é o Set, entre outras formas.
- Qual Collection usar?
Depende da necessidade..
Se não se importa com a ordem pode ser um Set, se precisa ordenar um List e por aí vai. 
É bom pensar nas necesidades para escolher, mas devido a abstração fica fácil mudar
- Declarar como Collection< Aluno> alunos para ficar muito mais fácil mudar depois  
- A grande vantagem é a velocidade nas consultas
- O contains() funciona muito rápido
- No Set não conseguinos usar métodos que envolvam a ordem dos elementos
- No set não se aceita elementos repetidos
- Podemos passar o Set para uma Lista e ordená-lo ..
- Para verificar se já existe um objeto dentro de um set usar bem o hashCode e o equals, exemplos na classe Aluno
- Existe uma collection chamada TreeSet, que guarda os elementos em sua ordem natural. MAs para usá-la a gente deve ter elementos que possuam Comparable implementado ..

### Map


###Curiosidades
E quando não existia o foreach para percorrer uma lista?

```Set<Aluno> alunos = javaColecoes.getAlunos();
Iterator<Aluno> iterador = alunos.iterator();

while (iterador.hasNext()) {
System.out.println(iterador.next());
}´´´