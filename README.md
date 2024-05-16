![Logo do projeto ScoutSong](https://github.com/jefersonae/SongScout/assets/38109358/1a39d1b6-f4c4-457d-ab78-753c9f47efb5)
<h1>SongScout</h1>
<a href="https://docs.oracle.com/en/java/javase/20/"><img height= "35" src= "https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"></a>
<a href="https://www.oracle.com/java/technologies/javase-jdk11-downloads.html"><img height= "35" src= "https://img.shields.io/badge/JDK-007396?style=for-the-badge&logo=java&logoColor=white"></a>
<h2>:clipboard:Breve Resumo</h2>
<p>
  Projeto desenvolvido no curso da Oracle One T6 em parceria com a Alura como Desafio da Trilha Java e Spring Framework. O objetivo é realizar operações simples de CRUD integrado com o banco de dados do Postgres usando diferentes funções do Hibernate JPA.
</p>
<p>
  Criar um sistema que cadastre os diferentes tipos de artistas bem como as suas músicas. Adicionar filtros usando streams (fluxo de dados) também chamadas de funções anônimas.
</p>
<h2>:white_check_mark:Requisitos</h2>
<ul>
  <li>Java 8+</li>
  <li>Spring</li>
  <li>Hibernate JPA</li>
  <li>PostgreSQL</li>
</ul>
<h2>:hammer:Como funciona?</h2>
<p>Configure no arquivo Application.properties as informações do seu banco de dados. Ao rodar a aplicação selecione o item desejado de acordo com as opções:</p>
<ol>
  <li>Cadastrar artistas: o programa irá pedir para selecionar o nome do artista e o tipo (solo, dupla, banda)</li>
  <li>Cadastrar músicas: o sistema vai pedir o nome do artista filtrando no banco e pedir para informar o nome da música inserindo no banco</li>
  <li>Buscar músicas: o programa mostrar todas as músicas cadastradas no banco</li>
  <li>Buscar música por artistas: o sistema vai filtrar as músicas cadastradas por aquele artista</li>
</ol>
