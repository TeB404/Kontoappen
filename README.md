# Kontoappen

Jag har använt mig av punktnotation, vilket gör så att varje konto är sitt eget
och det hjälper med att få alting att det blir privat.

Jag avände skapande-mösnter factory så att Main bara ska hantera användarinteraktion.
AccountRegister ska skapa konton och jobba med hur konton konstrueras och hur den lagras.

Ett exempel av menyvalen från flödet är hur användaren annvändet nr 4 av menyn, vilket är uttaget.
Programmet frågar efter kontonamn och beloppet de vill ta ut, då ska användaren skriva ut
sitt namn och summan som ska tas ut, då körs registret för att hitta rätt konto
och om den finns, så anropar kontot för Withdraw(amount). Då kontrollerar den även att
saldot räcker och minskar det  vid godkänt uttag.

Har använt hjälp av lite AI och en del andra kodare + att jag läste lite på internet också.
Hade lite problem, var påväg att fråga om handling eller dom andra men lyckades fixa detta själv.

[här är läken](https://funet-my.sharepoint.com/:v:/g/personal/3kdyhapp26_bergte_folkuniversitetet_nu/IQDHvBNgptS6QLzAKhL89QZTATbWKzDZoRQjdMwjLRCyYP4?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbFZpZXciOiJTaGFyZURpYWxvZy1MaW5rIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXcifX0%3D&e=VSIMYc)