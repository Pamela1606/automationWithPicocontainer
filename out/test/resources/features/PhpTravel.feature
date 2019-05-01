# Login feature review the behavior in thie feature
Feature: Login

  Background: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And set my credentials on 'Login' page

  #
  # Option Hotels
  #
  #Hotels - TV-001
  Scenario: List of Hotels is displayed to select option Hotels on lateral menu
    And click to 'option Hotels' on lateral menu into dashboard page
    And click to 'sub option Hotels' on lateral menu into dashboard page
    Then Verify that the "HOTELS MANAGEMENT" is displayed on 'dashboard' page

  #Hotels - TV-003
  Scenario Outline: Form of Hotels registry is displayed to select the add button on dashboard page
    And click to 'option Hotels' on lateral menu into dashboard page
    And click to 'sub option Hotels' on lateral menu into dashboard page
    And click to 'add button' on Hotels page
    And fill 'datas on general tab form' on add Hotel page
      | Hotel Name   | Hotel Description | Location |
      | <Name Hotel> | Description Test  | Iquique  |
    Then Verify that the "<Name Hotel>" is displayed on 'List Hotels' page

    Examples:
      | Name Hotel |
      | Test 3     |

  #Hotels - TV-004
  Scenario: Edition of datas in the tab "Meta Info" on the form edit of Hotels on dashboard page
    And click to 'option Hotels' on lateral menu into dashboard page
    And click to 'sub option Hotels' on lateral menu into dashboard page
    And click to 'edit option' on Hotels List to a Hotel selected
    And click to tab 'Meta Info' on Hotel Edit selected
    And update data form of 'meta info tab' in edit Hotel page
      | Meta Title      | Meta keywords | Meta Description |
      | Title Test Meta | keywords Test | Description Test |
    Then Verify that the "CHANGES SAVED!" message is displayed on 'List Hotels' page

  #Hotels - TV-005
  Scenario: Delete a selected hotel on the list of Hotels on dashboard page
    And click to 'option Hotels' on lateral menu into dashboard page
    And click to 'sub option Hotels' on lateral menu into dashboard page
    And click to 'delete option' on the registry first on Hotels List into dashboard page
    And click to 'ok button' of the 'pop-up window' on the Hotel page
    Then Verify that 'Hotel Name' was deleted of the Hotels List into dashboard page


#  #Rooms - TV-009
#  Verificar que el listado de Rooms se despliegue al seleccionar la opcion "Rooms" del menu Lateral
#  Scenario: Verificar que un hotel seleccionado sea eliminado de la lista de Hoteles
#    Given 'PHP travel' page is loaded
#    And set my credentials on 'Login' page
#    And delete hotel on 'Hotel List' page
#
#  #Rooms - TV-010
#  Verificar que el formulario de registro de Rooms permita la insercion de datos para su posterior
#  almacenamiento y se muestre en la pagina de la lista de Rooms
#  Scenario: Verificar que un hotel seleccionado sea eliminado de la lista de Hoteles
#    Given 'PHP travel' page is loaded
#    And set my credentials on 'Login' page
#    And delete hotel on 'Hotel List' page
#
#  #Rooms - TV-011
#  Verificar que la edicion de datos del tab "Translate" en el formulario de editar Rooms sea correcto
#  Scenario: Verificar que un hotel seleccionado sea eliminado de la lista de Hoteles
#    Given 'PHP travel' page is loaded
#    And set my credentials on 'Login' page
#    And delete hotel on 'Hotel List' page
#
#  #Rooms - TV-012
#  Verificar que un room seleccionado sea eliminado de la lista de Rooms
#  Scenario: Verificar que un hotel seleccionado sea eliminado de la lista de Hoteles
#    Given 'PHP travel' page is loaded
#    And set my credentials on 'Login' page
#    And delete hotel on 'Hotel List' page



  #Option Flights

  #Option Tours

  #Option Cars

  #Option Blog
