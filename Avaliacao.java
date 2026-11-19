
/* Se você está vendo esta mensagem é porque fez tudo certo até aqui. 
    Boa prova! */

void main () {
   int espera;
   int clientes;
   int tempo = Integer.parseInt(IO.readln("Qual o tempo de espera?"));
   
   while (tempo>=0) {
espera += tempo; clientes++;
 int tempo = Integer.parseInt(IOreadln("Qual o tempo de espera"));
   }

if (clientes==0) {
IO.println("Aviso:nehum cliente válido foi registrado");
}
   else {
    double media = (double) espera/clientes;
   
IO.println("Clientes que se registrarão" + Clientes);
IO.println("Tempo total de espera" + espera);
IO.println("Tempo da media dos clientes" + media);

if (media<=10){
    IO.println("Atendimento Ágil");
}
else if (media<=20){
    IO.println("atendimento regular");
}
else {
    IO.println("Atendimento Lento: Reforçar a Equipe");
}

   }
}













}
