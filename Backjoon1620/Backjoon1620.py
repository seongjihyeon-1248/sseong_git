import random

N = 26
M = 5
n = list()
nn = ["Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard", 
      "Squirtle", "Wartortle", "Blastoise", "Caterpie", "Metapod", "Butterfree", 
      "Weedle", "Kakuna", "Beedrill", "Pidgey", "Pidgeotto", "Pidgeot", 
      "Rattata", "Raticate", "Spearow", "Fearow", "Ekans", "Arbok",
      "Pikachu", "Raichu"]

for i in range(0, N):
    n.append(nn[i])

ran = list()

for i in range(0, M):
    ran.append(random.randrange(0, (2 * N)))
    if(ran[i] <  N):
        print(n[ran[i]])
    else:
        print(ran[i] - N + 1)

for i in range(0, M):
    if(ran[i] <  N):
        print(n.index(n[ran[i]]) + 1)
    else:
        print(n[ran[i] - N])