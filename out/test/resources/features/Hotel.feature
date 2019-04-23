# Hotel feature review the behavior in this feature
Feature: Hotel

  Scenario: Verificar que un hotel seleccionado sea eliminado de la lista de Hoteles
    Given 'PHP travel' page is loaded
    And set my credentials on 'Login' page
    And delete hotel on 'Hotel List' page
