Feature: US1001 kullanici dogru bilgilerle database baglanabilmeli

  @db
  Scenario: kullanici database bilgileri okur

    Given kullanici HMC veri tabanina baglanir
    And kullanici "tHOTELROOM" tablosundaki "Price" verilerini alir
    And kullanici "Price" sutunundaki verileri okur