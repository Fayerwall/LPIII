import math
media = desvio=0
j=3
vet = []

for i in range (0,j):
    val = float(input(f'digite a variavel {i+1}: '))
    media+= val
    vet.append(val)

media/=j

for i in vet:
    desvio+=(i-media)**2

desvio/=j

desvio= math.sqrt(desvio)

if desvio>media*0.1:
    print(f'media: {media} desvio: {desvio} o multimetro não pode ser utilizado')

else:
    print(f'media: {media} desvio: {desvio} o multimetro é utilizavel')