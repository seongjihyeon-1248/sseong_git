#include <stdio.h>

def selfnum():
    a = list()
    for i in range(0, 10000):
        a.append(0) 

    for i in range(0, 10):
        for ii in range(0, 10):
            if(i*11+ii*2 < 100):
                a[i*11+ii*2] = 1

    for i in range(0, 10):
        for ii in range(0, 10):
            for iii in range(0, 10):
                if(i*101+ii*11+iii*2 < 1000):
                    a[i*101+ii*11+iii*2] = 1

    for i in range(0, 10):
        for ii in range(0, 10):
            for iii in range(0, 10):
                for iiii in range(0, 10):
                    if(i*1001+ii*101+iii*11+iiii*2 < 10000):
                        a[i*1001+ii*101+iii*11+iiii*2] = 1

    for i in range(1, 10000):
        if(a[i] == 0): 
            print(i)

selfnum()