
Feature: Hacer una gestion de articulos

  Background: : Cargar Pagina localhost:4200/
    Given 'Cargar Pagina de "Inicio" '


  Scenario: click en la opcion de Articulos
    Given redireccionar a la pagina '../articulos'

  Scenario: Gestion de Articulos "Crear un nuevo articulos"
    Given redireccionar a la pagina '../articulos'
    And mostrar Formulario de articulos
