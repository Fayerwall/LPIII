from random import randint

dado1 = randint(1,7)
dado2 = randint(1,7)
ponto=dado1+dado2

print(f'estagio 1:\ndado 1: {dado1} dado 2: {dado2}\nponto: {ponto}' )
v= [2,3,12]
if ponto== 7 or ponto==11:
    print('voce ganhou')

elif ponto in v:
    print('voce perdeu')

else:
    print('estagio 2:')

while True:
    dado1 = randint(1,7)
    dado2 = randint(1,7)
    print(f'dado1: {dado1} dado 2:{dado2}\nsoma:{dado1+dado2}')
    if dado1+dado2==7:
        print('voce perdeu')
        break
    elif dado1+dado2==ponto:
        print('parabens,voce ganhou')
        break
