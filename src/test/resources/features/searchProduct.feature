@SearchProduct
Feature: User should be able to find a product

  Background:
    Given The user is in the home page

    Scenario Outline: User can type a desired item and expect correct results
      When The user enters "<item>" into search tab
      And The user clicks the search button
      Then The user should be redirected to a results page for the item

      Examples:
        |item  |
        | protein |
        | books |
        | keyboards |