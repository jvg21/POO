import random
def cria_lista(tamanho):
    lista = []
    for num in range(0,tamanho):
        lista.append(random.randint(0, 50))
    
    return lista

tam = int(input("Digite o Tamanho da lista: "))
lista = cria_lista(tam)
print()
for i in lista:
    if i%3==0:
        print(i,"- Número Multiplo de 3")
    elif i%2==0:
        print(i,"- Número Par")
    else:
        print(i, "- Número Impar")


print("\n ----------------------------------------------------------")