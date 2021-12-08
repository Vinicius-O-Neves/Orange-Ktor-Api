<div style="display: inline_block" align="center">
 <h1>Orange-Ktor-API</h1>
 <img  height="70" width="60" src="https://github.com/Vinicius-O-Neves/Orange-Ktor-Api/blob/main/orange-svgrepo-com.svg">
</div>

Tabela de conteúdos
=================
<!--ts-->
   * [Sobre](#Sobre)
   * [Instalação](#instalacao)
   * [Como usar](#como-usar)
      * [Pre Requisitos](#pre-requisitos)
      * [Como configurar](#configure)
      * [Iniciar API no localhost](#turn-local-host)
   * [Rotas](#rotes)
   * [Observação](#observation)
<!--te-->
 
<h1 id="Sobre">Sobre</h1>
<p align="center">&nbsp;Orange-Ktor-Api é uma API desenvolvido para o estudo de criação de API utilizando o framework Ktor. Esta API simula o cardápio de um restaurante, ou seja, a API retorna atráves de um JSON dados como os lanches, bebidas, fotos, e descrição dos items, além do preço e quantidade de pessoas que serve.</p>


<h1 id="instalacao">Instalação</h1>
<p>&nbsp;Abra o terminal e navegue até a pasta desejada para clonar o projeto <b>(utilize cd *nome da diretorio* para navegar atráves do terminal do windows)</b> digite o comando "git clone https://github.com/Vinicius-O-Neves/Orange-Ktor-Api.git" para clonar o repositório</p>


<div id="como-usar">
 <h1>Como Usar?</h1>
 
 <h2 id="pre-requisitos">&nbsp;&nbsp;Pré-requesitos</h2>
 <p>&nbsp;&nbsp;&nbsp;IntelliJ ou outra IDE para desenvolvimento com Kotlin</p>
 
 <h2 id="configure">&nbsp;&nbsp;Como configurar?</h2>
 <p>&nbsp;&nbsp;&nbsp;Novamente no terminal (windows) digite o comando <b>ipconfig</b>. Procure em <b>Adaptador de Rede sem Fio Wi-Fi:</b> o <b>Endereço IPv4</b> e copie os números apresentados do seu IP local. Exemplo: 112.146.00.24 </p>
 <p>&nbsp;&nbsp;&nbsp;Agora dentro do IntelliJ ou outra IDE navegue até a pasta <b>resources</b> que se localiza em <b>src/main/kotlin/resources</b></p>
 <p>&nbsp;&nbsp;&nbsp;Abra o arquivo <b>application.conf</b> e altere a variável <b>host</b> colocando o <b>Endereço IPv4</b> encontrado anteriormente</p>
 
 <h2 id="turn-local-host">&nbsp;&nbsp;Iniciar API no localhost</h2>
 <div style="display: inline-block">
  <p style="float: left">&nbsp;&nbsp;&nbsp;No arquivo <b>Application.kt</b> que se localiza em <b>src/main/kotlin/com.orange</b> clique no:</p>
  &nbsp;&nbsp;&nbsp <img style="float: right align="right"" height="40" width="40" src="https://github.com/Vinicius-O-Neves/Orange-Ktor-Api/blob/main/triangulo%20verde.png">
 </div> 
</div>


<div id="rotes">
 <h1>Rotas</h1>
  <h2>&nbsp;&nbsp;Todos os Items</h2>
  <p>&nbsp;&nbsp;&nbsp;* http://yourIP/items => retorna todos os items</p>
 
 <h2>&nbsp;&nbsp;Procurar Item pelo Id</h2>
 <p>&nbsp;&nbsp;&nbsp;* http://yourIP/items/{id} => retorna o item pelo respectivo id passado</p>
 
 <h2>&nbsp;&nbsp;Procurar Item pela Categoria</h2>
 <p>&nbsp;&nbsp;&nbsp;* http://yourIP/items/category/{Category} => retorna os items pela respectiva categoria passada, sendo que a primeira letra da categoria é maiúscula</p>
 
 <h2>&nbsp;&nbsp;Retornar todas as categorias da API</h2>
 <p>&nbsp;&nbsp;&nbsp;* http://yourIP/items/categorys => retorna as categorias e a foto que as representam</p>
</div>

<div id="observation">
 <h1>Observação</h1>
 <p>A API não foi publicada em um endereço público por possíveis gastos não desejáveis, então caso deseje realizar o deploy e publicar, recomenda-se seguir a documentação oficial: https://ktor.io/docs/deploy.html</p>
</div>
